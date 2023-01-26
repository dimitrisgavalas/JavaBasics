package Encapulation;

public class Main {

    public static void main(String[] args) {

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Jim", 50, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());




//*********************No Encapulation*********
//        Player player = new Player();
//        player.fullName = "Jim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage= 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
    }

}
