package traveaux_pratique_poo;

public class Zoo { //
    public static void main(String[] args) { //
        Animal tigre = new Mammifere("Tigre"); //
        // Modification : le perroquet est déclaré en tant qu'Oiseau pour accéder à voler()
        Oiseau perroquet = new Oiseau("Perroquet"); //
        
        tigre.faireDuBruit(); //
        perroquet.faireDuBruit(); //
        perroquet.voler(); //
    }}
