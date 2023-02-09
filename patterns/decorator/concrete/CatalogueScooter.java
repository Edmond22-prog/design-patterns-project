package patterns.decorator.concrete;

import java.util.ArrayList;

import patterns.abstract_factory.abstract_.Scooter;
import patterns.decorator.interface_.Catalogue;

public class CatalogueScooter implements Catalogue {
    public String nom;
    public ArrayList<Scooter> listeVehicules;

    public CatalogueScooter(String nom) {
        this.nom = nom;
        listeVehicules = new ArrayList<Scooter>();
    }

    public CatalogueScooter(String nom, ArrayList<Scooter> listeVehicules) {
        this.nom = nom;
        this.listeVehicules = listeVehicules;
    }

    public void ajouterVehicule(Scooter vehicule) {
        listeVehicules.add(vehicule);
    }

    public void supprimerVehicule(Scooter vehicule) {
        listeVehicules.remove(vehicule);
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Scooter> getListeVehicules() {
        return listeVehicules;
    }

    @Override
    public void afficherVehicules() {
        System.out.println("Catalogue " + nom + " :");
        for (Scooter vehicule : listeVehicules) {
            vehicule.seDecrire();
            System.out.println("");
        }
    }
    
}
