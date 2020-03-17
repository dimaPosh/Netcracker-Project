/*
 * Copyright
 */

package com.netcracker.shop.service;

import com.netcracker.shop.dto.CartDto;

/**
 * The interface Cart service.
 */
public interface ICartService {
    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    CartDto getById(int id);

    /**
     * Create cart cart dto.
     *
     * @param cartDto the cart dto
     * @return the cart dto
     */
    CartDto createCart(CartDto cartDto);
}
