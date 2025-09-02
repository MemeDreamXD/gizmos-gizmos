package com.memedream.gizmosgizmos.entity;

import com.memedream.gizmosgizmos.GizmosGizmos;
import com.memedream.gizmosgizmos.entity.custom.DodoEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, GizmosGizmos.MOD_ID);

    public static final Supplier<EntityType<DodoEntity>> DODO =
            ENTITY_TYPES.register("dodo", () -> EntityType.Builder.of(DodoEntity::new, MobCategory.CREATURE)
                    .sized(0.75f, 0.35f).build("dodo"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
