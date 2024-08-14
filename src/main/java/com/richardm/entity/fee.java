package com.richardm.entity;

import java.util.Date;

public class fee {
    public int idLoan;
    public int number;
    public int idCustomer;
    public Date dateToPay;
    public double value;
    public double amortizationValue;
    public double interest;
    public boolean paid;
    
    public fee(){
        
    }
    
    public fee(int id, int num, int customer, Date toPay, double val, double amor, double inte, boolean ispaid){
        this.idLoan = id;
        this.number = num;
        this.idCustomer = customer;
        this.dateToPay = toPay;
        this.value = val;
        this.amortizationValue = amor;
        this.interest = inte;
        this.paid = ispaid;
    }
    
    public int getIdLoan() {
        return idLoan;
    }

    public int getNumber() {
        return number;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public Date getDateToPay() {
        return dateToPay;
    }

    public double getValue() {
        return value;
    }

    public double getAmortizationValue() {
        return amortizationValue;
    }

    public double getInterest() {
        return interest;
    }

    public boolean isPaid() {
        return paid;
    }
}
