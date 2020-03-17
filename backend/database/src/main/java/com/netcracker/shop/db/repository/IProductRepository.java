/*
 * Copyright
 */

package com.netcracker.shop.db.repository;

import com.netcracker.shop.db.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Product repository.
 */
@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
    /**
     * Find by category id list.
     *
     * @param category the category
     * @return the list
     */
    List<Product> findByCategoryId(Integer category);
}
