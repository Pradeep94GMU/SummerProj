package com.librarymanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librarymanagement.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
