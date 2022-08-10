package org.mzt.bizlog.springmvc.configurable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

/**
 * @author muzhantong
 * create on 2022/7/25 9:32 AM
 */
@Component
@Configurable(preConstruction = true)
public class Car {
    @Autowired
    private Engine engine;
    @Autowired
    private Transmission transmission;

    public void startCar() {
        System.out.println("Car started engine:" + engine);
    }
}
