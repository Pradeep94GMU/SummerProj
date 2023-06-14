package com.librarymanagement.service;

import java.util.List;

import com.librarymanagement.model.Transaction;

public interface TransactionService {
	
	 	List<Transaction> getAllTransactions();
	    Transaction getTransactionById(Long id);
	    Transaction saveTransaction(Transaction transaction);
	    void deleteTransaction(Long id);

}
