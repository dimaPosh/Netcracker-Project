/*
 * Copyright
 */

package com.netcracker.shop.service;

import com.netcracker.shop.dto.UserDto;

import java.util.List;

/**
 * The interface User service.
 */
public interface IUserService {
    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    UserDto getById(int id);

    /**
     * Gets all.
     *
     * @return the all
     */
    List<UserDto> getAll();

    /**
     * Create user user dto.
     *
     * @param userDto the user dto
     * @return the user dto
     */
    UserDto createUser(UserDto userDto);
}
