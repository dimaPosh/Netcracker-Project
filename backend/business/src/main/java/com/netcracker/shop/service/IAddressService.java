/*
 * Copyright
 */

package com.netcracker.shop.service;

import com.netcracker.shop.dto.AddressDto;

import java.util.List;

/**
 * The interface Address service.
 */
public interface IAddressService {

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    AddressDto getById(int id);

    /**
     * Gets all.
     *
     * @return the all
     */
    List<AddressDto> getAll();

    /**
     * Create address address dto.
     *
     * @param addressDto the address dto
     * @return the address dto
     */
    AddressDto createAddress(AddressDto addressDto);
}
