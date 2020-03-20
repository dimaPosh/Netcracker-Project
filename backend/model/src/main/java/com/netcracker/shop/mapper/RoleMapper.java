/*
 * Copyright
 */

package com.netcracker.shop.mapper;

import com.netcracker.shop.db.entity.Role;
import com.netcracker.shop.dto.RoleDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public class RoleMapper {

    protected RoleDto fromRole(Role role) {
        return RoleDto.of(role.getId());
    }


    protected Role fromDto(RoleDto roleDto) {
        return new Role(1);
    }
}
