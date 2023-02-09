package patterns.decorator.concrete;

import java.util.ArrayList;

import patterns.abstract_factory.abstract_.Automobile;
import patterns.decorator.interface_.Catalogue;

public class CatalogueAutomobile implements Catalogue {
    public String nom;
    public ArrayList<Automobile> listeVehicules;

    public CatalogueAutomobile(String nom) {
        this.nom = nom;
        listeVehicules = new ArrayList<Automobile>();
    }

    public CatalogueAutomobile(String nom, ArrayList<Automobile> listeVehicules) {
        this.nom = nom;
        this.listeVehicules = listeVehicules;
    }

    public void ajouterVehicule(Automobile vehicule) {
        listeVehicules.add(vehicule);
    }

    public void supprimerVehicule(Automobile vehicule) {
        listeVehicules.remove(vehicule);
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Automobile> getListeVehicules() {
        return listeVehicules;
    }

    @Override
    public void afficherVehicules() {
        System.out.println("Catalogue " + nom + " :");
        for (Automobile vehicule : listeVehicules) {
            vehicule.seDecrire();
            System.out.println("");
        }      
    }
}
