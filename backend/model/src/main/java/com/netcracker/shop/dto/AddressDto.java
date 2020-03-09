/*
 * Copyright
 */

package com.netcracker.shop.dto;

/**
 * The type Address dto.
 */
public class AddressDto {
    private Integer id;

    private String apartment;

    private String home;

    private String street;

    private String city;

    private String country;

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
     * Gets apartment.
     *
     * @return the apartment
     */
    public String getApartment() {
        return this.apartment;
    }

    /**
     * Sets apartment.
     *
     * @param apartment the apartment
     */
    public void setApartment(final String apartment) {
        this.apartment = apartment;
    }

    /**
     * Gets home.
     *
     * @return the home
     */
    public String getHome() {
        return this.home;
    }

    /**
     * Sets home.
     *
     * @param home the home
     */
    public void setHome(final String home) {
        this.home = home;
    }

    /**
     * Gets street.
     *
     * @return the street
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * Sets street.
     *
     * @param street the street
     */
    public void setStreet(final String street) {
        this.street = street;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Sets country.
     *
     * @param country the country
     */
    public void setCountry(final String country) {
        this.country = country;
    }
}
