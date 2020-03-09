/*
 * Copyright
 */

package com.netcracker.shop.mapper;

import com.netcracker.shop.dto.AddressDto;
import org.mapstruct.Mapper;
import com.netcracker.shop.db.entity.Address;
import org.mapstruct.Mapping;

/**
 * The interface Address mapper.
 */
@Mapper
public interface IAddressMapper {

    /**
     * From dto address.
     *
     * @param addressDto the address dto
     * @return the address
     */
    @Mapping(target = "id", ignore = true)
    Address fromDto(AddressDto addressDto);

    /**
     * To dto address dto.
     *
     * @param address the address
     * @return the address dto
     */
    AddressDto toDto(Address address);
}
