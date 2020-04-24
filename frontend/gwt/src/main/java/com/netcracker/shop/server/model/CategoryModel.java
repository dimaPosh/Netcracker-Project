package com.netcracker.shop.server.model;

/**
 * The type Category model.
 */
public class CategoryModel {
    private Integer id;

    private String name;

    /**
     * Instantiates a new Category model.
     */
    public CategoryModel() {
    }

    /**
     * Instantiates a new Category model.
     *
     * @param id   the id
     * @param name the name
     */
    public CategoryModel(Integer id, String name) {
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
