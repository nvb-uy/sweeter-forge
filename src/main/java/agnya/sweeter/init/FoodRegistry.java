package agnya.sweeter.init;

import net.minecraft.world.food.FoodProperties;

public class FoodRegistry {
    // Default Food Values
    public static int ICE_CREAM_NUTRITION = 2;
    public static float ICE_CREAM_SATURATION = 0.5f;
    
    
    public static final FoodProperties ICE_CREAM = new FoodProperties.Builder().nutrition(ICE_CREAM_NUTRITION).saturationMod(ICE_CREAM_SATURATION).alwaysEat().build();
    public static final FoodProperties ICE_CREAM_WITH_SPRINKLES = new FoodProperties.Builder().nutrition(ICE_CREAM_NUTRITION).saturationMod(ICE_CREAM_SATURATION).alwaysEat().build();
    public static final FoodProperties ICE_CREAM_WITH_CHERRY = new FoodProperties.Builder().nutrition(ICE_CREAM_NUTRITION).saturationMod(ICE_CREAM_SATURATION).alwaysEat().build();

    public static final FoodProperties CHOCOLATE_ICE_CREAM = new FoodProperties.Builder().nutrition(ICE_CREAM_NUTRITION).saturationMod(ICE_CREAM_SATURATION).alwaysEat().build();
    public static final FoodProperties CHOCOLATE_ICE_CREAM_WITH_CHERRY = new FoodProperties.Builder().nutrition(ICE_CREAM_NUTRITION).saturationMod(ICE_CREAM_SATURATION).alwaysEat().build();
    public static final FoodProperties CHOCOLATE_ICE_CREAM_WITH_SPRINKLES = new FoodProperties.Builder().nutrition(ICE_CREAM_NUTRITION).saturationMod(ICE_CREAM_SATURATION).alwaysEat().build();

    public static final FoodProperties STRAWBERRY_ICE_CREAM = new FoodProperties.Builder().nutrition(ICE_CREAM_NUTRITION).saturationMod(ICE_CREAM_SATURATION).alwaysEat().build();
    public static final FoodProperties STRAWBERRY_ICE_CREAM_WITH_CHERRY = new FoodProperties.Builder().nutrition(ICE_CREAM_NUTRITION).saturationMod(ICE_CREAM_SATURATION).alwaysEat().build();
    public static final FoodProperties STRAWBERRY_ICE_CREAM_WITH_SPRINKLES = new FoodProperties.Builder().nutrition(ICE_CREAM_NUTRITION).saturationMod(ICE_CREAM_SATURATION).alwaysEat().build();
}
