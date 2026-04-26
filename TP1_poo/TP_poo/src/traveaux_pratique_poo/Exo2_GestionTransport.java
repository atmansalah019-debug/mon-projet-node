package traveaux_pratique_poo;

abstract class Vehicule { //
    private String marque; //
    private String modele; //
    private int annee; //

    public Vehicule(String marque, String modele, int annee) { //
        this.marque = marque; //
        this.modele = modele; //
        this.annee = annee; //
    }

    public String getMarque() { return marque; } //
    public String getModele() { return modele; } //
    public int getAnnee() { return annee; } //

    public abstract void afficherDetails(); //

    public void demarrer() { //
        System.out.println("Le véhicule démarre."); //
    }
}

class Voiture extends Vehicule { //
    private int nombreDePortes; //

    public Voiture(String marque, String modele, int annee, int nombreDePortes) { //
        super(marque, modele, annee); //
        this.nombreDePortes = nombreDePortes; //
    }

    @Override //
    public void afficherDetails() { //
        demarrer(); //
        System.out.println("Voiture: " + getMarque() + " " + getModele() + " (" + getAnnee() + "), Portes: " + nombreDePortes); //
    }
}

class Camion extends Vehicule { //
    private double capaciteDeCharge; //

    public Camion(String marque, String modele, int annee, double capaciteDeCharge) { //
        super(marque, modele, annee); //
        this.capaciteDeCharge = capaciteDeCharge; //
    }

    @Override //
    public void afficherDetails() { //
        demarrer(); //
        System.out.println("Camion: " + getMarque() + " " + getModele() + " (" + getAnnee() + "), Capacité: " + capaciteDeCharge + " tonnes"); //
    }
}

class Moto extends Vehicule { //
    private String typeDeGuidon; //

    public Moto(String marque, String modele, int annee, String typeDeGuidon) {
        super(marque, modele, annee);
        this.typeDeGuidon = typeDeGuidon;
    }

    @Override
    public void afficherDetails() { //
        demarrer();
        System.out.println("Moto: " + getMarque() + " " + getModele() + " (" + getAnnee() + "), Guidon: " + typeDeGuidon);
    }
}
