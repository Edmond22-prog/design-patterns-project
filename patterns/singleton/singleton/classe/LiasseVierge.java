package singleton.classe;
import java.util.ArrayList;

import javax.swing.text.Document;

//import org.w3c.dom.stylesheets.DocumentStyle;

import singleton.classe.Liasses;

public class LiasseVierge extends Liasses{
    private static LiasseVierge instance= null;

    private LiasseVierge()
    {
       documents= new ArrayList<Document>();
    }

    public static LiasseVierge Instance (){
        if(instance==null){
            instance = new LiasseVierge();
            
        }
        return instance;
    }

    public void ajouter(Document doc){
        documents.add(doc);
    }
    public void retirer(Document doc){
        int indexDoc = documents.indexOf(doc);
        if(indexDoc>0)
            documents.remove(indexDoc);

    }
    
}