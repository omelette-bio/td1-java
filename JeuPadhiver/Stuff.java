// classe qui permet de créer des équipements
public class Stuff {
    protected String nom;
    protected String description;
    protected int degats;

    Stuff(String nomStuff, String descriptionStuff, int degatsStuff) {
        this.nom = nomStuff;
        this.description = descriptionStuff;
        this.degats = degatsStuff;
    }
}