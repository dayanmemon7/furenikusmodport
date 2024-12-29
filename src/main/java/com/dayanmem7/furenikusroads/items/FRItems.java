package com.dayanmem7.furenikusroads.items;

import com.dayanmem7.furenikusroads.FurenikusRoads;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FRItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FurenikusRoads.MOD_ID);

//item register



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}