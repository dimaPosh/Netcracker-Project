/*
 * Copyright
 */

package com.netcracker.shop.dto;

/**
 * The type Cart dto.
 */
public class CartDto {
    private Integer id;
    private String promo_code;

    /**
     * Instantiates a new Cart dto.
     */
    public CartDto() {
    }

    /**
     * Instantiates a new Cart dto.
     *
     * @param id         the id
     * @param promo_code the promo code
     */
    public CartDto(Integer id, String promo_code) {
        this.id = id;
        this.promo_code = promo_code;
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
     * Gets promo code.
     *
     * @return the promo code
     */
    public String getPromo_code() {
        return promo_code;
    }

    /**
     * Sets promo code.
     *
     * @param promo_code the promo code
     */
    public void setPromo_code(String promo_code) {
        this.promo_code = promo_code;
    }
}
