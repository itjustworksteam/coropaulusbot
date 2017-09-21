package it.itjustworks.coropaulusbot.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.itjustworks.coropaulusbot.commands.BotResponse;

public class CommandsTest {
			
	@Test
	public void testStartCommand() {
		String message = "/start";
		String answer = new BotResponse.Builder().build().reply(message);
		assertEquals(avviaStartOutput(), answer);
	}
	
	@Test
	public void testAvviaCommand() {
		String message = "/start start";
		String answer = new BotResponse.Builder().build().reply(message);
		assertEquals(avviaStartOutput(), answer);
	}
	
	@Test
	public void testCiaoCommand() {
		String message = "ciao";
		String answer = new BotResponse.Builder().build().reply(message);
		assertEquals(avviaStartOutput(), answer);
	}
	
	@Test
	public void testSearch() {
		String message = "amare oltre";
		String answer = new BotResponse.Builder().build().reply(message);
		assertNotNull(answer);
	}
		
	private String avviaStartOutput() {
		String response = "";
		response += "Ciao! Con questo bot puoi trovare i canti del coropaulus.\n"
				+ "Per cominciare basta che scrivi il nome del canto.\n"
				+ "Per esempio prova con: amare oltre";
		return response;
	}
						
}
