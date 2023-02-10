package com.danita.danitashopping.service;

import com.danita.danitashopping.model.Role;
import com.danita.danitashopping.model.User;

import java.util.Optional;
/**
 * @author daniel Taye
 *
 */
public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
