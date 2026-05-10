package net.fvue.fruitydelight;

import com.mojang.logging.LogUtils;
import net.fvue.fruitydelight.init.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(FruityDelight.MOD_ID)
public class FruityDelight {
    public static final String MOD_ID = "fruitydelight";
    public static final Logger LOGGER = LogUtils.getLogger();


    public FruityDelight(IEventBus modEventBus, ModContainer modContainer) {
        FruityItems.register(modEventBus);
        FruityBlocks.register(modEventBus);
        FruityFluids.FLUID_TYPES.register(modEventBus);
        FruityFluids.FLUIDS.register(modEventBus);
        FruitySound.register(modEventBus);

        FruityCreativeModeTabs.register(modEventBus);

//        modContainer.registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);
    }
}
