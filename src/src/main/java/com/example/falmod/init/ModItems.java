package com.example.falmod.init;

import com.example.falmod.FalMod;
import com.tac.guns.item.GunItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, FalMod.MOD_ID);

    public static final RegistryObject<GunItem> FAL_RIFLE = ITEMS.register("fal_rifle",
        () -> new GunItem(new Item.Properties()
            .tab(ItemGroup.TAB_COMBAT)
            .stacksTo(1)
        ));
}
