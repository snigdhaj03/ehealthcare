package com.dell.ehealthcare.repository;

import com.dell.ehealthcare.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<BankAccount, Long> {

    BankAccount findByUserId (Long id);

    BankAccount findBankAccountByUser_IdAndAccountNumber(Long id, String account);

}