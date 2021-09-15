package com.cabinvoicegenerator;

import java.util.*;

public class CabInvoiceGenerator {
    public static void calculateFare(){
        double dis = 0,time = 0,cost = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Distance in Killometer:");
        double distance = sc.nextDouble();
        System.out.print("Enter Time:");
        double t = sc.nextDouble();
        dis = (dis + distance*10);
        time = (time + t*1);
        cost = (cost + distance + t);
        System.out.println("Total Cost is:"+cost);
    }
    public static void calculateAggregateFare(){
        double dis = 0,time = 0,cost = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Distance in Killometer:");
        double distance = sc.nextDouble();
        System.out.print("Enter Time:");
        double t = sc.nextDouble();
        dis = (dis + distance*10);
        time = (time + t*1);
        cost = (cost + distance + t);
        System.out.println("Total Cost is:"+cost);
        System.out.println("How many Passengers?");
        int passenger = sc.nextInt();
        double total_avg = (cost/passenger);
        System.out.println("Average Total Rate is:"+total_avg);
    }
    public static void displayEnhancedInvoice(){
        double dis = 0,time = 0,cost = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Distance in Killometer:");
        double distance = sc.nextDouble();
        System.out.print("Enter Time:");
        double t = sc.nextDouble();
        dis = (dis + distance*10);
        time = (time + t*1);
        cost = (cost + distance + t);
        System.out.println("Total Cost is:"+cost);
        System.out.println("How many Passengers?");
        int passenger = sc.nextInt();
        double total_avg = (cost/passenger);
        System.out.println("Average Total Rate is:"+total_avg);
        System.out.println("What are the total no. of Rides?");
        int rides = sc.nextInt();
        System.out.println("Total no. of Rides:"+rides);
    }
    public static void main(String[] args){
        System.out.println("Welcome to Cab Invoice Generator problem.");
        CabInvoiceGenerator obj = new CabInvoiceGenerator();
        obj.calculateFare();
        obj.calculateAggregateFare();
        obj. displayEnhancedInvoice();
    }
}
