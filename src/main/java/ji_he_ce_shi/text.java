package ji_he_ce_shi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
    @Test
    public void text1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu=ac.getBean("stu",Stu.class);
        stu.run();
    }

    @Test
    public void text2(){
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean2.xml");
        real real=ac.getBean("myBean",real.class);
        System.out.println(real);

    }
}
