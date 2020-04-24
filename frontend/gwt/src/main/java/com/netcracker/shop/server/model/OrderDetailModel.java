package com.netcracker.shop.server.model;

/**
 * The type Order detail model.
 */
public class OrderDetailModel {
    private Integer id;
    private ProductModel product;
    private OrderModel order;

    /**
     * Instantiates a new Order detail model.
     */
    public OrderDetailModel() {
    }

    /**
     * Instantiates a new Order detail model.
     *
     * @param id      the id
     * @param product the product
     * @param order   the order
     */
    public OrderDetailModel(Integer id, ProductModel product, OrderModel order) {
        this.id = id;
        this.product = product;
        this.order = order;
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

    /**
     * Gets order.
     *
     * @return the order
     */
    public OrderModel getOrder() {
        return order;
    }

    /**
     * Sets order.
     *
     * @param order the order
     */
    public void setOrder(OrderModel order) {
        this.order = order;
    }
}
