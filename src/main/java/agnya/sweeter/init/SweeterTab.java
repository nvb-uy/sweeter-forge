package agnya.sweeter.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class SweeterTab {
    public static final CreativeModeTab SweeterTab = new CreativeModeTab("sweeter_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Registry.CHOCOLATE_CAKE_ITEM.get());
        }
    };
}