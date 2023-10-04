public class PersonnageJoueur extends Personnage{
    protected Metier metierJoueur;
    protected Stuff equipementJoueur;
    
    PersonnageJoueur(String nomJ, int metierJ){
        super(nomJ);
        this.metierJoueur = new Metier(metierJ);
        // make a switch on the metierJ to set the equipementJoueur
        switch(this.metierJoueur.nom){
            case Metier.magicien:
                this.equipementJoueur = new Stuff("Dague","Une dague en fer", 2);
                break;
            case Metier.guerrier:
                this.equipementJoueur = new Stuff("Epée","Une épée en fer", 4);
                break;
            case Metier.barbare:
                this.equipementJoueur = new Stuff("Hache", "Une hache en fer", 5);
                break;
            default:
                break;
        }
    }
}