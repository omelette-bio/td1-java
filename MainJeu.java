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

        PersonnageJoueur joueur = new PersonnageJoueur(name, choice);

        jeu.displayText(joueur.nom + " le " + joueur.metierJoueur.nom + " est né ! Ton histoire sera inscrite dans les légendes !");
        jeu.displayText("Mais avant ça, il faut que tu te trouves un équipement !");
        jeu.displayText("Voici une " + joueur.equipementJoueur.nom);
        jeu.displayText("C'est une " + joueur.equipementJoueur.description);

        PersonnageNonJoueur pnj1 = new PersonnageNonJoueur("Carlos", "*regarde dans le vide, attendant que quelque chose se passe*");
        PersonnageNonJoueur pnj2 = new PersonnageNonJoueur("Jorji", "Tu es venu voler or noir moi !!!??! Moi était là avant !!");
        PersonnageNonJoueur pnj3 = new PersonnageNonJoueur("placeholder", "placeholder");
        PersonnageNonJoueur pnj4 = new PersonnageNonJoueur("Werwilld", "Werwilld pensait à la frolein de sa vie : Rochta. Une orc magnifiquement musclée. Mais elle a trompé Werwilld avec sheiz d'orc là bas ! Werwilld a donc suivi sheiz d'orc mais en pensant à elle Werwilld s'est pris sheiz d'arbre. Il a cassé magnifique nez et tacher moustache de Werwilld....comment vais-je pouvoir la venger ainsi......");
        
        Orc monstre1 = new Orc();
        Orc monstre2 = new Orc();
        Gobelin monstre3 = new Gobelin();
        Gobelin monstre4 = new Gobelin();
        ChauveSouris monstre5 = new ChauveSouris();
        ChauveSouris monstre6 = new ChauveSouris();
        ChauveSouris monstre7 = new ChauveSouris();
        Necromant monstre8 = new Necromant();
        Dragon monstre9 = new Dragon();

        Personnage[] pnjs_town = new Personnage[]{pnj1, pnj2};
        Personnage[] pnjs_route1 = new Personnage[]{pnj3};
        Personnage[] pnjs_route2 = new Personnage[]{pnj4, monstre1, monstre2};
        Personnage[] pnjs_zone1 = new Personnage[]{monstre3, monstre4};
        Personnage[] pnjs_zone2 = new Personnage[]{monstre5, monstre6, monstre7};
        Personnage[] pnjs_zone3 = new Personnage[]{monstre8};
        Personnage[] pnjs_zone4 = new Personnage[]{monstre9};
        

        Lieu ville = new Lieu("Padhiver", pnjs_town);
        Lieu route1 = new Lieu("Route Nord", pnjs_route1);
        Lieu route2 = new Lieu("Route Sud", pnjs_route2);
        Lieu zone1 = new Lieu("Forêt", pnjs_zone1);
        Lieu zone2 = new Lieu("Marais des morts", pnjs_zone2);
        Lieu zone3 = new Lieu("Crypte", pnjs_zone3);
        Lieu zone4 = new Lieu("Volcan", pnjs_zone4);

        ville.addVoisin(new Lieu[]{route1, route2});
        route1.addVoisin(new Lieu[]{ville, zone1});
        route2.addVoisin(new Lieu[]{ville, zone2, zone4});
        zone1.addVoisin(new Lieu[]{route1, zone3});
        zone2.addVoisin(new Lieu[]{route2, zone3});
        zone3.addVoisin(new Lieu[]{zone1, zone2});
        zone4.addVoisin(new Lieu[]{zone2, zone3});

        joueur.changerLieu(ville);

        while (joueur.gameNotFinished()) {
          joueur.lieuJoueur.displayOptions();
          joueur.lieuJoueur.choices(joueur);
        }
        
        // messages de fin de jeu
        if (joueur.estVivant()) {
          System.out.println("Bravo aventurier, vous avez vaincu mes ballz");
        } else {
          System.out.println("Gros cheh t'es naze");
        }


        jeu.sc.close();
    }
}
