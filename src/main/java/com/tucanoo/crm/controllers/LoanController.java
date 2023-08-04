package com.tucanoo.crm.controllers;

import com.tucanoo.crm.data.entities.Customer;
import com.tucanoo.crm.data.entities.Loan;
import com.tucanoo.crm.data.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private final LoanRepository loanRepository;

    public LoanController(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @PostMapping("/{userId}/{loanAmount}/{loanType}")
    public ResponseEntity<Loan> createLoan(@PathVariable Integer userId, @PathVariable Integer loanAmount, @PathVariable String loanType ) {
        Loan loan = new Loan();
        loan.setUserId(userId);
        loan.setLoanType(loanType);
        loan.setLoanAmount(loanAmount);

        Loan loanInstance = loanRepository.save(loan);
        return new ResponseEntity<>(loanInstance, HttpStatus.OK);
    }


}