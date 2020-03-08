/*
 * Copyright
 */

package com.netcracker.shop.db.repository;

import com.netcracker.shop.db.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Addresses repository.
 */
public interface IAddressRepository extends JpaRepository<Address, Integer> {
}
