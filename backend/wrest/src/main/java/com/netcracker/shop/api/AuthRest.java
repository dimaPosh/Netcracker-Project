package com.netcracker.shop.api;

import com.netcracker.shop.db.entity.User;
import com.netcracker.shop.db.repository.IUserRepository;
import com.netcracker.shop.dto.LogInDto;
import com.netcracker.shop.dto.UserDto;
import com.netcracker.shop.mapper.IUserMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Auth rest.
 */
@RestController
@RequestMapping
public class AuthRest {

    private final IUserRepository repository;
    private final IUserMapper mapper;

    /**
     * Instantiates a new Auth rest.
     *
     * @param repository the repository
     * @param mapper     the mapper
     */
    public AuthRest(IUserRepository repository, IUserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    /**
     * Gets credentials.
     *
     * @param logInDto the log in dto
     * @return the credentials
     */
    @CrossOrigin
    @PostMapping(path = "/signin",
        consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDto getCredentials(@RequestBody LogInDto logInDto) {
        User user = repository.findByLogin(logInDto.getLogin());
        if (user == null) {
            return new UserDto();
        }
        if (!logInDto.getPassword().equals(user.getPassword())) {
            return null;
        }
        return mapper.toDto(user);
    }

    /**
     * Check login boolean.
     *
     * @param login the login
     * @return the boolean
     */
    @CrossOrigin
    @PostMapping(path = "/signup",
        consumes = MediaType.ALL_VALUE,
        produces = MediaType.ALL_VALUE)
    public Boolean checkLogin(@RequestBody String login) {
        return repository.findByLogin(login) == null;
    }
}
