/*
 * Copyright
 */

package com.netcracker.shop.service.impl;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.netcracker.shop.db.repository.IAddressRepository;
import com.netcracker.shop.dto.AddressDto;
import com.netcracker.shop.mapper.IAddressMapper;
import com.netcracker.shop.service.IAddressService;
import org.springframework.stereotype.Service;

/**
 * The type Address service.
 */
@Service
public class AddressServiceImpl implements IAddressService {

    private final IAddressMapper addressMapper;
    private final IAddressRepository addressRepository;
    private final CsvMapper csvMapper;

    /**
     * Instantiates a new Address service.
     *
     * @param addressMapper     the address mapper
     * @param addressRepository the address repository
     * @param csvMapper         the csv mapper
     */
    public AddressServiceImpl(IAddressMapper addressMapper, IAddressRepository addressRepository, CsvMapper csvMapper) {
        this.addressMapper = addressMapper;
        this.addressRepository = addressRepository;
        this.csvMapper = csvMapper;
    }

    @Override
    public AddressDto getById(int id) {
        return addressRepository.findById(id).map(addressMapper::toDto).orElse(null);
    }
}
