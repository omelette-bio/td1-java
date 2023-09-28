public class PersonnageJoueur extends Personnage{
    protected String metierJoueur;
    protected String equipementJoueur;
    
    PersonnageJoueur(String nomJ, int metierJ){
        super(nomJ);
        if (metierJ == 1) {
            this.metierJoueur = Metier.magicien;
        }
        else if (metierJ == 2) {
            this.metierJoueur = Metier.guerrier;
        }
        else{
            this.metierJoueur = Metier.barbare;
        }
    }
}