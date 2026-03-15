package Animal;

public class Animal {
   String Name;
   int age;
   String Gender;
    Animal(){

    }
    Animal(String Name, int age, String Gender){
        this.Name=Name;
        this.age=age;
        this.Gender=Gender;
    }
    void sound(){
        System.out.println("Animal Makes Sound");
    }
}
