package devnodevs.farmcopia;

import net.fabricmc.api.ModInitializer;

public class Farmcopia implements ModInitializer {

  public static final String MOD_ID = "farmcopia";

  @Override
  public void onInitialize() {
    FarmcopiaItems.registerItems();
  }
}

