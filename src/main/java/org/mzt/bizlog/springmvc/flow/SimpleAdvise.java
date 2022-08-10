package org.mzt.bizlog.springmvc.flow;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author muzhantong
 * create on 2022/6/7 9:30 AM
 */
public class SimpleAdvise  implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before");
        Object retVal=methodInvocation.proceed();
        System.out.println("after");
        return retVal;
    }
}
