/*
 * Copyright
 */

package com.netcracker.shop.db.repository;

import com.netcracker.shop.db.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Cart repository.
 */
@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {
}
