package com.netcracker.shop.mapper;

import com.netcracker.shop.db.entity.OrderDetail;
import com.netcracker.shop.dto.OrderDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * The interface Order detail mapper.
 */
@Mapper(componentModel = "spring", uses = {IProductMapper.class, IOrderMapper.class})
public interface IOrderDetailMapper {

    /**
     * From dto order detail.
     *
     * @param orderDetailDto the order detail dto
     * @return the order detail
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "order.id", ignore = false)
    @Mapping(target = "product.id", ignore = false)
    OrderDetail fromDto(OrderDetailDto orderDetailDto);

    /**
     * To dto order detail dto.
     *
     * @param orderDetail the order detail
     * @return the order detail dto
     */
    OrderDetailDto toDto(OrderDetail orderDetail);

    /**
     * To get dto list.
     *
     * @param orderDetails the order details
     * @return the list
     */
    List<OrderDetailDto> toGetDto(List<OrderDetail> orderDetails);
}
