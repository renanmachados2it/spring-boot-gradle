package br.com.springbootgradle.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.springbootgradle.amqp.Receiver;
import br.com.springbootgradle.amqp.Sender;

@Configuration
public class RabbitConfig {

	public static final String QUEUE = "spring-boot"; 
	
	@Bean
	public Sender sender() {
		return new Sender();
	}
	
	@Bean
	public Receiver receiver(){
		return new Receiver();
	}

	@Bean
	public Queue queue() {
		return new Queue(QUEUE);
	}
}
