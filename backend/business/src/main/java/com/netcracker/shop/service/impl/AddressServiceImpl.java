/*
 * Copyright
 */

package com.netcracker.shop.service.impl;

import com.netcracker.shop.db.repository.IAddressRepository;
import com.netcracker.shop.dto.AddressDto;
import com.netcracker.shop.mapper.IAddressMapper;
import com.netcracker.shop.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Address service.
 */
@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private final IAddressMapper addressMapper;
    @Autowired
    private final IAddressRepository addressRepository;

    /**
     * Instantiates a new Address service.
     *
     * @param addressMapper     the address mapper
     * @param addressRepository the address repository
     */
    public AddressServiceImpl(final IAddressMapper addressMapper, final IAddressRepository addressRepository) {
        this.addressMapper = addressMapper;
        this.addressRepository = addressRepository;
    }

    @Override
    public AddressDto getById(int id) {
        return addressRepository.findById(id).map(addressMapper::toDto).orElse(null);
    }
}
