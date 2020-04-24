package com.netcracker.shop.service.impl;

import com.netcracker.shop.db.entity.OrderDetail;
import com.netcracker.shop.db.repository.IOrderDetailRepository;
import com.netcracker.shop.dto.OrderDetailDto;
import com.netcracker.shop.mapper.IOrderDetailMapper;
import com.netcracker.shop.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Order detail service.
 */
@Service
public class OrderDetailServiceImpl implements IOrderDetailService {

    @Autowired
    private final IOrderDetailMapper mapper;
    @Autowired
    private final IOrderDetailRepository repository;

    /**
     * Instantiates a new Order detail service.
     *
     * @param mapper     the mapper
     * @param repository the repository
     */
    public OrderDetailServiceImpl(IOrderDetailMapper mapper, IOrderDetailRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public OrderDetailDto getById(int id) {
        return mapper
            .toDto(repository.findById(id)
                .orElse(null));
    }

    @Override
    public List<OrderDetailDto> getAll(int order) {
        return mapper
            .toGetDto(repository.findAllByOrderId(order));
    }

    @Override
    public OrderDetailDto createOrderDetail(OrderDetailDto orderDetailDto) {
        OrderDetail f = mapper.fromDto(orderDetailDto);
        repository.save(f);
        orderDetailDto.setId(f.getId());
        return orderDetailDto;
    }
}
