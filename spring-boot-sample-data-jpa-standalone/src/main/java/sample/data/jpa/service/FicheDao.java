package sample.data.jpa.service;
import sample.data.jpa.domain.Fiche;



public class FicheDao extends AbstractJpaDao<Long, Fiche> {


    public FicheDao() {
        super(Fiche.class);
    }

    public Fiche createFiche(String libelle) {
        Fiche fiche = new Fiche(libelle);
        this.save(fiche);
        return fiche;
    }


}
