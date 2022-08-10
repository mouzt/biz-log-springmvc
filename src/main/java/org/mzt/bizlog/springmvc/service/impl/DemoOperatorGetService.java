package org.mzt.bizlog.springmvc.service.impl;

import com.mzt.logapi.beans.Operator;
import com.mzt.logapi.service.IOperatorGetService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author muzhantong
 * create on 2022/5/18 3:36 PM
 */
@Primary
@Service
public class DemoOperatorGetService implements IOperatorGetService {
    @Override
    public Operator getUser() {
        return new Operator("muzhantong");
    }
}
