package net.qwenty.companionturtle.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.qwenty.companionturtle.CompanionTurtle;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CompanionTurtle.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COMPANION_TURTLE_TAB = CREATIVE_MODE_TABS.register("companion_turtle_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DEODORANT.get()))
                    .title(Component.translatable("creativetab.companion_turtle_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DEODORANT.get());
                        pOutput.accept(ModItems.EMPTY_DEODORANT.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
