/*
 * Copyright
 */

package com.netcracker.shop.service;

import com.netcracker.shop.dto.AddressDto;

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
}
