public class PersonnageJoueur extends PersonnageActif{
    protected Metier metierJoueur;
    protected Stuff equipementJoueur;
    protected Lieu lieuJoueur;
    int niveau;
    
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
        this.niveau = 1;
    }

    public void niveauSuperieur(){
        this.niveau ++;
    }

    public boolean gameNotFinished() {
        return this.pv > 0 && this.niveau < 10;
    }

    public void changerLieu(Lieu lieu) {
        this.lieuJoueur = lieu;
    }
}