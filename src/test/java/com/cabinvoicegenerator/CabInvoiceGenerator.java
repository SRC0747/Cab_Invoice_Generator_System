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
    public static void main(String[] args){
        System.out.println("Welcome to Cab Invoice Generator problem.");
        CabInvoiceGenerator obj = new CabInvoiceGenerator();
        obj.calculateFare();
    }
}
