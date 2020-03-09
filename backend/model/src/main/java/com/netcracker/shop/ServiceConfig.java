/*
 * Copyright
 */

package com.netcracker.shop;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * The type Service config.
 */
@Configuration
public class ServiceConfig {

    /**
     * Csv mapper csv mapper.
     *
     * @return the csv mapper
     */
    @Bean
    CsvMapper csvMapper() {
        return new CsvMapper();
    }

    /**
     * Object mapper object mapper.
     *
     * @return the object mapper
     */
    @Bean
    @Primary
    ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
