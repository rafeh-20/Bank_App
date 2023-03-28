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
public class Education_Credit extends CreditAccount {
    
 private String educationLevel;
 private String schoolName;
 private double scholarshipRate;

    public Education_Credit() {
    }

    public Education_Credit(String educationLevel, String schoolName, double scholarshipRate, String cust_Fullname, String creditType,
            double amount_Demanded, int id_no, int birthyear, String occupation, String mailAddress, String paymentTerm, double cust_income, ArrayList<Guarantors> guarantor) {
        super(cust_Fullname, creditType, amount_Demanded, id_no, birthyear, occupation, mailAddress, paymentTerm, cust_income, guarantor);
        this.educationLevel = educationLevel;
        this.schoolName = schoolName;
        this.scholarshipRate = scholarshipRate;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarshipRate() {
        return scholarshipRate;
    }

    public void setScholarshipRate(double scholarshipRate) {
        this.scholarshipRate = scholarshipRate;
    }

    @Override
    public String toString() {
        return "Education_Credit{" + super.toString() + "educationLevel=" + educationLevel + ", schoolName=" + schoolName + ", scholarshipRate=" + scholarshipRate + '}';
    }
    
 

 @Override
   public double getCreditPoints() {
       if ((amount_Demanded > 5000) || paymentTerm.equalsIgnoreCase("Short"))
           return amount_Demanded * 0.1;
       else
           return amount_Demanded * 0.05;
   }
    
 @Override
     public double rateOfInterest() {
         return 2.0;
     }
    
}
