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
public class RealEstate_Credit extends CreditAccount {
    
    private String estateType;
    private int yearBuilt;
    private String address;

    public RealEstate_Credit() {
    }

    public RealEstate_Credit(String estateType, int yearBuilt, String address, String cust_Fullname, String creditType, 
            double amount_Demanded, int id_no, int birthyear, String occupation, String mailAddress, String paymentTerm, double cust_income, ArrayList<Guarantors> guarantor) {
        super(cust_Fullname, creditType, amount_Demanded, id_no, birthyear, occupation, mailAddress, paymentTerm, cust_income, guarantor);
        this.estateType = estateType;
        this.yearBuilt = yearBuilt;
        this.address = address;
    }

    public String getEstateType() {
        return estateType;
    }

    public void setEstateType(String estateType) {
        this.estateType = estateType;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "RealEstate_Credit{" + super.toString() + "estateType=" + estateType + ", yearBuilt=" + yearBuilt + ", address=" + address + '}';
    }
    
    
    @Override
   public double getCreditPoints() {
       if ((amount_Demanded > 100000) || paymentTerm.equalsIgnoreCase("Short"))
           return amount_Demanded * 0.01;
       else
           return amount_Demanded * 0.005;
   }
    
    @Override
     public double rateOfInterest() {
         return 2.5;
     }
    
    
}
