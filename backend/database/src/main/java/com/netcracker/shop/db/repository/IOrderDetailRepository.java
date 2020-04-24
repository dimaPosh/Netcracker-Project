package com.netcracker.shop.db.repository;

import com.netcracker.shop.db.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Order detail repository.
 */
@Repository
public interface IOrderDetailRepository extends JpaRepository<OrderDetail, Integer> {

    /**
     * Find all by order id list.
     *
     * @param id the id
     * @return the list
     */
    List<OrderDetail> findAllByOrderId(Integer id);
}
