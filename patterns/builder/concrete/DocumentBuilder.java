package patterns.builder.concrete;

public interface DocumentBuilder {

    public void buildDemanderImmatriculation();

    public void buildCertificatCession();

    public void buildBonCommande();

    public LiasseDocument getResult();

}
