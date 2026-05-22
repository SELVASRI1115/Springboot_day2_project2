package com.day2project2.models;
public class Teacher extends Staff{
        private String subject;
        private double baseSalary;
        private double incentive;

        public Teacher(int staffId, String name, String subject, double baseSalary, double incentive) {
            super(staffId, name);
            this.subject = subject;
            this.baseSalary = baseSalary;
            this.incentive = incentive;
        }

        public String getSubject() {
            return subject;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        public double getIncentive() {
            return incentive;
        }
        @Override
        public double calculateSalary() {
            return baseSalary + incentive;
        }
     @Override
        public void displayDetails() {
            System.out.println("Teacher Details:");
            System.out.println("Teacher ID: " + super.staffId);
            System.out.println("Name: " + super.name);
            System.out.println("Subject: " + subject);
            System.out.println("Base Salary: " + baseSalary);
            System.out.println("Incentive: " + incentive);
            System.out.println("Total Salary: " + calculateSalary());
        }
}
