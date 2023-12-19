package com.yyt.util.jms.listener;

import com.yyt.util.jms.Consumer;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.*;

public class JmsMessageListener implements MessageListener {

    private static Destination orderDestination = new ActiveMQQueue("test.queue.order");
    private static Destination stockDestination = new ActiveMQQueue("test.queue.stock");

    @Autowired
    private Consumer orderConsumer;
    @Autowired
    private Consumer stockConsumer;

    @Override
    public void onMessage(Message message) {
        System.out.println("JmsMessageListener 处理 ===>>> " );
        Destination destination = null;
        try {
            destination = message.getJMSDestination();
        } catch (JMSException e) {
            e.printStackTrace();
        }
        if(destination.equals(orderDestination)) {
            if(message instanceof ObjectMessage) {
                ObjectMessage objectMessage = (ObjectMessage)message;
                try {
                    orderConsumer.receiveMsg(objectMessage.getObject());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if(destination.equals(stockDestination)) {
            if(message instanceof ObjectMessage) {
                ObjectMessage objectMessage = (ObjectMessage)message;
                try {
                    stockConsumer.receiveMsg(objectMessage.getObject());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
