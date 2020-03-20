/*
 * Copyright
 */

package com.netcracker.shop.service.impl;

import com.netcracker.shop.db.entity.User;
import com.netcracker.shop.db.repository.IUserRepository;
import com.netcracker.shop.dto.UserDto;
import com.netcracker.shop.mapper.IUserMapper;
import com.netcracker.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type User service.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private final IUserMapper mapper;
    @Autowired
    private final IUserRepository repository;

    /**
     * Instantiates a new User service.
     *
     * @param mapper     the mapper
     * @param repository the repository
     */
    public UserServiceImpl(IUserMapper mapper,
                           IUserRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public UserDto getById(int id) {
        return mapper
            .toDto(repository.findById(id)
                .orElse(null));
    }

    @Override
    public List<UserDto> getAll() {
        return mapper.toGetDto(repository.findAll());
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User f = mapper.fromDto(userDto);
        repository.save(f);
        userDto.setId(f.getId());
        return userDto;
    }
}
