package net.rodya_app.springsecurityapp.service;

/**
 * Created by rodya on 2.2.17.
 *Service of security
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
