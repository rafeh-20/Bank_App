/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_app;

import java.util.ArrayList;

/**
 *
 * @author Rafeh
 */
public class Commercial_Credit extends CreditAccount {

    private String companyName;
    private double ownershipRate;

    public Commercial_Credit() {
    }
    

    public Commercial_Credit(String companyName, double ownershipRate, String cust_Fullname, String creditType, 
            double amount_Demanded, int id_no, int birthyear, String occupation, String mailAddress, String paymentTerm, double cust_income, ArrayList<Guarantors> guarantor) {
        super(cust_Fullname, creditType, amount_Demanded, id_no, birthyear, occupation, mailAddress, paymentTerm, cust_income, guarantor);
        this.companyName = companyName;
        this.ownershipRate = ownershipRate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getOwnershipRate() {
        return ownershipRate;
    }

    public void setOwnershipRate(double ownershipRate) {
        this.ownershipRate = ownershipRate;
    }
    

    @Override
    public String toString() {
        return "Commercial_Credit{" + super.toString() + "companyName=" + companyName + ", ownershipRate=" + ownershipRate + '}';
    }
    
    
     @Override
   public double getCreditPoints() {
       if ((amount_Demanded > 50000) || paymentTerm.equalsIgnoreCase("Short"))
           return amount_Demanded * 0.01;
       else
           return amount_Demanded * 0.005;
   }
   
    
    @Override
     public double rateOfInterest() {
         return 3.5;
     }
    
}
