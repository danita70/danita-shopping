package com.danita.danitashopping.service;


import com.danita.danitashopping.model.User;

/**
 * @author daniel Taye
 *
 */
public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
