package com.stackroute;

import java.util.Scanner;
//java example for  loops i.e for,while
public class Loops
{
    public static void main(String[] args)
    {
        //taking input from user using Scanner class
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the input");
        int num=scn.nextInt();
        int sum=0;
        //checking the condition for given number using for loop
        for(int i=1;i<=num;i++){
             sum=sum+i;
            System.out.println("sum is :" + sum);
        }
//checking the condtion for output from For loop using while loop
while(sum>0)
{
    if(sum%2==0) {
        System.out.println("sum is a even number"+sum);
    }
    sum=sum-1;
}
    }
}
