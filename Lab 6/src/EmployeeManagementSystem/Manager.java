package EmployeeManagementSystem;

public class Manager extends Employee {

    int teamSize;
    String department;

    Manager(){
        System.out.println("The Manager has been made by default");
    }

    Manager(int Id, String Name, int Salary, int ExperienceYears,
            int teamSize, String department){

        super(Id, Name, Salary, ExperienceYears);
        this.teamSize = teamSize;
        this.department = department;
    }

    void work(){
        System.out.println("Manager is working");
    }

    void manageTeam(){
        System.out.println("Manager is managing the team");
    }

}