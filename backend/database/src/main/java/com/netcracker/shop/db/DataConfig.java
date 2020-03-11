/*
 * Copyright
 */

package com.netcracker.shop.db;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The type Data config.
 */
@Configuration
@EntityScan("com.netcracker.shop.db.entity")
@ComponentScan("com.netcracker.shop")
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("com.netcracker.shop.db.repository")
@EnableTransactionManagement
public class DataConfig {
}
