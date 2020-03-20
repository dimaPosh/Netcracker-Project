/*
 * Copyright
 */

package com.netcracker.shop.mapper;

import com.netcracker.shop.db.entity.CartDetail;
import com.netcracker.shop.dto.CartDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * The interface Cart detail mapper.
 */
@Mapper(componentModel = "spring", uses = {IProductMapper.class})
public interface ICartDetailMapper {
    /**
     * From dto cart detail.
     *
     * @param cartDetailDto the cart detail dto
     * @return the cart detail
     */
    @Mapping(target = "id", ignore = true)
    CartDetail fromDto(CartDetailDto cartDetailDto);

    /**
     * To dto cart detail dto.
     *
     * @param cartDetail the cart detail
     * @return the cart detail dto
     */
    CartDetailDto toDto(CartDetail cartDetail);

    /**
     * To get dto list.
     *
     * @param cartDetails the cart details
     * @return the list
     */
    List<CartDetailDto> toGetDto(List<CartDetail> cartDetails);


}
