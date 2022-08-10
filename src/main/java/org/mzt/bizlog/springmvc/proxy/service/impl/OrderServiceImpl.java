package org.mzt.bizlog.springmvc.proxy.service.impl;

import org.mzt.bizlog.springmvc.proxy.service.OrderService;

/**
 * @author muzhantong
 * create on 2022/5/11 8:44 AM
 */
public class OrderServiceImpl implements OrderService {

    @Override
    public String updateOrder() {
        System.out.println("OrderServiceImpl.order");
        return "OrderServiceImpl.order";
    }
}
