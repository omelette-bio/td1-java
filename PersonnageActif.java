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

    public int lancerDegats(){
        return this.degats;
    }

    public boolean estVivant(){
        return this.pv > 0;
    }

    public int utiliserSort(Sort s){
        this.pv += s.renduPv;
        return s.degats;
    }

    public void afficheInfos(){
        System.out.println(this.nom + ":  pv: " + this.pv + "/" + this.pvMax + " ");
        if (this.sorts != null){
            System.out.print("pm: " + this.pa + "/" + this.paMax);
        }
        System.out.println();
    }
    
    public abstract int attaquer();
}
