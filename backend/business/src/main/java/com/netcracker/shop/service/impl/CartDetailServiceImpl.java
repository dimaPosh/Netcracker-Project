/*
 * Copyright
 */

package com.netcracker.shop.service.impl;

import com.netcracker.shop.db.entity.CartDetail;
import com.netcracker.shop.db.repository.ICartDetailRepository;
import com.netcracker.shop.dto.CartDetailDto;
import com.netcracker.shop.mapper.ICartDetailMapper;
import com.netcracker.shop.service.ICartDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Cart detail service.
 */
@Service
public class CartDetailServiceImpl implements ICartDetailService {

    @Autowired
    private final ICartDetailMapper mapper;
    @Autowired
    private final ICartDetailRepository repository;

    /**
     * Instantiates a new Cart detail service.
     *
     * @param mapper     the mapper
     * @param repository the repository
     */
    public CartDetailServiceImpl(ICartDetailMapper mapper,
                                 ICartDetailRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    @Override
    public CartDetailDto getById(int id) {
        return mapper
            .toDto(repository.findById(id)
                .orElse(null));
    }

    @Override
    public List<CartDetailDto> getAll(int cart) {
        return mapper.toGetDto(repository.findAll());
    }

    @Override
    public CartDetailDto createCartDetail(CartDetailDto cartDetailDto) {
        CartDetail f = mapper.fromDto(cartDetailDto);
        f = repository.save(f);
        cartDetailDto.setId(f.getId());
        return cartDetailDto;
    }
}
