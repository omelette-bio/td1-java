public class PersonnageJoueur extends Personnage{
    protected Metier metierJoueur;
    protected String equipementJoueur;
    
    PersonnageJoueur(String nomJ, int metierJ){
        super(nomJ);
        this.metierJoueur = new Metier(metierJ);
    }
}