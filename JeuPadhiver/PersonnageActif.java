package JeuPadhiver;

// la classe PersonnageActif définit les attributs et méthodes des joueurs et monstres séparément des pnjs pour qu'ils puissent s'affronter
public abstract class PersonnageActif extends Personnage{
    // les attributs de la classe abstraite seront les points d'action, les dégâts, et un tableau de sorts
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

    // methode qui renvoie les dégâts physiques, utile lorsqu'elle est appelée en dessous
    public int lancerDegats(){
        return this.degats;
    }
    
    // permet de renvoyer les dégâts d'un sort, utile aussi lorsqu'elle est appelée en dessous
    public int utiliserSort(Sort s){
        if (this.pa > s.cout) {
            this.pv += s.renduPv;
            this.pa -= s.cout;
            return s.degats;
        } else {
            return lancerDegats();
        }
    }

    // permet de vérifier que le joueur ou le monstre est encore en vie
    public boolean estVivant(){
        return this.pv > 0;
    }

    // affiche les infos du personnage
    public void afficheInfos(){
        System.out.print(this.nom + ":  pv: " + this.pv + "/" + this.pvMax + " ");
        if (this.sorts != null){
            System.out.print("pm: " + this.pa + "/" + this.paMax);
        }
        System.out.println();
    }

    // methode abstraite dont le comportement doit être défini pour les joueurs et monstres séparément, utilise lancerDegats et utiliserSort
    public abstract int attaquer();
}
