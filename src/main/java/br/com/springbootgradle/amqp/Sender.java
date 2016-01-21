package br.com.springbootgradle.amqp;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.springbootgradle.config.RabbitConfig;

public class Sender {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Scheduled(fixedDelay = 10000L)
	public void sendScheduled() {
		this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE, "Teste");
		System.out.println("Message Sent Scheduled!!!");
	}
	
	public void send(Object obj){
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			String message = mapper.writeValueAsString(obj);
			
			this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE, message);
			System.out.println("Message Sent: "+message);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
