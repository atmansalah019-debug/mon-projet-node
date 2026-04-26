Exercice 1.1
Partie 1 : Définitions théoriques

1. Encapsulation : L'encapsulation permet de cacher les détails internes et de restreindre l'accès direct aux données de l'objet. Dans la classe Animal, elle est utilisée en rendant l'attribut nom privé (private String nom), accessible uniquement via le "getter" getNom().

2. Héritage : C'est le mécanisme permettant à une sous-classe d'acquérir les attributs et méthodes d'une classe parente. Ici, les classes Mammifere et Oiseau héritent de la classe Animal.

3. Abstraction : Elle consiste à définir le modèle d'une classe sans implémenter certains de ses détails. Elle est mise en œuvre dans la classe abstraite Animal (abstract class Animal) via la méthode abstraite faireDuBruit(); qui ne possède pas de corps.

4. Polymorphisme : Il s'agit de la capacité pour une même méthode d'avoir un comportement différent selon l'objet instancié. Dans le main(), bien que la même méthode faireDuBruit() soit appelée, elle affiche "grogne" pour l'instance de Mammifere et "chante" pour l'instance de Oiseau.

Partie 3 : Identification des mots-clés

L'héritage : extends.

La redéfinition de méthode : @Override.

L'abstraction : abstract.

Exercice 1.2
Partie 1 : Théorie et concepts

1. Encapsulation : Elle est visible dans la classe Vehicule où les attributs marque, modele et annee sont déclarés en private et manipulés via les getters publics (getMarque(), getModele(), getAnnee()).

2. Héritage : Implémenté en utilisant le mot-clé extends, permettant aux classes Voiture et Camion d'hériter des propriétés de la classe mère Vehicule.

3. Polymorphisme : Dans main(), les variables déclarées de type Vehicule (maVoiture et monCamion) invoquent des versions différentes de la méthode afficherDetails() en fonction de leur instanciation concrète.

4. Abstraction : La classe Vehicule est abstraite pour servir de modèle générique de transport. Elle ne peut pas être instanciée telle quelle car un véhicule doit posséder des spécificités avant d'exister concrètement.

Partie 3 : Identification des mots-clés

La redéfinition de méthode : @Override.

L'héritage : extends.

L'appel au constructeur parent : super.