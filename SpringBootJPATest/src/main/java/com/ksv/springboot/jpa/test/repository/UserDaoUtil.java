package com.ksv.springboot.jpa.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksv.springboot.jpa.test.entity.User;

@Repository
public interface UserDaoUtil extends JpaRepository<User, Long> {

}
