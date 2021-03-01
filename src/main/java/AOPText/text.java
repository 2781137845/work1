package AOPText;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
    @Test
    public void t(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean4.xml");
        User user=ac.getBean("user",User.class);
        user.add();
    }
}
