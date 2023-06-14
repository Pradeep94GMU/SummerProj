package com.librarymanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librarymanagement.model.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
