package it.itjustworks.coropaulusbot.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import it.itjustworks.coropaulusbot.utilities.TelegramIP;

public class TelegramIPTest {

	// Telegram IP Addresses are 149.154.167.197-233
	
	@Test
	public void testOne() {
		assertFalse(TelegramIP.isOk("149.154.167.196"));
		assertTrue(TelegramIP.isOk("149.154.167.197"));
		assertTrue(TelegramIP.isOk("149.154.167.229"));
		assertTrue(TelegramIP.isOk("149.154.167.233"));
		assertFalse(TelegramIP.isOk("149.154.167.234"));
	}
	
	@Test
	public void improveCodeCoverage() {
		assertFalse(TelegramIP.isOk("127.0.0.1"));
		TelegramIP ip = new TelegramIP();
		ip.toString();
	}
	
}
