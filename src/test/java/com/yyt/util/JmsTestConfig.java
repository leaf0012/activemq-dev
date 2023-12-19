package com.yyt.util;

import com.yyt.util.jms.listener.JmsMessageListener;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.support.converter.MessageConverter;

import javax.annotation.Resource;
import javax.jms.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * activemq的配置
 */
@Configuration
public class JmsTestConfig {

//    @Resource(name = "jsonMessageConverter")
//    MessageConverter messageConverter;
//
//    @Bean
//    public JmsTemplate getJmsTemplate(ConnectionFactory connectionFactor) {
//        JmsTemplate jmsTemplate = new JmsTemplate();
//        jmsTemplate.setMessageConverter(messageConverter);
//        jmsTemplate.setConnectionFactory(connectionFactor);
//        return jmsTemplate;
//    }
//
//    /**
//     * 消息监听器
//     * @return
//     */
//    @Bean
//    public JmsMessageListener getAbstractMessageListener() {
//        JmsMessageListener jmsMessageListener = new JmsMessageListener();
//        return jmsMessageListener;
//    }
//
//
//    @Bean
//    public ActiveMQConnectionFactory getActiveMQConnectionFactory() {
//        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
//        factory.setTrustedPackages(new ArrayList(Arrays.asList("com.yyt.util.model,java.time".split(","))));
//        return factory;
//    }
//
////    @Bean
////    public JmsListenerContainerFactory queueListenerContainerFactory(ConnectionFactory connectionFactory) {
////        DefaultJmsListenerContainerFactory queueJmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
////        queueJmsListenerContainerFactory.setPubSubDomain(false);
////        queueJmsListenerContainerFactory.setConnectionFactory(connectionFactory);
////        return queueJmsListenerContainerFactory;
////
////    }
//
//    /**
//     * 消息监听容器
//     * @param connectionFactory
//     * @param messageListener
//     * @return
//     */
//    @Bean
//    public DefaultMessageListenerContainer getOrderMessageListenerContainer(ConnectionFactory connectionFactory, MessageListener messageListener) {
//        DefaultMessageListenerContainer defaultMessageListenerContainer = new DefaultMessageListenerContainer();
//        defaultMessageListenerContainer.setConnectionFactory(connectionFactory);
//        defaultMessageListenerContainer.setMessageListener(messageListener);
//        defaultMessageListenerContainer.setConcurrentConsumers(10);
//        //可配置的消息队列
//        defaultMessageListenerContainer.setDestination(new ActiveMQQueue("test.queue.order"));
//        return defaultMessageListenerContainer;
//    }
//
//    @Bean
//    public DefaultMessageListenerContainer getStockMessageListenerContainer(ConnectionFactory connectionFactory, MessageListener messageListener) {
//        DefaultMessageListenerContainer defaultMessageListenerContainer = new DefaultMessageListenerContainer();
//        defaultMessageListenerContainer.setConnectionFactory(connectionFactory);
//        defaultMessageListenerContainer.setMessageListener(messageListener);
//        defaultMessageListenerContainer.setConcurrentConsumers(10);
//        //可配置的消息队列
//        defaultMessageListenerContainer.setDestination(new ActiveMQQueue("test.queue.stock"));
//        return defaultMessageListenerContainer;
//    }


}
