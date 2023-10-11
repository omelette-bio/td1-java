public abstract class Metier { 
    protected String nom;
    protected String description;

    protected int pv;
    protected int pa;

    protected Stuff stuff;
    protected Sort[] sorts = new Sort[4];

    public Metier(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }
}
