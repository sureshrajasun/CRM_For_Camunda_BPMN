package com.tucanoo.crm.data.entities;

import javax.persistence.*;

@Entity
@Table(name="loan")
public class Loan {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    private Integer userId;

    @Column
    private Integer loanAmount;

    @Column
    private String loanType;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Loan(Integer userId, Integer loanAmount, String loanType) {
        this.userId = userId;
        this.loanAmount = loanAmount;
        this.loanType = loanType;
    }

    public Loan() {
    }

    public Loan(Long id, Integer userId, Integer loanAmount, String loanType) {
        this.id = id;
        this.userId = userId;
        this.loanAmount = loanAmount;
        this.loanType = loanType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
