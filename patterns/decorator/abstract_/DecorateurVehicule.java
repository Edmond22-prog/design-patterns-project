package patterns.decorator.abstract_;

import patterns.decorator.interface_.Catalogue;

public abstract class DecorateurVehicule implements Catalogue {
    protected Catalogue catalogue;

    public DecorateurVehicule(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    public void afficherVehicules() {
        catalogue.afficherVehicules();
    }
}
