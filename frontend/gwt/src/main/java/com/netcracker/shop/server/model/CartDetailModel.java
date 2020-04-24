package com.netcracker.shop.server.model;

/**
 * The type Cart detail model.
 */
public class CartDetailModel {
    private Integer id;

    private CartModel cart;

    private ProductModel product;

    /**
     * Instantiates a new Cart detail model.
     */
    public CartDetailModel() {
    }

    /**
     * Instantiates a new Cart detail model.
     *
     * @param id      the id
     * @param cart    the cart
     * @param product the product
     */
    public CartDetailModel(Integer id, CartModel cart, ProductModel product) {
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
    public CartModel getCart() {
        return cart;
    }

    /**
     * Sets cart.
     *
     * @param cart the cart
     */
    public void setCart(CartModel cart) {
        this.cart = cart;
    }

    /**
     * Gets product.
     *
     * @return the product
     */
    public ProductModel getProduct() {
        return product;
    }

    /**
     * Sets product.
     *
     * @param product the product
     */
    public void setProduct(ProductModel product) {
        this.product = product;
    }
}
