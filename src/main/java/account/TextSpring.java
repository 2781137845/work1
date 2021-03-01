package account;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextSpring {
    @Test
    public void Text(){
        ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
        Account a1=a.getBean("account2",Account.class);
        System.out.println(a1);
    }
}
