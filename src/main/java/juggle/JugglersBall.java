package juggle;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class JugglersBall extends Item {

	public JugglersBall(Settings settings) {
		super(settings);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		user.playSound(SoundEvents.BLOCK_ANVIL_PLACE, 1.0f, 1.0f);

		ItemStack item = user.getStackInHand(hand);
		// item.setCount(0);

		return TypedActionResult.success(item);
	}
}
