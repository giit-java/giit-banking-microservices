package com.giit.banking.repository;

import com.giit.banking.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository  extends JpaRepository<Accounts,Long> {
}
