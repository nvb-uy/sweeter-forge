package agnya.sweeter.init;

import agnya.sweeter.Sweeter;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Sweeter.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Sweeter.MOD_ID);

    // ! BLOCK REGISTRY

	// TODO: Make and put cake in new sweeter tab
    public static final RegistryObject<Block> CHOCOLATE_CAKE = BLOCKS.register("chocolate_cake", () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE)));	

    // BlockItem Registry
    public static final RegistryObject<BlockItem> CHOCOLATE_CAKE_ITEM = ITEMS.register("chocolate_cake", () -> new BlockItem(CHOCOLATE_CAKE.get(), new Item.Properties().tab(SweeterTab.SweeterTab))); 


    // ! ITEM REGISTRY
    // Ice Creams
    // TODO: Currently they're items for test purposes
    public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("ice_cream", () -> new Item(new Item.Properties().tab(SweeterTab.SweeterTab)));
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () -> new Item(new Item.Properties().tab(SweeterTab.SweeterTab)));

    // TODO: Variations
    // With Cherry & Sprinkles
}
