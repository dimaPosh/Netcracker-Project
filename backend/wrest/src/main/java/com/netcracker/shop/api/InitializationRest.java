/*
 * Copyright
 */

package com.netcracker.shop.api;

import com.netcracker.shop.dto.LogInDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Initialization rest.
 */
@CrossOrigin( origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/security")
public class InitializationRest {
    /**
     * Log in string.
     *
     * @param dto the dto
     * @return the string
     */
    @GetMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    String logIn(LogInDto dto) {
        return "Success";
    }
}
