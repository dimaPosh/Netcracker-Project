/*
 * Copyright
 */

package com.netcracker.shop.db.repository;

import com.netcracker.shop.db.entity.CartDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * The interface Cart detail repository.
 */
public interface ICartDetailRepository extends JpaRepository<CartDetail, Integer> {
    /**
     * Find all by cart id list.
     *
     * @param id the id
     * @return the list
     */
    List<CartDetail> findAllByCart_Id(Integer id);
}
