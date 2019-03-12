/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivity;

import java.util.Scanner;

public class SalaryaCalculator {

    public static void main(String[] args) {
        int hra;
        int specialallowance;
        int pf;
        int netpayablesalary;
        int basicsalary;

        System.out.println("Enter your basic salary:");
        Scanner sc1 = new Scanner(System.in);
        basicsalary = sc1.nextInt();

        hra = (50 * basicsalary) / 100;
        specialallowance = (75 * basicsalary) / 100;
        pf = (12 * basicsalary) / 100;
        netpayablesalary = basicsalary + hra + specialallowance - pf;

        System.out.println("Basic salary      =" + basicsalary);
        System.out.println("HRA               =" + hra);
        System.out.println("Special allowance =" + specialallowance);
        System.out.println("PF                =" + pf);
        System.out.println("------------------------");
        System.out.println("Net payable salary=" + netpayablesalary);

        // TODO code application logic here
    }

}
