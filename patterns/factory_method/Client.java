package patterns.factory_method;

import patterns.factory_method.abstract_.Commande;
import patterns.factory_method.abstract_.FabriqueCommande;
import patterns.factory_method.concrete.FabriqueCommandeVehicule;

public class Client {
    public static void main(String [] args) {
        FabriqueCommande fabriqueCommande = new FabriqueCommandeVehicule();

        Commande commande1 = null;
        Commande commande2 = null;
        
        System.out.println("\n\nUtilisation de la fabrique de commande");
        System.out.println("(New) Application du pattern Template Method");
        commande1 = fabriqueCommande.obtenirCommande("Ghislain Makolle", "Audi", 745000000, 1);
        commande1.calculeMontantTtc();
        commande1.afficher();
        System.out.println("");
        commande2 = fabriqueCommande.obtenirCommande("Man Njoh", "Toyota", 4500000, 1);
        commande2.calculeMontantTtc();
        commande2.afficher();

    }

}
