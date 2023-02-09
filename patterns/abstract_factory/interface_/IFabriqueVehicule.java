package patterns.abstract_factory.interface_;

import patterns.abstract_factory.abstract_.Automobile;
import patterns.abstract_factory.abstract_.Scooter;

public interface IFabriqueVehicule {
    public Automobile creerAutomobile();

    public Automobile creerAutomobile(int id, String marque, String couleur, int puissance, int prix);

    public Scooter creerScooter();

    public Scooter creerScooter(int id, String marque, String couleur, int puissance, int prix);
}
