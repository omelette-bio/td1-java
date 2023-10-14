import java.util.Scanner;

// la classe PersonnageJoueur est la classe définissant les attributs et méthodes pour le joueur, 
// elle hérite de deux classes abstraites: PersonnageActif et Personnage
public class PersonnageJoueur extends PersonnageActif{
    protected Metier metierJoueur;
    protected Stuff equipementJoueur;
    protected Lieu lieuJoueur;
    // crée un scanner pour gérer le choix du joueur pour le métier, et ses attaques
    Scanner sc = new Scanner(System.in);
    int niveau;
    
    PersonnageJoueur(String nomJ, int metierJ){
        super(nomJ);
        // défini le métier du joueur en fonction de l'input
        switch (metierJ) {
            case 1:
                this.metierJoueur = new Magicien();
                break;
            case 2:
                this.metierJoueur = new Guerrier();
                break;
            default:
                this.metierJoueur = new Barbare();
                break;
        }
        // set les attributs grâce au métier
        this.pvMax = metierJoueur.pv;
        this.pv = metierJoueur.pv;
        this.paMax = metierJoueur.pa;
        this.pa = metierJoueur.pa;
        this.equipementJoueur = metierJoueur.stuff;
        this.degats = metierJoueur.stuff.degats;
        this.sorts = metierJoueur.sorts;
        this.niveau = 1;
    }

    // methode qui permet de gagner un niveau, et quelques affichages d'infos
    public void niveauSuperieur(){
        this.niveau ++;
        
        Jeu.displayText("Niveau supérieur !");

        String curr_line = "";
        curr_line += "Niveau: " + (this.niveau - 1) + " => " + this.niveau + "  ";

        if (this.niveau % 3 == 0){
            curr_line += "Dégâts: " + (this.degats) + " => ";
            
            // divise les degats du joueur pour avoir les dégâts de base, puis multiplier par le nb de niveaux
            this.degats += (this.degats / (this.niveau / 3));
            
            curr_line += (this.degats + "  ");
        }
        if (this.niveau == 6 && this.sorts != null) {
            // boucle pour multiplier 
            for (int i = 0; i < this.sorts.length; i++) {
                this.sorts[i].degats *= 2;
            }

            curr_line += "Puissance des sorts doublée !  ";
        }

        curr_line += ("Pv : " + (this.pvMax) + " => ");
        
        // divise les pvMax du joueur pour obtenir les pvMax de base, puis multiplier par le nb de niveaux
        this.pvMax += (this.pvMax / (this.niveau - 1));
        
        curr_line += (this.pvMax + "  ");

        Jeu.displayText(curr_line);
    }

    // renvoie vraie si le joueur est toujours en vie et qu'il n'est toujours pas niveau 10
    public boolean gameNotFinished() {
        return this.pv > 0 && this.niveau < 10;
    }

    // permet de changer le lieu courant
    public void changerLieu(Lieu lieu) {
        this.lieuJoueur = lieu;
    }

    // affiche les différentes options du joueur pendant un combat
    public void afficherOptions(){
        System.out.println();
        Jeu.displayText("Vous faites face à votre ennemi, que voulez-vous faire ?");
        System.out.print("1. Attaquer ");
        if (this.sorts != null){
            for (int i = 0; i < this.sorts.length; i++) {
                // (2+i) car on a déjà le 1 réservé pour l'attaque normale
                if (this.pa >= this.sorts[i].cout){
                    System.out.print((2+i) + ". " + this.sorts[i].nom + " ");
                }
            }
        }
        System.out.println();
    }

    // permet de prendre le choix du joueur et d'agir en fonction
    public int attaquer(){
        int choix = sc.nextInt();
        if (choix == 1){
            return this.lancerDegats();
        }
        // on ajoute 2 à la longueur car le joueur doit choisir un chiffre entre 2 et 3 or le tableau a les indices 0 et 1
        else if (this.sorts != null && choix < this.sorts.length + 2){
            return this.utiliserSort(this.sorts[choix-2]);
        }
        return 0;
    }

    // permet de regagner toute sa vie si aucun monstre est présent
    public void repos() {
        if (this.lieuJoueur.noMonsters()) {
            Jeu.displayText("Vous vous reposez, vous regagnez toute votre vie ainsi que tout votre mana");
            this.pv = this.pvMax;
            this.pa = this.paMax;
        }
    }

    // permet de retirer des pvs au joueur
    public void subirDegats(int degats){
        if (this.metierJoueur.nom == Guerrier.nom){
            this.pv -= (degats - 2);
        } else {
            this.pv -= degats;
        }
    }
}