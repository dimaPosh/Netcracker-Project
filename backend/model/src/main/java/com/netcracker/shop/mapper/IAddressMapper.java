/*
 * Copyright
 */

package com.netcracker.shop.mapper;

import com.netcracker.shop.dto.AddressDto;
import org.mapstruct.Mapper;
import com.netcracker.shop.db.entity.Address;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * The interface Address mapper.
 */
@Mapper(componentModel = "spring")
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
     * To get dto list.
     *
     * @param addresses the addresses
     * @return the list
     */
    List<AddressDto> toGetDto(List<Address> addresses);

    /**
     * To dto address dto.
     *
     * @param address the address
     * @return the address dto
     */
    AddressDto toDto(Address address);
}
