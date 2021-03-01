package text;

import account.Account;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text1 {
    ApplicationContext ac;
    @Before
    public void before(){
        ac=new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void t1(){
        Account a=ac.getBean("account",Account.class);
        System.out.println(a.toString());
    }
}
