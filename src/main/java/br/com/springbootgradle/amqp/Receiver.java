package br.com.springbootgradle.amqp;

import java.util.Date;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;

import br.com.springbootgradle.config.RabbitConfig;

@RabbitListener(queues = RabbitConfig.QUEUE)
public class Receiver {

	@RabbitHandler
	public void process(@Payload String obj) {	
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(new Date() + ": Message Received: "+obj);
	}
}
