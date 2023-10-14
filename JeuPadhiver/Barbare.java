package JeuPadhiver;

public class Barbare extends Metier {
  public static final String nom = "Barbare";
  public static final String description = "Le barbare est un être fou, armé d'une hache et de ses muscles, il ne craint rien ni personne. Il a néanmoins un air de catcheur mexicain et vit *un peu* pour les caméras...";

  Barbare() {
    super(nom, description);
    this.pv = 9;

    this.stuff = new Stuff("Hache", "Une hache en fer, vous ressentez toute la folie meurtière qui vient avec.", 5);
  }
}
