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
 * The type Order.
 */
@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @SequenceGenerator(name = "shopSeq", sequenceName = "SHOP_SEQUENCE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shopSeq")
    @Column(name = "ORDER_ID")
    private Integer id;

    @ManyToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "USER_ID", foreignKey = @ForeignKey(name = "OR_US_FK"))
    private User user;

    @OneToOne(cascade = {CascadeType.DETACH})
    @JoinColumn(name = "ADDRESS_ID", foreignKey = @ForeignKey(name = "OR_AD_FK"))
    private Address address;

    @Column(name="AMOUNT")
    private Float amount;

    @Column(name = "PROMO_CODE")
    private String promo_code;

    /**
     * Instantiates a new Order.
     */
    public Order() {
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
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public Float getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(Float amount) {
        this.amount = amount;
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
