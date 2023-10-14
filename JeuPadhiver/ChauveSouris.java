package JeuPadhiver;

public class ChauveSouris extends Monstre {
  public static final String nom = "Chauve-souris";

  ChauveSouris() {
    super (nom);
    this.pvMax = 6;
    this.pv = 6;

    this.degats = 5;    
  }
}
