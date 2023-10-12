import java.util.Random;

public class Monstre extends PersonnageActif{
    Random rand = new Random();
    
    Monstre(String nomMonstre){
        super(nomMonstre);
    }

    public int attaquer(){
        int range = 1;
        if (this.sorts != null){
            range += this.sorts.length;
        }
        int choix = rand.nextInt(range);
        if (choix == 0) {
            return this.lancerDegats();
        }
        else {
            return this.utiliserSort(this.sorts[choix-1]);
        }
    }
}