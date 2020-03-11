/*
 * Copyright
 */

package com.netcracker.shop.mapper;

import com.netcracker.shop.dto.AddressDto;
import org.mapstruct.Mapper;
import com.netcracker.shop.db.entity.Address;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * The interface Address mapper.
 */
@Mapper(componentModel = "spring")
public interface IAddressMapper {

    IAddressMapper INSTANCE = Mappers.getMapper( IAddressMapper.class );
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
