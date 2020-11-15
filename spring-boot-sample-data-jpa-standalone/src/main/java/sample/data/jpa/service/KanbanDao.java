package sample.data.jpa.service;


import sample.data.jpa.domain.Kanban;
import sample.data.jpa.domain.Section;

public class KanbanDao extends AbstractJpaDao<Long, Kanban>{
    public Kanban kanban;

    public KanbanDao() {
        super(Kanban.class);
    }

    public Kanban createKanban(String name){
        Kanban kanban = new Kanban(name);
        this.save(kanban);
        return kanban;
    }

    public void addSection(Section section){
        if(!kanban.getListSection().contains(section)){
            kanban.getListSection().add(section);
        }
    }
}
