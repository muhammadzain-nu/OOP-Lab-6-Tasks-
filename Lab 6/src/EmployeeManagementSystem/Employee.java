package EmployeeManagementSystem;

public class Employee {

    int Id;
    String Name;
    int Salary;
    int ExperienceYears;

    Employee(){
        System.out.println("The Employee has been made by default");
    }

    Employee(int Id, String Name, int Salary, int ExperienceYears){
        this.Id = Id;
        this.Name = Name;
        this.Salary = Salary;
        this.ExperienceYears = ExperienceYears;
    }

    void work(){
        System.out.println("Employee is working");
    }
}