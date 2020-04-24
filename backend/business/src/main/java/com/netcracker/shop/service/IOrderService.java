package com.netcracker.shop.service;

import com.netcracker.shop.dto.OrderDto;

import java.util.List;

/**
 * The interface Order service.
 */
public interface IOrderService {

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    OrderDto getById(int id);

    /**
     * Gets all.
     *
     * @param user the user
     * @return the all
     */
    List<OrderDto> getAll(int user);

    /**
     * Create order order dto.
     *
     * @param orderDto the order dto
     * @return the order dto
     */
    OrderDto createOrder(OrderDto orderDto);

}
