package com.bajaj.dao;
import com.bajaj.bean.ReferralRecord;
import java.util.Scanner;
import java.util.LinkedList;

public class EmployeeDPhoneCRUD {
    LinkedList<ReferralRecord> list;

    // Default Constructor
    public EmployeeDPhoneCRUD()
    {
        list = new LinkedList<>();
    }

    public void add (ReferralRecord record){
        list.add(record);
    }
    public void delete (int id){
        ReferralRecord deleteRecord = null;
        for(ReferralRecord ll: list){
            if(ll.getId() == id){
                deleteRecord = ll;
            }
        }
        if(deleteRecord == null){
            System.out.println("invalid id");
        }
        else {
            list.remove(deleteRecord);
            System.out.println("data successfully deleted");
        }
    }
    // Display Records
    public void display()
    {
        if (list.isEmpty()) {

            System.out.println("The list has no records\n");
        }

        for (ReferralRecord record : list) {

            System.out.println(record.toString());
        }
    }

    public void update(int id, Scanner input)
    {

        if (find(id)) {
            ReferralRecord rec = findRecord(id);

            System.out.print("What is the updated Bonus Point ");
            int BonusPoint = input.nextInt();
            input.nextLine();

            System.out.print("What is the new employee Name ? ");
            String name = input.nextLine();

            rec.setName(name);
            rec.setBonusPoint(BonusPoint);
            System.out.println("Record Updated Successfully");
        }
        else {

            // Print statement
            System.out.println("Record Not Found in the Student list");
        }
    }
    public boolean find(int idNumber)
    {

        for (ReferralRecord l : list) {

            // Checking record by id Number
            if (l.getId() == idNumber) {

                System.out.println(l);
                return true;
            }
        }
        return false;
    }
    public ReferralRecord findRecord(int idNumber)
    {

        // Iterate Record list
        // using for each loop
        for (ReferralRecord l : list) {

            // Checking record by id Number.
            if (l.getId() == idNumber) {
                return l;
            }
        }

        return null;
    }
}
