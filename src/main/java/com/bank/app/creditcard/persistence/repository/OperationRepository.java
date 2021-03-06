package com.bank.app.creditcard.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.app.creditcard.model.Operation;

@Repository
interface OperationRepository extends JpaRepository<Operation, Long>{

}
