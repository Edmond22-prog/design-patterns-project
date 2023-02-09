package patterns.composite.concrete;

import java.util.ArrayList;

import patterns.composite.abstract_.Societe;

public class Compose extends Societe {
    public ArrayList<Societe> filiales;
    
    public Compose(String name) {
        super(name);
        this.filiales = new ArrayList<Societe>();
    }

    public void ajouterFiliale(Societe simple) {
        filiales.add(simple);
    }

    public void retirerFiliale(Societe simple) {
        filiales.remove(simple);
    }
    
    @Override
    public void decrire() {
        System.out.println("Société avec filiale " + this.name);
        System.out.println("Filiales :");
        for (Societe filiale : filiales) {
            filiale.decrire();
        }
    }
}
