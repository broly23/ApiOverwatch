package com.ApiStudy.ctrl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MessengeReceiver {

	@RabbitListener(queues = {"resultado"})
    public void receive(@Payload String fileBody) {
		//
    }
}
