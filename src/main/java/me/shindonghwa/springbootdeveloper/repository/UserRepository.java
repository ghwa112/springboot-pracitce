package me.shindonghwa.springbootdeveloper.repository;

import me.shindonghwa.springbootdeveloper.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}