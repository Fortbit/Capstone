package com.wellsfargo.SoftBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.SoftBank.model.FixedDeposit;

@Repository

public interface FixedDepositRepository extends JpaRepository<FixedDeposit,Long> {

}
