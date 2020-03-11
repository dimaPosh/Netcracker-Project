/*
 * Copyright
 */

package com.netcracker.shop.init;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

/**
 * The type Entry point.
 *
 * @since 0.0.1
 */
public final class EntryPoint {

    /**
     * Private constructor.
     */
    private EntryPoint() {
    }

    /**
     * The entry point of application.
     *
     * @param args The input arguments.
     */
    @SuppressWarnings("PMD.ProhibitPublicStaticMethods")
    public static void main(final String[] args) {
        SpringApplication.run(SpringBootConfig.class, args);
    }
}
