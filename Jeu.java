import java.util.Scanner;

public class Jeu {

    protected static Scanner sc = new Scanner(System.in);
    
    public static void delay(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // method to display text with a delay of 1s to make it more realistic
    public static void displayText(String text){
        System.out.println("> "+text);
        // the part of the code that makes the delay
        delay(1000);
    }

    // method to display the various choices of the player, the choices are in a String array
    public static int choice(String[] choices){
        for (int i = 0; i < choices.length; i++) {
            System.out.print(i + 1 + ". " + choices[i] + "  ");
        }
        System.out.println();
        // setting up the scanner to get the player's choice, then closing it to avoid memory leaks
        int select = sc.nextInt();
        if (select > choices.length || select < 1) {
            select = 1;
        }
        return select;
    }

    // renvoie 0 si le joueur perd, 1 s'il gagne
    public static int combat(PersonnageJoueur p1, Monstre p2){
        while (p1.estVivant() && p2.estVivant()){
            p1.afficheInfos();
            p2.afficheInfos();

            p1.afficherOptions();
            p2.subirDegats(p1.attaquer());

            if (p2.estVivant()){
                p1.subirDegats(p2.attaquer());
            }
        }
        if (p1.estVivant()) {
            return 1;
        } else {
            return 0;
        }
    }


}