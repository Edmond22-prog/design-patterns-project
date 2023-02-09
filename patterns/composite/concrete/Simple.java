package patterns.composite.concrete;

import patterns.composite.abstract_.Societe;

public class Simple extends Societe {
    
    public Simple(String name) {
        super(name);
    }
    
    @Override
    public void decrire() {
        System.out.println("Société " + this.name);
    }
    
}
