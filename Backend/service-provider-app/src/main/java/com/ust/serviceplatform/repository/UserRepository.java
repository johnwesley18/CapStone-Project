package com.ust.serviceplatform.repository;

import com.ust.serviceplatform.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
  Users findByUsername(String username);
}
