package patterns.decorator;

import patterns.abstract_factory.concrete.FabriqueVehiculeElectrique;
import patterns.abstract_factory.concrete.FabriqueVehiculeEssence;
import patterns.decorator.abstract_.DecorateurVehicule;
import patterns.decorator.concrete.CatalogueAutomobile;
import patterns.decorator.concrete.CatalogueScooter;
import patterns.decorator.concrete.DecorateurCatalogue;

public class Client {
    
    public static void main(String [] args) {
        FabriqueVehiculeEssence fabriqueV = new FabriqueVehiculeEssence();
        FabriqueVehiculeElectrique fabriqueVE = new FabriqueVehiculeElectrique();

        CatalogueAutomobile catalogueA = new CatalogueAutomobile("Automobile Classe MOVIE");
        catalogueA.ajouterVehicule(fabriqueV.creerAutomobile("Lamborguini", "Jaune", 210, 1357000000));
        catalogueA.ajouterVehicule(fabriqueV.creerAutomobile("Ferrari", "Rouge", 110, 950500000));
        catalogueA.ajouterVehicule(fabriqueVE.creerAutomobile("Porsche", "Noir", 150, 1200000000));

        CatalogueScooter catalogueS = new CatalogueScooter("Scooter Classe HOMECOMING");
        catalogueS.ajouterVehicule(fabriqueV.creerScooter("Yamaha", "Bleu", 50, 750000));
        catalogueS.ajouterVehicule(fabriqueVE.creerScooter("Lexus", "Blanc", 30, 500000));

        System.out.println("\n(Message) Affichage avant décoration\n");
        catalogueA.afficherVehicules();
        System.out.println("");
        catalogueS.afficherVehicules();

        DecorateurVehicule catalogueADecore = new DecorateurCatalogue(catalogueA);
        DecorateurVehicule catalogueSDecore = new DecorateurCatalogue(catalogueS);

        System.out.println("\n(Message) Affichage après décoration\n");
        catalogueADecore.afficherVehicules();
        System.out.println("");
        catalogueSDecore.afficherVehicules();
    }
}
