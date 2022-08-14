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

    public static final RegistryObject<Block> CHOCOLATE_CAKE = BLOCKS.register("chocolate_cake", () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE)));	

    // BlockItem Registry
    public static final RegistryObject<BlockItem> CHOCOLATE_CAKE_ITEM = ITEMS.register("chocolate_cake", () -> new BlockItem(CHOCOLATE_CAKE.get(), new Item.Properties().tab(SweeterTab.SweeterTab))); 


    // ! ITEM REGISTRY
    // Ice Creams
    
    public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("ice_cream", () -> new Item(new Item.Properties().tab(SweeterTab.SweeterTab).food(FoodRegistry.ICE_CREAM)));
    public static final RegistryObject<Item> VANILLA_ICE_CREAM_CHERRY = ITEMS.register("ice_cream_with_cherry", () -> new Item(new Item.Properties().tab(SweeterTab.SweeterTab).food(FoodRegistry.ICE_CREAM_WITH_CHERRY)));
    public static final RegistryObject<Item> VANILLA_ICE_CREAM_SPRINKLES = ITEMS.register("ice_cream_with_sprinkles", () -> new Item(new Item.Properties().tab(SweeterTab.SweeterTab).food(FoodRegistry.ICE_CREAM_WITH_SPRINKLES)));

    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM = ITEMS.register("chocolate_ice_cream", () -> new Item(new Item.Properties().tab(SweeterTab.SweeterTab).food(FoodRegistry.CHOCOLATE_ICE_CREAM)));
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM_WITH_CHERRY = ITEMS.register("chocolate_ice_cream_with_cherry", () -> new Item(new Item.Properties().tab(SweeterTab.SweeterTab).food(FoodRegistry.CHOCOLATE_ICE_CREAM_WITH_CHERRY)));
    public static final RegistryObject<Item> CHOCOLATE_ICE_CREAM_WITH_SPINKLES = ITEMS.register("chocolate_ice_cream_with_sprinkles", () -> new Item(new Item.Properties().tab(SweeterTab.SweeterTab).food(FoodRegistry.CHOCOLATE_ICE_CREAM_WITH_SPRINKLES)));

    public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM = ITEMS.register("strawberry_ice_cream", () -> new Item(new Item.Properties().tab(SweeterTab.SweeterTab).food(FoodRegistry.STRAWBERRY_ICE_CREAM)));
    public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM_WITH_CHERRY = ITEMS.register("strawberry_ice_cream_with_cherry", () -> new Item(new Item.Properties().tab(SweeterTab.SweeterTab).food(FoodRegistry.STRAWBERRY_ICE_CREAM_WITH_CHERRY)));
    public static final RegistryObject<Item> STRAWBERRY_ICE_CREAM_WITH_SPINKLES = ITEMS.register("strawberry_ice_cream_with_sprinkles", () -> new Item(new Item.Properties().tab(SweeterTab.SweeterTab).food(FoodRegistry.STRAWBERRY_ICE_CREAM_WITH_SPRINKLES)));

}
