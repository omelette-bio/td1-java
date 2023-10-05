public class PersonnageJoueur extends PersonnageActif{
    protected Metier metierJoueur;
    protected Stuff equipementJoueur;
    protected Lieu lieuJoueur;
    
    PersonnageJoueur(String nomJ, int metierJ){
        super(nomJ);
        switch (metierJ) {
            case 1:
                this.metierJoueur = new Magicien();
                break;
            case 2:
                this.metierJoueur = new Guerrier();
                break;
            default:
                this.metierJoueur = new Barbare();
                break;
        }
        this.pvMax = metierJoueur.pv;
        this.pv = metierJoueur.pv;
        this.paMax = metierJoueur.pa;
        this.pa = metierJoueur.pa;
        this.equipementJoueur = metierJoueur.stuff;
    }
}