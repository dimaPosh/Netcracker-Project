/*
 * Copyright
 */

package com.netcracker.shop.service;

import com.netcracker.shop.dto.ProductDto;

import java.util.List;

/**
 * The interface Product service.
 */
public interface IProductService {
    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    ProductDto getById(int id);

    /**
     * Gets all.
     *
     * @param category the category
     * @return the all
     */
    List<ProductDto> getAllById(int category);

    /**
     * Gets all.
     *
     * @return the all
     */
    List<ProductDto> getAll();

    /**
     * Create product dto.
     *
     * @param productDto the product dto
     * @return the product dto
     */
    ProductDto createProduct(ProductDto productDto);
}
