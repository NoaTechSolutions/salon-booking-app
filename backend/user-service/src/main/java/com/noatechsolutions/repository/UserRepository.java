package com.noatechsolutions.repository;

import com.noatechsolutions.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
