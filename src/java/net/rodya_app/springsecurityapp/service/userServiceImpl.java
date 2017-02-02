package net.rodya_app.springsecurityapp.service;

import net.rodya_app.springsecurityapp.dao.RoleDao;
import net.rodya_app.springsecurityapp.dao.UserDao;
import net.rodya_app.springsecurityapp.model.Role;
import net.rodya_app.springsecurityapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rodya on 1.2.17.
 * Implementation of the {@UserService} interface
 */
@Service
public class userServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    Set<Role> roles= new HashSet<>();
    roles.add(roleDao.getOne(1L));
    user.setRoles(roles);
    userDao.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
