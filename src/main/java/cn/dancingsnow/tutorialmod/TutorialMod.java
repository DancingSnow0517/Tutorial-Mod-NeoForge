package cn.dancingsnow.tutorialmod;

import cn.dancingsnow.tutorialmod.setup.ModItems;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(TutorialMod.MODID)
public class TutorialMod {
    public static final String MODID = "tutorialmod";
    private static final Logger LOGGER = LogUtils.getLogger();


    public TutorialMod(IEventBus modEventBus) {
        ModItems.register(modEventBus);
    }
}
