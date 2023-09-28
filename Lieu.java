import java.util.ArrayList;

public class Lieu {
    protected String nom;
    protected ArrayList<Personnage> pnjs;
    protected ArrayList<Lieu> lieuxVoisins;

    public Lieu(String name, ArrayList<Personnage> pnjs, ArrayList<Lieu> lieuxVoisins) {
        this.nom = name;
        this.pnjs = pnjs;
        this.lieuxVoisins = lieuxVoisins;
    }
    

}

