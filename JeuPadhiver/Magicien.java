public class Magicien extends Metier {
  public static final String nom = "Magicien";
  public static final String description = "Ermite de son époque, le magicien est un être solitaire doté d'une intelligence rare qui privilégie la compagnie des livres à celui des Hommes.";
  
  Magicien() {
    super(nom, description);
    this.pv = 7;
    this.pa = 8;
    
    this.sorts = new Sort[2];
    this.sorts[0] = new Sort("Rayon de givre", "un rayon de givre", 4, 2);
    this.sorts[1] = new Sort("Boule de feu", "une boule de feu", 15, 9);

    this.stuff = new Stuff("Dague", "petite dague en fer, utile pour vous défendre en cas de manque de mana", 2);
  }
}