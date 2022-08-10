package org.mzt.bizlog.springmvc.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author muzhantong
 * create on 2022/5/19 7:12 PM
 */
public class CglibTransactionProxy {

    public static Object getTransactionProxy(final Object target){
        return Enhancer.create(target.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                /*增强逻辑*/
                System.out.println("CglibTransactionProxy.invoke open transaction");
                Object result;
                try {
                    result = methodProxy.invokeSuper(proxy, args);
//                     //result = methodProxy.invokeSuper(proxy, args);
//                    result = method.invoke(target, args);
//                    //result = method.invoke(proxy, args);
//                    //result = methodProxy.invokeSuper(proxy, args);
                    return result;
                }catch (Exception e){
                    System.out.println("CglibTransactionProxy.invoke rollback transaction");
                    throw e;
                }finally {
                    System.out.println("CglibTransactionProxy.invoke close transaction");
                }
            }
        });
    }

}
