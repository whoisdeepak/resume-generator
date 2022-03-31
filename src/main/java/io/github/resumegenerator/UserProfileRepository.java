package io.github.resumegenerator;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.resumegenerator.models.User;
import io.github.resumegenerator.models.UserProfile;

import java.util.Optional;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {
    Optional<UserProfile> findByUserName(String userName);
}