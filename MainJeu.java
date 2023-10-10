//import java.util.ArrayList;

public class MainJeu {
  public static void main(String[] args) {
        Jeu jeu = new Jeu();

        jeu.displayText("Bonjour aventurier !");
        jeu.displayText("Bienvenue dans les nuits de Padhiver !");
        jeu.displayText("Je suis votre guide, votre maitre de jeu !");
        jeu.displayText("Bien, passons à la création de ton personnage !");
        jeu.displayText("Quel est ton nom aventurier ?");
        String name = jeu.sc.next();
        jeu.displayText(name + " ? C'est un joli nom !");
        jeu.displayText("Il est l'heure de choisir ton metier !");
        jeu.displayText("laisse moi te les présenter :");
        jeu.displayText("Le " + Magicien.nom + " : " + Magicien.description);
        jeu.displayText("Le " + Guerrier.nom + " : " + Guerrier.description);
        jeu.displayText("Le " + Barbare.nom + " : " + Barbare.description);
        jeu.displayText("Qui veux-tu être ?");

        String[] metier = new String[]{Magicien.nom, Guerrier.nom, Barbare.nom};

        int choice = jeu.choice(metier);

        System.out.println(choice);

        PersonnageJoueur joueur = new PersonnageJoueur(name, choice);

        jeu.displayText(joueur.nom + " le " + joueur.metierJoueur.nom + " est né ! Ton histoire sera inscrite dans les légendes !");
        jeu.displayText("Mais avant ça, il faut que tu te trouves un équipement !");
        jeu.displayText("Voici une " + joueur.equipementJoueur.nom);
        jeu.displayText("C'est une " + joueur.equipementJoueur.description);

        PersonnageNonJoueur pnj1 = new PersonnageNonJoueur("Carlos", "*regarde dans le vide, attendant que quelque chose se passe*");
        PersonnageNonJoueur pnj2 = new PersonnageNonJoueur("Jorji", "Tu es venu voler or noir moi !!!??! Moi était là avant !!");
        PersonnageNonJoueur pnj3 = new PersonnageNonJoueur("placeholder", "placeholder");
        PersonnageNonJoueur pnj4 = new PersonnageNonJoueur("Werwilld", "Werwilld pensait à la frolein de sa vie : Rochta. Une orc magnifiquement musclée. Mais elle a trompé Werwilld avec sheiz d'orc là bas ! Werwilld a donc suivi sheiz d'orc mais en pensant à elle Werwilld s'est pris sheiz d'arbre. Il a cassé magnifique nez et tacher moustache de Werwilld....comment vais-je pouvoir la venger ainsi......");
        
        Personnage[] pnjs_town = new Personnage[]{pnj1, pnj2};
        Personnage[] pnjs_route1 = new Personnage[]{pnj3};
        Personnage[] pnjs_route2 = new Personnage[]{pnj4};

        Lieu lieu1 = new Lieu("Padhiver", pnjs_town);
        Lieu lieu2 = new Lieu("Route Nord", pnjs_route1);
        Lieu lieu3 = new Lieu("Route Sud", pnjs_route2);

        Lieu[] voisins_ville = new Lieu[]{lieu2, lieu3};
        
        lieu1.addVoisin(voisins_ville);

        // // code temporaire pour tester les lieux
        // jeu.displayText("liste des lieux, de leurs pnjs et de leurs voisins :");
        // jeu.displayText(lieu1.nom + " : " + lieu1.pnjs + " : " + lieu1.lieuxVoisins);
        // jeu.displayText(lieu2.nom + " : " + lieu2.pnjs + " : " + lieu2.lieuxVoisins);
        // jeu.displayText(lieu3.nom + " : " + lieu3.pnjs + " : " + lieu3.lieuxVoisins);

        jeu.sc.close();
    }
}
