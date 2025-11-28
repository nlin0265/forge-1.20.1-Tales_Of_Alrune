package net.CreeperNinja265.tales_of_alrune.item;

import net.CreeperNinja265.tales_of_alrune.TalesOfAlrune;
import net.CreeperNinja265.tales_of_alrune.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TalesOfAlrune.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALRUNE_TAB =
            CREATIVE_MODE_TABS.register("alrune_tab", () -> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.alrune_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Items
                        output.accept(ModItems.RAW_SAPPHIRE.get());
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.RUBY.get());

                        //Blocks
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RUBY_BLOCK.get());

                        //Weapons
                        output.accept(ModItems.REKKA.get());
                    })
            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
