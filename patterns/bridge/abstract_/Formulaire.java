package patterns.bridge.abstract_;

import patterns.bridge.interface_.IType;

public abstract class Formulaire {
    protected IType type;

    public Formulaire(IType type) {
        this.type = type;
    }
    
    public void construire() {}

}
