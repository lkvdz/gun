package com.example.falmod;

import com.example.falmod.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(FalMod.MOD_ID)
public class FalMod {
    public static final String MOD_ID = "tacfal";
    public static final Logger LOGGER = LogManager.getLogger();

    public FalMod() {
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        LOGGER.info("FAL Mod加载完成！");
    }
}
