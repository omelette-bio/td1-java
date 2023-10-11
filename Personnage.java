public class Personnage{
    protected String nom;
    protected int pvMax;
    protected int pv;

    Personnage(String nomPersonnage){
        this.nom = nomPersonnage;
        this.pvMax = 5;
        this.pv = 5;
    }
    public void recevoirDegat(int degatsSubis){
        this.pv = this.pv - degatsSubis;
    }
    
    public String afficherNom(){
        return this.nom;
    }
}