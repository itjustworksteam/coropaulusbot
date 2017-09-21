package it.itjustworks.coropaulusbot.server;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class BotApplication extends Application {

	@Override
	public Restlet createInboundRoot() {
		Router router = new Router(getContext());
				
		// bot response
		router.attach("/telegrambot/{token}", BotResource.class);
		getLogger().info("Started " + BotResource.class.toString() + " @ /telegrambot/{token}");
						
		return router;
	}
	
}
