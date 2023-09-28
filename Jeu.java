import java.util.Scanner;

public class Jeu {

  // method to display text with a delay of 0.6s to make it more realistic
  public void display_text(String text){
    System.out.println(text);
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
      System.out.print(i + 1 + ". " + choices[i] + "\t");
    }
    System.out.println();
    // setting up the scanner to get the player's choice, then closing it to avoid memory leaks
    Scanner sc = new Scanner(System.in);
    int choix = sc.nextInt();
    sc.close();
    return choix;
  }

  public static void main(String[] args) {
    Jeu jeu = new Jeu();
    jeu.display_text("Bonjour aventurier !");
    jeu.display_text("Bienvenue dans les nuits de Padhiver !");
    jeu.display_text("Je suis votre guide, votre maître de jeu !");
    jeu.display_text("Mais avant tout, comment ça va ?");
    
    int result = jeu.choice(new String[]{"Bien", "Mal"});
    
    if (result == 1) {
      jeu.display_text("C'est bien !");
    } else {
      jeu.display_text("C'est pas bien !");
      jeu.display_text("Tu devrais aller voir un psy !");
      return;
    }
    
  }
}