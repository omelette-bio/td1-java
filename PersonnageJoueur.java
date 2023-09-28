public class PersonnageJoueur extends Personnage{
    protected String metierJoueur;
    protected String equipementJoureur;
    
    PersonnageJoueur(String nomJ, String metierJ, String equipementJ){
        super(nomJ);
        this.metierJoueur = metierJ;
        this.equipementJoureur = equipementJ;
    }
}