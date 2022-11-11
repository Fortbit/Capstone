package com.wellsfargo.SoftBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.SoftBank.model.FundTransfer;

@Repository

public interface FundTransferRepository extends JpaRepository<FundTransfer, Long> {

}
