/*
 * Copyright
 */

package com.netcracker.shop.dto;

/**
 * The type Category dto.
 */
public class CategoryDto {

    private Integer id;

    private String name;

    /**
     * Instantiates a new Category dto.
     */
    public CategoryDto() {
    }

    /**
     * Instantiates a new Category dto.
     *
     * @param id   the id
     * @param name the name
     */
    public CategoryDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}
