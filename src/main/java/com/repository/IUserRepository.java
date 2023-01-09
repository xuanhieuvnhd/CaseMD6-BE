package com.repository;

import com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findAppUserByEmail(String email);
}
