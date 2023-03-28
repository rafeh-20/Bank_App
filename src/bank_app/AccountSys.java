/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_app;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafeh
 */
public class AccountSys {
      private static ArrayList<CreditAccount> cust_list = new ArrayList();
      
      public static boolean isCustExists(int id) {
        for (int i = 0; i < cust_list.size(); i++) {
            CreditAccount a = cust_list.get(i);
            if (a.checkIdExists(id)) {
                return true;
            }
        }
        return false;
    }
            
    public static boolean addEducationCredit(String educationLevel, String schoolName, double scholarshipRate, String cust_Fullname, String creditType, double amount_Demanded, int id_no,
            int birthyear, String occupation, String mailAddress, String paymentTerm, double cust_income, ArrayList<Guarantors> guarantor) {
        if (isCustExists(id_no)) {
            return false;
        } else {
            Education_Credit ec = new  Education_Credit(educationLevel, schoolName, scholarshipRate, cust_Fullname, creditType, amount_Demanded, id_no, birthyear, occupation, mailAddress, paymentTerm, cust_income, guarantor);
            cust_list.add(ec);
            return true;
        }
    }
    
     public static boolean addTravelCredit(String passport_No, String countryToVisit, String airlineName, String cust_Fullname, String creditType,
            double amount_Demanded, int id_no, int birthyear, String occupation, String mailAddress, String paymentTerm, double cust_income, ArrayList<Guarantors> guarantor) {
        if (isCustExists(id_no)) {
            return false;
        } else {
            Travel_Credit tc = new  Travel_Credit(passport_No, countryToVisit, airlineName, cust_Fullname, creditType, amount_Demanded, id_no, birthyear, occupation, mailAddress, paymentTerm, cust_income, guarantor);
            cust_list.add(tc);
            return true;
        }
    }
     
            
    public static boolean addRealEstateCredit(String estateType, int yearBuilt, String address, String cust_Fullname, String creditType, 
            double amount_Demanded, int id_no, int birthyear, String occupation, String mailAddress, String paymentTerm, double cust_income, ArrayList<Guarantors> guarantor) {
        if (isCustExists(id_no)) {
            return false;
        } else {
            RealEstate_Credit rc = new  RealEstate_Credit(estateType, yearBuilt, address, cust_Fullname, creditType, amount_Demanded, id_no, birthyear, occupation, mailAddress, paymentTerm, cust_income, guarantor);
            cust_list.add(rc);
            return true;
        }
    }
    
            
    public static boolean addCommericalCredit(String companyName, double ownershipRate, String cust_Fullname, String creditType, 
            double amount_Demanded, int id_no, int birthyear, String occupation, String mailAddress, String paymentTerm, double cust_income, ArrayList<Guarantors> guarantor) {
        if (isCustExists(id_no)) {
            return false;
        } else {
            Commercial_Credit cc = new  Commercial_Credit(companyName, ownershipRate, cust_Fullname, creditType, amount_Demanded, id_no, birthyear, occupation, mailAddress, paymentTerm, cust_income, guarantor);
            cust_list.add(cc);
            return true;
        }
    }
     
    
    
     public static boolean removeCust(int id) {
        for (int i = 0; i < cust_list.size(); i++) {
            if (cust_list.get(i).getId_no() == id) {
                cust_list.remove(i);
                return true;
            }
        }
        return false;
    }
    
      public static CreditAccount searchCust(int id) {
        for (int i = 0; i < cust_list.size(); i++) {
            int idObj = cust_list.get(i).getId_no();
            if (idObj == id) {
                return cust_list.get(i);
            }
        }
        return null;
    }
      
      public static void calcPaymentPlan() {
        double payment = 0;
        for (CreditAccount c : cust_list) {
                if (c.paymentTerm.equalsIgnoreCase("short"))
                    payment = (c.amount_Demanded + ((c.amount_Demanded * c.rateOfInterest() * 0.5)/100))/12;
                else if (c.paymentTerm.equalsIgnoreCase("medium"))
                    payment = (c.amount_Demanded + ((c.amount_Demanded * c.rateOfInterest())/100))/24;
                else if (c.paymentTerm.equalsIgnoreCase("long"))
                    payment = (c.amount_Demanded + ((c.amount_Demanded * c.rateOfInterest() * 1.5)/100))/48;
            c.setMonthlypayment(payment);
        }
    }
      
        public static String display() {
        CreditAccount temp;
        String out = "";
        for (int i = 0; i < cust_list.size(); i++) {
            temp = (CreditAccount) cust_list.get(i);
            out += temp.toString() + "\n\n";
        }

        return out;
    }
    
    }
