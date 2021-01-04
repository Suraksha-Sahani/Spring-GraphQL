package com.example.spqr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spqr.model.AppUser;

@Repository
public interface UserRepository extends JpaRepository<AppUser, String>{

}
