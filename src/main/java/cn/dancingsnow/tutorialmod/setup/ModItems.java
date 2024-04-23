package cn.dancingsnow.tutorialmod.setup;

import cn.dancingsnow.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    // Mod 使用的 DeferredRegister
    public static final DeferredRegister.Items ITEM = DeferredRegister.createItems(TutorialMod.MODID);

    public static final DeferredItem<Item> RED_CRYSTAL = ITEM.registerSimpleItem("red_crystal");

    // 加载并将我们的 DeferredRegister 添加到事件总线中
    public static void register(IEventBus bus) {
        ITEM.register(bus);
    }
}
