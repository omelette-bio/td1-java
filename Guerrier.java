public class Guerrier extends Metier {
  public static final String nom = "Guerrier";
  public static final String description = "Le guerrier est un grand méchant pas beau qui aime taper sur les gens.";
  
  Guerrier() {
    super(nom, description);
    this.pv = 8;

    this.stuff = new Stuff("Épée", "Épée en fer, arme basique de tout guerrier", 4);
  }
}
