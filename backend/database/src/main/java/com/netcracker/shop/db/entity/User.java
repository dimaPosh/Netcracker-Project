/*
 * Copyright
 */

package com.netcracker.shop.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * The type Users.
 */
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer id;

    @Column(name = "LOGIN", nullable = false)
    private String login;

    @Column(name = "PASSWORD", nullable = false, columnDefinition = "bpchar")
    private char[] password;

    @Column(name = "FIRST_NAME", nullable = false)
    private String first_name;

    @Column(name = "LAST_NAME", nullable = false)
    private String last_name;

    @Column(name = "EMAIL", nullable = false)
    private String e_mail;

    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phone_number;

    @OneToMany
    @JoinColumn(name = "ADDRESS_ID")
    private Set<Address> address;

/*
    @JoinColumn(name = "CART_ID")
    private Cart cart_id;
 */

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
     * Gets login.
     *
     * @return the login
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * Sets login.
     *
     * @param login the login
     */
    public void setLogin(final String login) {
        this.login = login;
    }

    /**
     * Get password char [ ].
     *
     * @return the char [ ]
     */
    public char[] getPassword() {
        return this.password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(final char[] password) {
        this.password = password;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirst_name() {
        return this.first_name;
    }

    /**
     * Sets first name.
     *
     * @param first_name the first name
     */
    public void setFirst_name(final String first_name) {
        this.first_name = first_name;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLast_name() {
        return this.last_name;
    }

    /**
     * Sets last name.
     *
     * @param last_name the last name
     */
    public void setLast_name(final String last_name) {
        this.last_name = last_name;
    }

    /**
     * Gets e mail.
     *
     * @return the e mail
     */
    public String getE_mail() {
        return this.e_mail;
    }

    /**
     * Sets e mail.
     *
     * @param e_mail the e mail
     */
    public void setE_mail(final String e_mail) {
        this.e_mail = e_mail;
    }

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    public String getPhone_number() {
        return this.phone_number;
    }

    /**
     * Sets phone number.
     *
     * @param phone_number the phone number
     */
    public void setPhone_number(final String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * Gets address id.
     *
     * @return the address id
     */
    public Set<Address> getAddress() {
        return this.address;
    }

    /**
     * Sets address id.
     *
     * @param address the address id
     */
    public void setAddress(final Set<Address> address) {
        this.address = address;
    }
}
