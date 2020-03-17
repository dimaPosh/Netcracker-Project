/*
 * Copyright
 */

package com.netcracker.shop.mapper;

import com.netcracker.shop.db.entity.Cart;
import com.netcracker.shop.dto.CartDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * The interface Cart mapper.
 */
@Mapper(componentModel = "spring")
public interface ICartMapper {

    /**
     * From dto cart.
     *
     * @param cartDto the cart dto
     * @return the cart
     */
    @Mapping(target = "id", ignore = true)
    Cart fromDto(CartDto cartDto);

    /**
     * To dto cart dto.
     *
     * @param cart the cart
     * @return the cart dto
     */
    CartDto toDto(Cart cart);
}
