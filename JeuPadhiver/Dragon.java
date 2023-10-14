public class Dragon extends Monstre {
  public static final String nom = "Dragon";

  Dragon() {
    super (nom);
    this.pvMax = 70;
    this.pv = 70;

    this.degats = 12;    

    this.paMax = 24;
    this.pa = 24;

    this.sorts = new Sort[1];
    this.sorts[0] = new Sort("Souffle du dragon", "Souffle de feu puissant, rasant villages et vallées", 20, 8);
  }
}
