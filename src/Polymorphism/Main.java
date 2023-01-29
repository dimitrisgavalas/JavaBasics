package Polymorphism;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats alot people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take us over";
    }

}

class Mazerunner extends Movie{
    public Mazerunner() {
        super("Mazerunner");
    }

    @Override
    public String plot() {
        return "kids try and escape maze";
    }
}

class Starwars extends Movie{
    public Starwars() {
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the galaxy";
    }
}

class Forgetable extends  Movie{
    public Forgetable() {
        super("Forgetable");
    }

    //No plot method
}




public class Main {
    public static void main(String[] args) {

        for (int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random()* 5) + 1;
        System.out.println("Random number generator was: " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Mazerunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgetable();

        }

        return null;
    }
}

