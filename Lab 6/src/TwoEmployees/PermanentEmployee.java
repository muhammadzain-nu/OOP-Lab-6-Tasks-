package TwoEmployees;


public class PermanentEmployee extends Employee {

    PermanentEmployee(double salary){
        super(salary);
    }

    void calculateBonus(){
        double bonus = salary * 0.10;
        int intBonus = (int) bonus;

        System.out.println("Bonus (integer): " + intBonus);
    }

    public static void main(String[] args){

        PermanentEmployee emp = new PermanentEmployee(50000);

        emp.displaySalary();

        emp.calculateBonus();
    }
}
