package com.ApiStudy.ctrl;

import org.springframework.stereotype.Component;

@Component
public class MessengeSender extends MessengerBasic {
 
	private final static String QUEUE_NAME = "pesquisa"; 
	
    public void send(String order) throws Exception {
        getChannel().queueDeclare(QUEUE_NAME, false, false, false, null);
        getChannel().basicPublish("", QUEUE_NAME, null, order.getBytes("UTF-8"));
    }
}
