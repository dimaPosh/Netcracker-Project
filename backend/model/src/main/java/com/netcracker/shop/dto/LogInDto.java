/*
 * Copyright
 */

package com.netcracker.shop.dto;

/**
 * The type Log in dto.
 */
public class LogInDto {
    private String login;
    private String password;

    /**
     * Instantiates a new Log in dto.
     */
    public LogInDto() {
    }

    /**
     * Instantiates a new Log in dto.
     *
     * @param login    the login
     * @param password the password
     */
    public LogInDto(String login, String password) {
        this.login = login;
        this.password = password;
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
}
