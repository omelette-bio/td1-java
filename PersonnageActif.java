public abstract class PersonnageActif extends Personnage{
    protected int paMax;
    protected int pa;
    protected int degats;
    protected Sort[] sorts;

    PersonnageActif(String nomPA){
        super(nomPA);
        this.paMax = 0;
        this.pa = 0;
        this.degats = 1;
        this.sorts = null;
    }

    public int attaquer(PersonnageActif p){
        return p.degats;
    }

    public boolean estVivant(){
        return this.pv > 0;
    }
}
