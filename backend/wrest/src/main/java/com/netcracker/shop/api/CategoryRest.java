/*
 * Copyright
 */

package com.netcracker.shop.api;

import com.netcracker.shop.dto.CategoryDto;
import com.netcracker.shop.service.ICategoryService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Category rest.
 */
@RestController
@RequestMapping("/category")
public class CategoryRest {
    private final ICategoryService service;

    /**
     * Instantiates a new Category rest.
     *
     * @param service the service
     */
    public CategoryRest(ICategoryService service) {
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
    CategoryDto getById(@PathVariable("id") int id) {
        return service.getById(id);
    }

    /**
     * Create category dto.
     *
     * @param categoryDto the category dto
     * @return the category dto
     */
    @CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    CategoryDto create(@RequestBody CategoryDto categoryDto) {
        return service.createCategory(categoryDto);
    }
}
