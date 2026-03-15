package UniversitySystem;

public class Student extends Person {
    String department;
    int Id;
    int Semester;
    double CGPA;
     Student(){

}
Student(String Name, int age, String department, int Id, int Semester, double CGPA){
super(Name, age);
this.department=department;
this.Id=Id;
this.Semester=Semester;
this.CGPA=CGPA;
}


    void displayStudent() {
        displayPerson();
        System.out.println("Department:"+department+"\nId:"+Id+"\nSemester:"+Semester+"\nCGPA:"+CGPA);
    }
}
