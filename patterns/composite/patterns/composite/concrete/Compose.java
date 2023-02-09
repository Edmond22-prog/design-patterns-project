package patterns.composite.concrete;
import java.util.ArrayList;
import java.util.List;

import patterns.composite.abstract_.Societe;;

public class Compose extends Societe{
    private String name;
    private List<Societe> sousclass;
    
    public Compose(String name){
        this.name= name;
        sousclass  = new ArrayList<Societe>();
    }
    public void add(Societe simple) {
        sousclass.add(simple);
    }
    public void remove(Societe simple) {
        sousclass.remove(simple);
    }
    public Void decrire(String name){
        this.name = name;
        return Compose.decrire();
    }

  /* 
   public  String toString() {
        return ("compose:[Name" + name+ "]");
   }*/
}