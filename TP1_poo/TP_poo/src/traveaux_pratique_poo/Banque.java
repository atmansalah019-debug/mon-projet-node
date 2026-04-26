package traveaux_pratique_poo;

public class Banque { //
    public static void main(String[] args) { //
        CompteCourant cc = new CompteCourant("CC-100", 5000.0); //
        CompteEpargne ce = new CompteEpargne("CE-200", 8000.0); //

        cc.deposer(1000); //
        cc.retirer(2000); //
        
        ce.deposer(500); //
        ce.calculerInterets(2.5); //
    }
}