package UniversitySystem;

public class GraduateStudent extends Student{
    int PassingYear;
    boolean isEmployed;
    GraduateStudent(){

    }
    GraduateStudent(String Name, int age, String department, int Id, int Semester, double CGPA, int PassingYear, boolean isEmployed){
        super(Name, age, department, Id, Semester, CGPA);
        this.PassingYear=PassingYear;
        this.isEmployed=isEmployed;
    }
    void displayGraduateStudent(){
        displayStudent();
        System.out.println("Passing Year"+PassingYear);
        if(isEmployed){
            System.out.println("Employment Status:Employed");
        }else {
            System.out.println("Employment Status:Unemployed");
        }
    }
}
