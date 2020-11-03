package com.chen;

import com.chen.pojo.Dog;
import com.chen.pojo.People;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: JINCHENCHEN
 * Date: 2020/10/29
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        People people = context.getBean("people", People.class);
        Dog dog = context.getBean("dog", Dog.class);
        Dog dog2 = context.getBean("dog", Dog.class);
        System.out.println(dog.hashCode() + " " + dog2.hashCode());
//        System.out.println(dog.getOwner().getName());
//        System.out.println(dog.getName());

    }
}
