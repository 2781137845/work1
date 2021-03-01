package ji_he_ce_shi;

import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<real> {
    private real real;

    public ji_he_ce_shi.real getReal() {
        return real;
    }

    public void setReal(ji_he_ce_shi.real real) {
        this.real = real;
    }

    @Override
    public real getObject() throws Exception {
        return real;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
