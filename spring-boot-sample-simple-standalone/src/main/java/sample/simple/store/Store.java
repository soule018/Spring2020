package sample.simple.store;

import sample.simple.bank.IBank;
import sample.simple.provider.IProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Store implements IFastLane, IJustHaveALook, ILane{
    @Autowired
    IBank bank;
    @Autowired
    IProvider provider;


    @Override
    public int getPrice(int idArticle) {
        return 0;
    }

    @Override
    public boolean isAvailable(int idArticle) {
        return false;
    }

    @Override
    public void getAccount(int soldeDuCompte) {

    }

    @Override
    public void getQuantite(int quantite) {

    }



    @Override
    public void oneShotOrder(String article, int quantite) {

    }

    @Override
    public void getVirement() {

    }

    @Override
    public void pay(int montant) {

    }

    @Override
    public void addItemToCart(int quantite) {

    }
}
