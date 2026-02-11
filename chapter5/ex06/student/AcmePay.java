// Write your code here
/*
Create the AcmePay program for Acme Parts, which runs a small factory and employs workers who are paid one of three hourly rates depending on their shift:
first shift, $17 per hour,
second shift, $18.50 per hour,
third shift, $22 per hour.
Each factory worker might work any number of hours per week and any hours greater than 40 are paid at one and one-half times the usual rate. In addition, 
second-shift and third-shift workers can elect to participate in the retirement plan, for which 3% percent of the worker’s gross pay is deducted from the paychecks. 
Write the AcmePay program that prompts the user for hours worked and the shift number; if the shift number is 2 or 3, prompt the user to enter the worker’s choice to 
participate in the retirement plan (1 for "yes", 2 for "no"). 
    
    VARS
first shift, $17 per hour,
second shift, $18.50 per hour,
third shift, $22 per hour.
hours worked
total regular
total overtime
retirement deduction
netpay
    INPUT
Please enter shift - 1, 2, or 3 >> 
Please enter hours worked (can be a fraction) >> 
Do you want to participate in the retirement plan?
    Enter 1 for Yes and 2 for No >> 

    COMPUTE
* overtime (hw>40) hours are paid at .5+
*if the shift number is 2 or 3, prompt the user to enter the worker’s choice to 
participate in the retirement plan (1 for "yes", 2 for "no")
*retirement plan means 3% percent of the worker’s gross pay is deducted from the paychecks.

    OUTPUT
(1) the hours worked
(2) the shift
(3) the hourly pay rate
(4) the regular pay
(5) overtime pay
(6) the total of regular and overtime pay
(7) the retirement deduction, if any
(8) the net pay. 
*/

import java.util.Scanner;

public class AcmePay {
        static double fistShift=17;
        static double secondShift=18.50;
        static double thirdShift=22;
        static int getShift;
        static int hoursWorked;
        static double relularPay;
        static double overtimePay;
        static double totalOTP;
        static double retirementDed;
        static double netPay;

    public static void main(String[] args) {
        // double fistShift=17;
        // double secondShift=18.50;
        // double thirdShift=22;
        // int getShift;
        // int hoursWorked;
        // double relularPay;
        // double overtimePay;
        // double totalOTP;
        // double retirementDed;
        // double netPay;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter shift - 1, 2, or 3 >> ");
        getShift = keyboard.nextInt();
        switch (getShift) {
            case 1:
                System.out.println("Please enter hours worked (can be a fraction) >>");
                hoursWorked = keyboard.nextInt();
                retirementDed=0;
                if (hoursWorked>40) {
                    overtimePay = fistShift*.5;
                    print();
                } else {
                    print();
                }
                break;
            case 2:
                System.out.println("is 2");
                break;
            case 3:
                System.out.println("is 3");
                break;
        }
    }
    public static void print(){
            System.out.println("Hours worked is      "+hoursWorked);
                System.out.println("Shift:             "+getShift);
                System.out.println("Hourly pay rate is "+fistShift);
                relularPay=hoursWorked*fistShift;
                System.out.println("Regular pay is      "+relularPay);
                totalOTP=overtimePay*hoursWorked;
                System.out.println("Overtime pay is     "+totalOTP);
                System.out.println("Retirement deduction is "+retirementDed);
                System.out.println("     Net pay is.............."+netPay);
    }
}