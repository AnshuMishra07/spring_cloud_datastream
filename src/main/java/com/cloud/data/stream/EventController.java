package com.cloud.data.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anshu Mishra
 *
 */
@RestController
@RequestMapping("/api/event")
public class EventController {
	@Autowired
	private EventStreamService eventStreamService;

	@PostMapping("/produce")
	public Boolean sendEvent(@RequestBody Message msg) throws Exception {
		return eventStreamService.produceEvent(msg);
	}

}
