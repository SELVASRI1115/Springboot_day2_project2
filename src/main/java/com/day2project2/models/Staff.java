package com.day2project2.models;

public abstract class Staff {
      protected int staffId;
      protected String name;
      public Staff(int staffId, String name) {
            this.staffId = staffId;
            this.name = name;
      }
      public abstract double calculateSalary();
      public abstract void displayDetails();
}
