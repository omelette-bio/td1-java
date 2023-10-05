public class Magicien extends Metier{
  Magicien() {
    super("Magicien", "Ermite de son époque, le magicien est un être solitaire doté d'une intelligence rare qui privilégie la compagnie des livres à celui des Hommes.");
    this.pv = 7;
    this.mana = 4;
    Sort sort1 = new Sort("Rayon de givre", "un rayon de givre", 4);
    Sort sort2 = new Sort("Boule de feu", "une boule de feu", 15);
    this.sorts.add(sort1);
    this.sorts.add(sort2);
  }
}