package net.rodya_app.springsecurityapp.service;

import net.rodya_app.springsecurityapp.model.User;

import java.util.HashSet;

/**
 * Created by rodya on 1.2.17.
 * Service pass for user
 */
public interface UserService {

    void save(User user);
    User findByUsername(String username);


}
