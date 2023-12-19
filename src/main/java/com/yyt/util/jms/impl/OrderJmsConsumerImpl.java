package com.yyt.util.jms.impl;

import com.yyt.util.jms.Consumer;
import com.yyt.util.model.Order;
import org.springframework.stereotype.Component;

@Component("orderConsumer")
public class OrderJmsConsumerImpl implements Consumer{

    @Override
    public void receiveMsg(Object obj) {
        try {
            Order order = (Order)obj;
            System.out.println(Thread.currentThread().getName() + "<<<<<<=====解析order：" + order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
