package JeuPadhiver;

import java.util.Scanner;

// ceci est la classe principale pour notre jeu, elle définit des méthodes de base afin de permettre le bon déroulement du jeu

public class Jeu {

    protected static Scanner sc = new Scanner(System.in);
    
    // permet de placer un delai de n millisecondes pour rendre le jeu plus agréable et lisible
    public static void delay(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // méthode pour afficher une ligne de texte
    public static void displayText(String text){
        System.out.println("> "+text);
        // the part of the code that makes the delay
        delay(1000);
    }

    // méthode qui permet au joueur de faire un choix parmis une liste
    public static int choice(String[] choices){
        for (int i = 0; i < choices.length; i++) {
            System.out.print(i + 1 + ". " + choices[i] + "  ");
        }
        System.out.println();
        // set le choix
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
                int degz = p2.attaquer();
                p1.subirDegats(degz);
                Jeu.displayText(p2.nom + " vous inflige " + degz + " degats");
            }
        }
        if (p1.estVivant()) {
            Jeu.displayText("Bravo, vous avez vaincu " + p2.nom + " !");
            return 1;
        } else {
            return 0;
        }
    }


}