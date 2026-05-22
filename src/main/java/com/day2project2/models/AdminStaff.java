package com.day2project2.models;

public class AdminStaff extends Staff{
    private double baseSalary;
    private int overtimeHours;
    private double hourlyRate;
    public AdminStaff(int staffId, String name, double baseSalary, int overtimeHours, double hourlyRate) {
        super(staffId, name);
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }
        @Override
        public double calculateSalary() {
            return baseSalary + (overtimeHours * hourlyRate);
        }
        @Override
        public void displayDetails() {
            System.out.println("Admin Staff Details:");
            System.out.println("Admin Staff ID: " + super.staffId);
            System.out.println("Name: " + super.name);
            System.out.println("Total Salary: " + calculateSalary());
        }
}
