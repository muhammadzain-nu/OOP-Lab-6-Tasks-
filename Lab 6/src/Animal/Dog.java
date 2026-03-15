package Animal;

public class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Woof Woof{That's a nice Bone:)}");
    }
    public static void main(){
Animal Janwar= new Animal();
Janwar.sound();
Cat billi = new Cat();
billi.sound();
Dog dog = new Dog();//nahhh
dog.sound();
    }
}
