package com.netcracker.shop.service;

import com.netcracker.shop.dto.OrderDetailDto;

import java.util.List;

/**
 * The interface Order detail service.
 */
public interface IOrderDetailService {

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    OrderDetailDto getById(int id);

    /**
     * Gets all.
     *
     * @param order the order
     * @return the all
     */
    List<OrderDetailDto> getAll(int order);

    /**
     * Create order detail order detail dto.
     *
     * @param orderDetailDto the order detail dto
     * @return the order detail dto
     */
    OrderDetailDto createOrderDetail(OrderDetailDto orderDetailDto);

}
