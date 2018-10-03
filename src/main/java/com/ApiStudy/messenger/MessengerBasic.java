package com.ApiStudy.messenger;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class MessengerBasic {

	private ConnectionFactory factory;

//	private ConnectionFactory getFactory() {
//		if (factory == null) {
//			factory = new ConnectionFactory();
//			factory.setHost("localhost");
//			factory.setUsername("admin");
//			factory.setPassword("admin");
//		}
//		return factory;
//	}

//	public Channel getChannel() throws Exception {
//		Connection connection = getFactory().newConnection();
//		Channel channel = connection.createChannel();
//		return channel;
//	}

}