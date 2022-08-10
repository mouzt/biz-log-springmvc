package org.mzt.bizlog.springmvc.flow;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * @author muzhantong
 * create on 2022/6/7 9:31 AM
 */
public class FlowTest {
    public static void main(String[] args) {
        OneBean one= new OneBean();

        OneBean proxyOne;


        Pointcut pc= new ControlFlowPointcut(FlowTest.class,"runfoo");
        Advice advice=new SimpleAdvise();
        Advisor advisor=new DefaultPointcutAdvisor(pc,advice);

        //创建BeanOne代理
        ProxyFactory pf1=new ProxyFactory();
        pf1.addAdvisor(advisor);
        pf1.setTarget(one);
        proxyOne=(OneBean) pf1.getProxy();

        //通过runfoo方法调用foo
        FlowTest.runfoo(proxyOne);


    }

    public static void runfoo(OneBean beanOne){
        beanOne.foo();
        beanOne.bar();
    }
}
