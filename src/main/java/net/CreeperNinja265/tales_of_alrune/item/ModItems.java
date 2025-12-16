package net.CreeperNinja265.tales_of_alrune.item;

import net.CreeperNinja265.tales_of_alrune.TalesOfAlrune;
import net.CreeperNinja265.tales_of_alrune.item.custom.MetalDetectorItem;
import net.CreeperNinja265.tales_of_alrune.item.custom.RekkaItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item>  ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TalesOfAlrune.MOD_ID);

    public static final RegistryObject<Item>  SAPPHIRE = ITEMS.register("sapphire",
            () ->new Item(new Item.Properties()));

    public static final RegistryObject<Item>  RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () ->new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY =
            ITEMS.register("ruby", ()->new Item(new Item.Properties()));

    public static final RegistryObject<Item> REKKA =
            ITEMS.register("rekka", ()->new RekkaItem(Tiers.NETHERITE, 10, .5f, new Item.Properties()));

    public static final RegistryObject<Item>  TILSTONITE_FIRE = ITEMS.register("tilstonite_fire",
            () ->new Item(new Item.Properties()));

    public static final RegistryObject<Item>  TILSTONITE_AQUA = ITEMS.register("tilstonite_aqua",
            () ->new Item(new Item.Properties()));

    public static final RegistryObject<Item>  TILSTONITE_LIGHTNING = ITEMS.register("tilstonite_lightning",
            () ->new Item(new Item.Properties()));

    public static final RegistryObject<Item>  TILSTONITE_PURE = ITEMS.register("tilstonite_pure",
            () ->new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOTTLE_OF_AEOS = ITEMS.register("bottle_of_aeos",
            ()->new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            ()->new MetalDetectorItem(new Item.Properties().durability(512)));

    public static final RegistryObject<Item> PORT_ALE = ITEMS.register("port_ale",
            ()->new Item(new Item.Properties()));

    public static final RegistryObject<Item> MONSTER_ENERGY = ITEMS.register("monster_energy",
            ()->new Item(new Item.Properties()));

    public static final RegistryObject<Item> REDBULL = ITEMS.register("redbull",
            ()->new Item(new Item.Properties()));

    public static final RegistryObject<Item> NAIL = ITEMS.register("nail",
            ()->new Item(new Item.Properties()));

    public static final RegistryObject<Item> BUNCH_OF_NAILS = ITEMS.register("bunch_of_nails",
            ()->new Item(new Item.Properties()));

    public static final RegistryObject<Item> MARK_THE_FISH = ITEMS.register("mark_the_fish",
            ()->new Item(new Item.Properties()));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
