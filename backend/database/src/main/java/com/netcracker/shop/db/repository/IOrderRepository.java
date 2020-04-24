package com.netcracker.shop.db.repository;

import com.netcracker.shop.db.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Order repository.
 */
@Repository
public interface IOrderRepository extends JpaRepository<Order, Integer> {

    /**
     * Find all by user id list.
     *
     * @param id the id
     * @return the list
     */
    List<Order> findAllByUserId(Integer id);
}
