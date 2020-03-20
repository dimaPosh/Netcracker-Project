/*
 * Copyright
 */

package com.netcracker.shop.service.impl;

import com.netcracker.shop.db.entity.Cart;
import com.netcracker.shop.db.repository.ICartRepository;
import com.netcracker.shop.dto.CartDto;
import com.netcracker.shop.mapper.ICartMapper;
import com.netcracker.shop.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Cart service.
 */
@Service
public class CartServiceImpl implements ICartService {

    @Autowired
    private final ICartMapper mapper;
    @Autowired
    private final ICartRepository repository;

    /**
     * Instantiates a new Cart service.
     *
     * @param mapper     the mapper
     * @param repository the repository
     */
    public CartServiceImpl(ICartMapper mapper,
                           ICartRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public CartDto getById(int id) {
        return mapper
            .toDto(repository.findById(id)
                .orElse(null));
    }

    @Override
    public CartDto createCart(CartDto cartDto) {
        Cart f = mapper.fromDto(cartDto);
        f = repository.save(f);
        cartDto.setId(f.getId());
        return cartDto;
    }
}
