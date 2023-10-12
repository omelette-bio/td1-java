public class Sort {
    protected String nom;
    protected String description;
    protected int degats;
    protected int cout;
    protected int renduPv;

    Sort(String nomSort, String descriptionSort, int degatsSort, int coutSort) {
        this.nom = nomSort;
        this.description = descriptionSort;
        this.degats = degatsSort;
        this.cout = coutSort;
        this.renduPv = 0;
    }

    Sort(String nomSort, String descriptionSort, int degatsSort, int coutSort, int renduPv) {
        this.nom = nomSort;
        this.description = descriptionSort;
        this.degats = degatsSort;
        this.cout = coutSort;
        this.renduPv = renduPv;
    }

    
}