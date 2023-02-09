package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import patterns.abstract_factory.abstract_.Automobile;
import patterns.abstract_factory.abstract_.Scooter;
import patterns.abstract_factory.abstract_.Vehicule;
import patterns.abstract_factory.concrete.FabriqueVehiculeElectrique;
import patterns.abstract_factory.concrete.FabriqueVehiculeEssence;
import patterns.decorator.concrete.CatalogueAutomobile;
import patterns.decorator.concrete.CatalogueScooter;

// Singleton contenant des donnée 
public class TestData {

    CatalogueAutomobile voitureModerne = new CatalogueAutomobile("Garage morderne");

    CatalogueAutomobile voitureAncienne = new CatalogueAutomobile("Garage classique");
    CatalogueScooter scooterModerne = new CatalogueScooter("Luxe Motor");
    CatalogueScooter scooterAncien = new CatalogueScooter("Luxe classique");

    FabriqueVehiculeEssence fabriqueVehiculeEssence = new FabriqueVehiculeEssence();
    FabriqueVehiculeElectrique fabriqueVehiculeElectrique = new FabriqueVehiculeElectrique();
    ArrayList<String> marques = new ArrayList<String>() {
        {
            add("Renault");
            add("Peugeot");
            add("Citroen");
            add("Fiat");
            add("Ford");
            add("Mercedes");
            add("BMW");
            add("Audi");
            add("Volkswagen");
            add("Toyota");
            add("Nissan");
            add("Honda");
            add("Kia");
            add("Hyundai");
            add("Suzuki");
            add("Dacia");
            add("Lada");
            add("Lancia");
            add("Mazda");
            add("Mitsubishi");
            add("Opel");
            add("Porsche");
            add("Seat");
            add("Skoda");
        }
    };
    List<String> couleurs = new ArrayList<String>() {
        {
            add("Rouge");
            add("Bleu");
            add("Vert");
            add("Jaune");
            add("Noir");
            add("Blanc");
            add("Gris");
            add("Marron");
            add("Rose");
            add("Violet");
        }
    };
    List<String> types = new ArrayList<String>() {
        {
            add("Essence");
            add("Electrique");
        }
    };

    private static TestData instance;

    private TestData() {
        super();
    }

    public static TestData getData() {
        if (instance == null) {
            return new TestData();
        } else {
            return instance;
        }
    }

    public void buildCatalogues() {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            for (int i = 0; i < 50; i++) {
                String type = types.get((int) (Math.random() * types.size()));
                if (type == "Essence") {
                    // creation de vehicule essence
                    voitureAncienne.listeVehicules.add(fabriqueVehiculeEssence.creerAutomobile(
                            (int) (Math.random() * 1000),
                            marques.get((int) (Math.random() * marques.size())),
                            couleurs.get((int) (Math.random() * couleurs.size())),
                            (int) (Math.random() * 100),
                            (int) (Math.random() * 10000000)));
                    System.out.println("voitureAncienne.listeVehicules.add(fabriqueVehiculeEssence.creerAutomobile(");
                    scooterAncien.listeVehicules.add(fabriqueVehiculeEssence.creerScooter(
                            (int) (Math.random() * 1000),
                            marques.get((int) (Math.random() * marques.size())),
                            couleurs.get((int) (Math.random() * couleurs.size())),
                            (int) (Math.random() * 10),
                            (int) (Math.random() * 100000)));
                } else {
                    // creation de vehicule electrique
                    voitureModerne.listeVehicules.add(fabriqueVehiculeElectrique.creerAutomobile(
                            (int) (Math.random() * 1000),
                            marques.get((int) (Math.random() * marques.size())),
                            couleurs.get((int) (Math.random() * couleurs.size())),
                            (int) (Math.random() * 100),
                            (int) (Math.random() * 10000000)

                    ));
                    scooterModerne.listeVehicules.add(
                            fabriqueVehiculeEssence.creerScooter(
                                    (int) (Math.random() * 1000),
                                    marques.get((int) (Math.random() * marques.size())),
                                    couleurs.get((int) (Math.random() * couleurs.size())),
                                    (int) (Math.random() * 10),
                                    (int) (Math.random() * 100000)));
                }

                // affichage de la barre de progression
                System.out.print("\r");
                System.out.print("\rChargement des données..." + (i * 100 / 50) + "%");

                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("\rChargement des données...: 100%");
            System.out.print("\nVotre choix: ");
        });
    }

    Vehicule searchById(int id) {
        for (Automobile automobile : voitureAncienne.listeVehicules) {
            if (automobile.getId() == id) {
                return automobile;
            }
        }
        for (Automobile automobile : voitureModerne.listeVehicules) {
            if (automobile.getId() == id) {
                return automobile;
            }
        }
        for (Scooter automobile : scooterAncien.listeVehicules) {
            if (automobile.getId() == id) {
                return automobile;
            }
        }
        for (Scooter automobile : scooterModerne.listeVehicules) {
            if (automobile.getId() == id) {
                return automobile;
            }
        }
        return null;

    }
}
