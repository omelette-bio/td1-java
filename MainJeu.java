import java.util.ArrayList;

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
        PersonnageNonJoueur pnj4 = new PersonnageNonJoueur("Werwilld", "Werwilld pensait à la frolein de sa vie : Rochta. Une orc magnifiquement musclée. Mais elle a trompé Werwilld avec sheiz d'orc là bas ! Werwilld a donc suivi sheiz d'orc mais en pensant à elle Werwilld s'est pris sheiz d'arbre. Il a cassé magnifique nez et tacher moustache de Werwilld....comment vais-je pouvoir la venger ainsi......");
        
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
