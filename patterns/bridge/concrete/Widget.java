package patterns.bridge.concrete;

import patterns.bridge.interface_.IType;

public class Widget implements IType {

    @Override
    public void implementer() {
        System.out.println("Implémentation faite en utilisant des widgets");
    }
    
}
