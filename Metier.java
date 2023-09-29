import java.util.ArrayList;

public class Metier {
    protected String nom;
    protected String description;
    protected ArrayList<Sort> sorts = new ArrayList<>();

    public static final String magicien = "Magicien";
    public static final String magicienDescription = "Le magicien est un personnage possédant des pouvoirs magiques, boules de feu et rayons de glace font partie de son arsenal.";
    public static final String guerrier = "Guerrier";
    public static final String guerrierDescription = "Le guerrier est un personnage qui utilise la force pour se battre.";
    public static final String barbare = "Barbare";
    public static final String barbareDescription = "Le barbare est un personnage qui utilise la force pour se battre.";

    public Metier(int metier) {
        switch (metier) {
            case 1:
                this.nom = magicien;
                this.description = magicienDescription;
                break;
            case 2:
                this.nom = guerrier;
                this.description = guerrierDescription;
                break;
            default:
                this.nom = barbare;
                this.description = barbareDescription;
                break;
        }
    }
}