/*
 * Copyright
 */

package com.netcracker.shop.db.repository;

import com.netcracker.shop.db.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Category repository.
 */
public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
