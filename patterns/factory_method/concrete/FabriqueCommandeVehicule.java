package patterns.factory_method.concrete;

import patterns.factory_method.abstract_.Commande;
import patterns.factory_method.abstract_.FabriqueCommande;

public class FabriqueCommandeVehicule extends FabriqueCommande {

    @Override
    protected Commande creerCommande() {
        return new CommandeVehicule();
    }

    @Override
    protected Commande creerCommande(String nomC, String nomV, int prixV, int q) {
        return new CommandeVehicule(nomC, nomV, prixV, q);
    }
    
}
