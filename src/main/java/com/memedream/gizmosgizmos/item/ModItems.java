package com.memedream.gizmosgizmos.item;

import com.memedream.gizmosgizmos.GizmosGizmos;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GizmosGizmos.MOD_ID);

    public static final DeferredItem<Item> RAW_DODO = ITEMS.register("raw_dodo",
            () -> new Item(new Item.Properties().food(ModFoodProperties.raw_dodo)));
    public static final DeferredItem<Item> COOKED_DODO = ITEMS.register("cooked_dodo",
            () -> new Item(new Item.Properties().food(ModFoodProperties.cooked_dodo)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
