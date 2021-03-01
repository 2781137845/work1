package jdbc.text;

import jdbc.entity.Web;
import jdbc.service.WebService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.List;
@ContextConfiguration(locations = {"classpath:bean1.xml"})
public class text {
    ApplicationContext ac;
    @Before
    public void init(){
        ac=new ClassPathXmlApplicationContext("jdbcText.xml");
    }

    @Test
    public void t(){
        WebService webService=ac.getBean("webService",WebService.class);
//        Web web1=new Web("john",1);
//        Web web2=new Web("tom",1);

//        List<Object[]> list=new ArrayList<>();
//        Object []o1={1};
//        Object []o2={2};
//        list.add(o1);
//        list.add(o2);
//        webService.deleteSome(list);

//        webService.delete(1);

//        int i = webService.WebOne();
//        System.out.println(i);

//        Web web = webService.selectOne(123);
//        System.out.println(web);

//        List<Web> webs = webService.selectAll();
//        System.out.println(webs);
    }
}
