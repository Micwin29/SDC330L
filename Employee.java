/********************************************
 * Name: Michael Winstead
 * Date: 11/7/2025
 * Purpose: Assignment SDC330L Project
 */
import java.util.ArrayList;
import java.util.Scanner;

// Abstract Employee class
abstract class Employee {
    private int ID;
    private String Name;
    protected double Salary;

    // Constructors
    public Employee() {}

    public Employee(int id, String name) {
        ID = id;
        Name = name;
    }

    // Abstract method
    public abstract void calculatePay();

    // Display employee info
    public void displayInfo() {
        System.out.println("ID: " + ID + ", Name: " + Name + ", Salary: " + Salary);
    }

    // Getters and setters
    public int getId() { 
        return ID; 
    }
    public void setName(String name) { 
        Name = name; 
    }
    public void setSalary(double salary) { 
        Salary = salary; 
    }
}
