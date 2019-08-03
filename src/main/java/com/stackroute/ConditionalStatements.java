package com.stackroute;

import java.util.Scanner;
//java example for conditional statements i.e if, if else,nested if,switch
public class ConditionalStatements
{
    public static void main(String[] args)
    {
        //taking input from user using Scanner class
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number");
        int num = scn.nextInt();
        //checking condition for number using nested if and else if
        if (num < 100) {
            System.out.println("given number is less than 100");
            if(num>50)
            {
                System.out.println("given number is greater than 50");
            }
        } else if (num > 100) {
            System.out.println("given number is greater than 100");
        } else {
            System.out.println("given number is equal to 100 ");
        }
   // ckecking the condition using switch case statement
        switch(num)
        {

            case 101:
                System.out.println("101");
                break;
            case 70:
                System.out.println("70");
              break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("number not in 101,50,30");
        }
    }
}
