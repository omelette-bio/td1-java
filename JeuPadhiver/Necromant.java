package JeuPadhiver;

public class Necromant extends Monstre {
  public static final String nom = "Necromant";

  Necromant() {
    super (nom);
    this.pvMax = 30;
    this.pv = 30;

    this.degats = 8;

    this.paMax = 10;
    this.pa = 10;

    this.sorts = new Sort[1];
    this.sorts[0] = new Sort("Transfert de vie", "Absorbe toute forme de vie pour récupérer de la santé", 12, 5, 6);

  }
}
