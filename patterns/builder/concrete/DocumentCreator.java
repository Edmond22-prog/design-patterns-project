package patterns.builder.concrete;

public class DocumentCreator {
    DocumentBuilder builder;

    public DocumentCreator(DocumentBuilder builder) {
        this.builder = builder;

    }

    LiasseDocument buildLiasse(){
        builder.buildBonCommande();
        builder.buildCertificatCession();
        builder.buildBonCommande();
        return builder.getResult();
    }
}
