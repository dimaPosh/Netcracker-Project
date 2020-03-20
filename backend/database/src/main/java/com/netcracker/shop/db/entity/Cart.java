/*
 * Copyright
 */

package com.netcracker.shop.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The type Cart.
 */
@Entity
@Table(name = "CARTS")
public class Cart {
    @Id
    @SequenceGenerator(name = "shopSeq", sequenceName = "SHOP_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shopSeq")
    @Column(name = "CART_ID")
    private Integer id;

    @Column(name = "PROMO_CODE")
    private String promo_code;

    /**
     * Instantiates a new Cart.
     */
    public Cart() {
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
