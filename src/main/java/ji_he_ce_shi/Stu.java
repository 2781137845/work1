package ji_he_ce_shi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Stu {
    private String[] name;
    private List id;
    private Map clazz;
    private serDao serDao;
    private List<real> realList;

    public List<real> getRealList() {
        return realList;
    }

    public void setRealList(List<real> realList) {
        this.realList = realList;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public List getId() {
        return id;
    }

    public void setId(List id) {
        this.id = id;
    }

    public Map getClazz() {
        return clazz;
    }

    public void setClazz(Map clazz) {
        this.clazz = clazz;
    }

    public ji_he_ce_shi.serDao getSerDao() {
        return serDao;
    }

    public void setSerDao(ji_he_ce_shi.serDao serDao) {
        this.serDao = serDao;
    }



    public void run(){
        System.out.println(Arrays.toString(name));
        System.out.println(id);
        System.out.println(clazz);
        System.out.println(realList);
        serDao.use();

    }


}
