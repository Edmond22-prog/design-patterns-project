package patterns.abstract_factory;

import patterns.abstract_factory.abstract_.Automobile;
import patterns.abstract_factory.abstract_.Scooter;
import patterns.abstract_factory.concrete.FabriqueVehiculeElectrique;
import patterns.abstract_factory.concrete.FabriqueVehiculeEssence;

// Pour les tests
public class Client {
    public static void main(String [] args) {
        FabriqueVehiculeEssence fabriqueVehiculeEssence = new FabriqueVehiculeEssence();
        FabriqueVehiculeElectrique fabriqueVehiculeElectrique = new FabriqueVehiculeElectrique();

        Automobile automobile = null;
        Scooter scooter = null;

        System.out.println("\n\nUtilisation de la fabrique essence");
        automobile = fabriqueVehiculeEssence.creerAutomobile("Renault", "Rouge", 56, 4567000);
        automobile.seDecrire();
        System.out.println(""); // saut de ligne    
        scooter = fabriqueVehiculeEssence.creerScooter("Vectrix", "Noir", 89, 860000);
        scooter.seDecrire();

        System.out.println("\n\nUtilisation de la fabrique electrique");
        automobile = fabriqueVehiculeElectrique.creerAutomobile("Tesla", "Bleu", 90, 6200000);
        automobile.seDecrire();
        System.out.println(""); // saut de ligne
        scooter = fabriqueVehiculeElectrique.creerScooter("Yamaha", "Blanc", 100, 1200000);
        scooter.seDecrire();
    }

}
