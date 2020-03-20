/*
 * Copyright
 */

package com.netcracker.shop.db.repository;

import com.netcracker.shop.db.entity.CartDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Cart detail repository.
 */
public interface ICartDetailRepository extends JpaRepository<CartDetail, Integer> {
}
