package sample.simple.Client;

import sample.simple.Store.IFastLane;
import sample.simple.Store.IJustHaveALook;
import sample.simple.Store.ILane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client implements IRun {
    @Autowired
    IFastLane ifast;
    @Autowired
    ILane ilane;
    @Autowired
    IJustHaveALook haveALook;

    @Override
    public void run() {
        System.out.println("C'est parti");
        int prix = haveALook.getPrice(123);
        boolean reponse = haveALook.isAvailable(123);
        ifast.OneShortOrder (123,45);

    }
}
