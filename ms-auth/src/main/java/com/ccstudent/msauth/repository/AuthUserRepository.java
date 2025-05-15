package com.ccstudent.msauth.repository;


import com.ccstudent.msauth.entity.AuthUser;
import com.google.common.base.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserRepository extends JpaRepository<AuthUser,Integer> {

    Optional<AuthUser> findByUserName(String userName);
}
