package com.yyt.util;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
@SpringBootApplication
@EnableJms
public class UtilApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilApplication.class, args);
		// Launch the application
//		ConfigurableApplicationContext context = SpringApplication.run(UtilApplication.class, args);
//		Producer producer = context.getBean(Producer.class);
////		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
//		for(int i=0; i<10; i++) {
//			Order order = new Order();
//			order.setId(i);
//			order.setOrderNo(i+"");
//			order.setProductId(i);
//			order.setCreateTime(LocalDateTime.now());
//			producer.sendMsg("test.queue", order);
//		}
	}
}
