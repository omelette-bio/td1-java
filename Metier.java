import java.util.ArrayList;

public class Metier { 
    protected String nom;
    protected String description;

    protected int pv;
    protected int pa;

    protected Stuff stuff;
    protected ArrayList<Sort> sorts;

    public Metier(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }
}
