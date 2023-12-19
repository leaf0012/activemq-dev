package com.yyt.util;

import com.yyt.util.jms.Producer;
import com.yyt.util.model.Order;
import com.yyt.util.model.Stock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilApplicationTests {

	@Autowired
	private Producer producer;

	@Test
	public void contextLoads() {
		for(int i=0; i<10; i++) {
			Order order = new Order();
			order.setId(i);
			order.setOrderNo(i+"");
			order.setProductId(i);
			order.setCreateTime(LocalDateTime.now());
			producer.sendMsg("test.queue.order", order);
		}

		for(int i=100; i<110; i++) {
			Stock stock = new Stock();
			stock.setId(i);
			stock.setProductId(i);
			stock.setCount(i);
			producer.sendMsg("test.queue.stock", stock);
		}
	}

}
