package JeuPadhiver;

import java.util.Scanner;

// la classe Lieu définit les classes et méthodes permettant de gérer les lieux et ce qu'il est possible de faire dedans

public class Lieu {
    protected String nom;
    protected Personnage[] pnjs;
    protected Lieu[] lieuxVoisins;
    protected int nbMonstres;
    
    // objet de classe scanner pour enregister les choix du joueur 
    Scanner sc = new Scanner(System.in);

    public Lieu(String name, Personnage[] pnjs) {
        this.nom = name;
        this.pnjs = pnjs;
        for (int i=0; i<this.pnjs.length; i++) {
            if (this.pnjs[i] instanceof Monstre) {
                this.nbMonstres ++;
            }
        }
    }
    

    // permet de set les lieux voisins
    public void addVoisin(Lieu[] voisins) {
        this.lieuxVoisins = voisins;
    }


    // permet de savoir si il reste des monstres dans la zone
    public boolean noMonsters() {
        return this.nbMonstres == 0;
    }


    // enlève le personnage à l'indice index du tableau des personnages
    public void removePnj(int index) {
        Personnage[] newPnjs = new Personnage[this.pnjs.length - 1];
        int j = 0;
        for (int i = 0; i < this.pnjs.length; i++) {
            if (i != index) {
                newPnjs[j] = this.pnjs[i];
                j++;
            }
        }
        this.pnjs = newPnjs;
    }


    // méthode pour afficher les options du lieu courant
    public void displayOptions() {
        System.out.println("");
        Jeu.displayText("Vous êtes à " + this.nom + ", que voulez-vous faire ?");
        int i = 1;

        for (int j = 0; j < this.lieuxVoisins.length; j++) {
            System.out.print(i + ". Aller vers " + this.lieuxVoisins[j].nom + " ");
            i++;
        }
        System.out.println();
        
        for (int j = 0; j < this.pnjs.length; j++) {
            if (this.pnjs[j] instanceof PersonnageNonJoueur){
                System.out.print(i + ". Parler à " + this.pnjs[j].nom + " ");
            } else if (this.pnjs[j] instanceof Monstre){
                System.out.print(i + ". Attaquer " + this.pnjs[j].nom + " ");
            }
            i++;
        }
        if (this.pnjs.length > 0){
            System.out.println();
        }

        if (this.noMonsters()) {
            System.out.println(i + ". Se reposer");
        }
    }


    // cette méthode permet de choisir ce que l'on veut faire dans le lieu courant
    public void choices(PersonnageJoueur joueur) {
        int choice = sc.nextInt();

        // calcule la longueur des tableaux des Voisins et des Pnjs
        int lengthVoisins = this.lieuxVoisins.length;
        int lengthPnjs = this.pnjs.length;
        
        // ensuite, on va calculer le nb de choix possibles
        int nbChoix = 0;

        // tout dépend si il reste des monstres dans la zone, on ajoute un choix pour le repos
        switch (this.nbMonstres){
            case 0:
                nbChoix = lengthVoisins + lengthPnjs + 1;
                break;
            default:
                nbChoix = lengthVoisins + lengthPnjs;
                break;
        }

        // si le choix du joueur est dans le tableau des Voisins, on fait partir le joueur vers un Voisin
        if (choice <= lengthVoisins) {
            Jeu.displayText("Vous allez vers " + this.lieuxVoisins[choice - 1].nom + "...");
            Jeu.delay(900);
            joueur.changerLieu(this.lieuxVoisins[choice - 1]);
        }

        // si il n'y a plus de monstres et que le choix du joueur est le dernier possible
        else if (this.noMonsters() && choice == nbChoix){
            joueur.repos();
        }

        // dans le reste des cas
        else if (choice <= nbChoix) {
            // si le personnage est un pnj, on lui parle
            if (this.pnjs[choice - lengthVoisins - 1] instanceof PersonnageNonJoueur) {
                ((PersonnageNonJoueur) this.pnjs[choice - lengthVoisins - 1]).repondre();
                Jeu.delay(1200);

            // si c'est un monstre, on le combat
            } else {
                int result = Jeu.combat(joueur, (Monstre) this.pnjs[choice - lengthVoisins - 1]);
                if (result == 1) {
                    this.nbMonstres -= 1;
                    joueur.niveauSuperieur();
                    removePnj(choice - lengthVoisins - 1);
                }
            }
        }
    }
}
