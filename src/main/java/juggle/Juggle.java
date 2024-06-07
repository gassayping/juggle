package juggle;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Juggle implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("juggle");

	public static final JugglersBall JUGGLERS_BALL = new JugglersBall(new Settings());

	@Override
	public void onInitialize() {

		Registry.register(Registries.ITEM, Identifier.of("juggle", "jugglers_ball"), JUGGLERS_BALL);
		LOGGER.info("Juggle mod loaded");
	}
}
