package gr.aueb.cf.teachersapp.repository;

import gr.aueb.cf.teachersapp.core.enums.Role;
import gr.aueb.cf.teachersapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByRole(Role role);
    Optional<User> findByUsername(String username);
    Long countByRole(Role role);
}