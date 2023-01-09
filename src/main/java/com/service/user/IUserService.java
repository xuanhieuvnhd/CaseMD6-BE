package com.service.user;

import com.entity.User;
import com.service.GenericService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends GenericService<User>, UserDetailsService {
    UserDetails loadUserByUsername(String username);

    User getUserByUsername(String username);

    User findAppUserByEmail(String email);
}
