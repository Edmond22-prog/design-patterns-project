package patterns.bridge.concrete;

import patterns.bridge.interface_.IType;

public class HTML implements IType {

    @Override
    public void implementer() {
        System.out.println("Implémentation faite en HTML");
    }
    
}
