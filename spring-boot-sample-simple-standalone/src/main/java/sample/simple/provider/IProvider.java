package sample.simple.provider;

public interface IProvider {

    double getPrice(long articleId);

    void order(long storeId, long articleId, int quantite);
}
