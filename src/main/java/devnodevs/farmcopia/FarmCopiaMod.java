package devnodevs.farmcopia;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FarmCopiaMod implements ModInitializer {

    private static void registerBlocks() {
        
    }

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("farmcopia:terrible_item"), FABRIC_ITEM);
        FarmCopiaRegister.register();
    }
}

