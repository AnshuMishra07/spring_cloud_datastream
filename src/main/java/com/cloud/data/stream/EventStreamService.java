package com.cloud.data.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

/**
 * @author Anshu Mishra
 *
 */
@Service
public class EventStreamService {
	@Autowired
	private EventStream eventStream;

	public Boolean produceEvent(Message msg) {
		System.out.println("Producing events --> id: "+ msg.getId() +" name: "+msg.getName()+" Actual message: "+ msg.getData());
		msg.setBytePayload(msg.getData().getBytes());
		MessageChannel messageChannel = eventStream.producer();
		return messageChannel.send(MessageBuilder.withPayload(msg)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
		
	}

}
