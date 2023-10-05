public class Barbare extends Metier{
  Barbare() {
    super("Barbare","Le barbare est un être fou, armé d'une hache et de ses muscles, il ne craint rien ni personne. Il a néanmoins un air de catcheur mexicain...");
    this.pv = 9;
    this.pa = 4;

    Sort sort1 = new Sort("Grizzly Bear Death Choke", "vous passez derrière votre ennemi pour lui broyer le cou", 4);
    Sort sort2 = new Sort("Rhino Charge Rib Breaker", "vous foncez dans votre ennemi, broyant ses côtes", 15);

    this.sorts.add(sort1);
    this.sorts.add(sort2);

    this.stuff = new Stuff("Hache", "Une hache en fer, vous ressentez toute la folie meurtière qui vient avec.", 5);
  }
}
