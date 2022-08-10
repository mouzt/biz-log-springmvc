package org.mzt.bizlog.springmvc.proxy;

import org.mzt.bizlog.springmvc.proxy.cglib.CglibTransactionProxy;
import org.mzt.bizlog.springmvc.proxy.service.OrderService;
import org.mzt.bizlog.springmvc.proxy.service.impl.OrderServiceImpl;
import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @author muzhantong
 * create on 2022/5/11 9:09 AM
 */

public class ProxyService {


//    public static void main(String[] args) {
//
//        OrderService orderService = new OrderServiceProxy(new OrderServiceImpl());
//        String order = orderService.updateOrder();
//        System.out.println(order);
//    }


//    public static void main(String[] args) {
//        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//        OrderService orderService = new OrderServiceImpl();
//        OrderService orderServiceTransactionProxy = (OrderService) JDKTransactionProxy.getTransactionProxy(orderService);
//        String order = orderServiceTransactionProxy.updateOrder();
//        System.out.println(order);
//    }

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/mouzhantong/Downloads/tmp");

        OrderService orderService = new OrderServiceImpl();
        OrderService orderServiceTransactionProxy = (OrderService) CglibTransactionProxy.getTransactionProxy(orderService);
        String order = orderServiceTransactionProxy.updateOrder();
        System.out.println("返回值----------"+order);

        //也可以代理接口
    }
}
