package patterns.composite;

import patterns.composite.abstract_.Societe;
import patterns.composite.concrete.Compose;
import patterns.composite.concrete.Simple;

public class Client {
    
    public static void main(String[] args) {
        Societe societe = new Simple("Société A");
        societe.decrire();
        
        Societe societe2 = new Simple("Société B");
        societe2.decrire();
        
        Societe societe3 = new Simple("Société C");
        societe3.decrire();
        
        Compose groupe = new Compose("Groupe A");
        groupe.ajouterFiliale(societe);
        groupe.ajouterFiliale(societe2);
        groupe.ajouterFiliale(societe3);
        groupe.decrire();
        
        Compose groupe2 = new Compose("Groupe B");
        groupe2.ajouterFiliale(societe);
        groupe2.ajouterFiliale(societe2);
        groupe2.ajouterFiliale(societe3);
        groupe2.decrire();
        
        Compose groupe3 = new Compose("Groupe C");
        groupe3.ajouterFiliale(societe);
        groupe3.ajouterFiliale(societe2);
        groupe3.ajouterFiliale(societe3);
        groupe3.decrire();
        
        Compose groupe4 = new Compose("Groupe D");
        groupe4.ajouterFiliale(groupe);
        groupe4.ajouterFiliale(groupe2);
        groupe4.ajouterFiliale(groupe3);
        groupe4.decrire();
        
    }
}
