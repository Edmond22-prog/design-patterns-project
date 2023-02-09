
import abstract_.Societe;  
import concrete.Simple;
import concrete.Compose;

public class Client{
    

    public static void main(String[] args) {

        Societe societe1 = new Simple("Societe1");
        Societe societe2 = new Simple( "societe2");
        Compose team1 = new Compose("goupe1");
        Compose team2 = new Compose ("groupe2");
        team1.add (societe1);
        team1.add(societe2);
        team1.remove(societe1);
        Simple societe3 = new Simple("societe3");
        team2.add(societe3);
        Simple.decrire();
        Simple.decrire();
    }

}

