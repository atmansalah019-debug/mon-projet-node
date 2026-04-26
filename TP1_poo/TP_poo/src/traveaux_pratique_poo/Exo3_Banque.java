package traveaux_pratique_poo;

class CompteBancaire { //
    protected String numeroCompte; //
    protected double solde; //

    public CompteBancaire(String numeroCompte, double soldeInitial) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
    }

    public void deposer(double montant) { //
        if (montant > 0) {
            solde += montant;
            System.out.println(montant + " DH déposés. Nouveau solde: " + solde);
        }
    }

    public void retirer(double montant) { //
        if (montant > 0 && solde >= montant) { //
            solde -= montant;
            System.out.println(montant + " DH retirés. Nouveau solde: " + solde);
        } else {
            System.out.println("Fonds insuffisants.");
        }
    }
}

class CompteCourant extends CompteBancaire { //
    public CompteCourant(String numeroCompte, double soldeInitial) {
        super(numeroCompte, soldeInitial);
    }
}

class CompteEpargne extends CompteBancaire { //
    public CompteEpargne(String numeroCompte, double soldeInitial) {
        super(numeroCompte, soldeInitial);
    }

    public void calculerInterets(double taux) { //
        double interets = solde * (taux / 100);
        solde += interets;
        System.out.println("Intérêts de " + interets + " ajoutés. Nouveau solde: " + solde);
    }
}

