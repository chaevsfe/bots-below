package chaevsfe.botsbelow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class BotsBelow implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("bots-below");

	@Override
	public void onInitialize() {
		LOGGER.info("Bots Below active: Carpet fake players sort to the tab list bottom.");
	}
}
