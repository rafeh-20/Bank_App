/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_app;

/**
 *
 * @author Rafeh
 */
public class Guarantors {
    
 private String guarantor_fullname;
 private String guarantor_Iban;
 private String guarantor_Occupation;
 private double guarantor_Income;

    public Guarantors() {
    }

    public Guarantors(String guarantor_fullname, String guarantor_Iban, String guarantor_Occupation, double guarantor_Income) {
        this.guarantor_fullname = guarantor_fullname;
        this.guarantor_Iban = guarantor_Iban;
        this.guarantor_Occupation = guarantor_Occupation;
        this.guarantor_Income = guarantor_Income;
    }

    public String getGuarantor_fullname() {
        return guarantor_fullname;
    }

    public String getGuarantor_Iban() {
        return guarantor_Iban;
    }

    public String getGuarantor_Occupation() {
        return guarantor_Occupation;
    }

    public double getGuarantor_Income() {
        return guarantor_Income;
    }

    public void setGuarantor_fullname(String guarantor_fullname) {
        this.guarantor_fullname = guarantor_fullname;
    }

    public void setGuarantor_Iban(String guarantor_Iban) {
        this.guarantor_Iban = guarantor_Iban;
    }

    public void setGuarantor_Occupation(String guarantor_Occupation) {
        this.guarantor_Occupation = guarantor_Occupation;
    }

    public void setGuarantor_Income(double guarantor_Income) {
        this.guarantor_Income = guarantor_Income;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Guarantors{" + "guarantor_fullname=" + guarantor_fullname + ", guarantor_Iban=" + guarantor_Iban + ", guarantor_Occupation=" + guarantor_Occupation + ", guarantor_Income=" + guarantor_Income + '}';
    }
    
    
 
}
