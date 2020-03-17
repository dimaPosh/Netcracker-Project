/*
 * Copyright
 */

package com.netcracker.shop.api;

import com.netcracker.shop.dto.CartDto;
import com.netcracker.shop.service.ICartService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Cart rest.
 */
@RestController
@RequestMapping("/cart")
public class CartRest {

    private final ICartService service;

    /**
     * Instantiates a new Cart rest.
     *
     * @param service the service
     */
    public CartRest(ICartService service) {
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
    CartDto getById(@PathVariable("id") int id) {
        return service.getById(id);
    }

    /**
     * Create cart dto.
     *
     * @param cartDto the cart dto
     * @return the cart dto
     */
    @CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    CartDto create(@RequestBody CartDto cartDto) {
        CartDto cartDto1 = cartDto;
        return service.createCart(cartDto);
    }
}
