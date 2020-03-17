/*
 * Copyright
 */

package com.netcracker.shop.api;

import com.netcracker.shop.dto.AddressDto;
import com.netcracker.shop.service.IAddressService;
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
 * The type Address rest.
 */
@RestController
@RequestMapping("/address")
public class AddressRest {
    private final IAddressService service;

    /**
     * Instantiates a new Address rest.
     *
     * @param service the service
     */
    public AddressRest(IAddressService service) {
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
    AddressDto getById(@PathVariable("id") int id) {
        return service.getById(id);
    }


    /**
     * Gets all.
     *
     * @return the all
     */
    @CrossOrigin
    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<AddressDto> getAll() {
        return service.getAll();
    }

    /**
     * Create address dto.
     *
     * @param addressDto the address dto
     * @return the address dto
     */
    @CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    AddressDto create(@RequestBody AddressDto addressDto) {
        return service.createAddress(addressDto);
    }
}
