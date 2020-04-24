package com.netcracker.shop.dto;

/**
 * The type Order dto.
 */
public class OrderDto {
    private Integer id;
    private UserDto user;
    private AddressDto address;
    private Float amount;
    private String promo_code;

    /**
     * Instantiates a new Order dto.
     */
    public OrderDto() {
    }

    /**
     * Instantiates a new Order dto.
     *
     * @param id         the id
     * @param user       the user
     * @param address    the address
     * @param promo_code the promo code
     * @param amount     the amount
     */
    public OrderDto(Integer id, UserDto user, AddressDto address, String promo_code, Float amount) {
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
    public UserDto getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(UserDto user) {
        this.user = user;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public AddressDto getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(AddressDto address) {
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
