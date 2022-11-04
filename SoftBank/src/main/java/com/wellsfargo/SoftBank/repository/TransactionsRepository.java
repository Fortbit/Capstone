package com.wellsfargo.SoftBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.SoftBank.model.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions,Long>{

}
