package com.cts.pensionerDetails;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cts.pensionerDetails.Controller.PensionerDetailsController;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PensionerDetailsApplicationTests {

	@LocalServerPort
	private int port;
	
	@Autowired
	private PensionerDetailsController controller;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}


}
