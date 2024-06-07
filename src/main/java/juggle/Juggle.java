package juggle;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Juggle implements ModInitializer {

	public static final String MOD_ID = "juggle";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final JugglersBall JUGGLERS_BALL = new JugglersBall(new Settings().maxCount(1));

	@Override
	public void onInitialize() {
		register(JUGGLERS_BALL, "jugglers_ball");
		LOGGER.info("Juggle mod loaded");
	}

	private static <T extends Item> T register(T item, String name) {
		return Registry.register(Registries.ITEM, Identifier.of("juggle", name), item);
	}
}
