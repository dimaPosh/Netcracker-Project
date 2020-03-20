/*
 * Copyright
 */

package com.netcracker.shop.api;

import com.netcracker.shop.dto.CartDetailDto;
import com.netcracker.shop.exception.NotFoundException;
import com.netcracker.shop.service.ICartDetailService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Cart detail rest.
 */
@RestController
@RequestMapping("/cartdetail")
public class CartDetailRest {
    private final ICartDetailService service;

    /**
     * Instantiates a new Cart detail rest.
     *
     * @param service the service
     */
    public CartDetailRest(ICartDetailService service) {
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
    CartDetailDto getById(@PathVariable("id") int id) {
        CartDetailDto cartDetailDto = service.getById(id);
        if (cartDetailDto == null) {
            throw new NotFoundException();
        }
        return cartDetailDto;
    }

    /**
     * Gets all.
     *
     * @param id the id
     * @return the all
     */
    @CrossOrigin
    @GetMapping(path = "/all/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<CartDetailDto> getAll(@PathVariable("id") int id) {
        List<CartDetailDto> cartDetailDtos = service.getAll(id);
        if (cartDetailDtos == null) {
            throw new NotFoundException();
        }
        return cartDetailDtos;
    }

    /**
     * Create cart detail dto.
     *
     * @param cartDetailDto the cart detail dto
     * @return the cart detail dto
     */
    @CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    CartDetailDto create(CartDetailDto cartDetailDto) {
        return service.createCartDetail(cartDetailDto);
    }
}
