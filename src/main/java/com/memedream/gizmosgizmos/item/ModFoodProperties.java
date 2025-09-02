package com.memedream.gizmosgizmos.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties raw_dodo = new FoodProperties.Builder().nutrition(5).saturationModifier(0.12F).build();

    public static final FoodProperties cooked_dodo = new FoodProperties.Builder().nutrition(14).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 1.0f).build();
}
