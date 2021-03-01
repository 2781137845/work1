package AOPText;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component//还有Controller,Repository,Service用来创建对象的注解
@Aspect//确定是增强类
@Order(1)//设置优先级，数值越小越先执行
public class Proxy {
    @Pointcut(value = "execution(* AOPText.User.add(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(){
        System.out.println("before...");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("after...");
    }

    @AfterReturning("pointcut()")
    public void afterRun(){
        System.out.println("afterRun...");
    }

    @AfterThrowing("pointcut()")
    public void throwing(){
        System.out.println("throwing...");
    }

    @Around("pointcut()")
    public void Around(ProceedingJoinPoint p) throws Throwable {
        System.out.println("aroundBefore");
        p.proceed();
        System.out.println("aroundAfter");
    }
}
