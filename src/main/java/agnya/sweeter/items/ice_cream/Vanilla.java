package agnya.sweeter.items.ice_cream;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import java.util.List;

public class Vanilla extends Item {
	public Vanilla(Item.Properties properties) {
		super(properties);
	}
	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7a+\u00A79 Speed \u00A78(10s)"));
	}
}
