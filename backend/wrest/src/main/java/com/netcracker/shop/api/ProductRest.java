/*
 * Copyright
 */

package com.netcracker.shop.api;

import com.netcracker.shop.dto.ProductDto;
import com.netcracker.shop.exception.NotFoundException;
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
        ProductDto productDto = service.getById(id);
        if (productDto == null) {
            throw new NotFoundException();
        }
        return productDto;
    }

    /**
     * Gets all.
     *
     * @param category the category
     * @return the all
     */
    @CrossOrigin
    @GetMapping(path = "/all/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProductDto> getAllById(@PathVariable("id") int category) {
        List<ProductDto> productDtos = service.getAllById(category);
        if (productDtos == null) {
            throw new NotFoundException();
        }
        return productDtos;
    }

    @CrossOrigin
    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProductDto> getAll(){
        List<ProductDto> productDtos = service.getAll();
        if (productDtos==null){
            throw new NotFoundException();
        }
        return productDtos;
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
        return service.createProduct(productDto);
    }
}
