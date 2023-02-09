package patterns.abstract_factory.concrete;

import patterns.abstract_factory.abstract_.Automobile;
import patterns.abstract_factory.abstract_.Scooter;
import patterns.abstract_factory.interface_.IFabriqueVehicule;

public class FabriqueVehiculeElectrique implements IFabriqueVehicule {

    @Override
    public Automobile creerAutomobile() {
        return new AutomobileElectrique();
    }

    @Override
    public Automobile creerAutomobile(int id, String marque, String couleur, int puissance, int prix) {
        return new AutomobileElectrique(marque, couleur, puissance, prix, id);
    }

    @Override
    public Scooter creerScooter() {
        return new ScooterElectrique();
    }

    @Override
    public Scooter creerScooter(int id, String marque, String couleur, int puissance, int prix) {
        return new ScooterElectrique(puissance, couleur, marque, prix, id);
    }

}
