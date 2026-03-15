package EmployeeManagementSystem;

public class Main {
    public  static void main(String[] args){
        Employee employee = new Employee();
        employee.work();

        Employee employee1 = new Employee(1,"Zain",200000,5);
        employee1.work();

        Manager manager = new Manager(2,"Hamza",100000,5,10,"Developers");
        manager.manageTeam();
    }
}
