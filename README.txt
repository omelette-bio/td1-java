Auteurs
  François Flandin
  Anthony Vasta
  Carla Boinon
  en L3 informatique

Voici notre TD1 de programmation et conception orientée objet en Java.

Pour le lancer, il faut exécuter la classe MainJeu.java.

Pour la structure, on est partis sur plusieurs choses :
  - Pour tous les personnages, on a mis les attributs et méthodes en commun sous la classe abstraite Personnage dont héritent les classes PersonnageNonJoueur et PersonnageActif
    PersonnageActif est une autre classe abstraite définissant des attributs et méthodes pour les classes PersonnageJoueur et Monstre, et Monstre est une autre classe abstraite
    dont hériteront tous les monstres que l'on va créer, cette structure pour les personnages nous permet de gérer bien plus facilement par la suite tous les monstres
    et pnjs du jeu.
  
  - Afin de nous permettre de mieux gérer le déroulement du jeu, nous avons créé une classe Jeu, qui nous définit des "primitives" nous permettant d'avoir des méthodes
    relatives au déroulement et à l'affichage du jeu, toutes les méthodes sont appelables depuis n'importe quelle classe du package