package com.netcracker.shop.server.model;

/**
 * The enum Role model.
 */
public enum RoleModel {
    /**
     * Admin role model.
     */
    ADMIN(1),
    /**
     * User role model.
     */
    USER(2);
    private Integer id;

    RoleModel(Integer id) {
        this.id = id;
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
}
