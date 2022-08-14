package agnya.sweeter.items.ice_cream;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import java.util.List;

public class Vanilla extends Item {
    public Vanilla(Properties p_41383_) {
        super(p_41383_);
    }
	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("u\00A79+ Speed"));
	}
}
