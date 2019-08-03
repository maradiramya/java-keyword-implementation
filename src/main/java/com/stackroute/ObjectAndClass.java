package com.stackroute;
//java example for object and class
public class ObjectAndClass
{
    //creation of instance variable
    int sum;
    //method for class
    void calculateSum(int a,int b)
    {
        sum=a+b;
        System.out.println("sum is :"+sum);
    }

    public static void main(String[] args)
    {
        //creation of object for class
        ObjectAndClass objectAndClass=new ObjectAndClass();
        //calling method using object of the class
        objectAndClass.calculateSum(10,20);
        objectAndClass.calculateSum(20,30);
    }
}
