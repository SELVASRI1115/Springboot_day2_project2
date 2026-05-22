package com.day2project2.models;

public class Principal extends Teacher{
     private double allowance;

     public Principal(int staffId, String name, String subject, double baseSalary, double incentive, double allowance) {
        super(staffId, name, subject, baseSalary, incentive);
        this.allowance = allowance;
     }
   @Override
    public double calculateSalary() {
        return super.calculateSalary() + allowance;
    }
    @Override
    public void displayDetails() {
        System.out.println("Principal Details:");
        System.out.println("Principal ID: " + super.staffId);
        System.out.println("Name: " + super.name);
        System.out.println("Subject: " + super.getSubject());
       // System.out.println("Base Salary: " + super.getBaseSalary());
       // System.out.println("Incentive: " + super.getIncentive());
        System.out.println("Allowance: " + allowance);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
