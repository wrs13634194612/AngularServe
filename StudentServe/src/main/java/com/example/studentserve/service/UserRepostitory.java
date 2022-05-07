package com.example.studentserve.service;


import com.example.studentserve.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostitory extends JpaRepository<User, Integer> {

}