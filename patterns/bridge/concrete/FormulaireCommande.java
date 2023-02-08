package patterns.bridge.concrete;

import patterns.bridge.abstract_.Formulaire;
import patterns.bridge.interface_.IType;

public class FormulaireCommande extends Formulaire {

    public FormulaireCommande(IType type) {
        super(type);
    }

    public void construire () {
        
        System.out.println("Formulaire Commande");
        type.implementer();
    }
    
}
