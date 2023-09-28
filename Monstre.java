public class Monstre extends Personnage{
    int degatsMonstre;
    Monstre(String nomMonstre, int degatsM, int pvM, int manaM){
        super(nomMonstre);
        this.degatsMonstre = degatsM;
        this.pvMax = pvM;
        this.pv = pvM;
        this.manMax = manaM;
        this.mana = manaM;
    }
}