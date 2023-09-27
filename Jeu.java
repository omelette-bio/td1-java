import java.util.Scanner;

public class Jeu {
  public static void main(String[] args) {
    System.out.println("Salut aventurier !");
    System.out.println("Bienvenue dans les nuits de Padhiver !");
    System.out.println("Vous allez vivre une aventure extraordinaire !");
    System.out.println("Mais avant tout, comment ça va ?");
    System.out.println("1. Ça va bien !   2. Ça va pas !");
    Scanner sc = new Scanner(System.in);
    int choix = sc.nextInt();
    sc.close();
    if (choix == 1) {
      System.out.println("Tant mieux !");
    } else if (choix == 2) {
      System.out.println("Désolé pour toi !");
      System.out.println("Tu devrais aller voir un psy !");
      return;
    } else {
      System.out.println("Je n'ai pas compris !");
    }
  }
}