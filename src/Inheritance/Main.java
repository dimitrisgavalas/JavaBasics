package Inheritance;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//        Dog dog = new Dog("Yorkie", 4,20,2, 4, 1, 30, "long silky");
//        dog.eat();


        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-39);

    }
}
