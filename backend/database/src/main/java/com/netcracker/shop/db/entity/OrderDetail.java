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
 * The type Order detail.
 */
@Entity
@Table(name = "ORDER_DETAILS")
public class OrderDetail {
    @Id
    @SequenceGenerator(name = "shopSeq", sequenceName = "SHOP_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shopSeq")
    @Column(name = "ORDER_DETAILS_ID")
    private Integer id;

    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "ORDER_ID", foreignKey = @ForeignKey(name = "ORDER_FK"))
    private Order order;

    @OneToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "PRODUCT_ID", foreignKey = @ForeignKey(name = "OR_DET_PR_FK"))
    private Product product;

    /**
     * Instantiates a new Order detail.
     */
    public OrderDetail() {
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
    public Order getOrder() {
        return order;
    }

    /**
     * Sets cart.
     *
     * @param order the order
     */
    public void setOrder(Order order) {
        this.order = order;
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
