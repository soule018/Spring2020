package sample.simple.client;

import sample.simple.store.IFastLane;
import sample.simple.store.IJustHaveALook;
import sample.simple.store.ILane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.simple.store.Store;

@Component
public class Client implements IRun {

    // décalaration des attributs

    private long numeroCarteBancaire;
    private Compte account;
    private Store store;



    @Autowired
    IFastLane ifast;
    @Autowired
    ILane ilane;
    @Autowired
    IJustHaveALook haveALook;


    public Client() {
        this.account = new Compte(1000);
    }

    public IFastLane getIfast() {
        return ifast;
    }

    public void setIfast(IFastLane ifast) {
        this.ifast = ifast;
    }

    public Compte getAccount() {
        return account;
    }

    public void setAccount(Compte account) {
        this.account = account;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }



    @Override
    public void run() {


        ifast.getVirement();
        ifast.oneShotOrder("orange", 10);
        haveALook.getAccount(account.getSoldeDuCompte());
        haveALook.getPrice(123);
        haveALook.getQuantite(30);
        haveALook.isAvailable(43);
        ilane.pay(45);
        ilane.addItemToCart(15);




    }
}










