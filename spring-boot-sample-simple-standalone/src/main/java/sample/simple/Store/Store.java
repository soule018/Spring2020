package sample.simple.Store;

import sample.simple.Bank.IBank;
import sample.simple.Provider.IProvider;
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
    public void OneShortOrder(int idArticle, int qteCommande) {

    }
}
