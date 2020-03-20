package com.netcracker.shop.exception.model;


/**
 * The type Holder.
 *
 * @param <T> the type parameter
 */
public class Holder<T> {
    private final T value;

    /**
     * Instantiates a new Holder.
     *
     * @param value the value
     */
    public Holder(T value) {
        this.value = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public T getValue() {
        return value;
    }
}
