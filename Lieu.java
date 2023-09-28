import java.util.ArrayList;

public class Lieu {
    protected String nom;
    protected ArrayList<Personnage> pnjs;
    protected ArrayList<Lieu> lieuxVoisins = new ArrayList<Lieu>();

    public Lieu(String name, ArrayList<Personnage> pnjs) {
        this.nom = name;
        this.pnjs = pnjs;
    }
    
    public void addVoisin(Lieu voisin) {
        this.lieuxVoisins.add(voisin);
    }

}

