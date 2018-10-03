package com.ApiStudy.messenger;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessengeSender extends MessengerBasic {
 
	@Value("${queue.pesquisa.name}")
	private String pesquisaQueue;
	
//    public void send(String order) throws Exception {
//        getChannel().queueDeclare(pesquisaQueue, false, false, false, null);
//        getChannel().basicPublish("", pesquisaQueue, null, order.getBytes("UTF-8"));
//    }
	
	@Autowired
    private RabbitTemplate rabbitTemplate;
 
	
    @Autowired
    private Queue queue;
 
    public void send(String order) {
        rabbitTemplate.convertAndSend(this.queue.getName(), order);
    }
    
}
