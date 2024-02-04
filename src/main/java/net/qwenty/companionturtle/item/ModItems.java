package net.qwenty.companionturtle.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.qwenty.companionturtle.CompanionTurtle;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CompanionTurtle.MOD_ID);

    public static final RegistryObject<Item> DEODORANT = ITEMS.register("deodorant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTY_DEODORANT = ITEMS.register("empty_deodorant",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
