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
public class Travel_Credit extends CreditAccount {

    private String passport_No;
    private String countryToVisit;
    private String airlineName;

    public Travel_Credit() {
    }

    public Travel_Credit(String passport_No, String countryToVisit, String airlineName, String cust_Fullname, String creditType,
            double amount_Demanded, int id_no, int birthyear, String occupation, String mailAddress, String paymentTerm, double cust_income, ArrayList<Guarantors> guarantor) {
        super(cust_Fullname, creditType, amount_Demanded, id_no, birthyear, occupation, mailAddress, paymentTerm, cust_income, guarantor);
        this.passport_No = passport_No;
        this.countryToVisit = countryToVisit;
        this.airlineName = airlineName;
    }

    public String getPassport_No() {
        return passport_No;
    }

    public void setPassport_No(String passport_No) {
        this.passport_No = passport_No;
    }

    public String getCountryToVisit() {
        return countryToVisit;
    }

    public void setCountryToVisit(String countryToVisit) {
        this.countryToVisit = countryToVisit;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    @Override
    public String toString() {
        return "Travel_Credit{" + super.toString() + "passport_No=" + passport_No + ", countryToVisit=" + countryToVisit + ", airlineName=" + airlineName + '}';
    }
    
    
    
     @Override
   public double getCreditPoints() {
       if ((amount_Demanded > 3000) || paymentTerm.equalsIgnoreCase("Short"))
           return amount_Demanded * 0.1;
       else
           return amount_Demanded * 0.05;
   }
    
    @Override
     public double rateOfInterest() {
         return 5.0;
     }
    
}
