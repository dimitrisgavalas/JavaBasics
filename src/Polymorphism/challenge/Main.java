package Polymorphism.challenge;

class Car{

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    private int doors;
    private String color;

    public Car( int cylinders, int doors, String color, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
        this.color = color;
        this.name = name;
    }

    public boolean startEngine(){

        if (engine){
            return true;
        }else {
            return false;
        }
    }

    public void accelerate(int velocity){

        if (startEngine()){
            System.out.println("Engine started...");
            System.out.println("Accelerate Vehicle to " + velocity);
        }else {
            System.out.println("Engine not turned on");
        }
    }

    public String brake(){
        return "Car --> brake()";
    }


    public int getCylinders() {
        return cylinders;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}

class Peugeot extends Car{

    public Peugeot(int cylinders, int doors, String color, String name) {
        super(cylinders, doors, color, name);
    }

    @Override
    public void accelerate(int velocity) {
        System.out.println("Peugeot vroum");
        super.accelerate(velocity);
    }

    @Override
    public String brake() {
        return "Peugeot --> brake()";
    }
}

class Ferrari extends Car{
    public Ferrari(int cylinders, int doors, String color, String name) {
        super(cylinders, doors, color, name);
    }

    @Override
    public void accelerate(int velocity) {
        System.out.println("Ferrari vroum");
        super.accelerate(velocity);
    }

    @Override
    public String brake() {
        return "Ferrari --> brake()";
    }
}

class Volkswagen extends Car{

    public Volkswagen(int cylinders, int doors, String color, String name) {
        super(cylinders, doors, color, name);
    }
    @Override
    public void accelerate(int velocity) {
        System.out.println("Volkswagen vroum");
        super.accelerate(velocity);
    }

    @Override
    public String brake() {
//      Instead of writing the class we can call like the example below
        return getClass().getName() + " --> brake()";
    }
}


public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, 5, "Blue", "Peugeot 2008");
        car.startEngine();
        car.accelerate(111);
        System.out.println(car.brake());
        System.out.println("You have chosen a " + car.getName() + " of " + car.getColor() + " color. It has " + car.getDoors() + " doors and the engine has " + car.getCylinders() + " Cylinders.");


        Ferrari ferrari = new Ferrari(19, 3, "Red", "458 Italia");
        ferrari.startEngine();
        ferrari.accelerate(900);
        System.out.println(ferrari.brake());
        System.out.println("You have chosen a " + ferrari.getName() + " of " + ferrari.getColor() + " color. It has " + ferrari.getDoors() + " doors and the engine has " + ferrari.getCylinders() + " Cylinders.");


        Peugeot peugeot = new Peugeot(6, 5, "Blue Electric", "Peugeot 2008");
        peugeot.startEngine();
        peugeot.accelerate(300);
        System.out.println(peugeot.brake());
        System.out.println("You have chosen a " + peugeot.getName() + " of " + peugeot.getColor() + " color. It has " + peugeot.getDoors() + " doors and the engine has " + peugeot.getCylinders() + " Cylinders.");


        Volkswagen volkswagen = new Volkswagen(4, 3, "Blue Space", "Beatle");
        volkswagen.startEngine();
        volkswagen.accelerate(100);
        System.out.println(volkswagen.brake());
        System.out.println("You have chosen a " + volkswagen.getName() + " of " + volkswagen.getColor() + " color. It has " + volkswagen.getDoors() + " doors and the engine has " + volkswagen.getCylinders() + " Cylinders.");





//        for (int i=1; i<5; i++){
//            Car car2 = randomCar();
//            System.out.println("You have chosen a " + car2.getModel() + " of " + car2.getColor() + " color. It has " + car2.getDoors() + " doors and the engine has " + car2.getCylinders() + " Cylinders.");
//        }



    }

//    public static Car randomCar(){
//        int randomNumber = (int) (Math.random()* 5) + 1;
//        System.out.println("Random number generator was: " + randomNumber);
//
//        switch (randomNumber){
//            case 1:
//                return new Ferrari();
//            case 2:
//                return new Volkswagen();
//            case 3:
//                return new Peugeot();
//
//        }
//
//        return null;
//    }
}