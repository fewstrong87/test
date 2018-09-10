package com.fewstrong.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fewstrong.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
