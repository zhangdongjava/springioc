package test;

import demo.DemoTest;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2017/10/26.
 */
public class Test {

    public static void main(String[] args) {
        DefaultListableBeanFactory context;
        context = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(context);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
        //context."classpath:"
        context.getBean(DemoTest.class).print();
    }
}
