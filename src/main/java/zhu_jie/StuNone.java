package zhu_jie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Repository
public class StuNone {
    @Resource
    private Teacher teacher;
    @Value(value = "123132")
    private String n;


    public void run() {
        System.out.println("StuNone");
        teacher.name();
    }
}
