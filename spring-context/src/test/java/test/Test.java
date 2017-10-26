package test;

import demo.DemoTest;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Administrator on 2017/10/26.
 */
public class Test {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext context;
        context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        context.getBean(DemoTest.class).print();
     aaaaa
    }
}
