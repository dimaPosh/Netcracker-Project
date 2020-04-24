package com.netcracker.shop.server.model;

/**
 * The type User model.
 */
public class UserModel {
    private Integer id;
    private String login;
    private String password;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private Integer role;
    private AddressModel address;
    private CartModel cart;

    /**
     * Instantiates a new User model.
     */
    public UserModel() {
    }

    /**
     * Instantiates a new User model.
     *
     * @param id           the id
     * @param login        the login
     * @param password     the password
     * @param first_name   the first name
     * @param last_name    the last name
     * @param email        the email
     * @param phone_number the phone number
     * @param address      the address
     * @param role         the role
     * @param cart         the cart
     */
    public UserModel(Integer id, String login, String password,
                     String first_name, String last_name,
                     String email, String phone_number, AddressModel address, Integer role, CartModel cart) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.role = role;
        this.cart = cart;
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
     * Gets login.
     *
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets login.
     *
     * @param login the login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * Sets first name.
     *
     * @param first_name the first name
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * Sets last name.
     *
     * @param last_name the last name
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * Sets phone number.
     *
     * @param phone_number the phone number
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public AddressModel getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(AddressModel address) {
        this.address = address;
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    public Integer getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(Integer role) {
        this.role = role;
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
}
