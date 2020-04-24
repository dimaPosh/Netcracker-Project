package com.netcracker.shop.mapper;

import com.netcracker.shop.db.entity.Order;
import com.netcracker.shop.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * The interface Order mapper.
 */
@Mapper(componentModel = "spring", uses = {IUserMapper.class, IProductMapper.class})
public interface IOrderMapper {
    /**
     * From dto order.
     *
     * @param orderDto the order dto
     * @return the order
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user.id", ignore = false)
    @Mapping(target = "address.id", ignore = false)
    Order fromDto(OrderDto orderDto);

    /**
     * To dto order dto.
     *
     * @param order the order
     * @return the order dto
     */
    OrderDto toDto(Order order);

    /**
     * To get dto list.
     *
     * @param orders the orders
     * @return the list
     */
    List<OrderDto> toGetDto(List<Order> orders);

}
