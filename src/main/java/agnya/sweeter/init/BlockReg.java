package agnya.sweeter.init;

import agnya.sweeter.Sweeter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockReg {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Sweeter.MODID);

    // TODO: Cakes registry
	// TODO: Put cake in new sweeter tab
    public static final RegistryObject<Block> CHOCOLATE_CAKE = REGISTRY.register("chocolate_cake", () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE)));	

}
