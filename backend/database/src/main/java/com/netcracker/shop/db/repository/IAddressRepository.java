/*
 * Copyright
 */

package com.netcracker.shop.db.repository;

import com.netcracker.shop.db.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Addresses repository.
 */
@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer> {
}
