package net.rodya_app.springsecurityapp.dao;

import net.rodya_app.springsecurityapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rodya on 1.2.17.
 */
public interface UserDao extends JpaRepository<User,Long> {
    User findByUsername (String username);
}
