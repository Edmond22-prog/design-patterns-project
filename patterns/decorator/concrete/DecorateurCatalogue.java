package patterns.decorator.concrete;

import patterns.decorator.abstract_.DecorateurVehicule;
import patterns.decorator.interface_.Catalogue;

public class DecorateurCatalogue extends DecorateurVehicule {

    public DecorateurCatalogue(Catalogue catalogue) {
        super(catalogue);
    }

    protected void decorationCatalogue() {
        System.out.println("\n\n###### CATALOGUE VEHICULE DECORE ######\n");
    }

    @Override
    public void afficherVehicules() {
        decorationCatalogue();
        super.afficherVehicules();
        System.out.println("########################################");
    }
    
}
