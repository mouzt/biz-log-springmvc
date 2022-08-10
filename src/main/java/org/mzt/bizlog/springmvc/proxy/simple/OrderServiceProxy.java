package org.mzt.bizlog.springmvc.proxy.simple;

import org.mzt.bizlog.springmvc.proxy.service.OrderService;

/**
 * @author muzhantong
 * create on 2022/5/22 3:38 PM
 */
public class OrderServiceProxy implements OrderService {

    private OrderService orderService;

    public OrderServiceProxy (OrderService orderService){
        this.orderService = orderService;
    }

    @Override
    public String updateOrder() {
        try {
            System.out.println("JDKTransactionProxy.invoke open transaction");
            return orderService.updateOrder();
        } catch (Exception e) {
            System.out.println("JDKTransactionProxy.exception transaction rollback");
            throw e;
        }finally {
            System.out.println("JDKTransactionProxy.transaction close");
        }
    }
}
