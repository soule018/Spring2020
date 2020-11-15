package sample.simple.bank;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import sample.simple.client.Client;

@Component
public class Bank implements IBank{

    List<Client> client = new ArrayList();



    @Override
    public void transfert(int prix) {

        System.out.println("Le transfert:" +prix);


    }
}