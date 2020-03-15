/*
 * Copyright
 */

package com.netcracker.shop.service;

import com.netcracker.shop.dto.CategoryDto;

/**
 * The interface Category service.
 */
public interface ICategoryService {
    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    CategoryDto getById(int id);

    /**
     * Create category category dto.
     *
     * @param categoryDto the category dto
     * @return the category dto
     */
    CategoryDto createCategory(CategoryDto categoryDto);
}
