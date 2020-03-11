/*
 * Copyright
 */

package com.netcracker.shop.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The type Product.
 */
@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Float price;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMAGE")
    private Byte[] image;

    @Column(name = "COUNT")
    private Integer count;

    @OneToOne()
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public Float getPrice() {
        return this.price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(final Float price) {
        this.price = price;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Get image byte [ ].
     *
     * @return the byte [ ]
     */
    public Byte[] getImage() {
        return this.image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(final Byte[] image) {
        this.image = image;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(final Integer count) {
        this.count = count;
    }

    /**
     * Gets category.
     *
     * @return the category
     */
    public Category getCategory() {
        return this.category;
    }

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(final Category category) {
        this.category = category;
    }
}
