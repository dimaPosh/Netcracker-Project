/*
 * Copyright
 */

package com.netcracker.shop.db.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The type Cart detail.
 */
@Entity
@Table(name = "CART_DETAILS")
public class CartDetail {
    @Id
    @SequenceGenerator(name = "shopSeq", sequenceName = "SHOP_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shopSeq")
    @Column(name = "CART_DETAILS_ID")
    private Integer id;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "CART_ID", foreignKey = @ForeignKey(name = "CA_ID_FK"))
    private Cart cart;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "PRODUCT_ID", foreignKey = @ForeignKey(name = "PROD_ID_FK"))
    private Product product;

    /**
     * Instantiates a new Cart detail.
     */
    public CartDetail() {
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
     * Gets cart.
     *
     * @return the cart
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * Sets cart.
     *
     * @param cart the cart
     */
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    /**
     * Gets product.
     *
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets product.
     *
     * @param product the product
     */
    public void setProduct(Product product) {
        this.product = product;
    }
}
