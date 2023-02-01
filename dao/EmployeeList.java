package com.bajaj.dao;
import com.bajaj.bean.ReferralRecord;
import com.bajaj.dao.EmployeeDPhoneCRUD;

public class EmployeeList {
    public static void main(String[] args) {
        EmployeeDPhoneCRUD emp = new EmployeeDPhoneCRUD();

        ReferralRecord record1 = new ReferralRecord();
        record1.setName("Rajeta");
        record1.setEmail("rajetasarkar2001@gmail.com");
        record1.setId(845886);
        record1.setBonusPoint(1000);

        emp.add(record1);
        ReferralRecord record2 = new ReferralRecord();
        record2.setName("Saurav");
        record2.setEmail("saurav@gmail.com");
        record2.setId(845887);
        record2.setBonusPoint(100);
        emp.add(record2);

        ReferralRecord record3 = new ReferralRecord();
        record3.setName("Ayushi");
        record3.setEmail("Ayushi@gmail.com");
        record3.setId(845888);
        record3.setBonusPoint(100);
        emp.add(record3);

        ReferralRecord record4 = new ReferralRecord();
        record4.setName("Gunja");
        record4.setEmail("gunja@gmail.com");
        record4.setId(845889);
        record4.setBonusPoint(100);
        emp.add(record4);
        menu();

        System.out.println("Display the records\n");
        emp.display();

        System.out.println("Delete the records where id = 845888\n");
        emp.delete(845888);
        emp.display();

        emp.update(845889,);


    }

    // Method 2
    // Menu - Static menu for displaying options
    public static void menu()
    {

        // Printing statements displaying menu on console
        System.out.println("MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("5: Display Students");

        System.out.print("\n");
    }
}
