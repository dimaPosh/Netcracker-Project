/*
 * Copyright
 */

package com.netcracker.shop.mapper;

import com.netcracker.shop.db.entity.Role;
import com.netcracker.shop.db.entity.User;
import com.netcracker.shop.dto.RoleDto;
import com.netcracker.shop.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * The interface User mapper.
 */
@Mapper(componentModel = "spring", uses = {IAddressMapper.class, ICartMapper.class, RoleMapper.class})
public interface IUserMapper {

    /**
     * From dto user.
     *
     * @param userDto the user dto
     * @return the user
     */
    @Mapping(target = "id", ignore = true)
    User fromDto(UserDto userDto);

    /**
     * To dto user dto.
     *
     * @param user the user
     * @return the user dto
     */
    UserDto toDto(User user);

    /**
     * To get dto list.
     *
     * @param users the users
     * @return the list
     */
    List<UserDto> toGetDto(List<User> users);
}
