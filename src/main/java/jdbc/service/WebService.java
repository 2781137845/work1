package jdbc.service;

import jdbc.dao.Dao;
import jdbc.entity.Web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class WebService {
    @Autowired
    private Dao dao;

    @Transactional()
    public void add(Web web){
        dao.addWeb(web);
    }

    public void update(Web web){
        dao.updateWeb(web);
    }

    public void delete(int id){
        dao.deleteWeb(id);
    }

    public int WebOne(){
        return dao.WatchOneWeb();

    }

    public Web selectOne(int id){
        return dao.selectOneWeb(id);
    }

    public List<Web> selectAll(){
        return (List<Web>) dao.selectAllWeb();
    }

    public void addSome(List<Object[]> list){
        dao.addSomeWeb(list);
    }

    public void updateSome(List<Object[]> list){
        dao.updateSomeWeb(list);
    }

    public void deleteSome(List<Object[]> list){
        dao.deleteSomeWeb(list);
    }
}
