package it.itjustworks.coropaulusbot.commands;

public class StartCommand implements Command {

	@Override
	public String execute(String message) {
		String output = "";
		output += "Ciao! Con questo bot puoi trovare i canti del coropaulus.\n"
				+ "Per cominciare basta che scrivi il nome del canto.\n"
				+ "Per esempio prova con: amare oltre";
		return output;
	}

}
