package patterns.abstract_factory.concrete;

import patterns.abstract_factory.abstract_.Automobile;
import patterns.abstract_factory.abstract_.Scooter;
import patterns.abstract_factory.interface_.IFabriqueVehicule;

public class FabriqueVehiculeEssence implements IFabriqueVehicule {

    // @Override
    // public Automobile creerAutomobile() {
    //     return new AutomobileEssence();
    // }

    @Override
    public Automobile creerAutomobile(String marque, String couleur, int puissance, int prix) {
        return new AutomobileEssence(marque, couleur, puissance, prix);
    }

    // @Override
    // public Scooter creerScooter() {
    //     return new ScooterEssence();
    // }

    @Override
    public Scooter creerScooter(String marque, String couleur, int puissance, int prix) {
        return new ScooterEssence(marque, couleur, puissance, prix);
    }

}
