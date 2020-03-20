/*
 * Copyright
 */

package com.netcracker.shop.api;

import com.netcracker.shop.dto.ProductDto;
import com.netcracker.shop.service.IProductService;
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
 * The type Product rest.
 */
@RestController
@RequestMapping("/product")
public class ProductRest {
    private final IProductService service;

    /**
     * Instantiates a new Product rest.
     *
     * @param service the service
     */
    public ProductRest(IProductService service) {
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
    ProductDto getById(@PathVariable("id") int id) {
        return service.getById(id);
    }

    /**
     * Gets all.
     *
     * @param category the category
     * @return the all
     */
    @CrossOrigin
    @GetMapping(path = "/all/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProductDto> getAll(@PathVariable("id") int category) {
        return service.getAll(category);
    }

    /**
     * Create product dto.
     *
     * @param productDto the product dto
     * @return the product dto
     */
    @CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    ProductDto create(@RequestBody ProductDto productDto) {
        return service.create(productDto);
    }
}
