import java.util.ArrayList;

public class Lieu {
    protected String nom;
    protected ArrayList<Personnage> pnjs;
    protected ArrayList<Lieu> lieuxVoisins = new ArrayList<Lieu>();

    public static final String ville = "Padhiver";
    public static final String route1 = "Route Nord";
    public static final String route2 = "Route Sud";
    public static final String zone1 = "Foret";
    public static final String zone2 = "Marais des morts";
    public static final String zone3 = "Crypte";
    public static final String zone4 = "Volcan";
             
    public Lieu(String name, ArrayList<Personnage> pnjs) {
        this.nom = name;
        this.pnjs = pnjs;
    }
    
    public void addVoisin(Lieu voisin) {
        this.lieuxVoisins.add(voisin);
    }

}
