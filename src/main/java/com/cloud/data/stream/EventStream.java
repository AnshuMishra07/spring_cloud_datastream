package com.cloud.data.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Anshu Mishra
 *
 */
public interface EventStream {
	String INBOUND = "event-consumer";
	String OUTBOUND = "event-producer";

	@Input(INBOUND)
	SubscribableChannel consumer();

	@Output(OUTBOUND)
	MessageChannel producer();
}
