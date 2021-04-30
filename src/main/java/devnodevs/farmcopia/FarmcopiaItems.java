package devnodevs.farmcopia;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FarmcopiaItems {

  public static final Item TOMATO = new Item(new Item.Settings().group(ItemGroup.MISC));

  public static void registerItems() {
    Registry.register(Registry.ITEM, new Identifier(Farmcopia.MOD_ID, "tomato"), TOMATO);
  }
}
