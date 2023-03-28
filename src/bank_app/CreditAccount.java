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
abstract public class CreditAccount implements InterestInterface {
    protected String cust_Fullname;
    protected String creditType;
    protected double amount_Demanded;
    protected int id_no;
    protected int birthyear;
    protected String occupation;
    protected String mailAddress;
    protected String paymentTerm;
    protected double cust_income;
    protected static int numOfAccounts;
    protected ArrayList<Guarantors> guarantor;
    protected double monthlypayment;

    public double getMonthlypayment() {
        return monthlypayment;
    }

    public void setMonthlypayment(double monthlypayment) {
        this.monthlypayment = monthlypayment;
    }
    
    public CreditAccount() {
        numOfAccounts+=1;
    }

    public CreditAccount(String cust_Fullname, String creditType, double amount_Demanded, int id_no, int birthyear, String occupation, String mailAddress, String paymentTerm, double cust_income, ArrayList<Guarantors> guarantor) {
        this.cust_Fullname = cust_Fullname;
        this.creditType = creditType;
        this.amount_Demanded = amount_Demanded;
        this.id_no = id_no;
        this.birthyear = birthyear;
        this.occupation = occupation;
        this.mailAddress = mailAddress;
        this.paymentTerm = paymentTerm;
        this.cust_income = cust_income;
        this.guarantor = (ArrayList<Guarantors>)guarantor.clone();
        numOfAccounts+=1;
    }
    
    
    
    
   public boolean checkIdExists(int id)
   {
       if(this.id_no==id)
   return true;
       return false;
       
   }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }


    public void setId_no(int id_no) {
        this.id_no = id_no;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public void setCust_income(double cust_income) {
        this.cust_income = cust_income;
    }

    public int getId_no() {
        return id_no;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public double getCust_income() {
        return cust_income;
    }

    public static int getNumOfAccounts() {
        return numOfAccounts;
    }
   
   /*public void getInput()
   {
   Scanner sc=new Scanner(System.in);
       System.out.println("Enter your fullname");
       cust_Fullname=sc.nextLine();
       System.out.println("Enter your credit type");
       creditType=sc.nextLine();
       System.out.println("Enter amount demanded");
       sc.skip("\n");
       amount_Demanded=sc.nextDouble();
        sc.skip("\n");
       System.out.println("Enter id no");
        id_no=sc.nextInt();
       System.out.println("Enter birthday:");
      birthyear=sc.nextInt();
       
       System.out.println(" Enter occupation:");
       occupation=sc.nextLine();
       System.out.println("Enter mail address:");
       mailAddress=sc.nextLine();
       System.out.println("Enter choice of long of the payment  term:");
       choice_long_ofpaymentTerm=sc.nextLine();
       System.out.println("Enter your customer income:");
       cust_income=sc.nextDouble();
}*/

    @Override
    public String toString() {
        return "CreditAccount\n" + "Customer Fullname=\n" + cust_Fullname + ", Credit Type=\n" + creditType + ", Amount Demanded=\n" + amount_Demanded + ", ID No=\n" + id_no + ", Birth Year=\n" + birthyear + ", Occupation=\n" + occupation + ", Mail Address=\n" + mailAddress + ", Payment Term=\n" + paymentTerm + ", Customer Income=\n" + cust_income + '\n';
    }
   
   public abstract double getCreditPoints();
   
}
