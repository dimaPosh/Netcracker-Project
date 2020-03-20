/*
 * Copyright
 */

package com.netcracker.shop.dto;

/**
 * The type Cart detail dto.
 */
public class CartDetailDto {

    private Integer id;

    private CartDto cart;

    private ProductDto product;

    /**
     * Instantiates a new Cart detail dto.
     */
    public CartDetailDto() {
    }

    /**
     * Instantiates a new Cart detail dto.
     *
     * @param id      the id
     * @param cart    the cart
     * @param product the product
     */
    public CartDetailDto(Integer id, CartDto cart, ProductDto product) {
        this.id = id;
        this.cart = cart;
        this.product = product;
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
    public CartDto getCart() {
        return cart;
    }

    /**
     * Sets cart.
     *
     * @param cart the cart
     */
    public void setCart(CartDto cart) {
        this.cart = cart;
    }

    /**
     * Gets product.
     *
     * @return the product
     */
    public ProductDto getProduct() {
        return product;
    }

    /**
     * Sets product.
     *
     * @param product the product
     */
    public void setProduct(ProductDto product) {
        this.product = product;
    }
}
