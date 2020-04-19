/*
 * Copyright
 */

package com.netcracker.shop.db.repository;

import com.netcracker.shop.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface User repository.
 */
public interface IUserRepository extends JpaRepository<User, Integer> {
    /**
     * Find by login user.
     *
     * @param login the login
     * @return the user
     */
    User findByLogin(String login);
}
