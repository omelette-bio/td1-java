import java.util.Scanner;

public class Lieu {
    Scanner sc = new Scanner(System.in);
    protected String nom;
    protected Personnage[] pnjs;
    protected Lieu[] lieuxVoisins;
    protected int nbMonstres;
             
    public Lieu(String name, Personnage[] pnjs) {
        this.nom = name;
        this.pnjs = pnjs;
    }
    
    public void addVoisin(Lieu[] voisins) {
        this.lieuxVoisins = voisins;
    }

    public boolean noMonsters() {
        return this.nbMonstres == 0;
    }

    public void displayOptions() {
        System.out.println("Vous êtes à " + this.nom + ", que voulez-vous faire ?");
        int i = 1;
        for (int j = 0; j < this.lieuxVoisins.length; j++) {
            System.out.print(i + ". Aller vers " + this.lieuxVoisins[j].nom + " ");
            i++;
        }
        System.out.println();
        for (int j = 0; j < this.pnjs.length; j++) {
            System.out.print(i + ". Parler à " + this.pnjs[j].nom + " ");
            i++;
        }
        System.out.println();
    }

    public void choices() {
        int choice = sc.nextInt();

        int lengthVoisins = this.lieuxVoisins.length;
        int lengthPnjs = this.pnjs.length;
        
        if (choice <= lengthVoisins) {
            System.out.println("Vous allez vers " + this.lieuxVoisins[choice - 1].nom);
        } 
        else if (choice <= lengthVoisins + lengthPnjs) {
            if (this.pnjs[choice - lengthVoisins - 1] instanceof PersonnageNonJoueur) {
                ((PersonnageNonJoueur) this.pnjs[choice - lengthVoisins - 1]).repondre();
            } else {
                System.out.println("Vous attaquez " + this.pnjs[choice - lengthVoisins - 1].nom);
            }
        }
    }
}
