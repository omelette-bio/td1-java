import java.util.ArrayList;

public class Metier {
    protected String nom;
    protected String description;
    protected ArrayList<Sort> sorts = new ArrayList<>();

    public static final String magicien = "magicien";
    public static final String magicienDescription = "Le magicien est un personnage qui utilise la magie pour se battre.";
    public static final String guerrier = "guerrier";
    public static final String guerrierDescription = "Le guerrier est un personnage qui utilise la force pour se battre.";
    public static final String barbare = "barbare";
    public static final String barbareDescription = "Le barbare est un personnage qui utilise la force pour se battre.";

    public Metier(String nom) {
        this.nom = nom;
    }
}