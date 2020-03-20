/*
 * Copyright
 */

package com.netcracker.shop.service.impl;

import com.netcracker.shop.db.entity.Address;
import com.netcracker.shop.db.repository.IAddressRepository;
import com.netcracker.shop.dto.AddressDto;
import com.netcracker.shop.mapper.IAddressMapper;
import com.netcracker.shop.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Address service.
 */
@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private final IAddressMapper mapper;
    @Autowired
    private final IAddressRepository repository;

    /**
     * Instantiates a new Address service.
     *
     * @param mapper     the address mapper
     * @param repository the address repository
     */
    public AddressServiceImpl(final IAddressMapper mapper,
                              final IAddressRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public AddressDto getById(int id) {
        return mapper
            .toDto(repository.findById(id)
                .orElse(null));
    }

    @Override
    public List<AddressDto> getAll() {
        return mapper.toGetDto(repository.findAll());
    }

    @Override
    public AddressDto createAddress(AddressDto addressDto) {
        Address f = mapper.fromDto(addressDto);
        f = repository.save(f);
        addressDto.setId(f.getId());
        return addressDto;
    }
}
