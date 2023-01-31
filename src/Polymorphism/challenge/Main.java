package Polymorphism.challenge;

class Car{

    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;
    private String color;
    private String model;

    public Car( int cylinders, int doors, String color, String model) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
        this.color = color;
        this.model = model;
    }

    public boolean startEngine(){
        System.out.println("Engine started...");
        return true;
    }

    public void accelerate(int velocity){

        if (startEngine()){
            System.out.println("Accelerate Vehicle to " + velocity);
        }else {
            System.out.println("Engine not turned on");
        }
    }

    public void brake(int velocity, int brake){
        velocity =- brake;
        System.out.println("Brake Vehicle to " + velocity);
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}

class Peugeot extends Car{

    public Peugeot(int cylinders, int doors, String color, String model) {
        super(cylinders, doors, color, model);
    }
}

class Ferrari extends Car{

    public Ferrari(int cylinders, int doors, String color, String model) {
        super(cylinders, doors, color, model);
    }
}

class VolksWagen extends Car{

    public VolksWagen(int cylinders, int doors, String color, String model) {
        super(cylinders, doors, color, model);
    }
}


public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, 5, "Blue", "Peugeot 2008");

        System.out.println("You have chosen a " + car.getModel() + " of " + car.getColor() + " color. It has " + car.getDoors() + " doors and the engine has " + car.getCylinders() + " Cylinders.");

        car.accelerate(200);



    }
}