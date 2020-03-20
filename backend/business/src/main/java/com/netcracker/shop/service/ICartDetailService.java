/*
 * Copyright
 */

package com.netcracker.shop.service;

import com.netcracker.shop.dto.CartDetailDto;

import java.util.List;

/**
 * The interface Cart detail service.
 */
public interface ICartDetailService {

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    CartDetailDto getById(int id);

    /**
     * Gets all.
     *
     * @param cart the cart
     * @return the all
     */
    List<CartDetailDto> getAll(int cart);

    /**
     * Create cart detail cart detail dto.
     *
     * @param cartDetailDto the cart detail dto
     * @return the cart detail dto
     */
    CartDetailDto createCartDetail(CartDetailDto cartDetailDto);

}
