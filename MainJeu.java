// La classe MainJeu permet de lancer le jeu

public class MainJeu {
  public static void main(String[] args) {
        Jeu.displayText("Bonjour aventurier !");
        Jeu.displayText("Bienvenue dans les nuits de Padhiver !");
        Jeu.displayText("Je suis ton guide, ton maitre de jeu !");
        Jeu.displayText("Bien, passons à la création de ton personnage !");
        Jeu.displayText("Quel est ton nom aventurier ?");
        String name = Jeu.sc.nextLine();
        Jeu.displayText(name + " ? C'est un joli nom !");
        Jeu.displayText("Il est l'heure de choisir ton metier !");
        Jeu.displayText("Laisse moi te les présenter :");
        Jeu.displayText("Le " + Magicien.nom + " : " + Magicien.description);
        Jeu.displayText("Le " + Guerrier.nom + " : " + Guerrier.description);
        Jeu.displayText("Le " + Barbare.nom + " : " + Barbare.description);
        Jeu.displayText("Qui veux-tu être ?");

        String[] metier = new String[]{Magicien.nom, Guerrier.nom, Barbare.nom};

        int choice = Jeu.choice(metier);

        PersonnageJoueur joueur = new PersonnageJoueur(name, choice);

        Jeu.displayText(joueur.nom + " le " + joueur.metierJoueur.nom + " est né ! Ton histoire sera inscrite dans les légendes !");
        Jeu.displayText("Mais avant ça, il faut que tu te trouves un équipement !");
        Jeu.displayText("Voici une " + joueur.equipementJoueur.nom);
        Jeu.displayText("C'est une " + joueur.equipementJoueur.description);

        // mise en place des différents pnjs
        PersonnageNonJoueur pnj1 = new PersonnageNonJoueur("Carlos", "*regarde dans le vide, attendant que quelque chose se passe*");
        PersonnageNonJoueur pnj2 = new PersonnageNonJoueur("Jorji", "Tu es venu voler or noir moi !!!??! Moi était là avant !!");
        PersonnageNonJoueur pnj3 = new PersonnageNonJoueur("Winraz", "01101010 01100001 01101001 00100000 01100110 01100001 01101001 01110100 00100000 01100011 01100001 01100011 01100001");
        PersonnageNonJoueur pnj4 = new PersonnageNonJoueur("Werwilld", "Werwilld pensait à la frolein de sa vie : Rochta. Une orc magnifiquement musclée. Mais elle a trompé Werwilld avec sheiz d'orc là bas ! Werwilld a donc suivi sheiz d'orc mais en pensant à elle Werwilld s'est pris sheiz d'arbre. Il a cassé magnifique nez et tacher moustache de Werwilld....comment vais-je pouvoir la venger ainsi......");
        
        // création des monstres
        Orc monstre1 = new Orc();
        Orc monstre2 = new Orc();
        Gobelin monstre3 = new Gobelin();
        Gobelin monstre4 = new Gobelin();
        ChauveSouris monstre5 = new ChauveSouris();
        ChauveSouris monstre6 = new ChauveSouris();
        ChauveSouris monstre7 = new ChauveSouris();
        Necromant monstre8 = new Necromant();
        Dragon monstre9 = new Dragon();
        
        // création des villes
        Lieu ville = new Lieu("Padhiver", new Personnage[]{pnj1, pnj2});
        Lieu route1 = new Lieu("Route Nord", new Personnage[]{pnj3});
        Lieu route2 = new Lieu("Route Sud", new Personnage[]{pnj4, monstre1, monstre2});
        Lieu zone1 = new Lieu("Forêt", new Personnage[]{monstre3, monstre4});
        Lieu zone2 = new Lieu("Marais des morts", new Personnage[]{monstre5, monstre6, monstre7});
        Lieu zone3 = new Lieu("Crypte", new Personnage[]{monstre8});
        Lieu zone4 = new Lieu("Volcan", new Personnage[]{monstre9});

        // ajout des voisins aux lieux
        ville.addVoisin(new Lieu[]{route1, route2});
        route1.addVoisin(new Lieu[]{ville, zone1});
        route2.addVoisin(new Lieu[]{ville, zone2});
        zone1.addVoisin(new Lieu[]{route1, zone4});
        zone2.addVoisin(new Lieu[]{route2, zone3});
        zone3.addVoisin(new Lieu[]{zone2});
        zone4.addVoisin(new Lieu[]{zone1});

        // place le joueur dans padhiver
        joueur.changerLieu(ville);

        // boucle principale
        while (joueur.gameNotFinished()) {
          joueur.lieuJoueur.displayOptions();
          joueur.lieuJoueur.choices(joueur);
        }
        
        // messages de fin de jeu
        if (joueur.estVivant()) {
          Jeu.displayText("Bravo aventurier !");
          Jeu.displayText("Tu as vaincu les nuits de Padhiver !");
        } else {
          Jeu.displayText("Oh non, tu es mort :(");
          Jeu.displayText("Game Over.");
        }

        // ferme tous les scanner
        Jeu.sc.close();
        joueur.sc.close();
        ville.sc.close();
        route1.sc.close();
        route2.sc.close();
        zone1.sc.close();
        zone2.sc.close();
        zone3.sc.close();
        zone4.sc.close();
    }
}
