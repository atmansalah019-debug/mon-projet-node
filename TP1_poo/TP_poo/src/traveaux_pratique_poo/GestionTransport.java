package traveaux_pratique_poo;
public class GestionTransport { //
    public static void main(String[] args) { //
        Vehicule maVoiture = new Voiture("Toyota", "Corolla", 2021, 4); //
        Vehicule monCamion = new Camion("Volvo", "FMX", 2019, 12.5); //
        Vehicule maMoto = new Moto("Yamaha", "MT-07", 2024, "Sport");
        
        maVoiture.afficherDetails(); //
        monCamion.afficherDetails(); //
        maMoto.afficherDetails();
    }
}