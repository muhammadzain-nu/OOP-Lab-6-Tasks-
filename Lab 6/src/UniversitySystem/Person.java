package UniversitySystem;

public class Person {
    String Name;
    int age;
    Person(){
    }
    Person(String Name,int age){
        this.Name=Name;
        this.age=age;
    }
    void displayPerson(){
        System.out.println("Name:"+Name);
        System.out.println("Age:"+age);
    }
}
