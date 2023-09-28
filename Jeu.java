import java.util.Scanner;

public class Jeu {

  Scanner sc = new Scanner(System.in);

  // method to display text with a delay of 0.6s to make it more realistic
  public void display_text(String text){
    System.out.println("> "+text);
    // the part of the code that makes the delay
    try {
      Thread.sleep(600);
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

    jeu.display_text("Bonjour aventurier !");
    jeu.display_text("Bienvenue dans les nuits de Padhiver !");
    jeu.display_text("Je suis votre guide, votre maitre de jeu !");
    jeu.display_text("Mais avant tout, comment ca va ?");
    
    int result = jeu.choice(new String[]{"Bien", "Mal"});
    
    if (result == 1) {
      jeu.display_text("Content de l'apprendre !");
    } else {
      jeu.display_text("C'est pas bien !");
      jeu.display_text("Tu devrais aller voir un psy !");
      return;
    }
    
    jeu.display_text("Bien, passons à la création de ton personnage !");
    jeu.display_text("Quel est ton nom aventurier ?");

    String name = jeu.sc.next();
    jeu.display_text(name + " ? C'est un joli nom !");

    jeu.display_text("Quel est ton metier ?");

    String[] metier = new String[]{"Guerrier", "Mage", "Voleur"};

    int choice = jeu.choice(metier);

    PersonnageJoueur joueur = new PersonnageJoueur(name, metier[choice-1], "Epée");

    jeu.display_text(joueur.nom + " le " + joueur.metierJoueur + " est né ! Ton histoire sera inscrite dans les légendes !");
    jeu.display_text("Mais avant ca, il faut que tu te trouves un équipement !");
    jeu.display_text(name + ", tiens, prends donc cette " + joueur.equipementJoueur + " !");

    /* 
    PersonnageNonJoueur pnj1 = new PersonnageNonJoueur("Carlo", "*regarde dans le vide, attendant que quelque chose se passe*");
    PersonnageNonJoueur pnj2 = new PersonnageNonJoueur("placeholder", "placeholder");
    PersonnageNonJoueur pnj3 = new PersonnageNonJoueur("placeholder", "placeholder");
    PersonnageNonJoueur pnj4 = new PersonnageNonJoueur("Werwilld", "placeholder");

    Lieu lieu1 = new Lieu("Padhiver")
    */

    jeu.sc.close();
  }
}