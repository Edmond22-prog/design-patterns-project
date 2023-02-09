package patterns.composite.concrete;
import patterns.composite.abstract_.Societe;

public class Simple extends Societe{
    public String name;
    public Simple(String string) {
    }
    public Void decrire(String name){
        this.name = name;
        return Simple.decrire();
    }

}