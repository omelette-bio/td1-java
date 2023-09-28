public class Personnage{
    protected String nom;
    protected int niveau;
    protected int pvMax;
    protected int pv;
    protected int manMax;
    protected int mana;

    Personnage(String nomPersonnage){
        this.nom = nomPersonnage;
        this.niveau = 1;
        this.pvMax = 1;
        this.pv = 1;
        this.manMax = 1;
        this.mana = 1;
    }

    /* public void attaquer(int degatsAttaque){}
    public void recevoirDegat(int degatsSubis){} */
}