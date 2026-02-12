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
    public static void main(String[] args) {
        final double FIRST_SHIFT=17, SECOND_SHIFT=18.50, THIRD_SHIFT=22;
        int hoursWorked, getShift, getRPlan;
        final double OT_RATE=1.5, RETIREMENT_DEDUCTION=0.03;
        double totalRegWeekPay=0, totalOTWeekPay=0, netPay=0, payRate=0, totalDedRetPlan=0;
        final int REG_WEEK_HOURS=40;

        Scanner keyboard = new Scanner(System.in);

        //SHIFT       
        System.out.println("Please enter shift - 1, 2, or 3 >> ");
        getShift = keyboard.nextInt();
        if (getShift == 1) {
            payRate = FIRST_SHIFT;
        } else if (getShift == 2) {
            payRate = SECOND_SHIFT;
        } else if(getShift == 3) {
            payRate = THIRD_SHIFT;
        } else {
            return;
        }

        //HOURS
        System.out.println("Please enter hours worked (can be a fraction) >> ");
        hoursWorked = keyboard.nextInt();   
        totalRegWeekPay = REG_WEEK_HOURS * payRate;
        if (hoursWorked >= 40) {
            totalOTWeekPay = (payRate*OT_RATE)*(hoursWorked-40);
        } else {
            totalOTWeekPay = 0;
        }
        //RETIREMENT PLAN
        if (getShift == 2 || getShift == 3) {
            System.out.println("Do you want to participate in the retirement plan?");
            System.out.println("   Enter 1 for Yes and 2 for No >> ");
            getRPlan = keyboard.nextInt();
            if (getRPlan == 1) {
                totalDedRetPlan = totalRegWeekPay * RETIREMENT_DEDUCTION;
            } else if (getRPlan == 2) {
                totalDedRetPlan = 0;
            } else {
                return;
                
            }
        } 
        //NETPAY
        netPay = totalRegWeekPay + totalOTWeekPay - totalDedRetPlan;
        
        //PRINT
        System.out.println("Hours worked is    "+hoursWorked);
        System.out.println("Shift:              "+getShift);
        System.out.println("Hourly pay rate is  "+payRate);
        System.out.println("Regular pay is     "+totalRegWeekPay);
        System.out.println("Overtime pay is    "+totalOTWeekPay);
        System.out.println("Retirement deduction is "+totalDedRetPlan);
        System.out.println("     Net pay is.............."+netPay);
    }
    
    
}


