// classe pour implémenter les pnjs
public class PersonnageNonJoueur extends Personnage{
    
    protected String phrase;
    
    PersonnageNonJoueur(String nomPNJ, String PhrasePNJ){
        super(nomPNJ);
        this.phrase = PhrasePNJ;
    }
    
    public void repondre(){
        System.out.println(this.nom+" : "+this.phrase);
    }
}
