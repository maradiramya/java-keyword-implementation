package com.stackroute.lambdaExpression;

public class LambdaMain
{
    public static void main(String[] args)
    {
        //Traditional way
        new Thread(new RunnableDemo()).start();
        //By anonymous class
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        //by lambda expression
       new Thread(()-> {
           System.out.println("Lambda");
           System.out.println("Lambda");
       }).start();
    }

}
