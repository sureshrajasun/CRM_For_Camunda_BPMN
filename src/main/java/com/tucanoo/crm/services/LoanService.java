package com.tucanoo.crm.services;

import com.tucanoo.crm.data.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository customerRepository) {
        this.loanRepository = customerRepository;
    }

}