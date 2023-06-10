package com.null8.perfectaccuracy.mixin;

import net.minecraft.world.entity.projectile.Projectile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(Projectile.class)
public class ProjectileMixin {

    @ModifyVariable(method = "shoot", at = @At("HEAD"), ordinal = 1)
    private float injected(float x) {
        return 0.0f;
    }
}
