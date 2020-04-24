package com.netcracker.shop.server.model;

/**
 * The type Address model.
 */
public class AddressModel {
    private Integer id;

    private String apartment;

    private String home;

    private String street;

    private String city;

    private String country;

    /**
     * Instantiates a new Address model.
     */
    public AddressModel() {
    }

    /**
     * Instantiates a new Address model.
     *
     * @param id        the id
     * @param apartment the apartment
     * @param home      the home
     * @param street    the street
     * @param city      the city
     * @param country   the country
     */
    public AddressModel(Integer id, String apartment, String home, String street, String city, String country) {
        this.id = id;
        this.apartment = apartment;
        this.home = home;
        this.street = street;
        this.city = city;
        this.country = country;
    }


    @Override
    public String toString() {
        return "Страна " + country
            + ", город " + city
            + ", улица " + street
            + ", дом " + home
            + ", кв " + apartment;
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
     * Gets apartment.
     *
     * @return the apartment
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Sets apartment.
     *
     * @param apartment the apartment
     */
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    /**
     * Gets home.
     *
     * @return the home
     */
    public String getHome() {
        return home;
    }

    /**
     * Sets home.
     *
     * @param home the home
     */
    public void setHome(String home) {
        this.home = home;
    }

    /**
     * Gets street.
     *
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets street.
     *
     * @param street the street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets country.
     *
     * @param country the country
     */
    public void setCountry(String country) {
        this.country = country;
    }
}
