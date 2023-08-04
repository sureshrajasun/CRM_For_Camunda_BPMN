package com.tucanoo.crm.data.repositories;

import com.tucanoo.crm.data.entities.Customer;
import com.tucanoo.crm.data.entities.Loan;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends PagingAndSortingRepository<Loan, Long>, JpaSpecificationExecutor<Customer> {
}
