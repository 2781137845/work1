package jdbc.dao;

import jdbc.entity.Web;

import java.util.*;

public interface Dao {
    void addWeb(Web web);

    void updateWeb(Web web);

    void deleteWeb(int id);

    int WatchOneWeb();

    Web selectOneWeb(int id);

    List<Web> selectAllWeb();

    void addSomeWeb(List<Object[]> list);

    void updateSomeWeb(List<Object[]> list);

    void deleteSomeWeb(List<Object[]> list);
}
