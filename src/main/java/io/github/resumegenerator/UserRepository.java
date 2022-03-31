package io.github.resumegenerator;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.resumegenerator.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}