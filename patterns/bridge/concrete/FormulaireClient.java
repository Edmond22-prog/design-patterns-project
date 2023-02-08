package patterns.bridge.concrete;

import patterns.bridge.abstract_.Formulaire;
import patterns.bridge.interface_.IType;

public class FormulaireClient extends Formulaire {

    public FormulaireClient(IType type) {
        super(type);
    }

    public void construire () {

        System.out.println("Formulaire Client");
        type.implementer();
    }
    
}
