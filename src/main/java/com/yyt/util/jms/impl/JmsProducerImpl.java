package com.yyt.util.jms.impl;

import com.yyt.util.help.MapperHelper;
import com.yyt.util.jms.Producer;
import com.yyt.util.model.Order;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

@Component
public class JmsProducerImpl implements Producer{

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private MapperHelper mapperHelper;

    @Override
    public void sendMsg(String destinationName, Object obj) {
        try {
            System.out.println("=====>>>>> 发送queue消息" + obj );
            Destination destination = new ActiveMQQueue(destinationName);
            jmsMessagingTemplate.convertAndSend(destination, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
