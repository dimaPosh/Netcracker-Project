/*
 * Copyright
 */

package com.netcracker.shop.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The enum Role dto.
 */
public enum RoleDto {
    /**
     * Admin role dto.
     */
    ADMIN(1),
    /**
     * User role dto.
     */
    USER(2);

    private final int id;

    RoleDto(final int id) {
        this.id = id;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    @JsonValue
    public int getId() {
        return id;
    }

    /**
     * Of role dto.
     *
     * @param id the id
     * @return the role dto
     */
    @JsonCreator
    public static RoleDto of(int id) {
        for (RoleDto value : values()) {
            if (value.id == id) {
                return value;
            }
        }
        return null;
    }
}
