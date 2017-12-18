package co.ceiba.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmailServiceTest {

	EmailService emailService;
	
	@Before
	public void init() {
		emailService = new EmailService();
	}
	
	@Test
	public void testSendMail() {
		// arrange
		
		// act 
		String res = emailService.sendMail("");
		// assert
		assertNotNull(res);
	}

}
