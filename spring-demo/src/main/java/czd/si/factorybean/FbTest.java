package czd.si.factorybean;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Administrator on 2017/11/3.
 */
public class FbTest {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext context;
        context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        Object bean = context.getBean("&fb");
        System.out.println(bean.getClass());
    }
}
