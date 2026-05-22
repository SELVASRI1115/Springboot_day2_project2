package com.day2project2.services;

import com.day2project2.models.Staff;
import java.util.ArrayList;

public class StaffService {
     private ArrayList<Staff> staffList=new ArrayList<>();

     public void addStaff(Staff staff){
          staffList.add(staff);
     }
        public void displayAllStaff(){
            for(Staff staff : staffList){
                staff.displayDetails();
                System.out.println();
            }
        }
        public double calculateSalary(){
            double total=0;
            for(Staff staff : staffList){
                total+=staff.calculateSalary();
            }
            return total;
        }
}
