package org.mzt.bizlog.springmvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author muzhantong
 * create on 2022/5/18 2:14 PM
 */
public class AppClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        OrderBean hero = (OrderBean) applicationContext.getBean("orderBean");
        System.out.println(hero);
    }
}
