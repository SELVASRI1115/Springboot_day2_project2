package com.day2project2.models;

public class Intern extends Staff{
     private double stipend;

        public Intern(int staffId, String name, double stipend) {
            super(staffId, name);
            this.stipend = stipend;
        }
        @Override
        public double calculateSalary() {
            return stipend;
        }
        @Override
        public void displayDetails() {
            System.out.println("Intern Details:");
            System.out.println("Intern ID: " + super.staffId);
            System.out.println("Name: " + super.name);
            System.out.println("Stipend: " + stipend);
            System.out.println("Tax      :  0");
        }  
}
