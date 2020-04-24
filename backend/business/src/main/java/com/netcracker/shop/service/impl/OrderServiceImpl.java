package com.netcracker.shop.service.impl;

import com.netcracker.shop.db.entity.Order;
import com.netcracker.shop.db.repository.IOrderRepository;
import com.netcracker.shop.dto.OrderDto;
import com.netcracker.shop.mapper.IOrderMapper;
import com.netcracker.shop.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Order service.
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private final IOrderMapper mapper;
    /**
     * The Repository.
     */
    @Autowired
    final IOrderRepository repository;

    /**
     * Instantiates a new Order service.
     *
     * @param mapper     the mapper
     * @param repository the repository
     */
    public OrderServiceImpl(IOrderMapper mapper, IOrderRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public OrderDto getById(int id) {
        return mapper
            .toDto(repository.findById(id)
                .orElse(null));
    }

    @Override
    public List<OrderDto> getAll(int user) {
        return mapper
            .toGetDto(repository.findAllByUserId(user));
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order f = mapper.fromDto(orderDto);
        repository.save(f);
        orderDto.setId(f.getId());
        return orderDto;
    }
}
