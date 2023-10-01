import java.util.ArrayList;
import java.util.Scanner;

public class Jeu {

    Scanner sc = new Scanner(System.in);

    // method to display text with a delay of 1s to make it more realistic
    public void displayText(String text){
        System.out.println("> "+text);
        // the part of the code that makes the delay
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // method to display the various choices of the player, the choices are in a String array
    public int choice(String[] choices){
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


    public static void main(String[] args) {
        Jeu jeu = new Jeu();

        jeu.displayText("Bonjour aventurier !");
        jeu.displayText("Bienvenue dans les nuits de Padhiver !");
        jeu.displayText("Je suis votre guide, votre maitre de jeu !");
        
        /* jeu.displayText("Mais avant tout, comment ça va ?");
        int result = jeu.choice(new String[]{"Bien", "Mal"});
        
        if (result == 1) {
            jeu.displayText("Content de l'apprendre !");
        } else {
            jeu.displayText("C'est pas bien !");
            jeu.displayText("Tu devrais aller voir un psy !");
            return;
        } */
        
        jeu.displayText("Bien, passons à la création de ton personnage !");
        jeu.displayText("Quel est ton nom aventurier ?");

        String name = jeu.sc.next();
        jeu.displayText(name + " ? C'est un joli nom !");

        jeu.displayText("Il est l'heure de choisir ton metier !");
        jeu.displayText("laisse moi te les présenter :");
        jeu.displayText("Le " + Metier.magicien + " : " + Metier.magicienDescription);
        jeu.displayText("Le " + Metier.guerrier + " : " + Metier.guerrierDescription);
        jeu.displayText("Le " + Metier.barbare + " : " + Metier.barbareDescription);

        jeu.displayText("Qui veux-tu être ?");

        String[] metier = new String[]{Metier.magicien, Metier.guerrier, Metier.barbare};

        int choice = jeu.choice(metier);

        PersonnageJoueur joueur = new PersonnageJoueur(name, choice);

        jeu.displayText(joueur.nom + " le " + joueur.metierJoueur.nom + " est né ! Ton histoire sera inscrite dans les légendes !");
        jeu.displayText("Mais avant ça, il faut que tu te trouves un équipement !");

        PersonnageNonJoueur pnj1 = new PersonnageNonJoueur("Carlos", "*regarde dans le vide, attendant que quelque chose se passe*");
        PersonnageNonJoueur pnj2 = new PersonnageNonJoueur("placeholder", "Tu es venu voler or noir moi !!!??! Moi était là avant !!");
        PersonnageNonJoueur pnj3 = new PersonnageNonJoueur("placeholder", "placeholder");
        PersonnageNonJoueur pnj4 = new PersonnageNonJoueur("Werwilld", "placeholder");
        
        ArrayList<Personnage> pnjs_town = new ArrayList<Personnage>();
        pnjs_town.add(pnj1);
        pnjs_town.add(pnj2);

        ArrayList<Personnage> pnjs_route1 = new ArrayList<Personnage>();
        pnjs_route1.add(pnj3);

        ArrayList<Personnage> pnjs_route2 = new ArrayList<Personnage>();
        pnjs_route2.add(pnj4);


        Lieu lieu1 = new Lieu(Lieu.ville, pnjs_town);
        Lieu lieu2 = new Lieu(Lieu.route1, pnjs_route1);
        Lieu lieu3 = new Lieu(Lieu.route2, pnjs_route2);

        lieu1.addVoisin(lieu2);
        lieu1.addVoisin(lieu3);
        
        // code temporaire pour tester les lieux
        jeu.displayText("liste des lieux, de leurs pnjs et de leurs voisins :");
        jeu.displayText(lieu1.nom + " : " + lieu1.pnjs + " : " + lieu1.lieuxVoisins);
        jeu.displayText(lieu2.nom + " : " + lieu2.pnjs + " : " + lieu2.lieuxVoisins);
        jeu.displayText(lieu3.nom + " : " + lieu3.pnjs + " : " + lieu3.lieuxVoisins);

        jeu.sc.close();
    }
}