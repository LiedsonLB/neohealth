package com.neohealth.neohealth.repositories;

import com.neohealth.neohealth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
