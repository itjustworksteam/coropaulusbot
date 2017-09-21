package it.itjustworks.coropaulusbot.commands;

import java.io.IOException;

import it.itjustworks.coropaulus.CoroPaulus;
import it.itjustworks.coropaulus.ListaCanti;

public class CoroPaulusSearch implements Command {

	@Override
	public String execute(String message) {
		CoroPaulus coro = new CoroPaulus();
		try {
			ListaCanti canti = coro.listaCanti();
			canti.cerca(message);
			return canti.prettyToString();
		} catch (IOException e) {
			return "Non riesco a trovare il server";
		}
	}
}
