package com.projects.marketlist.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.marketlist.model.User;

@Repository 
public interface UserRepository extends JpaRepository<User,Long> {
    Optional <User> findByEmail(String $email_user);
}
