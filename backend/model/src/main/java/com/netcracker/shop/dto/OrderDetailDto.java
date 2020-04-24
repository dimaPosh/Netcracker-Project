package com.netcracker.shop.dto;

/**
 * The type Order detail dto.
 */
public class OrderDetailDto {
    private Integer id;
    private ProductDto product;
    private OrderDto order;

    /**
     * Instantiates a new Order detail dto.
     */
    public OrderDetailDto() {
    }

    /**
     * Instantiates a new Order detail dto.
     *
     * @param id      the id
     * @param product the product
     * @param order   the order
     */
    public OrderDetailDto(Integer id, ProductDto product, OrderDto order) {
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

    /**
     * Gets order.
     *
     * @return the order
     */
    public OrderDto getOrder() {
        return order;
    }

    /**
     * Sets order.
     *
     * @param order the order
     */
    public void setOrder(OrderDto order) {
        this.order = order;
    }
}
