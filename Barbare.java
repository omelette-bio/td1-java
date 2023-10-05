public class Barbare extends Metier {
  public static final String nom = "Barbare";
  public static final String description = "Le barbare est un être fou, armé d'une hache et de ses muscles, il ne craint rien ni personne. Il a néanmoins un air de catcheur mexicain...";

  Barbare() {
    super(nom, description);
    this.pv = 9;
    this.pa = 4;

    this.sorts[0] = new Sort("Grizzly Bear Death Choke", "vous passez derrière votre ennemi pour lui broyer le cou", 4, 2);
    this.sorts[1] = new Sort("Rhino Charge Rib Breaker", "vous foncez dans votre ennemi, broyant ses côtes", 15, 7);

    this.stuff = new Stuff("Hache", "Une hache en fer, vous ressentez toute la folie meurtière qui vient avec.", 5);
  }
}
