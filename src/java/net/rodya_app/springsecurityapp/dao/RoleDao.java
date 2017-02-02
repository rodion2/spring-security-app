package net.rodya_app.springsecurityapp.dao;

import net.rodya_app.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rodya on 1.2.17.
 */
public interface RoleDao extends JpaRepository<Role,Long> {

}
