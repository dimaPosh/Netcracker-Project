/*
 * Copyright
 */

package com.netcracker.shop.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The type Addresses.
 *
 * @since 0.0.1
 */
@Entity
@Table(name = "ADDRESSES")
public class Address {
    @Id
    @SequenceGenerator(name = "shopSeq",sequenceName = "SHOP_SEQUENCE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shopSeq")
    @Column(name = "ADDRESS_ID")
    private Integer id;

    @Column(name = "APARTMENT", nullable = false)
    private String apartment;

    @Column(name = "HOME", nullable = false)
    private String home;

    @Column(name = "STREET", nullable = false)
    private String street;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "COUNTRY", nullable = false)
    private String country;

    public Address() {
    }

    /**
     * Gets id.
     *
     * @return The id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Sets id.
     *
     * @param id The id
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * Gets apartment.
     *
     * @return The apartment
     */
    public String getApartment() {
        return this.apartment;
    }

    /**
     * Sets apartment.
     *
     * @param apartment The apartment
     */
    public void setApartment(final String apartment) {
        this.apartment = apartment;
    }

    /**
     * Gets home.
     *
     * @return The home
     */
    public String getHome() {
        return this.home;
    }

    /**
     * Sets home.
     *
     * @param home The home
     */
    public void setHome(final String home) {
        this.home = home;
    }

    /**
     * Gets street.
     *
     * @return The street
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * Sets street.
     *
     * @param street The street
     */
    public void setStreet(final String street) {
        this.street = street;
    }

    /**
     * Gets city.
     *
     * @return The city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets city.
     *
     * @param city The city
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * Gets country.
     *
     * @return The country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Sets country.
     *
     * @param country The country
     */
    public void setCountry(final String country) {
        this.country = country;
    }
}
