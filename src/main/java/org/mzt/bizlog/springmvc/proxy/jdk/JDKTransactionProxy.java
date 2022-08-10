package org.mzt.bizlog.springmvc.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author muzhantong
 * create on 2022/5/11 8:58 AM
 */
public class JDKTransactionProxy {

    public static Object getTransactionProxy(Object target) {
        return new JDKTransactionInvocationHandler(target).getProxy();
    }
   static class JDKTransactionInvocationHandler implements InvocationHandler {

        private Object target;

        public JDKTransactionInvocationHandler(Object target) {
            this.target = target;
        }
        public Object getProxy() {
            return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            try {
                System.out.println("JDKTransactionProxy.invoke open transaction");
                return method.invoke(target, args);
            } catch (Exception e) {
                System.out.println("JDKTransactionProxy.exception transaction rollback");
                throw e;
            }finally {
                System.out.println("JDKTransactionProxy.transaction close");
            }
        }
    }
}
