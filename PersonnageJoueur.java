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

    public void afficherOptions(){
        System.out.println();
        System.out.println("Vous faites face à votre ennemi, que voulez-vous faire ?");
        System.out.print("1. Attaquer ");
        if (this.sorts != null){
            for (int i = 0; i < this.sorts.length; i++) {
                System.out.print((2+i) + ". " + this.sorts[i].nom + " ");
            }
        }
        System.out.println();
    }
}