public class Lieu {
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

    public void choices(int choice) {
        
    }
}
