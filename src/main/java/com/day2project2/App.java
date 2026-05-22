
package com.day2project2;

import com.day2project2.models.AdminStaff;
import com.day2project2.models.Intern;
import com.day2project2.models.Principal;
import com.day2project2.models.Teacher;
import com.day2project2.services.StaffService;

public class App {

    public static void main(String[] args) {

        StaffService service = new StaffService();

        Teacher t1 = new Teacher(
                101,
                "Selvasri",
                "Java",
                50000,
                5000
        );

        Principal p1 = new Principal(
                102,
                "Arun",
                "Management",
                80000,
                10000,
                15000
        );

        AdminStaff a1 = new AdminStaff(
                103,
                "Kumar",
                30000,
                10,
                500
        );

        Intern i1 = new Intern(
                104,
                "Ravi",
                10000
        );

        service.addStaff(t1);
        service.addStaff(p1);
        service.addStaff(a1);
        service.addStaff(i1);

        service.displayAllStaff();

        System.out.println("===== Total Salary Payout =====");

        System.out.println(service.calculateSalary());
    }  
}

