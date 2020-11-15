package sample.simple.provider;

import org.springframework.stereotype.Component;

@Component
public class Provider implements IProvider {



    @Override
    public double getPrice(long articleId) {
        return 0;
    }

    @Override
    public void order(long storeId, long articleId, int quantite) {
        System.out.println("Store" + storeId + " ident article " + articleId + " (quantite "+ quantite +")");
    }
}
