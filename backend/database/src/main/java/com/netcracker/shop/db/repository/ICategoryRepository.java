/*
 * Copyright
 */

package com.netcracker.shop.db.repository;

import com.netcracker.shop.db.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Category repository.
 */
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
