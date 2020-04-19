/*
 * Copyright
 */

package com.netcracker.shop.mapper;

import com.netcracker.shop.db.entity.Role;
import com.netcracker.shop.dto.RoleDto;
import org.mapstruct.Mapper;

/**
 * The type Role mapper.
 */
@Mapper(componentModel = "spring")
public class RoleMapper {

    /**
     * From role role dto.
     *
     * @param role the role
     * @return the role dto
     */
    protected RoleDto fromRole(Role role) {
        return RoleDto.of(role.getId());
    }


    /**
     * From dto role.
     *
     * @param roleDto the role dto
     * @return the role
     */
    protected Role fromDto(RoleDto roleDto) {
        return new Role(1);
    }
}
