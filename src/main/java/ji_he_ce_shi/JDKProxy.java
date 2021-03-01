package ji_he_ce_shi;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    @Test
    public void s(){
    Class [] interfaces={serDao.class};
    serDao ser=new serDaoImpl();
    serDao serDao= (serDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new handler(ser));
    serDao.use();
    }
}

class handler implements InvocationHandler{
    Object obj;
    public handler(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("先输出"+method.getName()+",数值为"+ Arrays.toString(args));

        Object res = method.invoke(obj,args);

        System.out.println("最后输出");
        return res;
    }
}
