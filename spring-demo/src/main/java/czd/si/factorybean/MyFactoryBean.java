package czd.si.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by Administrator on 2017/11/3.
 */
public class MyFactoryBean implements FactoryBean<Demo> {

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        System.out.println("info:"+info);
        this.info = info;
    }

    @Override
    public Demo getObject() throws Exception {
        return new Demo();
    }

    @Override
    public Class<?> getObjectType() {
        return Demo.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
