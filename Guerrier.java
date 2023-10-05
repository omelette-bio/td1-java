public class Guerrier extends Metier{
  public static final String nom = "Guerrier";
  public static final String description = "Le guerrier est un grand méchant pas beau qui aime taper sur les gens.";
  
  Guerrier() {
    super(nom, description);
    this.pv = 8;
    this.pa = 6;

    this.sorts[0] = new Sort("atk1", "desc1", 1);
    this.sorts[1] = new Sort("atk2", "desc2", 2);

    this.stuff = new Stuff("Épée", "Épée en fer, arme basique de tout guerrier", 4);
  }
}
