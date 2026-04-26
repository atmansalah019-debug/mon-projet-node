package traveaux_pratique_poo;

abstract class Animal { //
    private String nom; //

    public Animal(String nom) { //
        this.nom = nom; //
    }

    public String getNom() { //
        return nom; //
    }

    public abstract void faireDuBruit(); //
}

class Mammifere extends Animal { //
    public Mammifere(String nom) { //
        super(nom); //
    }

    @Override //
    public void faireDuBruit() { //
        System.out.println(getNom() + " grogne."); //
    }
}

class Oiseau extends Animal { //
    public Oiseau(String nom) { //
        super(nom); //
    }

    @Override //
    public void faireDuBruit() { //
        System.out.println(getNom() + " chante."); //
    }

    public void voler() { //
        System.out.println("L'oiseau vole."); //
    }
}

