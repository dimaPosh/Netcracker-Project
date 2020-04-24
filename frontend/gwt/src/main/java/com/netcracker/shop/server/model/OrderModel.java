package com.netcracker.shop.server.model;

/**
 * The type Order model.
 */
public class OrderModel {
    private Integer id;
    private UserModel user;
    private AddressModel address;
    private Float amount;
    private String promo_code;

    /**
     * Instantiates a new Order model.
     */
    public OrderModel() {
    }

    /**
     * Instantiates a new Order model.
     *
     * @param id         the id
     * @param user       the user
     * @param address    the address
     * @param amount     the amount
     * @param promo_code the promo code
     */
    public OrderModel(final Integer id, final UserModel user,
                      final AddressModel address, final Float amount, final String promo_code) {
        this.id = id;
        this.user = user;
        this.address = address;
        this.amount = amount;
        this.promo_code = promo_code;
    }

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
     * Gets user.
     *
     * @return the user
     */
    public UserModel getUser() {
        return this.user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(final UserModel user) {
        this.user = user;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public AddressModel getAddress() {
        return this.address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(final AddressModel address) {
        this.address = address;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public Float getAmount() {
        return this.amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(final Float amount) {
        this.amount = amount;
    }

    /**
     * Gets promo code.
     *
     * @return the promo code
     */
    public String getPromo_code() {
        return this.promo_code;
    }

    /**
     * Sets promo code.
     *
     * @param promo_code the promo code
     */
    public void setPromo_code(final String promo_code) {
        this.promo_code = promo_code;
    }
}
