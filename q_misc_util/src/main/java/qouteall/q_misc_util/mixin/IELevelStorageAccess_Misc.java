package qouteall.q_misc_util.mixin;

import net.minecraft.world.level.storage.LevelStorageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.nio.file.Path;

@Mixin(LevelStorageSource.LevelStorageAccess.class)
public interface IELevelStorageAccess_Misc {
    @Accessor("levelPath")
    Path ip_getLevelPath();
}
