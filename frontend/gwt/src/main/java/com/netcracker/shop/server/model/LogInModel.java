/*
 * Copyright
 */

package com.netcracker.shop.server.model;

/**
 * The type Log in model.
 */
public class LogInModel {
    private String login;
    private String password;

    /**
     * Instantiates a new Log in model.
     */
    public LogInModel() {
    }

    /**
     * Instantiates a new Log in model.
     *
     * @param login    the login
     * @param password the password
     */
    public LogInModel(String login, String password) {
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
