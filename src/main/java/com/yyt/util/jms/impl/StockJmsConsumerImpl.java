package com.yyt.util.jms.impl;

import com.yyt.util.jms.Consumer;
import com.yyt.util.model.Order;
import com.yyt.util.model.Stock;
import org.springframework.stereotype.Component;

@Component("stockConsumer")
public class StockJmsConsumerImpl implements Consumer{

    @Override
    public void receiveMsg(Object obj) {
        try {
            Stock stock = (Stock)obj;
            System.out.println(Thread.currentThread().getName() + "<<<<<<=====解析stock：" + stock);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
