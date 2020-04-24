/*
 * Copyright
 */

package com.netcracker.shop.api;

import com.netcracker.shop.dto.RoleDto;
import com.netcracker.shop.dto.UserDto;
import com.netcracker.shop.exception.NotFoundException;
import com.netcracker.shop.service.IUserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type User rest.
 */
@RestController
@RequestMapping("/user")
public class UserRest {
    private final IUserService service;

    /**
     * Instantiates a new User rest.
     *
     * @param service the service
     */
    public UserRest(IUserService service) {
        this.service = service;
    }

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    @CrossOrigin
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    UserDto getById(@PathVariable("id") int id) {
        UserDto userDto = service.getById(id);
        if (userDto == null) {
            throw new NotFoundException();
        }
        return userDto;
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    @CrossOrigin
    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<UserDto> getAll() {
        List<UserDto> userDtos = service.getAll();
        if (userDtos == null) {
            throw new NotFoundException();
        }
        return userDtos;
    }

    /**
     * Create user dto.
     *
     * @param userDto the user dto
     * @return the user dto
     */
    @CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    UserDto create(@RequestBody UserDto userDto) {
        userDto.setRole(RoleDto.USER);
        return service.createUser(userDto);
    }
}
