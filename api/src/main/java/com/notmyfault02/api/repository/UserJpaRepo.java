package com.notmyfault02.api.repository;

import com.notmyfault02.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<User, Long> {
}
