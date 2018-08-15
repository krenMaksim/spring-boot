package com.kren.boot.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private static final Log logger = LogFactory.getLog(TestService.class);

    public String test() {
	String mess = "hello from test service";

	logger.info(mess);

	return mess;
    }

}
