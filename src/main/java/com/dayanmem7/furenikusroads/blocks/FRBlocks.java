package com.dayanmem7.furenikusroads.blocks;


import com.dayanmem7.furenikusroads.FurenikusRoads;
import com.dayanmem7.furenikusroads.blocks.custom.*;
import com.dayanmem7.furenikusroads.items.FRCreativeModeTab;
import com.dayanmem7.furenikusroads.items.FRItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class FRBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FurenikusRoads.MOD_ID);

//Standard Tarmac

    public static final RegistryObject<Block> STANDARDTARMAC1_16 = registerBlock("standardtarmac1_16",
            () -> new StandardTarmac1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC2_16 = registerBlock("standardtarmac2_16",
            () -> new StandardTarmac2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC3_16 = registerBlock("standardtarmac3_16",
            () -> new StandardTarmac3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC4_16 = registerBlock("standardtarmac4_16",
            () -> new StandardTarmac4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC5_16 = registerBlock("standardtarmac5_16",
            () -> new StandardTarmac5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC6_16 = registerBlock("standardtarmac6_16",
            () -> new StandardTarmac6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC7_16 = registerBlock("standardtarmac7_16",
            () -> new StandardTarmac7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC8_16 = registerBlock("standardtarmac8_16",
            () -> new StandardTarmac8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC9_16 = registerBlock("standardtarmac9_16",
            () -> new StandardTarmac9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC10_16 = registerBlock("standardtarmac10_16",
            () -> new StandardTarmac10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC11_16 = registerBlock("standardtarmac11_16",
            () -> new StandardTarmac11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC12_16 = registerBlock("standardtarmac12_16",
            () -> new StandardTarmac12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC13_16 = registerBlock("standardtarmac13_16",
            () -> new StandardTarmac13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC14_16 = registerBlock("standardtarmac14_16",
            () -> new StandardTarmac14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC15_16 = registerBlock("standardtarmac15_16",
            () -> new StandardTarmac15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STANDARDTARMAC16_16 = registerBlock("standardtarmac16_16",
            () -> new StandardTarmac16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

//Light Tarmac

    public static final RegistryObject<Block> LIGHTTARMAC1_16 = registerBlock("lighttarmac1_16",
            () -> new LightTarmac1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC2_16 = registerBlock("lighttarmac2_16",
            () -> new LightTarmac2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC3_16 = registerBlock("lighttarmac3_16",
            () -> new LightTarmac3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC4_16 = registerBlock("lighttarmac4_16",
            () -> new LightTarmac4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC5_16 = registerBlock("lighttarmac5_16",
            () -> new LightTarmac5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC6_16 = registerBlock("lighttarmac6_16",
            () -> new LightTarmac6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC7_16 = registerBlock("lighttarmac7_16",
            () -> new LightTarmac7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC8_16 = registerBlock("lighttarmac8_16",
            () -> new LightTarmac8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC9_16 = registerBlock("lighttarmac9_16",
            () -> new LightTarmac9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC10_16 = registerBlock("lighttarmac10_16",
            () -> new LightTarmac10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC11_16 = registerBlock("lighttarmac11_16",
            () -> new LightTarmac11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC12_16 = registerBlock("lighttarmac12_16",
            () -> new LightTarmac12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC13_16 = registerBlock("lighttarmac13_16",
            () -> new LightTarmac13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC14_16 = registerBlock("lighttarmac14_16",
            () -> new LightTarmac14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC15_16 = registerBlock("lighttarmac15_16",
            () -> new LightTarmac15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTTARMAC16_16 = registerBlock("lighttarmac16_16",
            () -> new LightTarmac16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

//Dark Tarmac

    public static final RegistryObject<Block> DARKTARMAC1_16 = registerBlock("darktarmac1_16",
            () -> new DarkTarmac1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC2_16 = registerBlock("darktarmac2_16",
            () -> new DarkTarmac2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC3_16 = registerBlock("darktarmac3_16",
            () -> new DarkTarmac3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC4_16 = registerBlock("darktarmac4_16",
            () -> new DarkTarmac4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC5_16 = registerBlock("darktarmac5_16",
            () -> new DarkTarmac5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC6_16 = registerBlock("darktarmac6_16",
            () -> new DarkTarmac6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC7_16 = registerBlock("darktarmac7_16",
            () -> new DarkTarmac7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC8_16 = registerBlock("darktarmac8_16",
            () -> new DarkTarmac8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC9_16 = registerBlock("darktarmac9_16",
            () -> new DarkTarmac9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC10_16 = registerBlock("darktarmac10_16",
            () -> new DarkTarmac10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC11_16 = registerBlock("darktarmac11_16",
            () -> new DarkTarmac11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC12_16 = registerBlock("darktarmac12_16",
            () -> new DarkTarmac12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC13_16 = registerBlock("darktarmac13_16",
            () -> new DarkTarmac13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC14_16 = registerBlock("darktarmac14_16",
            () -> new DarkTarmac14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC15_16 = registerBlock("darktarmac15_16",
            () -> new DarkTarmac15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DARKTARMAC16_16 = registerBlock("darktarmac16_16",
            () -> new DarkTarmac16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

//Fine Tarmac

    public static final RegistryObject<Block> FINETARMAC1_16 = registerBlock("finetarmac1_16",
            () -> new FineTarmac1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC2_16 = registerBlock("finetarmac2_16",
            () -> new FineTarmac2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC3_16 = registerBlock("finetarmac3_16",
            () -> new FineTarmac3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC4_16 = registerBlock("finetarmac4_16",
            () -> new FineTarmac4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC5_16 = registerBlock("finetarmac5_16",
            () -> new FineTarmac5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC6_16 = registerBlock("finetarmac6_16",
            () -> new FineTarmac6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC7_16 = registerBlock("finetarmac7_16",
            () -> new FineTarmac7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC8_16 = registerBlock("finetarmac8_16",
            () -> new FineTarmac8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC9_16 = registerBlock("finetarmac9_16",
            () -> new FineTarmac9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC10_16 = registerBlock("finetarmac10_16",
            () -> new FineTarmac10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC11_16 = registerBlock("finetarmac11_16",
            () -> new FineTarmac11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC12_16 = registerBlock("finetarmac12_16",
            () -> new FineTarmac12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC13_16 = registerBlock("finetarmac13_16",
            () -> new FineTarmac13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC14_16 = registerBlock("finetarmac14_16",
            () -> new FineTarmac14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC15_16 = registerBlock("finetarmac15_16",
            () -> new FineTarmac15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> FINETARMAC16_16 = registerBlock("finetarmac16_16",
            () -> new FineTarmac16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

//Concrete Roads 1

    public static final RegistryObject<Block> CONCRETE1_16 = registerBlock("concrete1_16",
            () -> new Concrete1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE2_16 = registerBlock("concrete2_16",
            () -> new Concrete2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE3_16 = registerBlock("concrete3_16",
            () -> new Concrete3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE4_16 = registerBlock("concrete4_16",
            () -> new Concrete4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE5_16 = registerBlock("concrete5_16",
            () -> new Concrete5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE6_16 = registerBlock("concrete6_16",
            () -> new Concrete6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE7_16 = registerBlock("concrete7_16",
            () -> new Concrete7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE8_16 = registerBlock("concrete8_16",
            () -> new Concrete8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE9_16 = registerBlock("concrete9_16",
            () -> new Concrete9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE10_16 = registerBlock("concrete10_16",
            () -> new Concrete10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE11_16 = registerBlock("concrete11_16",
            () -> new Concrete11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE12_16 = registerBlock("concrete12_16",
            () -> new Concrete12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE13_16 = registerBlock("concrete13_16",
            () -> new Concrete13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE14_16 = registerBlock("concrete14_16",
            () -> new Concrete14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE15_16 = registerBlock("concrete15_16",
            () -> new Concrete15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> CONCRETE16_16 = registerBlock("concrete16_16",
            () -> new Concrete16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    //Concrete Roads 2

    public static final RegistryObject<Block> LIGHTCONCRETE1_16 = registerBlock("lightconcrete1_16",
            () -> new LightConcrete1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE2_16 = registerBlock("lightconcrete2_16",
            () -> new LightConcrete2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE3_16 = registerBlock("lightconcrete3_16",
            () -> new LightConcrete3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE4_16 = registerBlock("lightconcrete4_16",
            () -> new LightConcrete4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE5_16 = registerBlock("lightconcrete5_16",
            () -> new LightConcrete5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE6_16 = registerBlock("lightconcrete6_16",
            () -> new LightConcrete6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE7_16 = registerBlock("lightconcrete7_16",
            () -> new LightConcrete7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE8_16 = registerBlock("lightconcrete8_16",
            () -> new LightConcrete8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE9_16 = registerBlock("lightconcrete9_16",
            () -> new LightConcrete9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE10_16 = registerBlock("lightconcrete10_16",
            () -> new LightConcrete10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE11_16 = registerBlock("lightconcrete11_16",
            () -> new LightConcrete11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE12_16 = registerBlock("lightconcrete12_16",
            () -> new LightConcrete12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE13_16 = registerBlock("lightconcrete13_16",
            () -> new LightConcrete13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE14_16 = registerBlock("lightconcrete14_16",
            () -> new LightConcrete14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE15_16 = registerBlock("lightconcrete15_16",
            () -> new LightConcrete15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> LIGHTCONCRETE16_16 = registerBlock("lightconcrete16_16",
            () -> new LightConcrete16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    //Green Roads

    public static final RegistryObject<Block> GREENROAD1_16 = registerBlock("greenroad1_16",
            () -> new GreenRoad1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD2_16 = registerBlock("greenroad2_16",
            () -> new GreenRoad2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD3_16 = registerBlock("greenroad3_16",
            () -> new GreenRoad3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD4_16 = registerBlock("greenroad4_16",
            () -> new GreenRoad4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD5_16 = registerBlock("greenroad5_16",
            () -> new GreenRoad5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD6_16 = registerBlock("greenroad6_16",
            () -> new GreenRoad6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD7_16 = registerBlock("greenroad7_16",
            () -> new GreenRoad7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD8_16 = registerBlock("greenroad8_16",
            () -> new GreenRoad8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD9_16 = registerBlock("greenroad9_16",
            () -> new GreenRoad9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD10_16 = registerBlock("greenroad10_16",
            () -> new GreenRoad10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD11_16 = registerBlock("greenroad11_16",
            () -> new GreenRoad11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD12_16 = registerBlock("greenroad12_16",
            () -> new GreenRoad12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD13_16 = registerBlock("greenroad13_16",
            () -> new GreenRoad13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD14_16 = registerBlock("greenroad14_16",
            () -> new GreenRoad14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD15_16 = registerBlock("greenroad15_16",
            () -> new GreenRoad15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GREENROAD16_16 = registerBlock("greenroad16_16",
            () -> new GreenRoad16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    //Pale Roads

    public static final RegistryObject<Block> PALE1_16 = registerBlock("pale1_16",
            () -> new Pale1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE2_16 = registerBlock("pale2_16",
            () -> new Pale2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE3_16 = registerBlock("pale3_16",
            () -> new Pale3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE4_16 = registerBlock("pale4_16",
            () -> new Pale4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE5_16 = registerBlock("pale5_16",
            () -> new Pale5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE6_16 = registerBlock("pale6_16",
            () -> new Pale6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE7_16 = registerBlock("pale7_16",
            () -> new Pale7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE8_16 = registerBlock("pale8_16",
            () -> new Pale8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE9_16 = registerBlock("pale9_16",
            () -> new Pale9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE10_16 = registerBlock("pale10_16",
            () -> new Pale10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE11_16 = registerBlock("pale11_16",
            () -> new Pale11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE12_16 = registerBlock("pale12_16",
            () -> new Pale12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE13_16 = registerBlock("pale13_16",
            () -> new Pale13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE14_16 = registerBlock("pale14_16",
            () -> new Pale14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE15_16 = registerBlock("pale15_16",
            () -> new Pale15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> PALE16_16 = registerBlock("pale16_16",
            () -> new Pale16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    //Red Roads

    public static final RegistryObject<Block> RED1_16 = registerBlock("red1_16",
            () -> new Red1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED2_16 = registerBlock("red2_16",
            () -> new Red2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED3_16 = registerBlock("red3_16",
            () -> new Red3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED4_16 = registerBlock("red4_16",
            () -> new Red4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED5_16 = registerBlock("red5_16",
            () -> new Red5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED6_16 = registerBlock("red6_16",
            () -> new Red6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED7_16 = registerBlock("red7_16",
            () -> new Red7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED8_16 = registerBlock("red8_16",
            () -> new Red8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED9_16 = registerBlock("red9_16",
            () -> new Red9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED10_16 = registerBlock("red10_16",
            () -> new Red10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED11_16 = registerBlock("red11_16",
            () -> new Red11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED12_16 = registerBlock("red12_16",
            () -> new Red12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED13_16 = registerBlock("red13_16",
            () -> new Red13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED14_16 = registerBlock("red14_16",
            () -> new Red14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED15_16 = registerBlock("red15_16",
            () -> new Red15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> RED16_16 = registerBlock("red16_16",
            () -> new Red16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    //White Roads

    public static final RegistryObject<Block> WHITE1_16 = registerBlock("white1_16",
            () -> new White1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE2_16 = registerBlock("white2_16",
            () -> new White2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE3_16 = registerBlock("white3_16",
            () -> new White3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE4_16 = registerBlock("white4_16",
            () -> new White4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE5_16 = registerBlock("white5_16",
            () -> new White5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE6_16 = registerBlock("white6_16",
            () -> new White6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE7_16 = registerBlock("white7_16",
            () -> new White7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE8_16 = registerBlock("white8_16",
            () -> new White8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE9_16 = registerBlock("white9_16",
            () -> new White9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE10_16 = registerBlock("white10_16",
            () -> new White10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE11_16 = registerBlock("white11_16",
            () -> new White11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE12_16 = registerBlock("white12_16",
            () -> new White12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE13_16 = registerBlock("white13_16",
            () -> new White13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE14_16 = registerBlock("white14_16",
            () -> new White14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE15_16 = registerBlock("white15_16",
            () -> new White15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> WHITE16_16 = registerBlock("white16_16",
            () -> new White16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    //Yellow Roads

    public static final RegistryObject<Block> YELLOW1_16 = registerBlock("yellow1_16",
            () -> new Yellow1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW2_16 = registerBlock("yellow2_16",
            () -> new Yellow2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW3_16 = registerBlock("yellow3_16",
            () -> new Yellow3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW4_16 = registerBlock("yellow4_16",
            () -> new Yellow4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW5_16 = registerBlock("yellow5_16",
            () -> new Yellow5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW6_16 = registerBlock("yellow6_16",
            () -> new Yellow6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW7_16 = registerBlock("yellow7_16",
            () -> new Yellow7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW8_16 = registerBlock("yellow8_16",
            () -> new Yellow8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW9_16 = registerBlock("yellow9_16",
            () -> new Yellow9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW10_16 = registerBlock("yellow10_16",
            () -> new Yellow10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW11_16 = registerBlock("yellow11_16",
            () -> new Yellow11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW12_16 = registerBlock("yellow12_16",
            () -> new Yellow12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW13_16 = registerBlock("yellow13_16",
            () -> new Yellow13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW14_16 = registerBlock("yellow14_16",
            () -> new Yellow14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW15_16 = registerBlock("yellow15_16",
            () -> new Yellow15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> YELLOW16_16 = registerBlock("yellow16_16",
            () -> new Yellow16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    //Blue Roads

    public static final RegistryObject<Block> BLUE1_16 = registerBlock("blue1_16",
            () -> new Blue1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE2_16 = registerBlock("blue2_16",
            () -> new Blue2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE3_16 = registerBlock("blue3_16",
            () -> new Blue3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE4_16 = registerBlock("blue4_16",
            () -> new Blue4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE5_16 = registerBlock("blue5_16",
            () -> new Blue5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE6_16 = registerBlock("blue6_16",
            () -> new Blue6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE7_16 = registerBlock("blue7_16",
            () -> new Blue7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE8_16 = registerBlock("blue8_16",
            () -> new Blue8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE9_16 = registerBlock("blue9_16",
            () -> new Blue9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE10_16 = registerBlock("blue10_16",
            () -> new Blue10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE11_16 = registerBlock("blue11_16",
            () -> new Blue11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE12_16 = registerBlock("blue12_16",
            () -> new Blue12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE13_16 = registerBlock("blue13_16",
            () -> new Blue13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE14_16 = registerBlock("blue14_16",
            () -> new Blue14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE15_16 = registerBlock("blue15_16",
            () -> new Blue15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> BLUE16_16 = registerBlock("blue16_16",
            () -> new Blue16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    //Muddy Roads

    public static final RegistryObject<Block> MUDDYROAD1_16 = registerBlock("muddyroad1_16",
            () -> new MuddyRoad1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD2_16 = registerBlock("muddyroad2_16",
            () -> new MuddyRoad2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD3_16 = registerBlock("muddyroad3_16",
            () -> new MuddyRoad3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD4_16 = registerBlock("muddyroad4_16",
            () -> new MuddyRoad4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD5_16 = registerBlock("muddyroad5_16",
            () -> new MuddyRoad5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD6_16 = registerBlock("muddyroad6_16",
            () -> new MuddyRoad6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD7_16 = registerBlock("muddyroad7_16",
            () -> new MuddyRoad7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD8_16 = registerBlock("muddyroad8_16",
            () -> new MuddyRoad8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD9_16 = registerBlock("muddyroad9_16",
            () -> new MuddyRoad9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD10_16 = registerBlock("muddyroad10_16",
            () -> new MuddyRoad10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD11_16 = registerBlock("muddyroad11_16",
            () -> new MuddyRoad11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD12_16 = registerBlock("muddyroad12_16",
            () -> new MuddyRoad12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD13_16 = registerBlock("muddyroad13_16",
            () -> new MuddyRoad13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD14_16 = registerBlock("muddyroad14_16",
            () -> new MuddyRoad14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD15_16 = registerBlock("muddyroad15_16",
            () -> new MuddyRoad15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> MUDDYROAD16_16 = registerBlock("muddyroad16_16",
            () -> new MuddyRoad16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    // Dry Muddy Roads

    public static final RegistryObject<Block> DRYMUDDYROAD1_16 = registerBlock("drymuddyroad1_16",
            () -> new DryMuddyRoad1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD2_16 = registerBlock("drymuddyroad2_16",
            () -> new DryMuddyRoad2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD3_16 = registerBlock("drymuddyroad3_16",
            () -> new DryMuddyRoad3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD4_16 = registerBlock("drymuddyroad4_16",
            () -> new DryMuddyRoad4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD5_16 = registerBlock("drymuddyroad5_16",
            () -> new DryMuddyRoad5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD6_16 = registerBlock("drymuddyroad6_16",
            () -> new DryMuddyRoad6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD7_16 = registerBlock("drymuddyroad7_16",
            () -> new DryMuddyRoad7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD8_16 = registerBlock("drymuddyroad8_16",
            () -> new DryMuddyRoad8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD9_16 = registerBlock("drymuddyroad9_16",
            () -> new DryMuddyRoad9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD10_16 = registerBlock("drymuddyroad10_16",
            () -> new DryMuddyRoad10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD11_16 = registerBlock("drymuddyroad11_16",
            () -> new DryMuddyRoad11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD12_16 = registerBlock("drymuddyroad12_16",
            () -> new DryMuddyRoad12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD13_16 = registerBlock("drymuddyroad13_16",
            () -> new DryMuddyRoad13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD14_16 = registerBlock("drymuddyroad14_16",
            () -> new DryMuddyRoad14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD15_16 = registerBlock("drymuddyroad15_16",
            () -> new DryMuddyRoad15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DRYMUDDYROAD16_16 = registerBlock("drymuddyroad16_16",
            () -> new DryMuddyRoad16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    // Grass Roads

    public static final RegistryObject<Block> GRASS1_16 = registerBlock("grass1_16",
            () -> new Grass1_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS2_16 = registerBlock("grass2_16",
            () -> new Grass2_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS3_16 = registerBlock("grass3_16",
            () -> new Grass3_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS4_16 = registerBlock("grass4_16",
            () -> new Grass4_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS5_16 = registerBlock("grass5_16",
            () -> new Grass5_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS6_16 = registerBlock("grass6_16",
            () -> new Grass6_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS7_16 = registerBlock("grass7_16",
            () -> new Grass7_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS8_16 = registerBlock("grass8_16",
            () -> new Grass8_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS9_16 = registerBlock("grass9_16",
            () -> new Grass9_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS10_16 = registerBlock("grass10_16",
            () -> new Grass10_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS11_16 = registerBlock("grass11_16",
            () -> new Grass11_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS12_16 = registerBlock("grass12_16",
            () -> new Grass12_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS13_16 = registerBlock("grass13_16",
            () -> new Grass13_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS14_16 = registerBlock("grass14_16",
            () -> new Grass14_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS15_16 = registerBlock("grass15_16",
            () -> new Grass15_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRASS16_16 = registerBlock("grass16_16",
            () -> new Grass16_16(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    // Sand Roads

    public static final RegistryObject<Block> SAND1_16 = registerBlock("sand1_16",
            () -> new Sand1_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND2_16 = registerBlock("sand2_16",
            () -> new Sand2_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND3_16 = registerBlock("sand3_16",
            () -> new Sand3_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND4_16 = registerBlock("sand4_16",
            () -> new Sand4_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND5_16 = registerBlock("sand5_16",
            () -> new Sand5_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND6_16 = registerBlock("sand6_16",
            () -> new Sand6_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND7_16 = registerBlock("sand7_16",
            () -> new Sand7_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND8_16 = registerBlock("sand8_16",
            () -> new Sand8_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND9_16 = registerBlock("sand9_16",
            () -> new Sand9_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND10_16 = registerBlock("sand10_16",
            () -> new Sand10_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND11_16 = registerBlock("sand11_16",
            () -> new Sand11_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND12_16 = registerBlock("sand12_16",
            () -> new Sand12_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND13_16 = registerBlock("sand13_16",
            () -> new Sand13_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND14_16 = registerBlock("sand14_16",
            () -> new Sand14_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND15_16 = registerBlock("sand15_16",
            () -> new Sand15_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> SAND16_16 = registerBlock("sand16_16",
            () -> new Sand16_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    // Dirt Roads

    public static final RegistryObject<Block> DIRT1_16 = registerBlock("dirt1_16",
            () -> new Dirt1_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT2_16 = registerBlock("dirt2_16",
            () -> new Dirt2_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT3_16 = registerBlock("dirt3_16",
            () -> new Dirt3_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT4_16 = registerBlock("dirt4_16",
            () -> new Dirt4_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT5_16 = registerBlock("dirt5_16",
            () -> new Dirt5_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT6_16 = registerBlock("dirt6_16",
            () -> new Dirt6_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT7_16 = registerBlock("dirt7_16",
            () -> new Dirt7_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT8_16 = registerBlock("dirt8_16",
            () -> new Dirt8_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT9_16 = registerBlock("dirt9_16",
            () -> new Dirt9_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT10_16 = registerBlock("dirt10_16",
            () -> new Dirt10_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT11_16 = registerBlock("dirt11_16",
            () -> new Dirt11_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT12_16 = registerBlock("dirt12_16",
            () -> new Dirt12_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT13_16 = registerBlock("dirt13_16",
            () -> new Dirt13_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT14_16 = registerBlock("dirt14_16",
            () -> new Dirt14_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT15_16 = registerBlock("dirt15_16",
            () -> new Dirt15_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> DIRT16_16 = registerBlock("dirt16_16",
            () -> new Dirt16_16(BlockBehaviour.Properties.of(Material.DIRT).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    // Stone Roads

    public static final RegistryObject<Block> STONE1_16 = registerBlock("stone1_16",
            () -> new Stone1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE2_16 = registerBlock("stone2_16",
            () -> new Stone2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE3_16 = registerBlock("stone3_16",
            () -> new Stone3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE4_16 = registerBlock("stone4_16",
            () -> new Stone4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE5_16 = registerBlock("stone5_16",
            () -> new Stone5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE6_16 = registerBlock("stone6_16",
            () -> new Stone6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE7_16 = registerBlock("stone7_16",
            () -> new Stone7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE8_16 = registerBlock("stone8_16",
            () -> new Stone8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE9_16 = registerBlock("stone9_16",
            () -> new Stone9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE10_16 = registerBlock("stone10_16",
            () -> new Stone10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE11_16 = registerBlock("stone11_16",
            () -> new Stone11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE12_16 = registerBlock("stone12_16",
            () -> new Stone12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE13_16 = registerBlock("stone13_16",
            () -> new Stone13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE14_16 = registerBlock("stone14_16",
            () -> new Stone14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE15_16 = registerBlock("stone15_16",
            () -> new Stone15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> STONE16_16 = registerBlock("stone16_16",
            () -> new Stone16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    // Gravel Roads

    public static final RegistryObject<Block> GRAVEL1_16 = registerBlock("gravel1_16",
            () -> new Gravel1_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL2_16 = registerBlock("gravel2_16",
            () -> new Gravel2_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL3_16 = registerBlock("gravel3_16",
            () -> new Gravel3_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL4_16 = registerBlock("gravel4_16",
            () -> new Gravel4_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL5_16 = registerBlock("gravel5_16",
            () -> new Gravel5_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL6_16 = registerBlock("gravel6_16",
            () -> new Gravel6_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL7_16 = registerBlock("gravel7_16",
            () -> new Gravel7_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL8_16 = registerBlock("gravel8_16",
            () -> new Gravel8_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL9_16 = registerBlock("gravel9_16",
            () -> new Gravel9_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL10_16 = registerBlock("gravel10_16",
            () -> new Gravel10_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL11_16 = registerBlock("gravel11_16",
            () -> new Gravel11_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL12_16 = registerBlock("gravel12_16",
            () -> new Gravel12_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL13_16 = registerBlock("gravel13_16",
            () -> new Gravel13_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL14_16 = registerBlock("gravel14_16",
            () -> new Gravel14_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL15_16 = registerBlock("gravel15_16",
            () -> new Gravel15_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    public static final RegistryObject<Block> GRAVEL16_16 = registerBlock("gravel16_16",
            () -> new Gravel16_16(BlockBehaviour.Properties.of(Material.SAND).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.ROADS);

    // Sidewalks

    //Sidewalks

    public static final RegistryObject<Block> SIDEWALK1_16 = registerBlock("sidewalk1_16",
            () -> new Sidewalk1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK2_16 = registerBlock("sidewalk2_16",
            () -> new Sidewalk2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK3_16 = registerBlock("sidewalk3_16",
            () -> new Sidewalk3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK4_16 = registerBlock("sidewalk4_16",
            () -> new Sidewalk4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK5_16 = registerBlock("sidewalk5_16",
            () -> new Sidewalk5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK6_16 = registerBlock("sidewalk6_16",
            () -> new Sidewalk6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK7_16 = registerBlock("sidewalk7_16",
            () -> new Sidewalk7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK8_16 = registerBlock("sidewalk8_16",
            () -> new Sidewalk8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK9_16 = registerBlock("sidewalk9_16",
            () -> new Sidewalk9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK10_16 = registerBlock("sidewalk10_16",
            () -> new Sidewalk10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK11_16 = registerBlock("sidewalk11_16",
            () -> new Sidewalk11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK12_16 = registerBlock("sidewalk12_16",
            () -> new Sidewalk12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK13_16 = registerBlock("sidewalk13_16",
            () -> new Sidewalk13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK14_16 = registerBlock("sidewalk14_16",
            () -> new Sidewalk14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK15_16 = registerBlock("sidewalk15_16",
            () -> new Sidewalk15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block> SIDEWALK16_16 = registerBlock("sidewalk16_16",
            () -> new Sidewalk16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    // Tan Sidewalks

    public static final RegistryObject<Block>SIDEWALKTAN1_16 = registerBlock("sidewalktan1_16",
            () -> new SidewalkTan1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN2_16 = registerBlock("sidewalktan2_16",
            () -> new SidewalkTan2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN3_16 = registerBlock("sidewalktan3_16",
            () -> new SidewalkTan3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN4_16 = registerBlock("sidewalktan4_16",
            () -> new SidewalkTan4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN5_16 = registerBlock("sidewalktan5_16",
            () -> new SidewalkTan5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN6_16 = registerBlock("sidewalktan6_16",
            () -> new SidewalkTan6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN7_16 = registerBlock("sidewalktan7_16",
            () -> new SidewalkTan7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN8_16 = registerBlock("sidewalktan8_16",
            () -> new SidewalkTan8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN9_16 = registerBlock("sidewalktan9_16",
            () -> new SidewalkTan9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN10_16 = registerBlock("sidewalktan10_16",
            () -> new SidewalkTan10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN11_16 = registerBlock("sidewalktan11_16",
            () -> new SidewalkTan11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN12_16 = registerBlock("sidewalktan12_16",
            () -> new SidewalkTan12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN13_16 = registerBlock("sidewalktan13_16",
            () -> new SidewalkTan13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN14_16 = registerBlock("sidewalktan14_16",
            () -> new SidewalkTan14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN15_16 = registerBlock("sidewalktan15_16",
            () -> new SidewalkTan15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKTAN16_16 = registerBlock("sidewalktan16_16",
            () -> new SidewalkTan16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    // Clean Sidewalks

    public static final RegistryObject<Block>SIDEWALKCLEAN1_16 = registerBlock("sidewalkclean1_16",
            () -> new SidewalkClean1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN2_16 = registerBlock("sidewalkclean2_16",
            () -> new SidewalkClean2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN3_16 = registerBlock("sidewalkclean3_16",
            () -> new SidewalkClean3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN4_16 = registerBlock("sidewalkclean4_16",
            () -> new SidewalkClean4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN5_16 = registerBlock("sidewalkclean5_16",
            () -> new SidewalkClean5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN6_16 = registerBlock("sidewalkclean6_16",
            () -> new SidewalkClean6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN7_16 = registerBlock("sidewalkclean7_16",
            () -> new SidewalkClean7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN8_16 = registerBlock("sidewalkclean8_16",
            () -> new SidewalkClean8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN9_16 = registerBlock("sidewalkclean9_16",
            () -> new SidewalkClean9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN10_16 = registerBlock("sidewalkclean10_16",
            () -> new SidewalkClean10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN11_16 = registerBlock("sidewalkclean11_16",
            () -> new SidewalkClean11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN12_16 = registerBlock("sidewalkclean12_16",
            () -> new SidewalkClean12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN13_16 = registerBlock("sidewalkclean13_16",
            () -> new SidewalkClean13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN14_16 = registerBlock("sidewalkclean14_16",
            () -> new SidewalkClean14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN15_16 = registerBlock("sidewalkclean15_16",
            () -> new SidewalkClean15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKCLEAN16_16 = registerBlock("sidewalkclean16_16",
            () -> new SidewalkClean16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    // Dark Sidewalks

    public static final RegistryObject<Block>SIDEWALKDARK1_16 = registerBlock("sidewalkdark1_16",
            () -> new SidewalkDark1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK2_16 = registerBlock("sidewalkdark2_16",
            () -> new SidewalkDark2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK3_16 = registerBlock("sidewalkdark3_16",
            () -> new SidewalkDark3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK4_16 = registerBlock("sidewalkdark4_16",
            () -> new SidewalkDark4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK5_16 = registerBlock("sidewalkdark5_16",
            () -> new SidewalkDark5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK6_16 = registerBlock("sidewalkdark6_16",
            () -> new SidewalkDark6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK7_16 = registerBlock("sidewalkdark7_16",
            () -> new SidewalkDark7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK8_16 = registerBlock("sidewalkdark8_16",
            () -> new SidewalkDark8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK9_16 = registerBlock("sidewalkdark9_16",
            () -> new SidewalkDark9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK10_16 = registerBlock("sidewalkdark10_16",
            () -> new SidewalkDark10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK11_16 = registerBlock("sidewalkdark11_16",
            () -> new SidewalkDark11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK12_16 = registerBlock("sidewalkdark12_16",
            () -> new SidewalkDark12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK13_16 = registerBlock("sidewalkdark13_16",
            () -> new SidewalkDark13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK14_16 = registerBlock("sidewalkdark14_16",
            () -> new SidewalkDark14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK15_16 = registerBlock("sidewalkdark15_16",
            () -> new SidewalkDark15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>SIDEWALKDARK16_16 = registerBlock("sidewalkdark16_16",
            () -> new SidewalkDark16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    //Sidewalks Custom Bricks

    public static final RegistryObject<Block>STREET_BLOCK_A_0 = registerBlock("street_block_a_0",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_1 = registerBlock("street_block_a_1",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_2 = registerBlock("street_block_a_2",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_3 = registerBlock("street_block_a_3",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_4 = registerBlock("street_block_a_4",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_5 = registerBlock("street_block_a_5",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_6 = registerBlock("street_block_a_6",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_7 = registerBlock("street_block_a_7",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_8 = registerBlock("street_block_a_8",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_9 = registerBlock("street_block_a_9",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_10 = registerBlock("street_block_a_10",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_11 = registerBlock("street_block_a_11",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_12 = registerBlock("street_block_a_12",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_13 = registerBlock("street_block_a_13",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_14 = registerBlock("street_block_a_14",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_A_15 = registerBlock("street_block_a_15",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    //Sidewalks Custom Bricks 2

    public static final RegistryObject<Block>STREET_BLOCK_B_0 = registerBlock("street_block_b_0",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_1 = registerBlock("street_block_b_1",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_2 = registerBlock("street_block_b_2",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_3 = registerBlock("street_block_b_3",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_4 = registerBlock("street_block_b_4",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_5 = registerBlock("street_block_b_5",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_6 = registerBlock("street_block_b_6",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_7 = registerBlock("street_block_b_7",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_8 = registerBlock("street_block_b_8",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_9 = registerBlock("street_block_b_9",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_10 = registerBlock("street_block_b_10",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_11 = registerBlock("street_block_b_11",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_12 = registerBlock("street_block_b_12",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_13 = registerBlock("street_block_b_13",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_14 = registerBlock("street_block_b_14",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>STREET_BLOCK_B_15 = registerBlock("street_block_b_15",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().lightLevel(state -> 8)), FRCreativeModeTab.SIDEWALKS);

    //Generic Blocks

    public static final RegistryObject<Block>CLINKER = registerBlock("clinker",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>CEMENT = registerBlock("cement",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIDEWALKS);

    public static final RegistryObject<Block>CRUSHEDROCK = registerBlock("crushedrock",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIDEWALKS);


// 1_16 Road Paints


    public static final RegistryObject<Block> A_1_16 = registerBlock("a_1_16",
            () -> new A_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ARROW2_1_16 = registerBlock("arrow2_1_16",
            () -> new Arrow2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_1_16 = registerBlock("arrowline_1_1_16",
            () -> new ArrowLine_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_1_16 = registerBlock("arrowline_2_1_16",
            () -> new ArrowLine_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ARROW_3_1_16 = registerBlock("arrow_3_1_16",
            () -> new Arrow_3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_1_16 = registerBlock("arrowdiagonal2_1_16",
            () -> new Arrowdiagonal2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_1_16 = registerBlock("arrowdiagonal_1_16",
            () -> new ArrowDiagonal_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_1_16 = registerBlock("arrowline_0_1_16",
            () -> new Arrowline_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_1_16 = registerBlock("arrowline_3_1_16",
            () -> new Arrowline_3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> B_1_16 = registerBlock("b_1_16",
            () -> new B_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_1_16 = registerBlock("bikeicon_0_1_16",
            () -> new BikeIcon_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_1_16 = registerBlock("bikeicon_1_1_16",
            () -> new BikeIcon_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> BIKE_1_16 = registerBlock("bike_1_16",
            () -> new Bike_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> BIKE_1_1_16 = registerBlock("bike_1_1_16",
            () -> new Bike_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> BUS_0_1_16 = registerBlock("bus_0_1_16",
            () -> new Bus_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> BUS_1_1_16 = registerBlock("bus_1_1_16",
            () -> new Bus_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> C_1_16 = registerBlock("c_1_16",
            () -> new C_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_1_16 = registerBlock("centre_0_1_16",
            () -> new Centre_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_1_16 = registerBlock("centre_1_1_16",
            () -> new Centre_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_1_16 = registerBlock("chevronright_a_0_1_16",
            () -> new ChevronRight_A_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_1_16 = registerBlock("chevronright_a_thin_0_1_16",
            () -> new ChevronRight_A_Thin_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_1_16 = registerBlock("chevron_0_1_16",
            () -> new Chevron_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_1_16 = registerBlock("chevron_left_a_1_16",
            () -> new Chevron_Left_A_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_1_16 = registerBlock("chevron_left_a_thin_1_16",
            () -> new Chevron_Left_A_Thin_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_1_16 = registerBlock("chevron_mid_0_1_16",
            () -> new Chevron_Mid_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_1_16 = registerBlock("chevron_mid_1_1_16",
            () -> new Chevron_Mid_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_1_16 = registerBlock("chevron_mid_left_1_16",
            () -> new Chevron_Mid_Left_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_1_16 = registerBlock("chevron_mid_left_thin_1_16",
            () -> new Chevron_Mid_Left_Thin_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_1_16 = registerBlock("chevron_mid_right_0_1_16",
            () -> new Chevron_Mid_Right_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_1_16 = registerBlock("chevron_mid_right_1_1_16",
            () -> new Chevron_Mid_Right_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_1_16 = registerBlock("chevron_side_line_0_1_16",
            () -> new Chevron_Side_Line_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CITY_0_1_16 = registerBlock("city_0_1_16",
            () -> new City_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CITY_1_1_16 = registerBlock("city_1_1_16",
            () -> new City_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_1_16 = registerBlock("clear_0_1_16",
            () -> new Clear_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_1_16 = registerBlock("clear_1_1_16",
            () -> new Clear_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_1_16 = registerBlock("crossingdiagonal_0_1_16",
            () -> new CrossingDiagonal_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_1_16 = registerBlock("crossingdiagonal_1_1_16",
            () -> new CrossingDiagonal_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_1_16 = registerBlock("crossingdiagonal_2_1_16",
            () -> new CrossingDiagonal_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_1_16 = registerBlock("crossingdiagonal_3_1_16",
            () -> new CrossingDiagonal_3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_1_16 = registerBlock("crossingpaint_0_1_16",
            () -> new CrossingPaint_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_1_16 = registerBlock("crossingpaint_1_1_16",
            () -> new CrossingPaint_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_1_16 = registerBlock("crossingpaint_2_1_16",
            () -> new CrossingPaint_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> D_1_16 = registerBlock("d_1_16",
            () -> new D_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_1_16 = registerBlock("diagonalcrossing_1_16",
            () -> new DiagonalCrossing_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> E_1_16 = registerBlock("e_1_16",
            () -> new E_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_1_16 = registerBlock("entry_0_1_16",
            () -> new Entry_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_1_16 = registerBlock("entry_1_1_16",
            () -> new Entry_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_1_16 = registerBlock("exclamation_1_16",
            () -> new Exclamation_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> F_1_16 = registerBlock("f_1_16",
            () -> new F_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> G_1_16 = registerBlock("g_1_16",
            () -> new G_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_1_16 = registerBlock("giveway_0_1_16",
            () -> new GiveWay_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> H_1_16 = registerBlock("h_1_16",
            () -> new H_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> HASHTAG_1_16 = registerBlock("hashtag_1_16",
            () -> new Hashtag_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_1_16 = registerBlock("hatchbox_1_16",
            () -> new Hatchbox_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> I_1_16 = registerBlock("i_1_16",
            () -> new I_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> J_1_16 = registerBlock("j_1_16",
            () -> new J_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_1_16 = registerBlock("junction_a_0_1_16",
            () -> new Junction_A_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_1_16 = registerBlock("junction_a_1_1_16",
            () -> new Junction_A_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_1_16 = registerBlock("junction_a_2_1_16",
            () -> new Junction_A_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_1_16 = registerBlock("junction_b_0_1_16",
            () -> new Junction_B_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_1_16 = registerBlock("junction_b_1_1_16",
            () -> new Junction_B_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_1_16 = registerBlock("junction_b_2_1_16",
            () -> new Junction_B_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_1_16 = registerBlock("junction_filter_left_0_1_16",
            () -> new Junction_Filter_Left_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_1_16 = registerBlock("junction_filter_left_empty_0_1_16",
            () -> new Junction_Filter_Left_Empty_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_1_16 = registerBlock("junction_filter_left_thin_0_1_16",
            () -> new Junction_Filter_Left_Thin_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_1_16 = registerBlock("junction_filter_right_0_1_16",
            () -> new Junction_Filter_Right_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_1_16 = registerBlock("junction_filter_right_empty_0_1_16",
            () -> new Junction_Filter_Right_Empty_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_1_16 = registerBlock("junction_filter_right_thin_0_1_16",
            () -> new Junction_Filter_Right_Thin_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_1_16 = registerBlock("junction_fork_chevron_mid_0_1_16",
            () -> new Junction_Fork_Chevron_Mid_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_1_16 = registerBlock("junction_fork_chevron_mid_thin_0_1_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_1_16 = registerBlock("junction_fork_mid_0_1_16",
            () -> new Junction_Fork_Mid_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_1_16 = registerBlock("junction_fork_mid_0_thin_1_16",
            () -> new Junction_Fork_Mid_0_Thin_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_16 = registerBlock("junction_mid_line_connection_1_16",
            () -> new Junction_Mid_Line_Connection_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_1_16 = registerBlock("junction_mid_line_connection_1_1_16",
            () -> new Junction_Mid_Line_Connection_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_1_16 = registerBlock("junction_mid_line_connection_2_1_16",
            () -> new Junction_Mid_Line_Connection_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_1_16 = registerBlock("junction_mid_line_connection_3_1_16",
            () -> new Junction_Mid_Line_Connection_3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_1_16 = registerBlock("junction_side_line_connection_0_1_16",
            () -> new Junction_Side_Line_Connection_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_1_16 = registerBlock("junction_side_line_connection_1_1_16",
            () -> new Junction_Side_Line_Connection_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_1_16 = registerBlock("junction_side_line_connection_2_1_16",
            () -> new Junction_Side_Line_Connection_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_1_16 = registerBlock("junction_side_line_connection_3_1_16",
            () -> new Junction_Side_Line_Connection_3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_1_16 = registerBlock("junction_side_line_connection_thick_0_1_16",
            () -> new Junction_Side_Line_Connection_Thick_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_1_16 = registerBlock("junction_side_line_connection_thick_1_1_16",
            () -> new Junction_Side_Line_Connection_Thick_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_1_16 = registerBlock("junction_side_line_connection_thick_2_1_16",
            () -> new Junction_Side_Line_Connection_Thick_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_1_16 = registerBlock("junction_side_line_connection_thick_3_1_16",
            () -> new Junction_Side_Line_Connection_Thick_3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_1_16 = registerBlock("junction_side_line_connection_thin_0_1_16",
            () -> new Junction_Side_Line_Connection_Thin_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_1_16 = registerBlock("junction_side_line_connection_thin_1_1_16",
            () -> new Junction_Side_Line_Connection_Thin_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_1_16 = registerBlock("junction_side_line_connection_thin_2_1_16",
            () -> new Junction_Side_Line_Connection_Thin_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_1_16 = registerBlock("junction_side_line_thin_3_1_16",
            () -> new Junction_Side_Line_Thin_3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_1_16 = registerBlock("junction_side_line_connection_thin_3_1_16",
            () -> new Junction_side_line_connection_thin_3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> K_1_16 = registerBlock("k_1_16",
            () -> new K_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> KEEP_0_1_16 = registerBlock("keep_0_1_16",
            () -> new Keep_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> KEEP_1_1_16 = registerBlock("keep_1_1_16",
            () -> new Keep_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> L_1_16 = registerBlock("l_1_16",
            () -> new L_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LANE_0_1_16 = registerBlock("lane_0_1_16",
            () -> new Lane_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LANE_1_1_16 = registerBlock("lane_1_1_16",
            () -> new Lane_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LEFT_0_1_16 = registerBlock("left_0_1_16",
            () -> new Left_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LEFT_1_1_16 = registerBlock("left_1_1_16",
            () -> new Left_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LETTER0_1_16 = registerBlock("letter0_1_16.json",
            () -> new Letter0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LETTER1_1_16 = registerBlock("letter1_1_16",
            () -> new Letter1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LETTER2_1_16 = registerBlock("letter2_1_16",
            () -> new Letter2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LETTER3_1_16 = registerBlock("letter3_1_16",
            () -> new Letter3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LETTER4_1_16 = registerBlock("letter4_1_16",
            () -> new Letter4_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LETTER5_1_16 = registerBlock("letter5_1_16",
            () -> new Letter5_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LETTER6_1_16 = registerBlock("letter6_1_16",
            () -> new Letter6_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LETTER7_1_16 = registerBlock("letter7_1_16",
            () -> new Letter7_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LETTER8_1_16 = registerBlock("letter8_1_16",
            () -> new Letter8_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LETTER9_1_16 = registerBlock("letter9_1_16",
            () -> new Letter9_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_1_16 = registerBlock("lineedgethick_0_1_16",
            () -> new LineEdgeThick_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_1_16 = registerBlock("lineedgethick_1_1_16",
            () -> new LineEdgeThick_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_1_16 = registerBlock("lineedgethick_2_1_16",
            () -> new LineEdgeThick_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_1_16 = registerBlock("lineedgethick_3_1_16",
            () -> new LineEdgeThick_3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_1_16 = registerBlock("lineedge_1_1_16",
            () -> new LineEdge_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_1_16 = registerBlock("lineedge_2_1_16",
            () -> new LineEdge_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_1_16 = registerBlock("lineedge_3_1_16",
            () -> new LineEdge_3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_1_16 = registerBlock("linemiddledash_1_16",
            () -> new LineMiddleDash_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_1_16 = registerBlock("linemiddlehalf_1_16",
            () -> new LineMiddleHalf_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_1_16 = registerBlock("linemiddleshort_1_16",
            () -> new LineMiddleShort_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_1_16 = registerBlock("lineside1_1_16",
            () -> new LineSide1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_1_16 = registerBlock("lineside2_1_16",
            () -> new LineSide2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_1_16 = registerBlock("lineside3_1_16",
            () -> new LineSide3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_1_16 = registerBlock("lineside4_1_16",
            () -> new LineSide4_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_1_16 = registerBlock("lineside5_1_16",
            () -> new LineSide5_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_1_16 = registerBlock("lineside6_1_16",
            () -> new LineSide6_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_1_16 = registerBlock("linesidedoublethick_0_1_16",
            () -> new LineSideDoubleThick_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_1_16 = registerBlock("linesidedoublethick_1_1_16",
            () -> new LineSideDoubleThick_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_16 = registerBlock("linesidedouble_1_16",
            () -> new LineSideDouble_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_1_16 = registerBlock("linesidedouble_1_1_16",
            () -> new LineSideDouble_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_1_16 = registerBlock("linesidethick_0_1_16",
            () -> new LineSideThick_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_1_16 = registerBlock("linesidethick_1_1_16",
            () -> new LineSideThick_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_1_16 = registerBlock("linesidethick_2_1_16",
            () -> new LineSideThick_2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_1_16 = registerBlock("linesidethick_3_1_16",
            () -> new LineSideThick_3_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_1_16 = registerBlock("linesidethick_4_1_16",
            () -> new LineSideThick_4_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_1_16 = registerBlock("linesidethick_5_1_16",
            () -> new LineSideThick_5_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> M_1_16 = registerBlock("m_1_16",
            () -> new M_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> MERGE_0_1_16 = registerBlock("merge_0_1_16",
            () -> new Merge_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> MERGE_1_1_16 = registerBlock("merge_1_1_16",
            () -> new Merge_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> N_1_16 = registerBlock("n_1_16",
            () -> new N_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> NO_0_1_16 = registerBlock("no_0_1_16",
            () -> new No_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> NO_1_1_16 = registerBlock("no_1_1_16",
            () -> new No_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> O_1_16 = registerBlock("o_1_16",
            () -> new O_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ONLY_0_1_16 = registerBlock("only_0_1_16",
            () -> new Only_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ONLY_1_1_16 = registerBlock("only_1_1_16",
            () -> new Only_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> P_1_16 = registerBlock("p_1_16",
            () -> new P_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_1_16 = registerBlock("pedestrian_1_16",
            () -> new Pedestrian_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> Q_1_16 = registerBlock("q_1_16",
            () -> new Q_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> QUESTION_1_16 = registerBlock("question_1_16",
            () -> new Question_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> R_1_16 = registerBlock("r_1_16",
            () -> new R_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_1_16 = registerBlock("right_0_1_16",
            () -> new Right_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_1_16 = registerBlock("right_1_1_16",
            () -> new Right_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> S_1_16 = registerBlock("s_1_16",
            () -> new S_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> SLASH_1_16 = registerBlock("slash_1_16",
            () -> new Slash_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> SLASH_1_1_16 = registerBlock("slash_1_1_16",
            () -> new Slash_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> SLOW_0_1_16 = registerBlock("slow_0_1_16",
            () -> new Slow_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> SLOW_1_1_16 = registerBlock("slow_1_1_16",
            () -> new Slow_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> STOP_0_1_16 = registerBlock("stop_0_1_16",
            () -> new Stop_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> STOP_1_1_16 = registerBlock("stop_1_1_16",
            () -> new Stop_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_1_16 = registerBlock("straight2d_1_16",
            () -> new Straight2D_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_1_16 = registerBlock("straight2i_1_16",
            () -> new Straight2I_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_1_16 = registerBlock("straight2t_1_16",
            () -> new Straight2T_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_1_16 = registerBlock("straight2_1_16",
            () -> new Straight2_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> T_1_16 = registerBlock("t_1_16",
            () -> new T_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> TAXI_0_1_16 = registerBlock("taxi_0_1_16",
            () -> new Taxi_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> TAXI_1_1_16 = registerBlock("taxi_1_1_16",
            () -> new Taxi_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> THICK2_D_1_16 = registerBlock("thick2_d_1_16",
            () -> new Thick2_D_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> THICK2_I_1_16 = registerBlock("thick2_i_1_16",
            () -> new Thick2_I_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> THICK2_T_1_16 = registerBlock("thick2_t_1_16",
            () -> new Thick2_T_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> THICKS_D_1_16 = registerBlock("thicks_d_1_16",
            () -> new ThickS_D_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> THICKS_I_1_16 = registerBlock("thicks_i_1_16",
            () -> new ThickS_I_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> THICKS_T_1_16 = registerBlock("thicks_t_1_16",
            () -> new ThickS_T_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_1_16 = registerBlock("thickstraight_1_16",
            () -> new ThickStraight_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> TOWN_0_1_16 = registerBlock("town_0_1_16",
            () -> new Town_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> TOWN_1_1_16 = registerBlock("town_1_1_16",
            () -> new Town_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> TURN_0_1_16 = registerBlock("turn_0_1_16",
            () -> new Turn_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> TURN_1_1_16 = registerBlock("turn_1_1_16",
            () -> new Turn_1_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> U_1_16 = registerBlock("u_1_16",
            () -> new U_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> V_1_16 = registerBlock("v_1_16",
            () -> new V_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> W_1_16 = registerBlock("w_1_16",
            () -> new W_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_1_16 = registerBlock("wheelchair_0_1_16",
            () -> new Wheelchair_0_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> X_1_16 = registerBlock("x_1_16",
            () -> new X_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> Y_1_16 = registerBlock("y_1_16",
            () -> new Y_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> Z_1_16 = registerBlock("z_1_16",
            () -> new Z_1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

    public static final RegistryObject<Block> ARROW1_16 = registerBlock("Arrow1_16",
            () -> new Arrow1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);

// 2_16 Road Paints



    public static final RegistryObject<Block> A_2_16 = registerBlock("a_2_16",
            () -> new A_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ARROW2_2_16 = registerBlock("arrow2_2_16",
            () -> new Arrow2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_2_16 = registerBlock("arrowline_1_2_16",
            () -> new ArrowLine_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_2_16 = registerBlock("arrowline_2_2_16",
            () -> new ArrowLine_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ARROW_3_2_16 = registerBlock("arrow_3_2_16",
            () -> new Arrow_3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_2_16 = registerBlock("arrowdiagonal2_2_16",
            () -> new Arrowdiagonal2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_2_16 = registerBlock("arrowdiagonal_2_16",
            () -> new ArrowDiagonal_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_2_16 = registerBlock("arrowline_0_2_16",
            () -> new Arrowline_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_2_16 = registerBlock("arrowline_3_2_16",
            () -> new Arrowline_3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> B_2_16 = registerBlock("b_2_16",
            () -> new B_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_2_16 = registerBlock("bikeicon_0_2_16",
            () -> new BikeIcon_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_2_16 = registerBlock("bikeicon_1_2_16",
            () -> new BikeIcon_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> BIKE_1_2_16 = registerBlock("bike_1_2_16",
            () -> new Bike_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> BIKE_2_16 = registerBlock("bike_2_16",
            () -> new Bike_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> BUS_0_2_16 = registerBlock("bus_0_2_16",
            () -> new Bus_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> BUS_1_2_16 = registerBlock("bus_1_2_16",
            () -> new Bus_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> C_2_16 = registerBlock("c_2_16",
            () -> new C_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_2_16 = registerBlock("centre_0_2_16",
            () -> new Centre_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_2_16 = registerBlock("centre_1_2_16",
            () -> new Centre_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_2_16 = registerBlock("chevronright_a_0_2_16",
            () -> new ChevronRight_A_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_2_16 = registerBlock("chevronright_a_thin_0_2_16",
            () -> new ChevronRight_A_Thin_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_2_16 = registerBlock("chevron_0_2_16",
            () -> new Chevron_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_2_16 = registerBlock("chevron_left_a_2_16",
            () -> new Chevron_Left_A_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_2_16 = registerBlock("chevron_left_a_thin_2_16",
            () -> new Chevron_Left_A_Thin_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_2_16 = registerBlock("chevron_mid_0_2_16",
            () -> new Chevron_Mid_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_2_16 = registerBlock("chevron_mid_1_2_16",
            () -> new Chevron_Mid_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_2_16 = registerBlock("chevron_mid_left_2_16",
            () -> new Chevron_Mid_Left_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_2_16 = registerBlock("chevron_mid_left_thin_2_16",
            () -> new Chevron_Mid_Left_Thin_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_2_16 = registerBlock("chevron_mid_right_0_2_16",
            () -> new Chevron_Mid_Right_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_2_16 = registerBlock("chevron_mid_right_1_2_16",
            () -> new Chevron_Mid_Right_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_2_16 = registerBlock("chevron_side_line_0_2_16",
            () -> new Chevron_Side_Line_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CITY_0_2_16 = registerBlock("city_0_2_16",
            () -> new City_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CITY_1_2_16 = registerBlock("city_1_2_16",
            () -> new City_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_2_16 = registerBlock("clear_0_2_16",
            () -> new Clear_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_2_16 = registerBlock("clear_1_2_16",
            () -> new Clear_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_2_16 = registerBlock("crossingdiagonal_0_2_16",
            () -> new CrossingDiagonal_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_2_16 = registerBlock("crossingdiagonal_1_2_16",
            () -> new CrossingDiagonal_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_2_16 = registerBlock("crossingdiagonal_2_2_16",
            () -> new CrossingDiagonal_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_2_16 = registerBlock("crossingdiagonal_3_2_16",
            () -> new CrossingDiagonal_3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_2_16 = registerBlock("crossingpaint_0_2_16",
            () -> new CrossingPaint_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_2_16 = registerBlock("crossingpaint_1_2_16",
            () -> new CrossingPaint_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_2_16 = registerBlock("crossingpaint_2_2_16",
            () -> new CrossingPaint_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> D_2_16 = registerBlock("d_2_16",
            () -> new D_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_2_16 = registerBlock("diagonalcrossing_2_16",
            () -> new DiagonalCrossing_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> E_2_16 = registerBlock("e_2_16",
            () -> new E_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_2_16 = registerBlock("entry_0_2_16",
            () -> new Entry_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_2_16 = registerBlock("entry_1_2_16",
            () -> new Entry_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_2_16 = registerBlock("exclamation_2_16",
            () -> new Exclamation_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> F_2_16 = registerBlock("f_2_16",
            () -> new F_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> G_2_16 = registerBlock("g_2_16",
            () -> new G_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_2_16 = registerBlock("giveway_0_2_16",
            () -> new GiveWay_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> H_2_16 = registerBlock("h_2_16",
            () -> new H_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> HASHTAG_2_16 = registerBlock("hashtag_2_16",
            () -> new Hashtag_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_2_16 = registerBlock("hatchbox_2_16",
            () -> new Hatchbox_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> I_2_16 = registerBlock("i_2_16",
            () -> new I_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> J_2_16 = registerBlock("j_2_16",
            () -> new J_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_2_16 = registerBlock("junction_a_0_2_16",
            () -> new Junction_A_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_2_16 = registerBlock("junction_a_1_2_16",
            () -> new Junction_A_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_2_16 = registerBlock("junction_a_2_2_16",
            () -> new Junction_A_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_2_16 = registerBlock("junction_b_0_2_16",
            () -> new Junction_B_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_2_16 = registerBlock("junction_b_1_2_16",
            () -> new Junction_B_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_2_16 = registerBlock("junction_b_2_2_16",
            () -> new Junction_B_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_2_16 = registerBlock("junction_filter_left_0_2_16",
            () -> new Junction_Filter_Left_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_2_16 = registerBlock("junction_filter_left_empty_0_2_16",
            () -> new Junction_Filter_Left_Empty_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_2_16 = registerBlock("junction_filter_left_thin_0_2_16",
            () -> new Junction_Filter_Left_Thin_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_2_16 = registerBlock("junction_filter_right_0_2_16",
            () -> new Junction_Filter_Right_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_2_16 = registerBlock("junction_filter_right_empty_0_2_16",
            () -> new Junction_Filter_Right_Empty_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_2_16 = registerBlock("junction_filter_right_thin_0_2_16",
            () -> new Junction_Filter_Right_Thin_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_2_16 = registerBlock("junction_fork_chevron_mid_0_2_16",
            () -> new Junction_Fork_Chevron_Mid_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_2_16 = registerBlock("junction_fork_chevron_mid_thin_0_2_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_2_16 = registerBlock("junction_fork_mid_0_2_16",
            () -> new Junction_Fork_Mid_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_2_16 = registerBlock("junction_fork_mid_0_thin_2_16",
            () -> new Junction_Fork_Mid_0_Thin_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_2_16 = registerBlock("junction_mid_line_connection_1_2_16",
            () -> new Junction_Mid_Line_Connection_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_16 = registerBlock("junction_mid_line_connection_2_16",
            () -> new Junction_Mid_Line_Connection_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_2_16 = registerBlock("junction_mid_line_connection_2_2_16",
            () -> new Junction_Mid_Line_Connection_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_2_16 = registerBlock("junction_mid_line_connection_3_2_16",
            () -> new Junction_Mid_Line_Connection_3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_2_16 = registerBlock("junction_side_line_connection_0_2_16",
            () -> new Junction_Side_Line_Connection_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_2_16 = registerBlock("junction_side_line_connection_1_2_16",
            () -> new Junction_Side_Line_Connection_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_2_16 = registerBlock("junction_side_line_connection_2_2_16",
            () -> new Junction_Side_Line_Connection_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_2_16 = registerBlock("junction_side_line_connection_3_2_16",
            () -> new Junction_Side_Line_Connection_3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_2_16 = registerBlock("junction_side_line_connection_thick_0_2_16",
            () -> new Junction_Side_Line_Connection_Thick_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_2_16 = registerBlock("junction_side_line_connection_thick_1_2_16",
            () -> new Junction_Side_Line_Connection_Thick_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_2_16 = registerBlock("junction_side_line_connection_thick_2_2_16",
            () -> new Junction_Side_Line_Connection_Thick_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_2_16 = registerBlock("junction_side_line_connection_thick_3_2_16",
            () -> new Junction_Side_Line_Connection_Thick_3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_2_16 = registerBlock("junction_side_line_connection_thin_0_2_16",
            () -> new Junction_Side_Line_Connection_Thin_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_2_16 = registerBlock("junction_side_line_connection_thin_1_2_16",
            () -> new Junction_Side_Line_Connection_Thin_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_2_16 = registerBlock("junction_side_line_connection_thin_2_2_16",
            () -> new Junction_Side_Line_Connection_Thin_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_2_16 = registerBlock("junction_side_line_thin_3_2_16",
            () -> new Junction_Side_Line_Thin_3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_2_16 = registerBlock("junction_side_line_connection_thin_3_2_16",
            () -> new Junction_side_line_connection_thin_3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> K_2_16 = registerBlock("k_2_16",
            () -> new K_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> KEEP_0_2_16 = registerBlock("keep_0_2_16",
            () -> new Keep_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> KEEP_1_2_16 = registerBlock("keep_1_2_16",
            () -> new Keep_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> L_2_16 = registerBlock("l_2_16",
            () -> new L_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LANE_0_2_16 = registerBlock("lane_0_2_16",
            () -> new Lane_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LANE_1_2_16 = registerBlock("lane_1_2_16",
            () -> new Lane_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LEFT_0_2_16 = registerBlock("left_0_2_16",
            () -> new Left_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LEFT_1_2_16 = registerBlock("left_1_2_16",
            () -> new Left_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LETTER0_2_16 = registerBlock("letter0_2_16",
            () -> new Letter0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LETTER1_2_16 = registerBlock("letter1_2_16",
            () -> new Letter1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LETTER2_2_16 = registerBlock("letter2_2_16",
            () -> new Letter2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LETTER3_2_16 = registerBlock("letter3_2_16",
            () -> new Letter3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LETTER4_2_16 = registerBlock("letter4_2_16",
            () -> new Letter4_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LETTER5_2_16 = registerBlock("letter5_2_16",
            () -> new Letter5_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LETTER6_2_16 = registerBlock("letter6_2_16",
            () -> new Letter6_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LETTER7_2_16 = registerBlock("letter7_2_16",
            () -> new Letter7_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LETTER8_2_16 = registerBlock("letter8_2_16",
            () -> new Letter8_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LETTER9_2_16 = registerBlock("letter9_2_16",
            () -> new Letter9_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_2_16 = registerBlock("lineedgethick_0_2_16",
            () -> new LineEdgeThick_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_2_16 = registerBlock("lineedgethick_1_2_16",
            () -> new LineEdgeThick_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_2_16 = registerBlock("lineedgethick_2_2_16",
            () -> new LineEdgeThick_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_2_16 = registerBlock("lineedgethick_3_2_16",
            () -> new LineEdgeThick_3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_2_16 = registerBlock("lineedge_1_2_16",
            () -> new LineEdge_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_2_16 = registerBlock("lineedge_2_2_16",
            () -> new LineEdge_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_2_16 = registerBlock("lineedge_3_2_16",
            () -> new LineEdge_3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_2_16 = registerBlock("linemiddledash_2_16",
            () -> new LineMiddleDash_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_2_16 = registerBlock("linemiddlehalf_2_16",
            () -> new LineMiddleHalf_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_2_16 = registerBlock("linemiddleshort_2_16",
            () -> new LineMiddleShort_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_2_16 = registerBlock("lineside1_2_16",
            () -> new LineSide1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_2_16 = registerBlock("lineside2_2_16",
            () -> new LineSide2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_2_16 = registerBlock("lineside3_2_16",
            () -> new LineSide3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_2_16 = registerBlock("lineside4_2_16",
            () -> new LineSide4_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_2_16 = registerBlock("lineside5_2_16",
            () -> new LineSide5_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_2_16 = registerBlock("lineside6_2_16",
            () -> new LineSide6_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_2_16 = registerBlock("linesidedoublethick_0_2_16",
            () -> new LineSideDoubleThick_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_2_16 = registerBlock("linesidedoublethick_1_2_16",
            () -> new LineSideDoubleThick_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_2_16 = registerBlock("linesidedouble_1_2_16",
            () -> new LineSideDouble_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_2_16 = registerBlock("linesidedouble_2_16",
            () -> new LineSideDouble_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_2_16 = registerBlock("linesidethick_0_2_16",
            () -> new LineSideThick_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_2_16 = registerBlock("linesidethick_1_2_16",
            () -> new LineSideThick_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_2_16 = registerBlock("linesidethick_2_2_16",
            () -> new LineSideThick_2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_2_16 = registerBlock("linesidethick_3_2_16",
            () -> new LineSideThick_3_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_2_16 = registerBlock("linesidethick_4_2_16",
            () -> new LineSideThick_4_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_2_16 = registerBlock("linesidethick_5_2_16",
            () -> new LineSideThick_5_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> M_2_16 = registerBlock("m_2_16",
            () -> new M_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> MERGE_0_2_16 = registerBlock("merge_0_2_16",
            () -> new Merge_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> MERGE_1_2_16 = registerBlock("merge_1_2_16",
            () -> new Merge_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> N_2_16 = registerBlock("n_2_16",
            () -> new N_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> NO_0_2_16 = registerBlock("no_0_2_16",
            () -> new No_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> NO_1_2_16 = registerBlock("no_1_2_16",
            () -> new No_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> O_2_16 = registerBlock("o_2_16",
            () -> new O_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ONLY_0_2_16 = registerBlock("only_0_2_16",
            () -> new Only_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> ONLY_1_2_16 = registerBlock("only_1_2_16",
            () -> new Only_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> P_2_16 = registerBlock("p_2_16",
            () -> new P_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_2_16 = registerBlock("pedestrian_2_16",
            () -> new Pedestrian_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> Q_2_16 = registerBlock("q_2_16",
            () -> new Q_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> QUESTION_2_16 = registerBlock("question_2_16",
            () -> new Question_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> R_2_16 = registerBlock("r_2_16",
            () -> new R_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_2_16 = registerBlock("right_0_2_16",
            () -> new Right_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_2_16 = registerBlock("right_1_2_16",
            () -> new Right_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> S_2_16 = registerBlock("s_2_16",
            () -> new S_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> SLASH_1_2_16 = registerBlock("slash_1_2_16",
            () -> new Slash_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> SLASH_2_16 = registerBlock("slash_2_16",
            () -> new Slash_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> SLOW_0_2_16 = registerBlock("slow_0_2_16",
            () -> new Slow_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> SLOW_1_2_16 = registerBlock("slow_1_2_16",
            () -> new Slow_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> STOP_0_2_16 = registerBlock("stop_0_2_16",
            () -> new Stop_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> STOP_1_2_16 = registerBlock("stop_1_2_16",
            () -> new Stop_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_2_16 = registerBlock("straight2d_2_16",
            () -> new Straight2D_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_2_16 = registerBlock("straight2i_2_16",
            () -> new Straight2I_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_2_16 = registerBlock("straight2t_2_16",
            () -> new Straight2T_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_2_16 = registerBlock("straight2_2_16",
            () -> new Straight2_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> T_2_16 = registerBlock("t_2_16",
            () -> new T_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> TAXI_0_2_16 = registerBlock("taxi_0_2_16",
            () -> new Taxi_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> TAXI_1_2_16 = registerBlock("taxi_1_2_16",
            () -> new Taxi_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> THICK2_D_2_16 = registerBlock("thick2_d_2_16",
            () -> new Thick2_D_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> THICK2_I_2_16 = registerBlock("thick2_i_2_16",
            () -> new Thick2_I_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> THICK2_T_2_16 = registerBlock("thick2_t_2_16",
            () -> new Thick2_T_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> THICKS_D_2_16 = registerBlock("thicks_d_2_16",
            () -> new ThickS_D_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> THICKS_I_2_16 = registerBlock("thicks_i_2_16",
            () -> new ThickS_I_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> THICKS_T_2_16 = registerBlock("thicks_t_2_16",
            () -> new ThickS_T_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_2_16 = registerBlock("thickstraight_2_16",
            () -> new ThickStraight_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> TOWN_0_2_16 = registerBlock("town_0_2_16",
            () -> new Town_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> TOWN_1_2_16 = registerBlock("town_1_2_16",
            () -> new Town_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> TURN_0_2_16 = registerBlock("turn_0_2_16",
            () -> new Turn_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> TURN_1_2_16 = registerBlock("turn_1_2_16",
            () -> new Turn_1_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> U_2_16 = registerBlock("u_2_16",
            () -> new U_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> V_2_16 = registerBlock("v_2_16",
            () -> new V_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> W_2_16 = registerBlock("w_2_16",
            () -> new W_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_2_16 = registerBlock("wheelchair_0_2_16",
            () -> new Wheelchair_0_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> X_2_16 = registerBlock("x_2_16",
            () -> new X_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> Y_2_16 = registerBlock("y_2_16",
            () -> new Y_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

    public static final RegistryObject<Block> Z_2_16 = registerBlock("z_2_16",
            () -> new Z_2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);

// 3_16 Road Paints



    public static final RegistryObject<Block> A_3_16 = registerBlock("a_3_16",
            () -> new A_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ARROW2_3_16 = registerBlock("arrow2_3_16",
            () -> new Arrow2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_3_16 = registerBlock("arrowline_1_3_16",
            () -> new ArrowLine_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_3_16 = registerBlock("arrowline_2_3_16",
            () -> new ArrowLine_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ARROW_3_3_16 = registerBlock("arrow_3_3_16",
            () -> new Arrow_3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_3_16 = registerBlock("arrowdiagonal2_3_16",
            () -> new Arrowdiagonal2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_3_16 = registerBlock("arrowdiagonal_3_16",
            () -> new ArrowDiagonal_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_3_16 = registerBlock("arrowline_0_3_16",
            () -> new Arrowline_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_3_16 = registerBlock("arrowline_3_3_16",
            () -> new Arrowline_3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> B_3_16 = registerBlock("b_3_16",
            () -> new B_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_3_16 = registerBlock("bikeicon_0_3_16",
            () -> new BikeIcon_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_3_16 = registerBlock("bikeicon_1_3_16",
            () -> new BikeIcon_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> BIKE_1_3_16 = registerBlock("bike_1_3_16",
            () -> new Bike_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> BIKE_3_16 = registerBlock("bike_3_16",
            () -> new Bike_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> BUS_0_3_16 = registerBlock("bus_0_3_16",
            () -> new Bus_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> BUS_1_3_16 = registerBlock("bus_1_3_16",
            () -> new Bus_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> C_3_16 = registerBlock("c_3_16",
            () -> new C_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_3_16 = registerBlock("centre_0_3_16",
            () -> new Centre_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_3_16 = registerBlock("centre_1_3_16",
            () -> new Centre_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_3_16 = registerBlock("chevronright_a_0_3_16",
            () -> new ChevronRight_A_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_3_16 = registerBlock("chevronright_a_thin_0_3_16",
            () -> new ChevronRight_A_Thin_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_3_16 = registerBlock("chevron_0_3_16",
            () -> new Chevron_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_3_16 = registerBlock("chevron_left_a_3_16",
            () -> new Chevron_Left_A_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_3_16 = registerBlock("chevron_left_a_thin_3_16",
            () -> new Chevron_Left_A_Thin_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_3_16 = registerBlock("chevron_mid_0_3_16",
            () -> new Chevron_Mid_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_3_16 = registerBlock("chevron_mid_1_3_16",
            () -> new Chevron_Mid_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_3_16 = registerBlock("chevron_mid_left_3_16",
            () -> new Chevron_Mid_Left_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_3_16 = registerBlock("chevron_mid_left_thin_3_16",
            () -> new Chevron_Mid_Left_Thin_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_3_16 = registerBlock("chevron_mid_right_0_3_16",
            () -> new Chevron_Mid_Right_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_3_16 = registerBlock("chevron_mid_right_1_3_16",
            () -> new Chevron_Mid_Right_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_3_16 = registerBlock("chevron_side_line_0_3_16",
            () -> new Chevron_Side_Line_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CITY_0_3_16 = registerBlock("city_0_3_16",
            () -> new City_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CITY_1_3_16 = registerBlock("city_1_3_16",
            () -> new City_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_3_16 = registerBlock("clear_0_3_16",
            () -> new Clear_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_3_16 = registerBlock("clear_1_3_16",
            () -> new Clear_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_3_16 = registerBlock("crossingdiagonal_0_3_16",
            () -> new CrossingDiagonal_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_3_16 = registerBlock("crossingdiagonal_1_3_16",
            () -> new CrossingDiagonal_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_3_16 = registerBlock("crossingdiagonal_2_3_16",
            () -> new CrossingDiagonal_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_3_16 = registerBlock("crossingdiagonal_3_3_16",
            () -> new CrossingDiagonal_3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_3_16 = registerBlock("crossingpaint_0_3_16",
            () -> new CrossingPaint_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_3_16 = registerBlock("crossingpaint_1_3_16",
            () -> new CrossingPaint_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_3_16 = registerBlock("crossingpaint_2_3_16",
            () -> new CrossingPaint_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> D_3_16 = registerBlock("d_3_16",
            () -> new D_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_3_16 = registerBlock("diagonalcrossing_3_16",
            () -> new DiagonalCrossing_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> E_3_16 = registerBlock("e_3_16",
            () -> new E_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_3_16 = registerBlock("entry_0_3_16",
            () -> new Entry_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_3_16 = registerBlock("entry_1_3_16",
            () -> new Entry_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_3_16 = registerBlock("exclamation_3_16",
            () -> new Exclamation_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> F_3_16 = registerBlock("f_3_16",
            () -> new F_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> G_3_16 = registerBlock("g_3_16",
            () -> new G_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_3_16 = registerBlock("giveway_0_3_16",
            () -> new GiveWay_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> H_3_16 = registerBlock("h_3_16",
            () -> new H_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> HASHTAG_3_16 = registerBlock("hashtag_3_16",
            () -> new Hashtag_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_3_16 = registerBlock("hatchbox_3_16",
            () -> new Hatchbox_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> I_3_16 = registerBlock("i_3_16",
            () -> new I_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> J_3_16 = registerBlock("j_3_16",
            () -> new J_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_3_16 = registerBlock("junction_a_0_3_16",
            () -> new Junction_A_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_3_16 = registerBlock("junction_a_1_3_16",
            () -> new Junction_A_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_3_16 = registerBlock("junction_a_2_3_16",
            () -> new Junction_A_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_3_16 = registerBlock("junction_b_0_3_16",
            () -> new Junction_B_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_3_16 = registerBlock("junction_b_1_3_16",
            () -> new Junction_B_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_3_16 = registerBlock("junction_b_2_3_16",
            () -> new Junction_B_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_3_16 = registerBlock("junction_filter_left_0_3_16",
            () -> new Junction_Filter_Left_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_3_16 = registerBlock("junction_filter_left_empty_0_3_16",
            () -> new Junction_Filter_Left_Empty_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_3_16 = registerBlock("junction_filter_left_thin_0_3_16",
            () -> new Junction_Filter_Left_Thin_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_3_16 = registerBlock("junction_filter_right_0_3_16",
            () -> new Junction_Filter_Right_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_3_16 = registerBlock("junction_filter_right_empty_0_3_16",
            () -> new Junction_Filter_Right_Empty_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_3_16 = registerBlock("junction_filter_right_thin_0_3_16",
            () -> new Junction_Filter_Right_Thin_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_3_16 = registerBlock("junction_fork_chevron_mid_0_3_16",
            () -> new Junction_Fork_Chevron_Mid_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_3_16 = registerBlock("junction_fork_chevron_mid_thin_0_3_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_3_16 = registerBlock("junction_fork_mid_0_3_16",
            () -> new Junction_Fork_Mid_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_3_16 = registerBlock("junction_fork_mid_0_thin_3_16",
            () -> new Junction_Fork_Mid_0_Thin_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_3_16 = registerBlock("junction_mid_line_connection_1_3_16",
            () -> new Junction_Mid_Line_Connection_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_3_16 = registerBlock("junction_mid_line_connection_2_3_16",
            () -> new Junction_Mid_Line_Connection_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_16 = registerBlock("junction_mid_line_connection_3_16",
            () -> new Junction_Mid_Line_Connection_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_3_16 = registerBlock("junction_mid_line_connection_3_3_16",
            () -> new Junction_Mid_Line_Connection_3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_3_16 = registerBlock("junction_side_line_connection_0_3_16",
            () -> new Junction_Side_Line_Connection_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_3_16 = registerBlock("junction_side_line_connection_1_3_16",
            () -> new Junction_Side_Line_Connection_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_3_16 = registerBlock("junction_side_line_connection_2_3_16",
            () -> new Junction_Side_Line_Connection_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_3_16 = registerBlock("junction_side_line_connection_3_3_16",
            () -> new Junction_Side_Line_Connection_3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_3_16 = registerBlock("junction_side_line_connection_thick_0_3_16",
            () -> new Junction_Side_Line_Connection_Thick_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_3_16 = registerBlock("junction_side_line_connection_thick_1_3_16",
            () -> new Junction_Side_Line_Connection_Thick_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_3_16 = registerBlock("junction_side_line_connection_thick_2_3_16",
            () -> new Junction_Side_Line_Connection_Thick_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_3_16 = registerBlock("junction_side_line_connection_thick_3_3_16",
            () -> new Junction_Side_Line_Connection_Thick_3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_3_16 = registerBlock("junction_side_line_connection_thin_0_3_16",
            () -> new Junction_Side_Line_Connection_Thin_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_3_16 = registerBlock("junction_side_line_connection_thin_1_3_16",
            () -> new Junction_Side_Line_Connection_Thin_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_3_16 = registerBlock("junction_side_line_connection_thin_2_3_16",
            () -> new Junction_Side_Line_Connection_Thin_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_3_16 = registerBlock("junction_side_line_thin_3_3_16",
            () -> new Junction_Side_Line_Thin_3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_3_16 = registerBlock("junction_side_line_connection_thin_3_3_16",
            () -> new Junction_side_line_connection_thin_3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> K_3_16 = registerBlock("k_3_16",
            () -> new K_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> KEEP_0_3_16 = registerBlock("keep_0_3_16",
            () -> new Keep_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> KEEP_1_3_16 = registerBlock("keep_1_3_16",
            () -> new Keep_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> L_3_16 = registerBlock("l_3_16",
            () -> new L_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LANE_0_3_16 = registerBlock("lane_0_3_16",
            () -> new Lane_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LANE_1_3_16 = registerBlock("lane_1_3_16",
            () -> new Lane_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LEFT_0_3_16 = registerBlock("left_0_3_16",
            () -> new Left_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LEFT_1_3_16 = registerBlock("left_1_3_16",
            () -> new Left_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LETTER0_3_16 = registerBlock("letter0_3_16",
            () -> new Letter0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LETTER1_3_16 = registerBlock("letter1_3_16",
            () -> new Letter1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LETTER2_3_16 = registerBlock("letter2_3_16",
            () -> new Letter2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LETTER3_3_16 = registerBlock("letter3_3_16",
            () -> new Letter3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LETTER4_3_16 = registerBlock("letter4_3_16",
            () -> new Letter4_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LETTER5_3_16 = registerBlock("letter5_3_16",
            () -> new Letter5_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LETTER6_3_16 = registerBlock("letter6_3_16",
            () -> new Letter6_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LETTER7_3_16 = registerBlock("letter7_3_16",
            () -> new Letter7_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LETTER8_3_16 = registerBlock("letter8_3_16",
            () -> new Letter8_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LETTER9_3_16 = registerBlock("letter9_3_16",
            () -> new Letter9_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_3_16 = registerBlock("lineedgethick_0_3_16",
            () -> new LineEdgeThick_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_3_16 = registerBlock("lineedgethick_1_3_16",
            () -> new LineEdgeThick_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_3_16 = registerBlock("lineedgethick_2_3_16",
            () -> new LineEdgeThick_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_3_16 = registerBlock("lineedgethick_3_3_16",
            () -> new LineEdgeThick_3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_3_16 = registerBlock("lineedge_1_3_16",
            () -> new LineEdge_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_3_16 = registerBlock("lineedge_2_3_16",
            () -> new LineEdge_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_3_16 = registerBlock("lineedge_3_3_16",
            () -> new LineEdge_3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_3_16 = registerBlock("linemiddledash_3_16",
            () -> new LineMiddleDash_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_3_16 = registerBlock("linemiddlehalf_3_16",
            () -> new LineMiddleHalf_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_3_16 = registerBlock("linemiddleshort_3_16",
            () -> new LineMiddleShort_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_3_16 = registerBlock("lineside1_3_16",
            () -> new LineSide1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_3_16 = registerBlock("lineside2_3_16",
            () -> new LineSide2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_3_16 = registerBlock("lineside3_3_16",
            () -> new LineSide3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_3_16 = registerBlock("lineside4_3_16",
            () -> new LineSide4_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_3_16 = registerBlock("lineside5_3_16",
            () -> new LineSide5_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_3_16 = registerBlock("lineside6_3_16",
            () -> new LineSide6_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_3_16 = registerBlock("linesidedoublethick_0_3_16",
            () -> new LineSideDoubleThick_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_3_16 = registerBlock("linesidedoublethick_1_3_16",
            () -> new LineSideDoubleThick_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_3_16 = registerBlock("linesidedouble_1_3_16",
            () -> new LineSideDouble_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_3_16 = registerBlock("linesidedouble_3_16",
            () -> new LineSideDouble_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_3_16 = registerBlock("linesidethick_0_3_16",
            () -> new LineSideThick_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_3_16 = registerBlock("linesidethick_1_3_16",
            () -> new LineSideThick_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_3_16 = registerBlock("linesidethick_2_3_16",
            () -> new LineSideThick_2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_3_16 = registerBlock("linesidethick_3_3_16",
            () -> new LineSideThick_3_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_3_16 = registerBlock("linesidethick_4_3_16",
            () -> new LineSideThick_4_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_3_16 = registerBlock("linesidethick_5_3_16",
            () -> new LineSideThick_5_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> M_3_16 = registerBlock("m_3_16",
            () -> new M_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> MERGE_0_3_16 = registerBlock("merge_0_3_16",
            () -> new Merge_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> MERGE_1_3_16 = registerBlock("merge_1_3_16",
            () -> new Merge_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> N_3_16 = registerBlock("n_3_16",
            () -> new N_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> NO_0_3_16 = registerBlock("no_0_3_16",
            () -> new No_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> NO_1_3_16 = registerBlock("no_1_3_16",
            () -> new No_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> O_3_16 = registerBlock("o_3_16",
            () -> new O_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ONLY_0_3_16 = registerBlock("only_0_3_16",
            () -> new Only_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> ONLY_1_3_16 = registerBlock("only_1_3_16",
            () -> new Only_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> P_3_16 = registerBlock("p_3_16",
            () -> new P_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_3_16 = registerBlock("pedestrian_3_16",
            () -> new Pedestrian_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> Q_3_16 = registerBlock("q_3_16",
            () -> new Q_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> QUESTION_3_16 = registerBlock("question_3_16",
            () -> new Question_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> R_3_16 = registerBlock("r_3_16",
            () -> new R_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_3_16 = registerBlock("right_0_3_16",
            () -> new Right_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_3_16 = registerBlock("right_1_3_16",
            () -> new Right_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> S_3_16 = registerBlock("s_3_16",
            () -> new S_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> SLASH_1_3_16 = registerBlock("slash_1_3_16",
            () -> new Slash_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> SLASH_3_16 = registerBlock("slash_3_16",
            () -> new Slash_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> SLOW_0_3_16 = registerBlock("slow_0_3_16",
            () -> new Slow_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> SLOW_1_3_16 = registerBlock("slow_1_3_16",
            () -> new Slow_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> STOP_0_3_16 = registerBlock("stop_0_3_16",
            () -> new Stop_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> STOP_1_3_16 = registerBlock("stop_1_3_16",
            () -> new Stop_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_3_16 = registerBlock("straight2d_3_16",
            () -> new Straight2D_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_3_16 = registerBlock("straight2i_3_16",
            () -> new Straight2I_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_3_16 = registerBlock("straight2t_3_16",
            () -> new Straight2T_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_3_16 = registerBlock("straight2_3_16",
            () -> new Straight2_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> T_3_16 = registerBlock("t_3_16",
            () -> new T_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> TAXI_0_3_16 = registerBlock("taxi_0_3_16",
            () -> new Taxi_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> TAXI_1_3_16 = registerBlock("taxi_1_3_16",
            () -> new Taxi_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> THICK2_D_3_16 = registerBlock("thick2_d_3_16",
            () -> new Thick2_D_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> THICK2_I_3_16 = registerBlock("thick2_i_3_16",
            () -> new Thick2_I_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> THICK2_T_3_16 = registerBlock("thick2_t_3_16",
            () -> new Thick2_T_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> THICKS_D_3_16 = registerBlock("thicks_d_3_16",
            () -> new ThickS_D_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> THICKS_I_3_16 = registerBlock("thicks_i_3_16",
            () -> new ThickS_I_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> THICKS_T_3_16 = registerBlock("thicks_t_3_16",
            () -> new ThickS_T_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_3_16 = registerBlock("thickstraight_3_16",
            () -> new ThickStraight_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> TOWN_0_3_16 = registerBlock("town_0_3_16",
            () -> new Town_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> TOWN_1_3_16 = registerBlock("town_1_3_16",
            () -> new Town_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> TURN_0_3_16 = registerBlock("turn_0_3_16",
            () -> new Turn_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> TURN_1_3_16 = registerBlock("turn_1_3_16",
            () -> new Turn_1_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> U_3_16 = registerBlock("u_3_16",
            () -> new U_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> V_3_16 = registerBlock("v_3_16",
            () -> new V_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> W_3_16 = registerBlock("w_3_16",
            () -> new W_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_3_16 = registerBlock("wheelchair_0_3_16",
            () -> new Wheelchair_0_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> X_3_16 = registerBlock("x_3_16",
            () -> new X_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> Y_3_16 = registerBlock("y_3_16",
            () -> new Y_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

    public static final RegistryObject<Block> Z_3_16 = registerBlock("z_3_16",
            () -> new Z_3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);

// 4_16 Road Paints



    public static final RegistryObject<Block> A_4_16 = registerBlock("a_4_16",
            () -> new A_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ARROW2_4_16 = registerBlock("arrow2_4_16",
            () -> new Arrow2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_4_16 = registerBlock("arrowline_1_4_16",
            () -> new ArrowLine_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_4_16 = registerBlock("arrowline_2_4_16",
            () -> new ArrowLine_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ARROW_3_4_16 = registerBlock("arrow_3_4_16",
            () -> new Arrow_3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_4_16 = registerBlock("arrowdiagonal2_4_16",
            () -> new Arrowdiagonal2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_4_16 = registerBlock("arrowdiagonal_4_16",
            () -> new ArrowDiagonal_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_4_16 = registerBlock("arrowline_0_4_16",
            () -> new Arrowline_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_4_16 = registerBlock("arrowline_3_4_16",
            () -> new Arrowline_3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> B_4_16 = registerBlock("b_4_16",
            () -> new B_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_4_16 = registerBlock("bikeicon_0_4_16",
            () -> new BikeIcon_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_4_16 = registerBlock("bikeicon_1_4_16",
            () -> new BikeIcon_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> BIKE_1_4_16 = registerBlock("bike_1_4_16",
            () -> new Bike_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> BIKE_4_16 = registerBlock("bike_4_16",
            () -> new Bike_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> BUS_0_4_16 = registerBlock("bus_0_4_16",
            () -> new Bus_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> BUS_1_4_16 = registerBlock("bus_1_4_16",
            () -> new Bus_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> C_4_16 = registerBlock("c_4_16",
            () -> new C_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_4_16 = registerBlock("centre_0_4_16",
            () -> new Centre_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_4_16 = registerBlock("centre_1_4_16",
            () -> new Centre_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_4_16 = registerBlock("chevronright_a_0_4_16",
            () -> new ChevronRight_A_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_4_16 = registerBlock("chevronright_a_thin_0_4_16",
            () -> new ChevronRight_A_Thin_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_4_16 = registerBlock("chevron_0_4_16",
            () -> new Chevron_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_4_16 = registerBlock("chevron_left_a_4_16",
            () -> new Chevron_Left_A_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_4_16 = registerBlock("chevron_left_a_thin_4_16",
            () -> new Chevron_Left_A_Thin_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_4_16 = registerBlock("chevron_mid_0_4_16",
            () -> new Chevron_Mid_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_4_16 = registerBlock("chevron_mid_1_4_16",
            () -> new Chevron_Mid_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_4_16 = registerBlock("chevron_mid_left_4_16",
            () -> new Chevron_Mid_Left_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_4_16 = registerBlock("chevron_mid_left_thin_4_16",
            () -> new Chevron_Mid_Left_Thin_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_4_16 = registerBlock("chevron_mid_right_0_4_16",
            () -> new Chevron_Mid_Right_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_4_16 = registerBlock("chevron_mid_right_1_4_16",
            () -> new Chevron_Mid_Right_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_4_16 = registerBlock("chevron_side_line_0_4_16",
            () -> new Chevron_Side_Line_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CITY_0_4_16 = registerBlock("city_0_4_16",
            () -> new City_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CITY_1_4_16 = registerBlock("city_1_4_16",
            () -> new City_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_4_16 = registerBlock("clear_0_4_16",
            () -> new Clear_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_4_16 = registerBlock("clear_1_4_16",
            () -> new Clear_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_4_16 = registerBlock("crossingdiagonal_0_4_16",
            () -> new CrossingDiagonal_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_4_16 = registerBlock("crossingdiagonal_1_4_16",
            () -> new CrossingDiagonal_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_4_16 = registerBlock("crossingdiagonal_2_4_16",
            () -> new CrossingDiagonal_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_4_16 = registerBlock("crossingdiagonal_3_4_16",
            () -> new CrossingDiagonal_3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_4_16 = registerBlock("crossingpaint_0_4_16",
            () -> new CrossingPaint_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_4_16 = registerBlock("crossingpaint_1_4_16",
            () -> new CrossingPaint_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_4_16 = registerBlock("crossingpaint_2_4_16",
            () -> new CrossingPaint_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> D_4_16 = registerBlock("d_4_16",
            () -> new D_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_4_16 = registerBlock("diagonalcrossing_4_16",
            () -> new DiagonalCrossing_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> E_4_16 = registerBlock("e_4_16",
            () -> new E_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_4_16 = registerBlock("entry_0_4_16",
            () -> new Entry_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_4_16 = registerBlock("entry_1_4_16",
            () -> new Entry_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_4_16 = registerBlock("exclamation_4_16",
            () -> new Exclamation_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> F_4_16 = registerBlock("f_4_16",
            () -> new F_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> G_4_16 = registerBlock("g_4_16",
            () -> new G_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_4_16 = registerBlock("giveway_0_4_16",
            () -> new GiveWay_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> H_4_16 = registerBlock("h_4_16",
            () -> new H_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> HASHTAG_4_16 = registerBlock("hashtag_4_16",
            () -> new Hashtag_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_4_16 = registerBlock("hatchbox_4_16",
            () -> new Hatchbox_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> I_4_16 = registerBlock("i_4_16",
            () -> new I_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> J_4_16 = registerBlock("j_4_16",
            () -> new J_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_4_16 = registerBlock("junction_a_0_4_16",
            () -> new Junction_A_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_4_16 = registerBlock("junction_a_1_4_16",
            () -> new Junction_A_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_4_16 = registerBlock("junction_a_2_4_16",
            () -> new Junction_A_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_4_16 = registerBlock("junction_b_0_4_16",
            () -> new Junction_B_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_4_16 = registerBlock("junction_b_1_4_16",
            () -> new Junction_B_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_4_16 = registerBlock("junction_b_2_4_16",
            () -> new Junction_B_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_4_16 = registerBlock("junction_filter_left_0_4_16",
            () -> new Junction_Filter_Left_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_4_16 = registerBlock("junction_filter_left_empty_0_4_16",
            () -> new Junction_Filter_Left_Empty_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_4_16 = registerBlock("junction_filter_left_thin_0_4_16",
            () -> new Junction_Filter_Left_Thin_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_4_16 = registerBlock("junction_filter_right_0_4_16",
            () -> new Junction_Filter_Right_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_4_16 = registerBlock("junction_filter_right_empty_0_4_16",
            () -> new Junction_Filter_Right_Empty_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_4_16 = registerBlock("junction_filter_right_thin_0_4_16",
            () -> new Junction_Filter_Right_Thin_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_4_16 = registerBlock("junction_fork_chevron_mid_0_4_16",
            () -> new Junction_Fork_Chevron_Mid_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_4_16 = registerBlock("junction_fork_chevron_mid_thin_0_4_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_4_16 = registerBlock("junction_fork_mid_0_4_16",
            () -> new Junction_Fork_Mid_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_4_16 = registerBlock("junction_fork_mid_0_thin_4_16",
            () -> new Junction_Fork_Mid_0_Thin_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_4_16 = registerBlock("junction_mid_line_connection_1_4_16",
            () -> new Junction_Mid_Line_Connection_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_4_16 = registerBlock("junction_mid_line_connection_2_4_16",
            () -> new Junction_Mid_Line_Connection_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_4_16 = registerBlock("junction_mid_line_connection_3_4_16",
            () -> new Junction_Mid_Line_Connection_3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_4_16 = registerBlock("junction_mid_line_connection_4_16",
            () -> new Junction_Mid_Line_Connection_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_4_16 = registerBlock("junction_side_line_connection_0_4_16",
            () -> new Junction_Side_Line_Connection_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_4_16 = registerBlock("junction_side_line_connection_1_4_16",
            () -> new Junction_Side_Line_Connection_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_4_16 = registerBlock("junction_side_line_connection_2_4_16",
            () -> new Junction_Side_Line_Connection_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_4_16 = registerBlock("junction_side_line_connection_3_4_16",
            () -> new Junction_Side_Line_Connection_3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_4_16 = registerBlock("junction_side_line_connection_thick_0_4_16",
            () -> new Junction_Side_Line_Connection_Thick_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_4_16 = registerBlock("junction_side_line_connection_thick_1_4_16",
            () -> new Junction_Side_Line_Connection_Thick_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_4_16 = registerBlock("junction_side_line_connection_thick_2_4_16",
            () -> new Junction_Side_Line_Connection_Thick_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_4_16 = registerBlock("junction_side_line_connection_thick_3_4_16",
            () -> new Junction_Side_Line_Connection_Thick_3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_4_16 = registerBlock("junction_side_line_connection_thin_0_4_16",
            () -> new Junction_Side_Line_Connection_Thin_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_4_16 = registerBlock("junction_side_line_connection_thin_1_4_16",
            () -> new Junction_Side_Line_Connection_Thin_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_4_16 = registerBlock("junction_side_line_connection_thin_2_4_16",
            () -> new Junction_Side_Line_Connection_Thin_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_4_16 = registerBlock("junction_side_line_thin_3_4_16",
            () -> new Junction_Side_Line_Thin_3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_4_16 = registerBlock("junction_side_line_connection_thin_3_4_16",
            () -> new Junction_side_line_connection_thin_3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> K_4_16 = registerBlock("k_4_16",
            () -> new K_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> KEEP_0_4_16 = registerBlock("keep_0_4_16",
            () -> new Keep_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> KEEP_1_4_16 = registerBlock("keep_1_4_16",
            () -> new Keep_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> L_4_16 = registerBlock("l_4_16",
            () -> new L_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LANE_0_4_16 = registerBlock("lane_0_4_16",
            () -> new Lane_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LANE_1_4_16 = registerBlock("lane_1_4_16",
            () -> new Lane_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LEFT_0_4_16 = registerBlock("left_0_4_16",
            () -> new Left_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LEFT_1_4_16 = registerBlock("left_1_4_16",
            () -> new Left_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LETTER0_4_16 = registerBlock("letter0_4_16",
            () -> new Letter0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LETTER1_4_16 = registerBlock("letter1_4_16",
            () -> new Letter1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LETTER2_4_16 = registerBlock("letter2_4_16",
            () -> new Letter2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LETTER3_4_16 = registerBlock("letter3_4_16",
            () -> new Letter3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LETTER4_4_16 = registerBlock("letter4_4_16",
            () -> new Letter4_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LETTER5_4_16 = registerBlock("letter5_4_16",
            () -> new Letter5_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LETTER6_4_16 = registerBlock("letter6_4_16",
            () -> new Letter6_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LETTER7_4_16 = registerBlock("letter7_4_16",
            () -> new Letter7_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LETTER8_4_16 = registerBlock("letter8_4_16",
            () -> new Letter8_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LETTER9_4_16 = registerBlock("letter9_4_16",
            () -> new Letter9_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_4_16 = registerBlock("lineedgethick_0_4_16",
            () -> new LineEdgeThick_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_4_16 = registerBlock("lineedgethick_1_4_16",
            () -> new LineEdgeThick_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_4_16 = registerBlock("lineedgethick_2_4_16",
            () -> new LineEdgeThick_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_4_16 = registerBlock("lineedgethick_3_4_16",
            () -> new LineEdgeThick_3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_4_16 = registerBlock("lineedge_1_4_16",
            () -> new LineEdge_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_4_16 = registerBlock("lineedge_2_4_16",
            () -> new LineEdge_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_4_16 = registerBlock("lineedge_3_4_16",
            () -> new LineEdge_3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_4_16 = registerBlock("linemiddledash_4_16",
            () -> new LineMiddleDash_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_4_16 = registerBlock("linemiddlehalf_4_16",
            () -> new LineMiddleHalf_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_4_16 = registerBlock("linemiddleshort_4_16",
            () -> new LineMiddleShort_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_4_16 = registerBlock("lineside1_4_16",
            () -> new LineSide1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_4_16 = registerBlock("lineside2_4_16",
            () -> new LineSide2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_4_16 = registerBlock("lineside3_4_16",
            () -> new LineSide3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_4_16 = registerBlock("lineside4_4_16",
            () -> new LineSide4_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_4_16 = registerBlock("lineside5_4_16",
            () -> new LineSide5_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_4_16 = registerBlock("lineside6_4_16",
            () -> new LineSide6_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_4_16 = registerBlock("linesidedoublethick_0_4_16",
            () -> new LineSideDoubleThick_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_4_16 = registerBlock("linesidedoublethick_1_4_16",
            () -> new LineSideDoubleThick_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_4_16 = registerBlock("linesidedouble_1_4_16",
            () -> new LineSideDouble_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_4_16 = registerBlock("linesidedouble_4_16",
            () -> new LineSideDouble_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_4_16 = registerBlock("linesidethick_0_4_16",
            () -> new LineSideThick_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_4_16 = registerBlock("linesidethick_1_4_16",
            () -> new LineSideThick_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_4_16 = registerBlock("linesidethick_2_4_16",
            () -> new LineSideThick_2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_4_16 = registerBlock("linesidethick_3_4_16",
            () -> new LineSideThick_3_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_4_16 = registerBlock("linesidethick_4_4_16",
            () -> new LineSideThick_4_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_4_16 = registerBlock("linesidethick_5_4_16",
            () -> new LineSideThick_5_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> M_4_16 = registerBlock("m_4_16",
            () -> new M_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> MERGE_0_4_16 = registerBlock("merge_0_4_16",
            () -> new Merge_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> MERGE_1_4_16 = registerBlock("merge_1_4_16",
            () -> new Merge_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> N_4_16 = registerBlock("n_4_16",
            () -> new N_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> NO_0_4_16 = registerBlock("no_0_4_16",
            () -> new No_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> NO_1_4_16 = registerBlock("no_1_4_16",
            () -> new No_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> O_4_16 = registerBlock("o_4_16",
            () -> new O_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ONLY_0_4_16 = registerBlock("only_0_4_16",
            () -> new Only_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> ONLY_1_4_16 = registerBlock("only_1_4_16",
            () -> new Only_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> P_4_16 = registerBlock("p_4_16",
            () -> new P_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_4_16 = registerBlock("pedestrian_4_16",
            () -> new Pedestrian_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> Q_4_16 = registerBlock("q_4_16",
            () -> new Q_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> QUESTION_4_16 = registerBlock("question_4_16",
            () -> new Question_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> R_4_16 = registerBlock("r_4_16",
            () -> new R_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_4_16 = registerBlock("right_0_4_16",
            () -> new Right_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_4_16 = registerBlock("right_1_4_16",
            () -> new Right_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> S_4_16 = registerBlock("s_4_16",
            () -> new S_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> SLASH_1_4_16 = registerBlock("slash_1_4_16",
            () -> new Slash_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> SLASH_4_16 = registerBlock("slash_4_16",
            () -> new Slash_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> SLOW_0_4_16 = registerBlock("slow_0_4_16",
            () -> new Slow_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> SLOW_1_4_16 = registerBlock("slow_1_4_16",
            () -> new Slow_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> STOP_0_4_16 = registerBlock("stop_0_4_16",
            () -> new Stop_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> STOP_1_4_16 = registerBlock("stop_1_4_16",
            () -> new Stop_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_4_16 = registerBlock("straight2d_4_16",
            () -> new Straight2D_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_4_16 = registerBlock("straight2i_4_16",
            () -> new Straight2I_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_4_16 = registerBlock("straight2t_4_16",
            () -> new Straight2T_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_4_16 = registerBlock("straight2_4_16",
            () -> new Straight2_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> T_4_16 = registerBlock("t_4_16",
            () -> new T_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> TAXI_0_4_16 = registerBlock("taxi_0_4_16",
            () -> new Taxi_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> TAXI_1_4_16 = registerBlock("taxi_1_4_16",
            () -> new Taxi_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> THICK2_D_4_16 = registerBlock("thick2_d_4_16",
            () -> new Thick2_D_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> THICK2_I_4_16 = registerBlock("thick2_i_4_16",
            () -> new Thick2_I_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> THICK2_T_4_16 = registerBlock("thick2_t_4_16",
            () -> new Thick2_T_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> THICKS_D_4_16 = registerBlock("thicks_d_4_16",
            () -> new ThickS_D_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> THICKS_I_4_16 = registerBlock("thicks_i_4_16",
            () -> new ThickS_I_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> THICKS_T_4_16 = registerBlock("thicks_t_4_16",
            () -> new ThickS_T_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_4_16 = registerBlock("thickstraight_4_16",
            () -> new ThickStraight_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> TOWN_0_4_16 = registerBlock("town_0_4_16",
            () -> new Town_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> TOWN_1_4_16 = registerBlock("town_1_4_16",
            () -> new Town_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> TURN_0_4_16 = registerBlock("turn_0_4_16",
            () -> new Turn_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> TURN_1_4_16 = registerBlock("turn_1_4_16",
            () -> new Turn_1_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> U_4_16 = registerBlock("u_4_16",
            () -> new U_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> V_4_16 = registerBlock("v_4_16",
            () -> new V_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> W_4_16 = registerBlock("w_4_16",
            () -> new W_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_4_16 = registerBlock("wheelchair_0_4_16",
            () -> new Wheelchair_0_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> X_4_16 = registerBlock("x_4_16",
            () -> new X_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> Y_4_16 = registerBlock("y_4_16",
            () -> new Y_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

    public static final RegistryObject<Block> Z_4_16 = registerBlock("z_4_16",
            () -> new Z_4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);

// 5_16 Road Paints



    public static final RegistryObject<Block> A_5_16 = registerBlock("a_5_16",
            () -> new A_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ARROW2_5_16 = registerBlock("arrow2_5_16",
            () -> new Arrow2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_5_16 = registerBlock("arrowline_1_5_16",
            () -> new ArrowLine_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_5_16 = registerBlock("arrowline_2_5_16",
            () -> new ArrowLine_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ARROW_3_5_16 = registerBlock("arrow_3_5_16",
            () -> new Arrow_3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_5_16 = registerBlock("arrowdiagonal2_5_16",
            () -> new Arrowdiagonal2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_5_16 = registerBlock("arrowdiagonal_5_16",
            () -> new ArrowDiagonal_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_5_16 = registerBlock("arrowline_0_5_16",
            () -> new Arrowline_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_5_16 = registerBlock("arrowline_3_5_16",
            () -> new Arrowline_3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> B_5_16 = registerBlock("b_5_16",
            () -> new B_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_5_16 = registerBlock("bikeicon_0_5_16",
            () -> new BikeIcon_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_5_16 = registerBlock("bikeicon_1_5_16",
            () -> new BikeIcon_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> BIKE_1_5_16 = registerBlock("bike_1_5_16",
            () -> new Bike_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> BIKE_5_16 = registerBlock("bike_5_16",
            () -> new Bike_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> BUS_0_5_16 = registerBlock("bus_0_5_16",
            () -> new Bus_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> BUS_1_5_16 = registerBlock("bus_1_5_16",
            () -> new Bus_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> C_5_16 = registerBlock("c_5_16",
            () -> new C_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_5_16 = registerBlock("centre_0_5_16",
            () -> new Centre_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_5_16 = registerBlock("centre_1_5_16",
            () -> new Centre_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_5_16 = registerBlock("chevronright_a_0_5_16",
            () -> new ChevronRight_A_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_5_16 = registerBlock("chevronright_a_thin_0_5_16",
            () -> new ChevronRight_A_Thin_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_5_16 = registerBlock("chevron_0_5_16",
            () -> new Chevron_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_5_16 = registerBlock("chevron_left_a_5_16",
            () -> new Chevron_Left_A_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_5_16 = registerBlock("chevron_left_a_thin_5_16",
            () -> new Chevron_Left_A_Thin_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_5_16 = registerBlock("chevron_mid_0_5_16",
            () -> new Chevron_Mid_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_5_16 = registerBlock("chevron_mid_1_5_16",
            () -> new Chevron_Mid_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_5_16 = registerBlock("chevron_mid_left_5_16",
            () -> new Chevron_Mid_Left_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_5_16 = registerBlock("chevron_mid_left_thin_5_16",
            () -> new Chevron_Mid_Left_Thin_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_5_16 = registerBlock("chevron_mid_right_0_5_16",
            () -> new Chevron_Mid_Right_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_5_16 = registerBlock("chevron_mid_right_1_5_16",
            () -> new Chevron_Mid_Right_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_5_16 = registerBlock("chevron_side_line_0_5_16",
            () -> new Chevron_Side_Line_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CITY_0_5_16 = registerBlock("city_0_5_16",
            () -> new City_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CITY_1_5_16 = registerBlock("city_1_5_16",
            () -> new City_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_5_16 = registerBlock("clear_0_5_16",
            () -> new Clear_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_5_16 = registerBlock("clear_1_5_16",
            () -> new Clear_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_5_16 = registerBlock("crossingdiagonal_0_5_16",
            () -> new CrossingDiagonal_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_5_16 = registerBlock("crossingdiagonal_1_5_16",
            () -> new CrossingDiagonal_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_5_16 = registerBlock("crossingdiagonal_2_5_16",
            () -> new CrossingDiagonal_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_5_16 = registerBlock("crossingdiagonal_3_5_16",
            () -> new CrossingDiagonal_3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_5_16 = registerBlock("crossingpaint_0_5_16",
            () -> new CrossingPaint_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_5_16 = registerBlock("crossingpaint_1_5_16",
            () -> new CrossingPaint_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_5_16 = registerBlock("crossingpaint_2_5_16",
            () -> new CrossingPaint_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> D_5_16 = registerBlock("d_5_16",
            () -> new D_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_5_16 = registerBlock("diagonalcrossing_5_16",
            () -> new DiagonalCrossing_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> E_5_16 = registerBlock("e_5_16",
            () -> new E_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_5_16 = registerBlock("entry_0_5_16",
            () -> new Entry_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_5_16 = registerBlock("entry_1_5_16",
            () -> new Entry_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_5_16 = registerBlock("exclamation_5_16",
            () -> new Exclamation_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> F_5_16 = registerBlock("f_5_16",
            () -> new F_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> G_5_16 = registerBlock("g_5_16",
            () -> new G_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_5_16 = registerBlock("giveway_0_5_16",
            () -> new GiveWay_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> H_5_16 = registerBlock("h_5_16",
            () -> new H_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> HASHTAG_5_16 = registerBlock("hashtag_5_16",
            () -> new Hashtag_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_5_16 = registerBlock("hatchbox_5_16",
            () -> new Hatchbox_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> I_5_16 = registerBlock("i_5_16",
            () -> new I_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> J_5_16 = registerBlock("j_5_16",
            () -> new J_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_5_16 = registerBlock("junction_a_0_5_16",
            () -> new Junction_A_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_5_16 = registerBlock("junction_a_1_5_16",
            () -> new Junction_A_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_5_16 = registerBlock("junction_a_2_5_16",
            () -> new Junction_A_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_5_16 = registerBlock("junction_b_0_5_16",
            () -> new Junction_B_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_5_16 = registerBlock("junction_b_1_5_16",
            () -> new Junction_B_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_5_16 = registerBlock("junction_b_2_5_16",
            () -> new Junction_B_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_5_16 = registerBlock("junction_filter_left_0_5_16",
            () -> new Junction_Filter_Left_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_5_16 = registerBlock("junction_filter_left_empty_0_5_16",
            () -> new Junction_Filter_Left_Empty_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_5_16 = registerBlock("junction_filter_left_thin_0_5_16",
            () -> new Junction_Filter_Left_Thin_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_5_16 = registerBlock("junction_filter_right_0_5_16",
            () -> new Junction_Filter_Right_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_5_16 = registerBlock("junction_filter_right_empty_0_5_16",
            () -> new Junction_Filter_Right_Empty_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_5_16 = registerBlock("junction_filter_right_thin_0_5_16",
            () -> new Junction_Filter_Right_Thin_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_5_16 = registerBlock("junction_fork_chevron_mid_0_5_16",
            () -> new Junction_Fork_Chevron_Mid_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_5_16 = registerBlock("junction_fork_chevron_mid_thin_0_5_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_5_16 = registerBlock("junction_fork_mid_0_5_16",
            () -> new Junction_Fork_Mid_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_5_16 = registerBlock("junction_fork_mid_0_thin_5_16",
            () -> new Junction_Fork_Mid_0_Thin_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_5_16 = registerBlock("junction_mid_line_connection_1_5_16",
            () -> new Junction_Mid_Line_Connection_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_5_16 = registerBlock("junction_mid_line_connection_2_5_16",
            () -> new Junction_Mid_Line_Connection_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_5_16 = registerBlock("junction_mid_line_connection_3_5_16",
            () -> new Junction_Mid_Line_Connection_3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_5_16 = registerBlock("junction_mid_line_connection_5_16",
            () -> new Junction_Mid_Line_Connection_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_5_16 = registerBlock("junction_side_line_connection_0_5_16",
            () -> new Junction_Side_Line_Connection_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_5_16 = registerBlock("junction_side_line_connection_1_5_16",
            () -> new Junction_Side_Line_Connection_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_5_16 = registerBlock("junction_side_line_connection_2_5_16",
            () -> new Junction_Side_Line_Connection_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_5_16 = registerBlock("junction_side_line_connection_3_5_16",
            () -> new Junction_Side_Line_Connection_3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_5_16 = registerBlock("junction_side_line_connection_thick_0_5_16",
            () -> new Junction_Side_Line_Connection_Thick_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_5_16 = registerBlock("junction_side_line_connection_thick_1_5_16",
            () -> new Junction_Side_Line_Connection_Thick_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_5_16 = registerBlock("junction_side_line_connection_thick_2_5_16",
            () -> new Junction_Side_Line_Connection_Thick_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_5_16 = registerBlock("junction_side_line_connection_thick_3_5_16",
            () -> new Junction_Side_Line_Connection_Thick_3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_5_16 = registerBlock("junction_side_line_connection_thin_0_5_16",
            () -> new Junction_Side_Line_Connection_Thin_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_5_16 = registerBlock("junction_side_line_connection_thin_1_5_16",
            () -> new Junction_Side_Line_Connection_Thin_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_5_16 = registerBlock("junction_side_line_connection_thin_2_5_16",
            () -> new Junction_Side_Line_Connection_Thin_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_5_16 = registerBlock("junction_side_line_thin_3_5_16",
            () -> new Junction_Side_Line_Thin_3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_5_16 = registerBlock("junction_side_line_connection_thin_3_5_16",
            () -> new Junction_side_line_connection_thin_3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> K_5_16 = registerBlock("k_5_16",
            () -> new K_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> KEEP_0_5_16 = registerBlock("keep_0_5_16",
            () -> new Keep_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> KEEP_1_5_16 = registerBlock("keep_1_5_16",
            () -> new Keep_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> L_5_16 = registerBlock("l_5_16",
            () -> new L_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LANE_0_5_16 = registerBlock("lane_0_5_16",
            () -> new Lane_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LANE_1_5_16 = registerBlock("lane_1_5_16",
            () -> new Lane_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LEFT_0_5_16 = registerBlock("left_0_5_16",
            () -> new Left_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LEFT_1_5_16 = registerBlock("left_1_5_16",
            () -> new Left_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LETTER0_5_16 = registerBlock("letter0_5_16",
            () -> new Letter0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LETTER1_5_16 = registerBlock("letter1_5_16",
            () -> new Letter1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LETTER2_5_16 = registerBlock("letter2_5_16",
            () -> new Letter2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LETTER3_5_16 = registerBlock("letter3_5_16",
            () -> new Letter3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LETTER4_5_16 = registerBlock("letter4_5_16",
            () -> new Letter4_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LETTER5_5_16 = registerBlock("letter5_5_16",
            () -> new Letter5_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LETTER6_5_16 = registerBlock("letter6_5_16",
            () -> new Letter6_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LETTER7_5_16 = registerBlock("letter7_5_16",
            () -> new Letter7_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LETTER8_5_16 = registerBlock("letter8_5_16",
            () -> new Letter8_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LETTER9_5_16 = registerBlock("letter9_5_16",
            () -> new Letter9_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_5_16 = registerBlock("lineedgethick_0_5_16",
            () -> new LineEdgeThick_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_5_16 = registerBlock("lineedgethick_1_5_16",
            () -> new LineEdgeThick_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_5_16 = registerBlock("lineedgethick_2_5_16",
            () -> new LineEdgeThick_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_5_16 = registerBlock("lineedgethick_3_5_16",
            () -> new LineEdgeThick_3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_5_16 = registerBlock("lineedge_1_5_16",
            () -> new LineEdge_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_5_16 = registerBlock("lineedge_2_5_16",
            () -> new LineEdge_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_5_16 = registerBlock("lineedge_3_5_16",
            () -> new LineEdge_3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_5_16 = registerBlock("linemiddledash_5_16",
            () -> new LineMiddleDash_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_5_16 = registerBlock("linemiddlehalf_5_16",
            () -> new LineMiddleHalf_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_5_16 = registerBlock("linemiddleshort_5_16",
            () -> new LineMiddleShort_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_5_16 = registerBlock("lineside1_5_16",
            () -> new LineSide1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_5_16 = registerBlock("lineside2_5_16",
            () -> new LineSide2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_5_16 = registerBlock("lineside3_5_16",
            () -> new LineSide3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_5_16 = registerBlock("lineside4_5_16",
            () -> new LineSide4_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_5_16 = registerBlock("lineside5_5_16",
            () -> new LineSide5_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_5_16 = registerBlock("lineside6_5_16",
            () -> new LineSide6_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_5_16 = registerBlock("linesidedoublethick_0_5_16",
            () -> new LineSideDoubleThick_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_5_16 = registerBlock("linesidedoublethick_1_5_16",
            () -> new LineSideDoubleThick_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_5_16 = registerBlock("linesidedouble_1_5_16",
            () -> new LineSideDouble_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_5_16 = registerBlock("linesidedouble_5_16",
            () -> new LineSideDouble_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_5_16 = registerBlock("linesidethick_0_5_16",
            () -> new LineSideThick_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_5_16 = registerBlock("linesidethick_1_5_16",
            () -> new LineSideThick_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_5_16 = registerBlock("linesidethick_2_5_16",
            () -> new LineSideThick_2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_5_16 = registerBlock("linesidethick_3_5_16",
            () -> new LineSideThick_3_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_5_16 = registerBlock("linesidethick_4_5_16",
            () -> new LineSideThick_4_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_5_16 = registerBlock("linesidethick_5_5_16",
            () -> new LineSideThick_5_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> M_5_16 = registerBlock("m_5_16",
            () -> new M_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> MERGE_0_5_16 = registerBlock("merge_0_5_16",
            () -> new Merge_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> MERGE_1_5_16 = registerBlock("merge_1_5_16",
            () -> new Merge_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> N_5_16 = registerBlock("n_5_16",
            () -> new N_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> NO_0_5_16 = registerBlock("no_0_5_16",
            () -> new No_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> NO_1_5_16 = registerBlock("no_1_5_16",
            () -> new No_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> O_5_16 = registerBlock("o_5_16",
            () -> new O_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ONLY_0_5_16 = registerBlock("only_0_5_16",
            () -> new Only_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> ONLY_1_5_16 = registerBlock("only_1_5_16",
            () -> new Only_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> P_5_16 = registerBlock("p_5_16",
            () -> new P_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_5_16 = registerBlock("pedestrian_5_16",
            () -> new Pedestrian_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> Q_5_16 = registerBlock("q_5_16",
            () -> new Q_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> QUESTION_5_16 = registerBlock("question_5_16",
            () -> new Question_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> R_5_16 = registerBlock("r_5_16",
            () -> new R_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_5_16 = registerBlock("right_0_5_16",
            () -> new Right_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_5_16 = registerBlock("right_1_5_16",
            () -> new Right_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> S_5_16 = registerBlock("s_5_16",
            () -> new S_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> SLASH_1_5_16 = registerBlock("slash_1_5_16",
            () -> new Slash_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> SLASH_5_16 = registerBlock("slash_5_16",
            () -> new Slash_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> SLOW_0_5_16 = registerBlock("slow_0_5_16",
            () -> new Slow_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> SLOW_1_5_16 = registerBlock("slow_1_5_16",
            () -> new Slow_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> STOP_0_5_16 = registerBlock("stop_0_5_16",
            () -> new Stop_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> STOP_1_5_16 = registerBlock("stop_1_5_16",
            () -> new Stop_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_5_16 = registerBlock("straight2d_5_16",
            () -> new Straight2D_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_5_16 = registerBlock("straight2i_5_16",
            () -> new Straight2I_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_5_16 = registerBlock("straight2t_5_16",
            () -> new Straight2T_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_5_16 = registerBlock("straight2_5_16",
            () -> new Straight2_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> T_5_16 = registerBlock("t_5_16",
            () -> new T_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> TAXI_0_5_16 = registerBlock("taxi_0_5_16",
            () -> new Taxi_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> TAXI_1_5_16 = registerBlock("taxi_1_5_16",
            () -> new Taxi_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> THICK2_D_5_16 = registerBlock("thick2_d_5_16",
            () -> new Thick2_D_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> THICK2_I_5_16 = registerBlock("thick2_i_5_16",
            () -> new Thick2_I_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> THICK2_T_5_16 = registerBlock("thick2_t_5_16",
            () -> new Thick2_T_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> THICKS_D_5_16 = registerBlock("thicks_d_5_16",
            () -> new ThickS_D_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> THICKS_I_5_16 = registerBlock("thicks_i_5_16",
            () -> new ThickS_I_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> THICKS_T_5_16 = registerBlock("thicks_t_5_16",
            () -> new ThickS_T_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_5_16 = registerBlock("thickstraight_5_16",
            () -> new ThickStraight_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> TOWN_0_5_16 = registerBlock("town_0_5_16",
            () -> new Town_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> TOWN_1_5_16 = registerBlock("town_1_5_16",
            () -> new Town_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> TURN_0_5_16 = registerBlock("turn_0_5_16",
            () -> new Turn_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> TURN_1_5_16 = registerBlock("turn_1_5_16",
            () -> new Turn_1_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> U_5_16 = registerBlock("u_5_16",
            () -> new U_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> V_5_16 = registerBlock("v_5_16",
            () -> new V_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> W_5_16 = registerBlock("w_5_16",
            () -> new W_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_5_16 = registerBlock("wheelchair_0_5_16",
            () -> new Wheelchair_0_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> X_5_16 = registerBlock("x_5_16",
            () -> new X_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> Y_5_16 = registerBlock("y_5_16",
            () -> new Y_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

    public static final RegistryObject<Block> Z_5_16 = registerBlock("z_5_16",
            () -> new Z_5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);

// 6_16 Road Paints




    public static final RegistryObject<Block> A_6_16 = registerBlock("a_6_16",
            () -> new A_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ARROW2_6_16 = registerBlock("arrow2_6_16",
            () -> new Arrow2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_6_16 = registerBlock("arrowline_1_6_16",
            () -> new ArrowLine_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_6_16 = registerBlock("arrowline_2_6_16",
            () -> new ArrowLine_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ARROW_3_6_16 = registerBlock("arrow_3_6_16",
            () -> new Arrow_3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_6_16 = registerBlock("arrowdiagonal2_6_16",
            () -> new Arrowdiagonal2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_6_16 = registerBlock("arrowdiagonal_6_16",
            () -> new ArrowDiagonal_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_6_16 = registerBlock("arrowline_0_6_16",
            () -> new Arrowline_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_6_16 = registerBlock("arrowline_3_6_16",
            () -> new Arrowline_3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> B_6_16 = registerBlock("b_6_16",
            () -> new B_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_6_16 = registerBlock("bikeicon_0_6_16",
            () -> new BikeIcon_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_6_16 = registerBlock("bikeicon_1_6_16",
            () -> new BikeIcon_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> BIKE_1_6_16 = registerBlock("bike_1_6_16",
            () -> new Bike_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> BIKE_6_16 = registerBlock("bike_6_16",
            () -> new Bike_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> BUS_0_6_16 = registerBlock("bus_0_6_16",
            () -> new Bus_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> BUS_1_6_16 = registerBlock("bus_1_6_16",
            () -> new Bus_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> C_6_16 = registerBlock("c_6_16",
            () -> new C_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_6_16 = registerBlock("centre_0_6_16",
            () -> new Centre_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_6_16 = registerBlock("centre_1_6_16",
            () -> new Centre_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_6_16 = registerBlock("chevronright_a_0_6_16",
            () -> new ChevronRight_A_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_6_16 = registerBlock("chevronright_a_thin_0_6_16",
            () -> new ChevronRight_A_Thin_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_6_16 = registerBlock("chevron_0_6_16",
            () -> new Chevron_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_6_16 = registerBlock("chevron_left_a_6_16",
            () -> new Chevron_Left_A_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_6_16 = registerBlock("chevron_left_a_thin_6_16",
            () -> new Chevron_Left_A_Thin_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_6_16 = registerBlock("chevron_mid_0_6_16",
            () -> new Chevron_Mid_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_6_16 = registerBlock("chevron_mid_1_6_16",
            () -> new Chevron_Mid_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_6_16 = registerBlock("chevron_mid_left_6_16",
            () -> new Chevron_Mid_Left_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_6_16 = registerBlock("chevron_mid_left_thin_6_16",
            () -> new Chevron_Mid_Left_Thin_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_6_16 = registerBlock("chevron_mid_right_0_6_16",
            () -> new Chevron_Mid_Right_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_6_16 = registerBlock("chevron_mid_right_1_6_16",
            () -> new Chevron_Mid_Right_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_6_16 = registerBlock("chevron_side_line_0_6_16",
            () -> new Chevron_Side_Line_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CITY_0_6_16 = registerBlock("city_0_6_16",
            () -> new City_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CITY_1_6_16 = registerBlock("city_1_6_16",
            () -> new City_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_6_16 = registerBlock("clear_0_6_16",
            () -> new Clear_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_6_16 = registerBlock("clear_1_6_16",
            () -> new Clear_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_6_16 = registerBlock("crossingdiagonal_0_6_16",
            () -> new CrossingDiagonal_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_6_16 = registerBlock("crossingdiagonal_1_6_16",
            () -> new CrossingDiagonal_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_6_16 = registerBlock("crossingdiagonal_2_6_16",
            () -> new CrossingDiagonal_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_6_16 = registerBlock("crossingdiagonal_3_6_16",
            () -> new CrossingDiagonal_3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_6_16 = registerBlock("crossingpaint_0_6_16",
            () -> new CrossingPaint_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_6_16 = registerBlock("crossingpaint_1_6_16",
            () -> new CrossingPaint_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_6_16 = registerBlock("crossingpaint_2_6_16",
            () -> new CrossingPaint_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> D_6_16 = registerBlock("d_6_16",
            () -> new D_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_6_16 = registerBlock("diagonalcrossing_6_16",
            () -> new DiagonalCrossing_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> E_6_16 = registerBlock("e_6_16",
            () -> new E_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_6_16 = registerBlock("entry_0_6_16",
            () -> new Entry_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_6_16 = registerBlock("entry_1_6_16",
            () -> new Entry_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_6_16 = registerBlock("exclamation_6_16",
            () -> new Exclamation_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> F_6_16 = registerBlock("f_6_16",
            () -> new F_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> G_6_16 = registerBlock("g_6_16",
            () -> new G_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_6_16 = registerBlock("giveway_0_6_16",
            () -> new GiveWay_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> H_6_16 = registerBlock("h_6_16",
            () -> new H_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> HASHTAG_6_16 = registerBlock("hashtag_6_16",
            () -> new Hashtag_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_6_16 = registerBlock("hatchbox_6_16",
            () -> new Hatchbox_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> I_6_16 = registerBlock("i_6_16",
            () -> new I_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> J_6_16 = registerBlock("j_6_16",
            () -> new J_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_6_16 = registerBlock("junction_a_0_6_16",
            () -> new Junction_A_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_6_16 = registerBlock("junction_a_1_6_16",
            () -> new Junction_A_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_6_16 = registerBlock("junction_a_2_6_16",
            () -> new Junction_A_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_6_16 = registerBlock("junction_b_0_6_16",
            () -> new Junction_B_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_6_16 = registerBlock("junction_b_1_6_16",
            () -> new Junction_B_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_6_16 = registerBlock("junction_b_2_6_16",
            () -> new Junction_B_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_6_16 = registerBlock("junction_filter_left_0_6_16",
            () -> new Junction_Filter_Left_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_6_16 = registerBlock("junction_filter_left_empty_0_6_16",
            () -> new Junction_Filter_Left_Empty_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_6_16 = registerBlock("junction_filter_left_thin_0_6_16",
            () -> new Junction_Filter_Left_Thin_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_6_16 = registerBlock("junction_filter_right_0_6_16",
            () -> new Junction_Filter_Right_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_6_16 = registerBlock("junction_filter_right_empty_0_6_16",
            () -> new Junction_Filter_Right_Empty_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_6_16 = registerBlock("junction_filter_right_thin_0_6_16",
            () -> new Junction_Filter_Right_Thin_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_6_16 = registerBlock("junction_fork_chevron_mid_0_6_16",
            () -> new Junction_Fork_Chevron_Mid_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_6_16 = registerBlock("junction_fork_chevron_mid_thin_0_6_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_6_16 = registerBlock("junction_fork_mid_0_6_16",
            () -> new Junction_Fork_Mid_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_6_16 = registerBlock("junction_fork_mid_0_thin_6_16",
            () -> new Junction_Fork_Mid_0_Thin_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_6_16 = registerBlock("junction_mid_line_connection_1_6_16",
            () -> new Junction_Mid_Line_Connection_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_6_16 = registerBlock("junction_mid_line_connection_2_6_16",
            () -> new Junction_Mid_Line_Connection_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_6_16 = registerBlock("junction_mid_line_connection_3_6_16",
            () -> new Junction_Mid_Line_Connection_3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_6_16 = registerBlock("junction_mid_line_connection_6_16",
            () -> new Junction_Mid_Line_Connection_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_6_16 = registerBlock("junction_side_line_connection_0_6_16",
            () -> new Junction_Side_Line_Connection_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_6_16 = registerBlock("junction_side_line_connection_1_6_16",
            () -> new Junction_Side_Line_Connection_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_6_16 = registerBlock("junction_side_line_connection_2_6_16",
            () -> new Junction_Side_Line_Connection_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_6_16 = registerBlock("junction_side_line_connection_3_6_16",
            () -> new Junction_Side_Line_Connection_3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_6_16 = registerBlock("junction_side_line_connection_thick_0_6_16",
            () -> new Junction_Side_Line_Connection_Thick_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_6_16 = registerBlock("junction_side_line_connection_thick_1_6_16",
            () -> new Junction_Side_Line_Connection_Thick_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_6_16 = registerBlock("junction_side_line_connection_thick_2_6_16",
            () -> new Junction_Side_Line_Connection_Thick_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_6_16 = registerBlock("junction_side_line_connection_thick_3_6_16",
            () -> new Junction_Side_Line_Connection_Thick_3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_6_16 = registerBlock("junction_side_line_connection_thin_0_6_16",
            () -> new Junction_Side_Line_Connection_Thin_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_6_16 = registerBlock("junction_side_line_connection_thin_1_6_16",
            () -> new Junction_Side_Line_Connection_Thin_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_6_16 = registerBlock("junction_side_line_connection_thin_2_6_16",
            () -> new Junction_Side_Line_Connection_Thin_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_6_16 = registerBlock("junction_side_line_thin_3_6_16",
            () -> new Junction_Side_Line_Thin_3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_6_16 = registerBlock("junction_side_line_connection_thin_3_6_16",
            () -> new Junction_side_line_connection_thin_3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> K_6_16 = registerBlock("k_6_16",
            () -> new K_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> KEEP_0_6_16 = registerBlock("keep_0_6_16",
            () -> new Keep_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> KEEP_1_6_16 = registerBlock("keep_1_6_16",
            () -> new Keep_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> L_6_16 = registerBlock("l_6_16",
            () -> new L_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LANE_0_6_16 = registerBlock("lane_0_6_16",
            () -> new Lane_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LANE_1_6_16 = registerBlock("lane_1_6_16",
            () -> new Lane_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LEFT_0_6_16 = registerBlock("left_0_6_16",
            () -> new Left_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LEFT_1_6_16 = registerBlock("left_1_6_16",
            () -> new Left_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LETTER0_6_16 = registerBlock("letter0_6_16",
            () -> new Letter0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LETTER1_6_16 = registerBlock("letter1_6_16",
            () -> new Letter1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LETTER2_6_16 = registerBlock("letter2_6_16",
            () -> new Letter2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LETTER3_6_16 = registerBlock("letter3_6_16",
            () -> new Letter3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LETTER4_6_16 = registerBlock("letter4_6_16",
            () -> new Letter4_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LETTER5_6_16 = registerBlock("letter5_6_16",
            () -> new Letter5_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LETTER6_6_16 = registerBlock("letter6_6_16",
            () -> new Letter6_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LETTER7_6_16 = registerBlock("letter7_6_16",
            () -> new Letter7_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LETTER8_6_16 = registerBlock("letter8_6_16",
            () -> new Letter8_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LETTER9_6_16 = registerBlock("letter9_6_16",
            () -> new Letter9_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_6_16 = registerBlock("lineedgethick_0_6_16",
            () -> new LineEdgeThick_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_6_16 = registerBlock("lineedgethick_1_6_16",
            () -> new LineEdgeThick_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_6_16 = registerBlock("lineedgethick_2_6_16",
            () -> new LineEdgeThick_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_6_16 = registerBlock("lineedgethick_3_6_16",
            () -> new LineEdgeThick_3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_6_16 = registerBlock("lineedge_1_6_16",
            () -> new LineEdge_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_6_16 = registerBlock("lineedge_2_6_16",
            () -> new LineEdge_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_6_16 = registerBlock("lineedge_3_6_16",
            () -> new LineEdge_3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_6_16 = registerBlock("linemiddledash_6_16",
            () -> new LineMiddleDash_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_6_16 = registerBlock("linemiddlehalf_6_16",
            () -> new LineMiddleHalf_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_6_16 = registerBlock("linemiddleshort_6_16",
            () -> new LineMiddleShort_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_6_16 = registerBlock("lineside1_6_16",
            () -> new LineSide1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_6_16 = registerBlock("lineside2_6_16",
            () -> new LineSide2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_6_16 = registerBlock("lineside3_6_16",
            () -> new LineSide3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_6_16 = registerBlock("lineside4_6_16",
            () -> new LineSide4_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_6_16 = registerBlock("lineside5_6_16",
            () -> new LineSide5_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_6_16 = registerBlock("lineside6_6_16",
            () -> new LineSide6_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_6_16 = registerBlock("linesidedoublethick_0_6_16",
            () -> new LineSideDoubleThick_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_6_16 = registerBlock("linesidedoublethick_1_6_16",
            () -> new LineSideDoubleThick_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_6_16 = registerBlock("linesidedouble_1_6_16",
            () -> new LineSideDouble_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_6_16 = registerBlock("linesidedouble_6_16",
            () -> new LineSideDouble_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_6_16 = registerBlock("linesidethick_0_6_16",
            () -> new LineSideThick_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_6_16 = registerBlock("linesidethick_1_6_16",
            () -> new LineSideThick_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_6_16 = registerBlock("linesidethick_2_6_16",
            () -> new LineSideThick_2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_6_16 = registerBlock("linesidethick_3_6_16",
            () -> new LineSideThick_3_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_6_16 = registerBlock("linesidethick_4_6_16",
            () -> new LineSideThick_4_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_6_16 = registerBlock("linesidethick_5_6_16",
            () -> new LineSideThick_5_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> M_6_16 = registerBlock("m_6_16",
            () -> new M_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> MERGE_0_6_16 = registerBlock("merge_0_6_16",
            () -> new Merge_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> MERGE_1_6_16 = registerBlock("merge_1_6_16",
            () -> new Merge_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> N_6_16 = registerBlock("n_6_16",
            () -> new N_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> NO_0_6_16 = registerBlock("no_0_6_16",
            () -> new No_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> NO_1_6_16 = registerBlock("no_1_6_16",
            () -> new No_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> O_6_16 = registerBlock("o_6_16",
            () -> new O_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ONLY_0_6_16 = registerBlock("only_0_6_16",
            () -> new Only_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> ONLY_1_6_16 = registerBlock("only_1_6_16",
            () -> new Only_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> P_6_16 = registerBlock("p_6_16",
            () -> new P_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_6_16 = registerBlock("pedestrian_6_16",
            () -> new Pedestrian_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> Q_6_16 = registerBlock("q_6_16",
            () -> new Q_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> QUESTION_6_16 = registerBlock("question_6_16",
            () -> new Question_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> R_6_16 = registerBlock("r_6_16",
            () -> new R_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_6_16 = registerBlock("right_0_6_16",
            () -> new Right_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_6_16 = registerBlock("right_1_6_16",
            () -> new Right_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> S_6_16 = registerBlock("s_6_16",
            () -> new S_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> SLASH_1_6_16 = registerBlock("slash_1_6_16",
            () -> new Slash_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> SLASH_6_16 = registerBlock("slash_6_16",
            () -> new Slash_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> SLOW_0_6_16 = registerBlock("slow_0_6_16",
            () -> new Slow_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> SLOW_1_6_16 = registerBlock("slow_1_6_16",
            () -> new Slow_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> STOP_0_6_16 = registerBlock("stop_0_6_16",
            () -> new Stop_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> STOP_1_6_16 = registerBlock("stop_1_6_16",
            () -> new Stop_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_6_16 = registerBlock("straight2d_6_16",
            () -> new Straight2D_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_6_16 = registerBlock("straight2i_6_16",
            () -> new Straight2I_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_6_16 = registerBlock("straight2t_6_16",
            () -> new Straight2T_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_6_16 = registerBlock("straight2_6_16",
            () -> new Straight2_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> T_6_16 = registerBlock("t_6_16",
            () -> new T_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> TAXI_0_6_16 = registerBlock("taxi_0_6_16",
            () -> new Taxi_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> TAXI_1_6_16 = registerBlock("taxi_1_6_16",
            () -> new Taxi_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> THICK2_D_6_16 = registerBlock("thick2_d_6_16",
            () -> new Thick2_D_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> THICK2_I_6_16 = registerBlock("thick2_i_6_16",
            () -> new Thick2_I_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> THICK2_T_6_16 = registerBlock("thick2_t_6_16",
            () -> new Thick2_T_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> THICKS_D_6_16 = registerBlock("thicks_d_6_16",
            () -> new ThickS_D_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> THICKS_I_6_16 = registerBlock("thicks_i_6_16",
            () -> new ThickS_I_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> THICKS_T_6_16 = registerBlock("thicks_t_6_16",
            () -> new ThickS_T_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_6_16 = registerBlock("thickstraight_6_16",
            () -> new ThickStraight_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> TOWN_0_6_16 = registerBlock("town_0_6_16",
            () -> new Town_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> TOWN_1_6_16 = registerBlock("town_1_6_16",
            () -> new Town_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> TURN_0_6_16 = registerBlock("turn_0_6_16",
            () -> new Turn_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> TURN_1_6_16 = registerBlock("turn_1_6_16",
            () -> new Turn_1_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> U_6_16 = registerBlock("u_6_16",
            () -> new U_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> V_6_16 = registerBlock("v_6_16",
            () -> new V_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> W_6_16 = registerBlock("w_6_16",
            () -> new W_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_6_16 = registerBlock("wheelchair_0_6_16",
            () -> new Wheelchair_0_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> X_6_16 = registerBlock("x_6_16",
            () -> new X_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> Y_6_16 = registerBlock("y_6_16",
            () -> new Y_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

    public static final RegistryObject<Block> Z_6_16 = registerBlock("z_6_16",
            () -> new Z_6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);

// 7_16 Road Paints



    public static final RegistryObject<Block> A_7_16 = registerBlock("a_7_16",
            () -> new A_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ARROW2_7_16 = registerBlock("arrow2_7_16",
            () -> new Arrow2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_7_16 = registerBlock("arrowline_1_7_16",
            () -> new ArrowLine_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_7_16 = registerBlock("arrowline_2_7_16",
            () -> new ArrowLine_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ARROW_3_7_16 = registerBlock("arrow_3_7_16",
            () -> new Arrow_3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_7_16 = registerBlock("arrowdiagonal2_7_16",
            () -> new Arrowdiagonal2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_7_16 = registerBlock("arrowdiagonal_7_16",
            () -> new ArrowDiagonal_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_7_16 = registerBlock("arrowline_0_7_16",
            () -> new Arrowline_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_7_16 = registerBlock("arrowline_3_7_16",
            () -> new Arrowline_3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> B_7_16 = registerBlock("b_7_16",
            () -> new B_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_7_16 = registerBlock("bikeicon_0_7_16",
            () -> new BikeIcon_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_7_16 = registerBlock("bikeicon_1_7_16",
            () -> new BikeIcon_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> BIKE_1_7_16 = registerBlock("bike_1_7_16",
            () -> new Bike_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> BIKE_7_16 = registerBlock("bike_7_16",
            () -> new Bike_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> BUS_0_7_16 = registerBlock("bus_0_7_16",
            () -> new Bus_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> BUS_1_7_16 = registerBlock("bus_1_7_16",
            () -> new Bus_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> C_7_16 = registerBlock("c_7_16",
            () -> new C_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_7_16 = registerBlock("centre_0_7_16",
            () -> new Centre_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_7_16 = registerBlock("centre_1_7_16",
            () -> new Centre_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_7_16 = registerBlock("chevronright_a_0_7_16",
            () -> new ChevronRight_A_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_7_16 = registerBlock("chevronright_a_thin_0_7_16",
            () -> new ChevronRight_A_Thin_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_7_16 = registerBlock("chevron_0_7_16",
            () -> new Chevron_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_7_16 = registerBlock("chevron_left_a_7_16",
            () -> new Chevron_Left_A_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_7_16 = registerBlock("chevron_left_a_thin_7_16",
            () -> new Chevron_Left_A_Thin_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_7_16 = registerBlock("chevron_mid_0_7_16",
            () -> new Chevron_Mid_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_7_16 = registerBlock("chevron_mid_1_7_16",
            () -> new Chevron_Mid_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_7_16 = registerBlock("chevron_mid_left_7_16",
            () -> new Chevron_Mid_Left_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_7_16 = registerBlock("chevron_mid_left_thin_7_16",
            () -> new Chevron_Mid_Left_Thin_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_7_16 = registerBlock("chevron_mid_right_0_7_16",
            () -> new Chevron_Mid_Right_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_7_16 = registerBlock("chevron_mid_right_1_7_16",
            () -> new Chevron_Mid_Right_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_7_16 = registerBlock("chevron_side_line_0_7_16",
            () -> new Chevron_Side_Line_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CITY_0_7_16 = registerBlock("city_0_7_16",
            () -> new City_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CITY_1_7_16 = registerBlock("city_1_7_16",
            () -> new City_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_7_16 = registerBlock("clear_0_7_16",
            () -> new Clear_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_7_16 = registerBlock("clear_1_7_16",
            () -> new Clear_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_7_16 = registerBlock("crossingdiagonal_0_7_16",
            () -> new CrossingDiagonal_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_7_16 = registerBlock("crossingdiagonal_1_7_16",
            () -> new CrossingDiagonal_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_7_16 = registerBlock("crossingdiagonal_2_7_16",
            () -> new CrossingDiagonal_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_7_16 = registerBlock("crossingdiagonal_3_7_16",
            () -> new CrossingDiagonal_3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_7_16 = registerBlock("crossingpaint_0_7_16",
            () -> new CrossingPaint_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_7_16 = registerBlock("crossingpaint_1_7_16",
            () -> new CrossingPaint_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_7_16 = registerBlock("crossingpaint_2_7_16",
            () -> new CrossingPaint_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> D_7_16 = registerBlock("d_7_16",
            () -> new D_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_7_16 = registerBlock("diagonalcrossing_7_16",
            () -> new DiagonalCrossing_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> E_7_16 = registerBlock("e_7_16",
            () -> new E_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_7_16 = registerBlock("entry_0_7_16",
            () -> new Entry_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_7_16 = registerBlock("entry_1_7_16",
            () -> new Entry_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_7_16 = registerBlock("exclamation_7_16",
            () -> new Exclamation_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> F_7_16 = registerBlock("f_7_16",
            () -> new F_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> G_7_16 = registerBlock("g_7_16",
            () -> new G_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_7_16 = registerBlock("giveway_0_7_16",
            () -> new GiveWay_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> H_7_16 = registerBlock("h_7_16",
            () -> new H_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> HASHTAG_7_16 = registerBlock("hashtag_7_16",
            () -> new Hashtag_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_7_16 = registerBlock("hatchbox_7_16",
            () -> new Hatchbox_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> I_7_16 = registerBlock("i_7_16",
            () -> new I_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> J_7_16 = registerBlock("j_7_16",
            () -> new J_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_7_16 = registerBlock("junction_a_0_7_16",
            () -> new Junction_A_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_7_16 = registerBlock("junction_a_1_7_16",
            () -> new Junction_A_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_7_16 = registerBlock("junction_a_2_7_16",
            () -> new Junction_A_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_7_16 = registerBlock("junction_b_0_7_16",
            () -> new Junction_B_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_7_16 = registerBlock("junction_b_1_7_16",
            () -> new Junction_B_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_7_16 = registerBlock("junction_b_2_7_16",
            () -> new Junction_B_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_7_16 = registerBlock("junction_filter_left_0_7_16",
            () -> new Junction_Filter_Left_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_7_16 = registerBlock("junction_filter_left_empty_0_7_16",
            () -> new Junction_Filter_Left_Empty_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_7_16 = registerBlock("junction_filter_left_thin_0_7_16",
            () -> new Junction_Filter_Left_Thin_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_7_16 = registerBlock("junction_filter_right_0_7_16",
            () -> new Junction_Filter_Right_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_7_16 = registerBlock("junction_filter_right_empty_0_7_16",
            () -> new Junction_Filter_Right_Empty_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_7_16 = registerBlock("junction_filter_right_thin_0_7_16",
            () -> new Junction_Filter_Right_Thin_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_7_16 = registerBlock("junction_fork_chevron_mid_0_7_16",
            () -> new Junction_Fork_Chevron_Mid_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_7_16 = registerBlock("junction_fork_chevron_mid_thin_0_7_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_7_16 = registerBlock("junction_fork_mid_0_7_16",
            () -> new Junction_Fork_Mid_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_7_16 = registerBlock("junction_fork_mid_0_thin_7_16",
            () -> new Junction_Fork_Mid_0_Thin_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_7_16 = registerBlock("junction_mid_line_connection_1_7_16",
            () -> new Junction_Mid_Line_Connection_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_7_16 = registerBlock("junction_mid_line_connection_2_7_16",
            () -> new Junction_Mid_Line_Connection_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_7_16 = registerBlock("junction_mid_line_connection_3_7_16",
            () -> new Junction_Mid_Line_Connection_3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_7_16 = registerBlock("junction_mid_line_connection_7_16",
            () -> new Junction_Mid_Line_Connection_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_7_16 = registerBlock("junction_side_line_connection_0_7_16",
            () -> new Junction_Side_Line_Connection_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_7_16 = registerBlock("junction_side_line_connection_1_7_16",
            () -> new Junction_Side_Line_Connection_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_7_16 = registerBlock("junction_side_line_connection_2_7_16",
            () -> new Junction_Side_Line_Connection_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_7_16 = registerBlock("junction_side_line_connection_3_7_16",
            () -> new Junction_Side_Line_Connection_3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_7_16 = registerBlock("junction_side_line_connection_thick_0_7_16",
            () -> new Junction_Side_Line_Connection_Thick_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_7_16 = registerBlock("junction_side_line_connection_thick_1_7_16",
            () -> new Junction_Side_Line_Connection_Thick_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_7_16 = registerBlock("junction_side_line_connection_thick_2_7_16",
            () -> new Junction_Side_Line_Connection_Thick_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_7_16 = registerBlock("junction_side_line_connection_thick_3_7_16",
            () -> new Junction_Side_Line_Connection_Thick_3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_7_16 = registerBlock("junction_side_line_connection_thin_0_7_16",
            () -> new Junction_Side_Line_Connection_Thin_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_7_16 = registerBlock("junction_side_line_connection_thin_1_7_16",
            () -> new Junction_Side_Line_Connection_Thin_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_7_16 = registerBlock("junction_side_line_connection_thin_2_7_16",
            () -> new Junction_Side_Line_Connection_Thin_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_7_16 = registerBlock("junction_side_line_thin_3_7_16",
            () -> new Junction_Side_Line_Thin_3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_7_16 = registerBlock("junction_side_line_connection_thin_3_7_16",
            () -> new Junction_side_line_connection_thin_3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> K_7_16 = registerBlock("k_7_16",
            () -> new K_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> KEEP_0_7_16 = registerBlock("keep_0_7_16",
            () -> new Keep_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> KEEP_1_7_16 = registerBlock("keep_1_7_16",
            () -> new Keep_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> L_7_16 = registerBlock("l_7_16",
            () -> new L_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LANE_0_7_16 = registerBlock("lane_0_7_16",
            () -> new Lane_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LANE_1_7_16 = registerBlock("lane_1_7_16",
            () -> new Lane_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LEFT_0_7_16 = registerBlock("left_0_7_16",
            () -> new Left_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LEFT_1_7_16 = registerBlock("left_1_7_16",
            () -> new Left_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER0_7_16 = registerBlock("letter0_7_16",
            () -> new Letter0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER1_7_16 = registerBlock("letter1_7_16",
            () -> new Letter1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER2_7_16 = registerBlock("letter2_7_16",
            () -> new Letter2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER3_7_16 = registerBlock("letter3_7_16",
            () -> new Letter3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER4_7_16 = registerBlock("letter4_7_16",
            () -> new Letter4_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER5_7_16 = registerBlock("letter5_7_16",
            () -> new Letter5_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER6_7_16 = registerBlock("letter6_7_16",
            () -> new Letter6_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER7_7_16 = registerBlock("letter7_7_16",
            () -> new Letter7_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER8_7_16 = registerBlock("letter8_7_16",
            () -> new Letter8_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER9_7_16 = registerBlock("letter9_7_16",
            () -> new Letter9_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_7_16 = registerBlock("lineedgethick_0_7_16",
            () -> new LineEdgeThick_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_7_16 = registerBlock("lineedgethick_1_7_16",
            () -> new LineEdgeThick_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_7_16 = registerBlock("lineedgethick_2_7_16",
            () -> new LineEdgeThick_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_7_16 = registerBlock("lineedgethick_3_7_16",
            () -> new LineEdgeThick_3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_7_16 = registerBlock("lineedge_1_7_16",
            () -> new LineEdge_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_7_16 = registerBlock("lineedge_2_7_16",
            () -> new LineEdge_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_7_16 = registerBlock("lineedge_3_7_16",
            () -> new LineEdge_3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_7_16 = registerBlock("linemiddledash_7_16",
            () -> new LineMiddleDash_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_7_16 = registerBlock("linemiddlehalf_7_16",
            () -> new LineMiddleHalf_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_7_16 = registerBlock("linemiddleshort_7_16",
            () -> new LineMiddleShort_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_7_16 = registerBlock("lineside1_7_16",
            () -> new LineSide1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_7_16 = registerBlock("lineside2_7_16",
            () -> new LineSide2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_7_16 = registerBlock("lineside3_7_16",
            () -> new LineSide3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_7_16 = registerBlock("lineside4_7_16",
            () -> new LineSide4_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_7_16 = registerBlock("lineside5_7_16",
            () -> new LineSide5_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_7_16 = registerBlock("lineside6_7_16",
            () -> new LineSide6_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_7_16 = registerBlock("linesidedoublethick_0_7_16",
            () -> new LineSideDoubleThick_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_7_16 = registerBlock("linesidedoublethick_1_7_16",
            () -> new LineSideDoubleThick_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_7_16 = registerBlock("linesidedouble_1_7_16",
            () -> new LineSideDouble_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_7_16 = registerBlock("linesidedouble_7_16",
            () -> new LineSideDouble_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_7_16 = registerBlock("linesidethick_0_7_16",
            () -> new LineSideThick_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_7_16 = registerBlock("linesidethick_1_7_16",
            () -> new LineSideThick_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_7_16 = registerBlock("linesidethick_2_7_16",
            () -> new LineSideThick_2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_7_16 = registerBlock("linesidethick_3_7_16",
            () -> new LineSideThick_3_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_7_16 = registerBlock("linesidethick_4_7_16",
            () -> new LineSideThick_4_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_7_16 = registerBlock("linesidethick_5_7_16",
            () -> new LineSideThick_5_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> M_7_16 = registerBlock("m_7_16",
            () -> new M_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> MERGE_0_7_16 = registerBlock("merge_0_7_16",
            () -> new Merge_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> MERGE_1_7_16 = registerBlock("merge_1_7_16",
            () -> new Merge_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> N_7_16 = registerBlock("n_7_16",
            () -> new N_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> NO_0_7_16 = registerBlock("no_0_7_16",
            () -> new No_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> NO_1_7_16 = registerBlock("no_1_7_16",
            () -> new No_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> O_7_16 = registerBlock("o_7_16",
            () -> new O_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ONLY_0_7_16 = registerBlock("only_0_7_16",
            () -> new Only_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> ONLY_1_7_16 = registerBlock("only_1_7_16",
            () -> new Only_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> P_7_16 = registerBlock("p_7_16",
            () -> new P_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_7_16 = registerBlock("pedestrian_7_16",
            () -> new Pedestrian_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> Q_7_16 = registerBlock("q_7_16",
            () -> new Q_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> QUESTION_7_16 = registerBlock("question_7_16",
            () -> new Question_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> R_7_16 = registerBlock("r_7_16",
            () -> new R_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_7_16 = registerBlock("right_0_7_16",
            () -> new Right_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_7_16 = registerBlock("right_1_7_16",
            () -> new Right_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> S_7_16 = registerBlock("s_7_16",
            () -> new S_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> SLASH_1_7_16 = registerBlock("slash_1_7_16",
            () -> new Slash_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> SLASH_7_16 = registerBlock("slash_7_16",
            () -> new Slash_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> SLOW_0_7_16 = registerBlock("slow_0_7_16",
            () -> new Slow_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> SLOW_1_7_16 = registerBlock("slow_1_7_16",
            () -> new Slow_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> STOP_0_7_16 = registerBlock("stop_0_7_16",
            () -> new Stop_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> STOP_1_7_16 = registerBlock("stop_1_7_16",
            () -> new Stop_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_7_16 = registerBlock("straight2d_7_16",
            () -> new Straight2D_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_7_16 = registerBlock("straight2i_7_16",
            () -> new Straight2I_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_7_16 = registerBlock("straight2t_7_16",
            () -> new Straight2T_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_7_16 = registerBlock("straight2_7_16",
            () -> new Straight2_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> T_7_16 = registerBlock("t_7_16",
            () -> new T_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> TAXI_0_7_16 = registerBlock("taxi_0_7_16",
            () -> new Taxi_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> TAXI_1_7_16 = registerBlock("taxi_1_7_16",
            () -> new Taxi_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> THICK2_D_7_16 = registerBlock("thick2_d_7_16",
            () -> new Thick2_D_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> THICK2_I_7_16 = registerBlock("thick2_i_7_16",
            () -> new Thick2_I_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> THICK2_T_7_16 = registerBlock("thick2_t_7_16",
            () -> new Thick2_T_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> THICKS_D_7_16 = registerBlock("thicks_d_7_16",
            () -> new ThickS_D_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> THICKS_I_7_16 = registerBlock("thicks_i_7_16",
            () -> new ThickS_I_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> THICKS_T_7_16 = registerBlock("thicks_t_7_16",
            () -> new ThickS_T_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_7_16 = registerBlock("thickstraight_7_16",
            () -> new ThickStraight_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> TOWN_0_7_16 = registerBlock("town_0_7_16",
            () -> new Town_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> TOWN_1_7_16 = registerBlock("town_1_7_16",
            () -> new Town_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> TURN_0_7_16 = registerBlock("turn_0_7_16",
            () -> new Turn_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> TURN_1_7_16 = registerBlock("turn_1_7_16",
            () -> new Turn_1_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> U_7_16 = registerBlock("u_7_16",
            () -> new U_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> V_7_16 = registerBlock("v_7_16",
            () -> new V_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> W_7_16 = registerBlock("w_7_16",
            () -> new W_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_7_16 = registerBlock("wheelchair_0_7_16",
            () -> new Wheelchair_0_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> X_7_16 = registerBlock("x_7_16",
            () -> new X_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> Y_7_16 = registerBlock("y_7_16",
            () -> new Y_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

    public static final RegistryObject<Block> Z_7_16 = registerBlock("z_7_16",
            () -> new Z_7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);

// 8_16 Road Paints



    public static final RegistryObject<Block> A_8_16 = registerBlock("a_8_16",
            () -> new A_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ARROW2_8_16 = registerBlock("arrow2_8_16",
            () -> new Arrow2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_8_16 = registerBlock("arrowline_1_8_16",
            () -> new ArrowLine_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_8_16 = registerBlock("arrowline_2_8_16",
            () -> new ArrowLine_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ARROW_3_8_16 = registerBlock("arrow_3_8_16",
            () -> new Arrow_3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_8_16 = registerBlock("arrowdiagonal2_8_16",
            () -> new Arrowdiagonal2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_8_16 = registerBlock("arrowdiagonal_8_16",
            () -> new ArrowDiagonal_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_8_16 = registerBlock("arrowline_0_8_16",
            () -> new Arrowline_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_8_16 = registerBlock("arrowline_3_8_16",
            () -> new Arrowline_3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> B_8_16 = registerBlock("b_8_16",
            () -> new B_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_8_16 = registerBlock("bikeicon_0_8_16",
            () -> new BikeIcon_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_8_16 = registerBlock("bikeicon_1_8_16",
            () -> new BikeIcon_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> BIKE_1_8_16 = registerBlock("bike_1_8_16",
            () -> new Bike_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> BIKE_8_16 = registerBlock("bike_8_16",
            () -> new Bike_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> BUS_0_8_16 = registerBlock("bus_0_8_16",
            () -> new Bus_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> BUS_1_8_16 = registerBlock("bus_1_8_16",
            () -> new Bus_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> C_8_16 = registerBlock("c_8_16",
            () -> new C_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_8_16 = registerBlock("centre_0_8_16",
            () -> new Centre_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_8_16 = registerBlock("centre_1_8_16",
            () -> new Centre_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_8_16 = registerBlock("chevronright_a_0_8_16",
            () -> new ChevronRight_A_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_8_16 = registerBlock("chevronright_a_thin_0_8_16",
            () -> new ChevronRight_A_Thin_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_8_16 = registerBlock("chevron_0_8_16",
            () -> new Chevron_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_8_16 = registerBlock("chevron_left_a_8_16",
            () -> new Chevron_Left_A_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_8_16 = registerBlock("chevron_left_a_thin_8_16",
            () -> new Chevron_Left_A_Thin_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_8_16 = registerBlock("chevron_mid_0_8_16",
            () -> new Chevron_Mid_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_8_16 = registerBlock("chevron_mid_1_8_16",
            () -> new Chevron_Mid_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_8_16 = registerBlock("chevron_mid_left_8_16",
            () -> new Chevron_Mid_Left_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_8_16 = registerBlock("chevron_mid_left_thin_8_16",
            () -> new Chevron_Mid_Left_Thin_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_8_16 = registerBlock("chevron_mid_right_0_8_16",
            () -> new Chevron_Mid_Right_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_8_16 = registerBlock("chevron_mid_right_1_8_16",
            () -> new Chevron_Mid_Right_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_8_16 = registerBlock("chevron_side_line_0_8_16",
            () -> new Chevron_Side_Line_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CITY_0_8_16 = registerBlock("city_0_8_16",
            () -> new City_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CITY_1_8_16 = registerBlock("city_1_8_16",
            () -> new City_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_8_16 = registerBlock("clear_0_8_16",
            () -> new Clear_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_8_16 = registerBlock("clear_1_8_16",
            () -> new Clear_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_8_16 = registerBlock("crossingdiagonal_0_8_16",
            () -> new CrossingDiagonal_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_8_16 = registerBlock("crossingdiagonal_1_8_16",
            () -> new CrossingDiagonal_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_8_16 = registerBlock("crossingdiagonal_2_8_16",
            () -> new CrossingDiagonal_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_8_16 = registerBlock("crossingdiagonal_3_8_16",
            () -> new CrossingDiagonal_3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_8_16 = registerBlock("crossingpaint_0_8_16",
            () -> new CrossingPaint_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_8_16 = registerBlock("crossingpaint_1_8_16",
            () -> new CrossingPaint_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_8_16 = registerBlock("crossingpaint_2_8_16",
            () -> new CrossingPaint_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> D_8_16 = registerBlock("d_8_16",
            () -> new D_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_8_16 = registerBlock("diagonalcrossing_8_16",
            () -> new DiagonalCrossing_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> E_8_16 = registerBlock("e_8_16",
            () -> new E_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_8_16 = registerBlock("entry_0_8_16",
            () -> new Entry_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_8_16 = registerBlock("entry_1_8_16",
            () -> new Entry_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_8_16 = registerBlock("exclamation_8_16",
            () -> new Exclamation_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> F_8_16 = registerBlock("f_8_16",
            () -> new F_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> G_8_16 = registerBlock("g_8_16",
            () -> new G_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_8_16 = registerBlock("giveway_0_8_16",
            () -> new GiveWay_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> H_8_16 = registerBlock("h_8_16",
            () -> new H_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> HASHTAG_8_16 = registerBlock("hashtag_8_16",
            () -> new Hashtag_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_8_16 = registerBlock("hatchbox_8_16",
            () -> new Hatchbox_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> I_8_16 = registerBlock("i_8_16",
            () -> new I_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> J_8_16 = registerBlock("j_8_16",
            () -> new J_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_8_16 = registerBlock("junction_a_0_8_16",
            () -> new Junction_A_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_8_16 = registerBlock("junction_a_1_8_16",
            () -> new Junction_A_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_8_16 = registerBlock("junction_a_2_8_16",
            () -> new Junction_A_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_8_16 = registerBlock("junction_b_0_8_16",
            () -> new Junction_B_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_8_16 = registerBlock("junction_b_1_8_16",
            () -> new Junction_B_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_8_16 = registerBlock("junction_b_2_8_16",
            () -> new Junction_B_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_8_16 = registerBlock("junction_filter_left_0_8_16",
            () -> new Junction_Filter_Left_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_8_16 = registerBlock("junction_filter_left_empty_0_8_16",
            () -> new Junction_Filter_Left_Empty_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_8_16 = registerBlock("junction_filter_left_thin_0_8_16",
            () -> new Junction_Filter_Left_Thin_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_8_16 = registerBlock("junction_filter_right_0_8_16",
            () -> new Junction_Filter_Right_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_8_16 = registerBlock("junction_filter_right_empty_0_8_16",
            () -> new Junction_Filter_Right_Empty_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_8_16 = registerBlock("junction_filter_right_thin_0_8_16",
            () -> new Junction_Filter_Right_Thin_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_8_16 = registerBlock("junction_fork_chevron_mid_0_8_16",
            () -> new Junction_Fork_Chevron_Mid_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_8_16 = registerBlock("junction_fork_chevron_mid_thin_0_8_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_8_16 = registerBlock("junction_fork_mid_0_8_16",
            () -> new Junction_Fork_Mid_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_8_16 = registerBlock("junction_fork_mid_0_thin_8_16",
            () -> new Junction_Fork_Mid_0_Thin_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_8_16 = registerBlock("junction_mid_line_connection_1_8_16",
            () -> new Junction_Mid_Line_Connection_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_8_16 = registerBlock("junction_mid_line_connection_2_8_16",
            () -> new Junction_Mid_Line_Connection_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_8_16 = registerBlock("junction_mid_line_connection_3_8_16",
            () -> new Junction_Mid_Line_Connection_3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_8_16 = registerBlock("junction_mid_line_connection_8_16",
            () -> new Junction_Mid_Line_Connection_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_8_16 = registerBlock("junction_side_line_connection_0_8_16",
            () -> new Junction_Side_Line_Connection_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_8_16 = registerBlock("junction_side_line_connection_1_8_16",
            () -> new Junction_Side_Line_Connection_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_8_16 = registerBlock("junction_side_line_connection_2_8_16",
            () -> new Junction_Side_Line_Connection_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_8_16 = registerBlock("junction_side_line_connection_3_8_16",
            () -> new Junction_Side_Line_Connection_3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_8_16 = registerBlock("junction_side_line_connection_thick_0_8_16",
            () -> new Junction_Side_Line_Connection_Thick_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_8_16 = registerBlock("junction_side_line_connection_thick_1_8_16",
            () -> new Junction_Side_Line_Connection_Thick_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_8_16 = registerBlock("junction_side_line_connection_thick_2_8_16",
            () -> new Junction_Side_Line_Connection_Thick_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_8_16 = registerBlock("junction_side_line_connection_thick_3_8_16",
            () -> new Junction_Side_Line_Connection_Thick_3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_8_16 = registerBlock("junction_side_line_connection_thin_0_8_16",
            () -> new Junction_Side_Line_Connection_Thin_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_8_16 = registerBlock("junction_side_line_connection_thin_1_8_16",
            () -> new Junction_Side_Line_Connection_Thin_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_8_16 = registerBlock("junction_side_line_connection_thin_2_8_16",
            () -> new Junction_Side_Line_Connection_Thin_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_8_16 = registerBlock("junction_side_line_thin_3_8_16",
            () -> new Junction_Side_Line_Thin_3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_8_16 = registerBlock("junction_side_line_connection_thin_3_8_16",
            () -> new Junction_side_line_connection_thin_3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> K_8_16 = registerBlock("k_8_16",
            () -> new K_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> KEEP_0_8_16 = registerBlock("keep_0_8_16",
            () -> new Keep_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> KEEP_1_8_16 = registerBlock("keep_1_8_16",
            () -> new Keep_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> L_8_16 = registerBlock("l_8_16",
            () -> new L_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LANE_0_8_16 = registerBlock("lane_0_8_16",
            () -> new Lane_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LANE_1_8_16 = registerBlock("lane_1_8_16",
            () -> new Lane_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LEFT_0_8_16 = registerBlock("left_0_8_16",
            () -> new Left_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LEFT_1_8_16 = registerBlock("left_1_8_16",
            () -> new Left_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LETTER0_8_16 = registerBlock("letter0_8_16",
            () -> new Letter0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LETTER1_8_16 = registerBlock("letter1_8_16",
            () -> new Letter1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LETTER2_8_16 = registerBlock("letter2_8_16",
            () -> new Letter2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LETTER3_8_16 = registerBlock("letter3_8_16",
            () -> new Letter3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LETTER4_8_16 = registerBlock("letter4_8_16",
            () -> new Letter4_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LETTER5_8_16 = registerBlock("letter5_8_16",
            () -> new Letter5_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LETTER6_8_16 = registerBlock("letter6_8_16",
            () -> new Letter6_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LETTER7_8_16 = registerBlock("letter7_8_16",
            () -> new Letter7_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LETTER8_8_16 = registerBlock("letter8_8_16",
            () -> new Letter8_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LETTER9_8_16 = registerBlock("letter9_8_16",
            () -> new Letter9_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_8_16 = registerBlock("lineedgethick_0_8_16",
            () -> new LineEdgeThick_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_8_16 = registerBlock("lineedgethick_1_8_16",
            () -> new LineEdgeThick_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_8_16 = registerBlock("lineedgethick_2_8_16",
            () -> new LineEdgeThick_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_8_16 = registerBlock("lineedgethick_3_8_16",
            () -> new LineEdgeThick_3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_8_16 = registerBlock("lineedge_1_8_16",
            () -> new LineEdge_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_8_16 = registerBlock("lineedge_2_8_16",
            () -> new LineEdge_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_8_16 = registerBlock("lineedge_3_8_16",
            () -> new LineEdge_3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_8_16 = registerBlock("linemiddledash_8_16",
            () -> new LineMiddleDash_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_8_16 = registerBlock("linemiddlehalf_8_16",
            () -> new LineMiddleHalf_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_8_16 = registerBlock("linemiddleshort_8_16",
            () -> new LineMiddleShort_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_8_16 = registerBlock("lineside1_8_16",
            () -> new LineSide1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_8_16 = registerBlock("lineside2_8_16",
            () -> new LineSide2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_8_16 = registerBlock("lineside3_8_16",
            () -> new LineSide3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_8_16 = registerBlock("lineside4_8_16",
            () -> new LineSide4_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_8_16 = registerBlock("lineside5_8_16",
            () -> new LineSide5_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_8_16 = registerBlock("lineside6_8_16",
            () -> new LineSide6_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_8_16 = registerBlock("linesidedoublethick_0_8_16",
            () -> new LineSideDoubleThick_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_8_16 = registerBlock("linesidedoublethick_1_8_16",
            () -> new LineSideDoubleThick_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_8_16 = registerBlock("linesidedouble_1_8_16",
            () -> new LineSideDouble_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_8_16 = registerBlock("linesidedouble_8_16",
            () -> new LineSideDouble_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_8_16 = registerBlock("linesidethick_0_8_16",
            () -> new LineSideThick_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_8_16 = registerBlock("linesidethick_1_8_16",
            () -> new LineSideThick_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_8_16 = registerBlock("linesidethick_2_8_16",
            () -> new LineSideThick_2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_8_16 = registerBlock("linesidethick_3_8_16",
            () -> new LineSideThick_3_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_8_16 = registerBlock("linesidethick_4_8_16",
            () -> new LineSideThick_4_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_8_16 = registerBlock("linesidethick_5_8_16",
            () -> new LineSideThick_5_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> M_8_16 = registerBlock("m_8_16",
            () -> new M_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> MERGE_0_8_16 = registerBlock("merge_0_8_16",
            () -> new Merge_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> MERGE_1_8_16 = registerBlock("merge_1_8_16",
            () -> new Merge_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> N_8_16 = registerBlock("n_8_16",
            () -> new N_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> NO_0_8_16 = registerBlock("no_0_8_16",
            () -> new No_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> NO_1_8_16 = registerBlock("no_1_8_16",
            () -> new No_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> O_8_16 = registerBlock("o_8_16",
            () -> new O_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ONLY_0_8_16 = registerBlock("only_0_8_16",
            () -> new Only_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> ONLY_1_8_16 = registerBlock("only_1_8_16",
            () -> new Only_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> P_8_16 = registerBlock("p_8_16",
            () -> new P_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_8_16 = registerBlock("pedestrian_8_16",
            () -> new Pedestrian_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> Q_8_16 = registerBlock("q_8_16",
            () -> new Q_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> QUESTION_8_16 = registerBlock("question_8_16",
            () -> new Question_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> R_8_16 = registerBlock("r_8_16",
            () -> new R_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_8_16 = registerBlock("right_0_8_16",
            () -> new Right_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_8_16 = registerBlock("right_1_8_16",
            () -> new Right_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> S_8_16 = registerBlock("s_8_16",
            () -> new S_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> SLASH_1_8_16 = registerBlock("slash_1_8_16",
            () -> new Slash_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> SLASH_8_16 = registerBlock("slash_8_16",
            () -> new Slash_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> SLOW_0_8_16 = registerBlock("slow_0_8_16",
            () -> new Slow_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> SLOW_1_8_16 = registerBlock("slow_1_8_16",
            () -> new Slow_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> STOP_0_8_16 = registerBlock("stop_0_8_16",
            () -> new Stop_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> STOP_1_8_16 = registerBlock("stop_1_8_16",
            () -> new Stop_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_8_16 = registerBlock("straight2d_8_16",
            () -> new Straight2D_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_8_16 = registerBlock("straight2i_8_16",
            () -> new Straight2I_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_8_16 = registerBlock("straight2t_8_16",
            () -> new Straight2T_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_8_16 = registerBlock("straight2_8_16",
            () -> new Straight2_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> T_8_16 = registerBlock("t_8_16",
            () -> new T_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> TAXI_0_8_16 = registerBlock("taxi_0_8_16",
            () -> new Taxi_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> TAXI_1_8_16 = registerBlock("taxi_1_8_16",
            () -> new Taxi_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> THICK2_D_8_16 = registerBlock("thick2_d_8_16",
            () -> new Thick2_D_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> THICK2_I_8_16 = registerBlock("thick2_i_8_16",
            () -> new Thick2_I_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> THICK2_T_8_16 = registerBlock("thick2_t_8_16",
            () -> new Thick2_T_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> THICKS_D_8_16 = registerBlock("thicks_d_8_16",
            () -> new ThickS_D_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> THICKS_I_8_16 = registerBlock("thicks_i_8_16",
            () -> new ThickS_I_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> THICKS_T_8_16 = registerBlock("thicks_t_8_16",
            () -> new ThickS_T_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_8_16 = registerBlock("thickstraight_8_16",
            () -> new ThickStraight_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> TOWN_0_8_16 = registerBlock("town_0_8_16",
            () -> new Town_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> TOWN_1_8_16 = registerBlock("town_1_8_16",
            () -> new Town_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> TURN_0_8_16 = registerBlock("turn_0_8_16",
            () -> new Turn_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> TURN_1_8_16 = registerBlock("turn_1_8_16",
            () -> new Turn_1_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> U_8_16 = registerBlock("u_8_16",
            () -> new U_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> V_8_16 = registerBlock("v_8_16",
            () -> new V_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> W_8_16 = registerBlock("w_8_16",
            () -> new W_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_8_16 = registerBlock("wheelchair_0_8_16",
            () -> new Wheelchair_0_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> X_8_16 = registerBlock("x_8_16",
            () -> new X_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> Y_8_16 = registerBlock("y_8_16",
            () -> new Y_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

    public static final RegistryObject<Block> Z_8_16 = registerBlock("z_8_16",
            () -> new Z_8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);

// 9_16 Road Paints


    public static final RegistryObject<Block> A_9_16 = registerBlock("a_9_16",
            () -> new A_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ARROW2_9_16 = registerBlock("arrow2_9_16",
            () -> new Arrow2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_9_16 = registerBlock("arrowline_1_9_16",
            () -> new ArrowLine_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_9_16 = registerBlock("arrowline_2_9_16",
            () -> new ArrowLine_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ARROW_3_9_16 = registerBlock("arrow_3_9_16",
            () -> new Arrow_3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_9_16 = registerBlock("arrowdiagonal2_9_16",
            () -> new Arrowdiagonal2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_9_16 = registerBlock("arrowdiagonal_9_16",
            () -> new ArrowDiagonal_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_9_16 = registerBlock("arrowline_0_9_16",
            () -> new Arrowline_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_9_16 = registerBlock("arrowline_3_9_16",
            () -> new Arrowline_3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> B_9_16 = registerBlock("b_9_16",
            () -> new B_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_9_16 = registerBlock("bikeicon_0_9_16",
            () -> new BikeIcon_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_9_16 = registerBlock("bikeicon_1_9_16",
            () -> new BikeIcon_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> BIKE_1_9_16 = registerBlock("bike_1_9_16",
            () -> new Bike_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> BIKE_9_16 = registerBlock("bike_9_16",
            () -> new Bike_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> BUS_0_9_16 = registerBlock("bus_0_9_16",
            () -> new Bus_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> BUS_1_9_16 = registerBlock("bus_1_9_16",
            () -> new Bus_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> C_9_16 = registerBlock("c_9_16",
            () -> new C_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_9_16 = registerBlock("centre_0_9_16",
            () -> new Centre_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_9_16 = registerBlock("centre_1_9_16",
            () -> new Centre_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_9_16 = registerBlock("chevronright_a_0_9_16",
            () -> new ChevronRight_A_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_9_16 = registerBlock("chevronright_a_thin_0_9_16",
            () -> new ChevronRight_A_Thin_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_9_16 = registerBlock("chevron_0_9_16",
            () -> new Chevron_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_9_16 = registerBlock("chevron_left_a_9_16",
            () -> new Chevron_Left_A_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_9_16 = registerBlock("chevron_left_a_thin_9_16",
            () -> new Chevron_Left_A_Thin_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_9_16 = registerBlock("chevron_mid_0_9_16",
            () -> new Chevron_Mid_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_9_16 = registerBlock("chevron_mid_1_9_16",
            () -> new Chevron_Mid_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_9_16 = registerBlock("chevron_mid_left_9_16",
            () -> new Chevron_Mid_Left_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_9_16 = registerBlock("chevron_mid_left_thin_9_16",
            () -> new Chevron_Mid_Left_Thin_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_9_16 = registerBlock("chevron_mid_right_0_9_16",
            () -> new Chevron_Mid_Right_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_9_16 = registerBlock("chevron_mid_right_1_9_16",
            () -> new Chevron_Mid_Right_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_9_16 = registerBlock("chevron_side_line_0_9_16",
            () -> new Chevron_Side_Line_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CITY_0_9_16 = registerBlock("city_0_9_16",
            () -> new City_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CITY_1_9_16 = registerBlock("city_1_9_16",
            () -> new City_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_9_16 = registerBlock("clear_0_9_16",
            () -> new Clear_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_9_16 = registerBlock("clear_1_9_16",
            () -> new Clear_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_9_16 = registerBlock("crossingdiagonal_0_9_16",
            () -> new CrossingDiagonal_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_9_16 = registerBlock("crossingdiagonal_1_9_16",
            () -> new CrossingDiagonal_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_9_16 = registerBlock("crossingdiagonal_2_9_16",
            () -> new CrossingDiagonal_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_9_16 = registerBlock("crossingdiagonal_3_9_16",
            () -> new CrossingDiagonal_3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_9_16 = registerBlock("crossingpaint_0_9_16",
            () -> new CrossingPaint_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_9_16 = registerBlock("crossingpaint_1_9_16",
            () -> new CrossingPaint_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_9_16 = registerBlock("crossingpaint_2_9_16",
            () -> new CrossingPaint_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> D_9_16 = registerBlock("d_9_16",
            () -> new D_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_9_16 = registerBlock("diagonalcrossing_9_16",
            () -> new DiagonalCrossing_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> E_9_16 = registerBlock("e_9_16",
            () -> new E_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_9_16 = registerBlock("entry_0_9_16",
            () -> new Entry_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_9_16 = registerBlock("entry_1_9_16",
            () -> new Entry_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_9_16 = registerBlock("exclamation_9_16",
            () -> new Exclamation_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> F_9_16 = registerBlock("f_9_16",
            () -> new F_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> G_9_16 = registerBlock("g_9_16",
            () -> new G_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_9_16 = registerBlock("giveway_0_9_16",
            () -> new GiveWay_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> H_9_16 = registerBlock("h_9_16",
            () -> new H_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> HASHTAG_9_16 = registerBlock("hashtag_9_16",
            () -> new Hashtag_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_9_16 = registerBlock("hatchbox_9_16",
            () -> new Hatchbox_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> I_9_16 = registerBlock("i_9_16",
            () -> new I_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> J_9_16 = registerBlock("j_9_16",
            () -> new J_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_9_16 = registerBlock("junction_a_0_9_16",
            () -> new Junction_A_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_9_16 = registerBlock("junction_a_1_9_16",
            () -> new Junction_A_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_9_16 = registerBlock("junction_a_2_9_16",
            () -> new Junction_A_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_9_16 = registerBlock("junction_b_0_9_16",
            () -> new Junction_B_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_9_16 = registerBlock("junction_b_1_9_16",
            () -> new Junction_B_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_9_16 = registerBlock("junction_b_2_9_16",
            () -> new Junction_B_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_9_16 = registerBlock("junction_filter_left_0_9_16",
            () -> new Junction_Filter_Left_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_9_16 = registerBlock("junction_filter_left_empty_0_9_16",
            () -> new Junction_Filter_Left_Empty_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_9_16 = registerBlock("junction_filter_left_thin_0_9_16",
            () -> new Junction_Filter_Left_Thin_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_9_16 = registerBlock("junction_filter_right_0_9_16",
            () -> new Junction_Filter_Right_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_9_16 = registerBlock("junction_filter_right_empty_0_9_16",
            () -> new Junction_Filter_Right_Empty_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_9_16 = registerBlock("junction_filter_right_thin_0_9_16",
            () -> new Junction_Filter_Right_Thin_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_9_16 = registerBlock("junction_fork_chevron_mid_0_9_16",
            () -> new Junction_Fork_Chevron_Mid_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_9_16 = registerBlock("junction_fork_chevron_mid_thin_0_9_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_9_16 = registerBlock("junction_fork_mid_0_9_16",
            () -> new Junction_Fork_Mid_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_9_16 = registerBlock("junction_fork_mid_0_thin_9_16",
            () -> new Junction_Fork_Mid_0_Thin_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_9_16 = registerBlock("junction_mid_line_connection_1_9_16",
            () -> new Junction_Mid_Line_Connection_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_9_16 = registerBlock("junction_mid_line_connection_2_9_16",
            () -> new Junction_Mid_Line_Connection_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_9_16 = registerBlock("junction_mid_line_connection_3_9_16",
            () -> new Junction_Mid_Line_Connection_3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_9_16 = registerBlock("junction_mid_line_connection_9_16",
            () -> new Junction_Mid_Line_Connection_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_9_16 = registerBlock("junction_side_line_connection_0_9_16",
            () -> new Junction_Side_Line_Connection_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_9_16 = registerBlock("junction_side_line_connection_1_9_16",
            () -> new Junction_Side_Line_Connection_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_9_16 = registerBlock("junction_side_line_connection_2_9_16",
            () -> new Junction_Side_Line_Connection_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_9_16 = registerBlock("junction_side_line_connection_3_9_16",
            () -> new Junction_Side_Line_Connection_3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_9_16 = registerBlock("junction_side_line_connection_thick_0_9_16",
            () -> new Junction_Side_Line_Connection_Thick_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_9_16 = registerBlock("junction_side_line_connection_thick_1_9_16",
            () -> new Junction_Side_Line_Connection_Thick_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_9_16 = registerBlock("junction_side_line_connection_thick_2_9_16",
            () -> new Junction_Side_Line_Connection_Thick_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_9_16 = registerBlock("junction_side_line_connection_thick_3_9_16",
            () -> new Junction_Side_Line_Connection_Thick_3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_9_16 = registerBlock("junction_side_line_connection_thin_0_9_16",
            () -> new Junction_Side_Line_Connection_Thin_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_9_16 = registerBlock("junction_side_line_connection_thin_1_9_16",
            () -> new Junction_Side_Line_Connection_Thin_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_9_16 = registerBlock("junction_side_line_connection_thin_2_9_16",
            () -> new Junction_Side_Line_Connection_Thin_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_9_16 = registerBlock("junction_side_line_thin_3_9_16",
            () -> new Junction_Side_Line_Thin_3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_9_16 = registerBlock("junction_side_line_connection_thin_3_9_16",
            () -> new Junction_side_line_connection_thin_3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> K_9_16 = registerBlock("k_9_16",
            () -> new K_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> KEEP_0_9_16 = registerBlock("keep_0_9_16",
            () -> new Keep_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> KEEP_1_9_16 = registerBlock("keep_1_9_16",
            () -> new Keep_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> L_9_16 = registerBlock("l_9_16",
            () -> new L_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LANE_0_9_16 = registerBlock("lane_0_9_16",
            () -> new Lane_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LANE_1_9_16 = registerBlock("lane_1_9_16",
            () -> new Lane_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LEFT_0_9_16 = registerBlock("left_0_9_16",
            () -> new Left_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LEFT_1_9_16 = registerBlock("left_1_9_16",
            () -> new Left_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LETTER0_9_16 = registerBlock("letter0_9_16",
            () -> new Letter0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LETTER1_9_16 = registerBlock("letter1_9_16",
            () -> new Letter1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LETTER2_9_16 = registerBlock("letter2_9_16",
            () -> new Letter2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LETTER3_9_16 = registerBlock("letter3_9_16",
            () -> new Letter3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LETTER4_9_16 = registerBlock("letter4_9_16",
            () -> new Letter4_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LETTER5_9_16 = registerBlock("letter5_9_16",
            () -> new Letter5_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LETTER6_9_16 = registerBlock("letter6_9_16",
            () -> new Letter6_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LETTER7_9_16 = registerBlock("letter7_9_16",
            () -> new Letter7_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LETTER8_9_16 = registerBlock("letter8_9_16",
            () -> new Letter8_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LETTER9_9_16 = registerBlock("letter9_9_16",
            () -> new Letter9_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_9_16 = registerBlock("lineedgethick_0_9_16",
            () -> new LineEdgeThick_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_9_16 = registerBlock("lineedgethick_1_9_16",
            () -> new LineEdgeThick_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_9_16 = registerBlock("lineedgethick_2_9_16",
            () -> new LineEdgeThick_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_9_16 = registerBlock("lineedgethick_3_9_16",
            () -> new LineEdgeThick_3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_9_16 = registerBlock("lineedge_1_9_16",
            () -> new LineEdge_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_9_16 = registerBlock("lineedge_2_9_16",
            () -> new LineEdge_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_9_16 = registerBlock("lineedge_3_9_16",
            () -> new LineEdge_3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_9_16 = registerBlock("linemiddledash_9_16",
            () -> new LineMiddleDash_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_9_16 = registerBlock("linemiddlehalf_9_16",
            () -> new LineMiddleHalf_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_9_16 = registerBlock("linemiddleshort_9_16",
            () -> new LineMiddleShort_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_9_16 = registerBlock("lineside1_9_16",
            () -> new LineSide1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_9_16 = registerBlock("lineside2_9_16",
            () -> new LineSide2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_9_16 = registerBlock("lineside3_9_16",
            () -> new LineSide3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_9_16 = registerBlock("lineside4_9_16",
            () -> new LineSide4_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_9_16 = registerBlock("lineside5_9_16",
            () -> new LineSide5_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_9_16 = registerBlock("lineside6_9_16",
            () -> new LineSide6_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_9_16 = registerBlock("linesidedoublethick_0_9_16",
            () -> new LineSideDoubleThick_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_9_16 = registerBlock("linesidedoublethick_1_9_16",
            () -> new LineSideDoubleThick_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_9_16 = registerBlock("linesidedouble_1_9_16",
            () -> new LineSideDouble_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_9_16 = registerBlock("linesidedouble_9_16",
            () -> new LineSideDouble_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_9_16 = registerBlock("linesidethick_0_9_16",
            () -> new LineSideThick_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_9_16 = registerBlock("linesidethick_1_9_16",
            () -> new LineSideThick_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_9_16 = registerBlock("linesidethick_2_9_16",
            () -> new LineSideThick_2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_9_16 = registerBlock("linesidethick_3_9_16",
            () -> new LineSideThick_3_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_9_16 = registerBlock("linesidethick_4_9_16",
            () -> new LineSideThick_4_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_9_16 = registerBlock("linesidethick_5_9_16",
            () -> new LineSideThick_5_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> M_9_16 = registerBlock("m_9_16",
            () -> new M_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> MERGE_0_9_16 = registerBlock("merge_0_9_16",
            () -> new Merge_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> MERGE_1_9_16 = registerBlock("merge_1_9_16",
            () -> new Merge_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> N_9_16 = registerBlock("n_9_16",
            () -> new N_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> NO_0_9_16 = registerBlock("no_0_9_16",
            () -> new No_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> NO_1_9_16 = registerBlock("no_1_9_16",
            () -> new No_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> O_9_16 = registerBlock("o_9_16",
            () -> new O_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ONLY_0_9_16 = registerBlock("only_0_9_16",
            () -> new Only_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> ONLY_1_9_16 = registerBlock("only_1_9_16",
            () -> new Only_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> P_9_16 = registerBlock("p_9_16",
            () -> new P_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_9_16 = registerBlock("pedestrian_9_16",
            () -> new Pedestrian_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> Q_9_16 = registerBlock("q_9_16",
            () -> new Q_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> QUESTION_9_16 = registerBlock("question_9_16",
            () -> new Question_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> R_9_16 = registerBlock("r_9_16",
            () -> new R_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_9_16 = registerBlock("right_0_9_16",
            () -> new Right_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_9_16 = registerBlock("right_1_9_16",
            () -> new Right_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> S_9_16 = registerBlock("s_9_16",
            () -> new S_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> SLASH_1_9_16 = registerBlock("slash_1_9_16",
            () -> new Slash_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> SLASH_9_16 = registerBlock("slash_9_16",
            () -> new Slash_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> SLOW_0_9_16 = registerBlock("slow_0_9_16",
            () -> new Slow_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> SLOW_1_9_16 = registerBlock("slow_1_9_16",
            () -> new Slow_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> STOP_0_9_16 = registerBlock("stop_0_9_16",
            () -> new Stop_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> STOP_1_9_16 = registerBlock("stop_1_9_16",
            () -> new Stop_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_9_16 = registerBlock("straight2d_9_16",
            () -> new Straight2D_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_9_16 = registerBlock("straight2i_9_16",
            () -> new Straight2I_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_9_16 = registerBlock("straight2t_9_16",
            () -> new Straight2T_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_9_16 = registerBlock("straight2_9_16",
            () -> new Straight2_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> T_9_16 = registerBlock("t_9_16",
            () -> new T_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> TAXI_0_9_16 = registerBlock("taxi_0_9_16",
            () -> new Taxi_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> TAXI_1_9_16 = registerBlock("taxi_1_9_16",
            () -> new Taxi_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> THICK2_D_9_16 = registerBlock("thick2_d_9_16",
            () -> new Thick2_D_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> THICK2_I_9_16 = registerBlock("thick2_i_9_16",
            () -> new Thick2_I_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> THICK2_T_9_16 = registerBlock("thick2_t_9_16",
            () -> new Thick2_T_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> THICKS_D_9_16 = registerBlock("thicks_d_9_16",
            () -> new ThickS_D_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> THICKS_I_9_16 = registerBlock("thicks_i_9_16",
            () -> new ThickS_I_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> THICKS_T_9_16 = registerBlock("thicks_t_9_16",
            () -> new ThickS_T_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_9_16 = registerBlock("thickstraight_9_16",
            () -> new ThickStraight_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> TOWN_0_9_16 = registerBlock("town_0_9_16",
            () -> new Town_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> TOWN_1_9_16 = registerBlock("town_1_9_16",
            () -> new Town_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> TURN_0_9_16 = registerBlock("turn_0_9_16",
            () -> new Turn_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> TURN_1_9_16 = registerBlock("turn_1_9_16",
            () -> new Turn_1_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> U_9_16 = registerBlock("u_9_16",
            () -> new U_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> V_9_16 = registerBlock("v_9_16",
            () -> new V_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> W_9_16 = registerBlock("w_9_16",
            () -> new W_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_9_16 = registerBlock("wheelchair_0_9_16",
            () -> new Wheelchair_0_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> X_9_16 = registerBlock("x_9_16",
            () -> new X_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> Y_9_16 = registerBlock("y_9_16",
            () -> new Y_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

    public static final RegistryObject<Block> Z_9_16 = registerBlock("z_9_16",
            () -> new Z_9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

// 10_16 Road Paints



    public static final RegistryObject<Block> A_10_16 = registerBlock("a_10_16",
            () -> new A_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ARROW2_10_16 = registerBlock("arrow2_10_16",
            () -> new Arrow2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_10_16 = registerBlock("arrowline_1_10_16",
            () -> new ArrowLine_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_10_16 = registerBlock("arrowline_2_10_16",
            () -> new ArrowLine_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ARROW_3_10_16 = registerBlock("arrow_3_10_16",
            () -> new Arrow_3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_10_16 = registerBlock("arrowdiagonal2_10_16",
            () -> new Arrowdiagonal2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_10_16 = registerBlock("arrowdiagonal_10_16",
            () -> new ArrowDiagonal_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_10_16 = registerBlock("arrowline_0_10_16",
            () -> new Arrowline_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_10_16 = registerBlock("arrowline_3_10_16",
            () -> new Arrowline_3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> B_10_16 = registerBlock("b_10_16",
            () -> new B_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_10_16 = registerBlock("bikeicon_0_10_16",
            () -> new BikeIcon_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_10_16 = registerBlock("bikeicon_1_10_16",
            () -> new BikeIcon_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> BIKE_10_16 = registerBlock("bike_10_16",
            () -> new Bike_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> BIKE_1_10_16 = registerBlock("bike_1_10_16",
            () -> new Bike_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> BUS_0_10_16 = registerBlock("bus_0_10_16",
            () -> new Bus_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> BUS_1_10_16 = registerBlock("bus_1_10_16",
            () -> new Bus_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> C_10_16 = registerBlock("c_10_16",
            () -> new C_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_10_16 = registerBlock("centre_0_10_16",
            () -> new Centre_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_10_16 = registerBlock("centre_1_10_16",
            () -> new Centre_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_10_16 = registerBlock("chevronright_a_0_10_16",
            () -> new ChevronRight_A_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_10_16 = registerBlock("chevronright_a_thin_0_10_16",
            () -> new ChevronRight_A_Thin_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_10_16 = registerBlock("chevron_0_10_16",
            () -> new Chevron_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_10_16 = registerBlock("chevron_left_a_10_16",
            () -> new Chevron_Left_A_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_10_16 = registerBlock("chevron_left_a_thin_10_16",
            () -> new Chevron_Left_A_Thin_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_10_16 = registerBlock("chevron_mid_0_10_16",
            () -> new Chevron_Mid_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_10_16 = registerBlock("chevron_mid_1_10_16",
            () -> new Chevron_Mid_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_10_16 = registerBlock("chevron_mid_left_10_16",
            () -> new Chevron_Mid_Left_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_10_16 = registerBlock("chevron_mid_left_thin_10_16",
            () -> new Chevron_Mid_Left_Thin_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_10_16 = registerBlock("chevron_mid_right_0_10_16",
            () -> new Chevron_Mid_Right_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_10_16 = registerBlock("chevron_mid_right_1_10_16",
            () -> new Chevron_Mid_Right_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_10_16 = registerBlock("chevron_side_line_0_10_16",
            () -> new Chevron_Side_Line_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CITY_0_10_16 = registerBlock("city_0_10_16",
            () -> new City_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CITY_1_10_16 = registerBlock("city_1_10_16",
            () -> new City_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_10_16 = registerBlock("clear_0_10_16",
            () -> new Clear_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_10_16 = registerBlock("clear_1_10_16",
            () -> new Clear_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_10_16 = registerBlock("crossingdiagonal_0_10_16",
            () -> new CrossingDiagonal_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_10_16 = registerBlock("crossingdiagonal_1_10_16",
            () -> new CrossingDiagonal_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_10_16 = registerBlock("crossingdiagonal_2_10_16",
            () -> new CrossingDiagonal_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_10_16 = registerBlock("crossingdiagonal_3_10_16",
            () -> new CrossingDiagonal_3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_10_16 = registerBlock("crossingpaint_0_10_16",
            () -> new CrossingPaint_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_10_16 = registerBlock("crossingpaint_1_10_16",
            () -> new CrossingPaint_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_10_16 = registerBlock("crossingpaint_2_10_16",
            () -> new CrossingPaint_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> D_10_16 = registerBlock("d_10_16",
            () -> new D_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_10_16 = registerBlock("diagonalcrossing_10_16",
            () -> new DiagonalCrossing_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> E_10_16 = registerBlock("e_10_16",
            () -> new E_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_10_16 = registerBlock("entry_0_10_16",
            () -> new Entry_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_10_16 = registerBlock("entry_1_10_16",
            () -> new Entry_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_10_16 = registerBlock("exclamation_10_16",
            () -> new Exclamation_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> F_10_16 = registerBlock("f_10_16",
            () -> new F_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> G_10_16 = registerBlock("g_10_16",
            () -> new G_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_10_16 = registerBlock("giveway_0_10_16",
            () -> new GiveWay_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> H_10_16 = registerBlock("h_10_16",
            () -> new H_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> HASHTAG_10_16 = registerBlock("hashtag_10_16",
            () -> new Hashtag_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_10_16 = registerBlock("hatchbox_10_16",
            () -> new Hatchbox_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> I_10_16 = registerBlock("i_10_16",
            () -> new I_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> J_10_16 = registerBlock("j_10_16",
            () -> new J_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_10_16 = registerBlock("junction_a_0_10_16",
            () -> new Junction_A_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_10_16 = registerBlock("junction_a_1_10_16",
            () -> new Junction_A_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_10_16 = registerBlock("junction_a_2_10_16",
            () -> new Junction_A_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_10_16 = registerBlock("junction_b_0_10_16",
            () -> new Junction_B_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_10_16 = registerBlock("junction_b_1_10_16",
            () -> new Junction_B_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_10_16 = registerBlock("junction_b_2_10_16",
            () -> new Junction_B_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_10_16 = registerBlock("junction_filter_left_0_10_16",
            () -> new Junction_Filter_Left_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_10_16 = registerBlock("junction_filter_left_empty_0_10_16",
            () -> new Junction_Filter_Left_Empty_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_10_16 = registerBlock("junction_filter_left_thin_0_10_16",
            () -> new Junction_Filter_Left_Thin_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_10_16 = registerBlock("junction_filter_right_0_10_16",
            () -> new Junction_Filter_Right_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_10_16 = registerBlock("junction_filter_right_empty_0_10_16",
            () -> new Junction_Filter_Right_Empty_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_10_16 = registerBlock("junction_filter_right_thin_0_10_16",
            () -> new Junction_Filter_Right_Thin_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_10_16 = registerBlock("junction_fork_chevron_mid_0_10_16",
            () -> new Junction_Fork_Chevron_Mid_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_10_16 = registerBlock("junction_fork_chevron_mid_thin_0_10_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_10_16 = registerBlock("junction_fork_mid_0_10_16",
            () -> new Junction_Fork_Mid_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_10_16 = registerBlock("junction_fork_mid_0_thin_10_16",
            () -> new Junction_Fork_Mid_0_Thin_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_10_16 = registerBlock("junction_mid_line_connection_10_16",
            () -> new Junction_Mid_Line_Connection_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_10_16 = registerBlock("junction_mid_line_connection_1_10_16",
            () -> new Junction_Mid_Line_Connection_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_10_16 = registerBlock("junction_mid_line_connection_2_10_16",
            () -> new Junction_Mid_Line_Connection_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_10_16 = registerBlock("junction_mid_line_connection_3_10_16",
            () -> new Junction_Mid_Line_Connection_3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_10_16 = registerBlock("junction_side_line_connection_0_10_16",
            () -> new Junction_Side_Line_Connection_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_10_16 = registerBlock("junction_side_line_connection_1_10_16",
            () -> new Junction_Side_Line_Connection_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_10_16 = registerBlock("junction_side_line_connection_2_10_16",
            () -> new Junction_Side_Line_Connection_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_10_16 = registerBlock("junction_side_line_connection_3_10_16",
            () -> new Junction_Side_Line_Connection_3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_10_16 = registerBlock("junction_side_line_connection_thick_0_10_16",
            () -> new Junction_Side_Line_Connection_Thick_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_10_16 = registerBlock("junction_side_line_connection_thick_1_10_16",
            () -> new Junction_Side_Line_Connection_Thick_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_10_16 = registerBlock("junction_side_line_connection_thick_2_10_16",
            () -> new Junction_Side_Line_Connection_Thick_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_10_16 = registerBlock("junction_side_line_connection_thick_3_10_16",
            () -> new Junction_Side_Line_Connection_Thick_3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_10_16 = registerBlock("junction_side_line_connection_thin_0_10_16",
            () -> new Junction_Side_Line_Connection_Thin_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_10_16 = registerBlock("junction_side_line_connection_thin_1_10_16",
            () -> new Junction_Side_Line_Connection_Thin_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_10_16 = registerBlock("junction_side_line_connection_thin_2_10_16",
            () -> new Junction_Side_Line_Connection_Thin_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_10_16 = registerBlock("junction_side_line_thin_3_10_16",
            () -> new Junction_Side_Line_Thin_3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_10_16 = registerBlock("junction_side_line_connection_thin_3_10_16",
            () -> new Junction_side_line_connection_thin_3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> K_10_16 = registerBlock("k_10_16",
            () -> new K_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> KEEP_0_10_16 = registerBlock("keep_0_10_16",
            () -> new Keep_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> KEEP_1_10_16 = registerBlock("keep_1_10_16",
            () -> new Keep_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> L_10_16 = registerBlock("l_10_16",
            () -> new L_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LANE_0_10_16 = registerBlock("lane_0_10_16",
            () -> new Lane_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LANE_1_10_16 = registerBlock("lane_1_10_16",
            () -> new Lane_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LEFT_0_10_16 = registerBlock("left_0_10_16",
            () -> new Left_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LEFT_1_10_16 = registerBlock("left_1_10_16",
            () -> new Left_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LETTER0_10_16 = registerBlock("letter0_10_16",
            () -> new Letter0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LETTER1_10_16 = registerBlock("letter1_10_16",
            () -> new Letter1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LETTER2_10_16 = registerBlock("letter2_10_16",
            () -> new Letter2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LETTER3_10_16 = registerBlock("letter3_10_16",
            () -> new Letter3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LETTER4_10_16 = registerBlock("letter4_10_16",
            () -> new Letter4_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LETTER5_10_16 = registerBlock("letter5_10_16",
            () -> new Letter5_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LETTER6_10_16 = registerBlock("letter6_10_16",
            () -> new Letter6_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LETTER7_10_16 = registerBlock("letter7_10_16",
            () -> new Letter7_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LETTER8_10_16 = registerBlock("letter8_10_16",
            () -> new Letter8_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LETTER9_10_16 = registerBlock("letter9_10_16",
            () -> new Letter9_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_10_16 = registerBlock("lineedgethick_0_10_16",
            () -> new LineEdgeThick_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_10_16 = registerBlock("lineedgethick_1_10_16",
            () -> new LineEdgeThick_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_10_16 = registerBlock("lineedgethick_2_10_16",
            () -> new LineEdgeThick_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_10_16 = registerBlock("lineedgethick_3_10_16",
            () -> new LineEdgeThick_3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_10_16 = registerBlock("lineedge_1_10_16",
            () -> new LineEdge_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_10_16 = registerBlock("lineedge_2_10_16",
            () -> new LineEdge_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_10_16 = registerBlock("lineedge_3_10_16",
            () -> new LineEdge_3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_10_16 = registerBlock("linemiddledash_10_16",
            () -> new LineMiddleDash_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_10_16 = registerBlock("linemiddlehalf_10_16",
            () -> new LineMiddleHalf_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_10_16 = registerBlock("linemiddleshort_10_16",
            () -> new LineMiddleShort_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_10_16 = registerBlock("lineside1_10_16",
            () -> new LineSide1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_10_16 = registerBlock("lineside2_10_16",
            () -> new LineSide2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_10_16 = registerBlock("lineside3_10_16",
            () -> new LineSide3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_10_16 = registerBlock("lineside4_10_16",
            () -> new LineSide4_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_10_16 = registerBlock("lineside5_10_16",
            () -> new LineSide5_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_10_16 = registerBlock("lineside6_10_16",
            () -> new LineSide6_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_10_16 = registerBlock("linesidedoublethick_0_10_16",
            () -> new LineSideDoubleThick_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_10_16 = registerBlock("linesidedoublethick_1_10_16",
            () -> new LineSideDoubleThick_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_10_16 = registerBlock("linesidedouble_10_16",
            () -> new LineSideDouble_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_10_16 = registerBlock("linesidedouble_1_10_16",
            () -> new LineSideDouble_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_10_16 = registerBlock("linesidethick_0_10_16",
            () -> new LineSideThick_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_10_16 = registerBlock("linesidethick_1_10_16",
            () -> new LineSideThick_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_10_16 = registerBlock("linesidethick_2_10_16",
            () -> new LineSideThick_2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_10_16 = registerBlock("linesidethick_3_10_16",
            () -> new LineSideThick_3_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_10_16 = registerBlock("linesidethick_4_10_16",
            () -> new LineSideThick_4_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_10_16 = registerBlock("linesidethick_5_10_16",
            () -> new LineSideThick_5_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> M_10_16 = registerBlock("m_10_16",
            () -> new M_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> MERGE_0_10_16 = registerBlock("merge_0_10_16",
            () -> new Merge_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> MERGE_1_10_16 = registerBlock("merge_1_10_16",
            () -> new Merge_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> N_10_16 = registerBlock("n_10_16",
            () -> new N_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> NO_0_10_16 = registerBlock("no_0_10_16",
            () -> new No_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> NO_1_10_16 = registerBlock("no_1_10_16",
            () -> new No_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> O_10_16 = registerBlock("o_10_16",
            () -> new O_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ONLY_0_10_16 = registerBlock("only_0_10_16",
            () -> new Only_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> ONLY_1_10_16 = registerBlock("only_1_10_16",
            () -> new Only_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> P_10_16 = registerBlock("p_10_16",
            () -> new P_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_10_16 = registerBlock("pedestrian_10_16",
            () -> new Pedestrian_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> Q_10_16 = registerBlock("q_10_16",
            () -> new Q_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> QUESTION_10_16 = registerBlock("question_10_16",
            () -> new Question_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> R_10_16 = registerBlock("r_10_16",
            () -> new R_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_10_16 = registerBlock("right_0_10_16",
            () -> new Right_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_10_16 = registerBlock("right_1_10_16",
            () -> new Right_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> S_10_16 = registerBlock("s_10_16",
            () -> new S_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> SLASH_10_16 = registerBlock("slash_10_16",
            () -> new Slash_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> SLASH_1_10_16 = registerBlock("slash_1_10_16",
            () -> new Slash_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> SLOW_0_10_16 = registerBlock("slow_0_10_16",
            () -> new Slow_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> SLOW_1_10_16 = registerBlock("slow_1_10_16",
            () -> new Slow_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> STOP_0_10_16 = registerBlock("stop_0_10_16",
            () -> new Stop_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> STOP_1_10_16 = registerBlock("stop_1_10_16",
            () -> new Stop_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_10_16 = registerBlock("straight2d_10_16",
            () -> new Straight2D_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_10_16 = registerBlock("straight2i_10_16",
            () -> new Straight2I_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_10_16 = registerBlock("straight2t_10_16",
            () -> new Straight2T_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_10_16 = registerBlock("straight2_10_16",
            () -> new Straight2_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> T_10_16 = registerBlock("t_10_16",
            () -> new T_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> TAXI_0_10_16 = registerBlock("taxi_0_10_16",
            () -> new Taxi_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> TAXI_1_10_16 = registerBlock("taxi_1_10_16",
            () -> new Taxi_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> THICK2_D_10_16 = registerBlock("thick2_d_10_16",
            () -> new Thick2_D_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> THICK2_I_10_16 = registerBlock("thick2_i_10_16",
            () -> new Thick2_I_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> THICK2_T_10_16 = registerBlock("thick2_t_10_16",
            () -> new Thick2_T_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> THICKS_D_10_16 = registerBlock("thicks_d_10_16",
            () -> new ThickS_D_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> THICKS_I_10_16 = registerBlock("thicks_i_10_16",
            () -> new ThickS_I_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> THICKS_T_10_16 = registerBlock("thicks_t_10_16",
            () -> new ThickS_T_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_10_16 = registerBlock("thickstraight_10_16",
            () -> new ThickStraight_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> TOWN_0_10_16 = registerBlock("town_0_10_16",
            () -> new Town_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> TOWN_1_10_16 = registerBlock("town_1_10_16",
            () -> new Town_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> TURN_0_10_16 = registerBlock("turn_0_10_16",
            () -> new Turn_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> TURN_1_10_16 = registerBlock("turn_1_10_16",
            () -> new Turn_1_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> U_10_16 = registerBlock("u_10_16",
            () -> new U_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> V_10_16 = registerBlock("v_10_16",
            () -> new V_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> W_10_16 = registerBlock("w_10_16",
            () -> new W_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_10_16 = registerBlock("wheelchair_0_10_16",
            () -> new Wheelchair_0_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> X_10_16 = registerBlock("x_10_16",
            () -> new X_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> Y_10_16 = registerBlock("y_10_16",
            () -> new Y_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

    public static final RegistryObject<Block> Z_10_16 = registerBlock("z_10_16",
            () -> new Z_10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);

// 11_16 Road Paints



    public static final RegistryObject<Block> A_11_16 = registerBlock("a_11_16",
            () -> new A_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ARROW2_11_16 = registerBlock("arrow2_11_16",
            () -> new Arrow2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_11_16 = registerBlock("arrowline_1_11_16",
            () -> new ArrowLine_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_11_16 = registerBlock("arrowline_2_11_16",
            () -> new ArrowLine_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ARROW_3_11_16 = registerBlock("arrow_3_11_16",
            () -> new Arrow_3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_11_16 = registerBlock("arrowdiagonal2_11_16",
            () -> new Arrowdiagonal2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_11_16 = registerBlock("arrowdiagonal_11_16",
            () -> new ArrowDiagonal_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_11_16 = registerBlock("arrowline_0_11_16",
            () -> new Arrowline_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_11_16 = registerBlock("arrowline_3_11_16",
            () -> new Arrowline_3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> B_11_16 = registerBlock("b_11_16",
            () -> new B_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_11_16 = registerBlock("bikeicon_0_11_16",
            () -> new BikeIcon_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_11_16 = registerBlock("bikeicon_1_11_16",
            () -> new BikeIcon_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> BIKE_11_16 = registerBlock("bike_11_16",
            () -> new Bike_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> BIKE_1_11_16 = registerBlock("bike_1_11_16",
            () -> new Bike_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> BUS_0_11_16 = registerBlock("bus_0_11_16",
            () -> new Bus_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> BUS_1_11_16 = registerBlock("bus_1_11_16",
            () -> new Bus_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> C_11_16 = registerBlock("c_11_16",
            () -> new C_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_11_16 = registerBlock("centre_0_11_16",
            () -> new Centre_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_11_16 = registerBlock("centre_1_11_16",
            () -> new Centre_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_11_16 = registerBlock("chevronright_a_0_11_16",
            () -> new ChevronRight_A_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_11_16 = registerBlock("chevronright_a_thin_0_11_16",
            () -> new ChevronRight_A_Thin_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_11_16 = registerBlock("chevron_0_11_16",
            () -> new Chevron_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_11_16 = registerBlock("chevron_left_a_11_16",
            () -> new Chevron_Left_A_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_11_16 = registerBlock("chevron_left_a_thin_11_16",
            () -> new Chevron_Left_A_Thin_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_11_16 = registerBlock("chevron_mid_0_11_16",
            () -> new Chevron_Mid_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_11_16 = registerBlock("chevron_mid_1_11_16",
            () -> new Chevron_Mid_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_11_16 = registerBlock("chevron_mid_left_11_16",
            () -> new Chevron_Mid_Left_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_11_16 = registerBlock("chevron_mid_left_thin_11_16",
            () -> new Chevron_Mid_Left_Thin_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_11_16 = registerBlock("chevron_mid_right_0_11_16",
            () -> new Chevron_Mid_Right_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_11_16 = registerBlock("chevron_mid_right_1_11_16",
            () -> new Chevron_Mid_Right_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_11_16 = registerBlock("chevron_side_line_0_11_16",
            () -> new Chevron_Side_Line_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CITY_0_11_16 = registerBlock("city_0_11_16",
            () -> new City_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CITY_1_11_16 = registerBlock("city_1_11_16",
            () -> new City_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_11_16 = registerBlock("clear_0_11_16",
            () -> new Clear_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_11_16 = registerBlock("clear_1_11_16",
            () -> new Clear_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_11_16 = registerBlock("crossingdiagonal_0_11_16",
            () -> new CrossingDiagonal_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_11_16 = registerBlock("crossingdiagonal_1_11_16",
            () -> new CrossingDiagonal_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_11_16 = registerBlock("crossingdiagonal_2_11_16",
            () -> new CrossingDiagonal_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_11_16 = registerBlock("crossingdiagonal_3_11_16",
            () -> new CrossingDiagonal_3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_11_16 = registerBlock("crossingpaint_0_11_16",
            () -> new CrossingPaint_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_11_16 = registerBlock("crossingpaint_1_11_16",
            () -> new CrossingPaint_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_11_16 = registerBlock("crossingpaint_2_11_16",
            () -> new CrossingPaint_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> D_11_16 = registerBlock("d_11_16",
            () -> new D_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_11_16 = registerBlock("diagonalcrossing_11_16",
            () -> new DiagonalCrossing_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> E_11_16 = registerBlock("e_11_16",
            () -> new E_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_11_16 = registerBlock("entry_0_11_16",
            () -> new Entry_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_11_16 = registerBlock("entry_1_11_16",
            () -> new Entry_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_11_16 = registerBlock("exclamation_11_16",
            () -> new Exclamation_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> F_11_16 = registerBlock("f_11_16",
            () -> new F_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> G_11_16 = registerBlock("g_11_16",
            () -> new G_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_11_16 = registerBlock("giveway_0_11_16",
            () -> new GiveWay_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> H_11_16 = registerBlock("h_11_16",
            () -> new H_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> HASHTAG_11_16 = registerBlock("hashtag_11_16",
            () -> new Hashtag_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_11_16 = registerBlock("hatchbox_11_16",
            () -> new Hatchbox_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> I_11_16 = registerBlock("i_11_16",
            () -> new I_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> J_11_16 = registerBlock("j_11_16",
            () -> new J_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_11_16 = registerBlock("junction_a_0_11_16",
            () -> new Junction_A_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_11_16 = registerBlock("junction_a_1_11_16",
            () -> new Junction_A_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_11_16 = registerBlock("junction_a_2_11_16",
            () -> new Junction_A_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_11_16 = registerBlock("junction_b_0_11_16",
            () -> new Junction_B_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_11_16 = registerBlock("junction_b_1_11_16",
            () -> new Junction_B_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_11_16 = registerBlock("junction_b_2_11_16",
            () -> new Junction_B_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_11_16 = registerBlock("junction_filter_left_0_11_16",
            () -> new Junction_Filter_Left_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_11_16 = registerBlock("junction_filter_left_empty_0_11_16",
            () -> new Junction_Filter_Left_Empty_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_11_16 = registerBlock("junction_filter_left_thin_0_11_16",
            () -> new Junction_Filter_Left_Thin_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_11_16 = registerBlock("junction_filter_right_0_11_16",
            () -> new Junction_Filter_Right_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_11_16 = registerBlock("junction_filter_right_empty_0_11_16",
            () -> new Junction_Filter_Right_Empty_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_11_16 = registerBlock("junction_filter_right_thin_0_11_16",
            () -> new Junction_Filter_Right_Thin_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_11_16 = registerBlock("junction_fork_chevron_mid_0_11_16",
            () -> new Junction_Fork_Chevron_Mid_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_11_16 = registerBlock("junction_fork_chevron_mid_thin_0_11_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_11_16 = registerBlock("junction_fork_mid_0_11_16",
            () -> new Junction_Fork_Mid_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_11_16 = registerBlock("junction_fork_mid_0_thin_11_16",
            () -> new Junction_Fork_Mid_0_Thin_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_11_16 = registerBlock("junction_mid_line_connection_11_16",
            () -> new Junction_Mid_Line_Connection_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_11_16 = registerBlock("junction_mid_line_connection_1_11_16",
            () -> new Junction_Mid_Line_Connection_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_11_16 = registerBlock("junction_mid_line_connection_2_11_16",
            () -> new Junction_Mid_Line_Connection_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_11_16 = registerBlock("junction_mid_line_connection_3_11_16",
            () -> new Junction_Mid_Line_Connection_3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_11_16 = registerBlock("junction_side_line_connection_0_11_16",
            () -> new Junction_Side_Line_Connection_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_11_16 = registerBlock("junction_side_line_connection_1_11_16",
            () -> new Junction_Side_Line_Connection_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_11_16 = registerBlock("junction_side_line_connection_2_11_16",
            () -> new Junction_Side_Line_Connection_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_11_16 = registerBlock("junction_side_line_connection_3_11_16",
            () -> new Junction_Side_Line_Connection_3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_11_16 = registerBlock("junction_side_line_connection_thick_0_11_16",
            () -> new Junction_Side_Line_Connection_Thick_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_11_16 = registerBlock("junction_side_line_connection_thick_1_11_16",
            () -> new Junction_Side_Line_Connection_Thick_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_11_16 = registerBlock("junction_side_line_connection_thick_2_11_16",
            () -> new Junction_Side_Line_Connection_Thick_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_11_16 = registerBlock("junction_side_line_connection_thick_3_11_16",
            () -> new Junction_Side_Line_Connection_Thick_3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_11_16 = registerBlock("junction_side_line_connection_thin_0_11_16",
            () -> new Junction_Side_Line_Connection_Thin_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_11_16 = registerBlock("junction_side_line_connection_thin_1_11_16",
            () -> new Junction_Side_Line_Connection_Thin_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_11_16 = registerBlock("junction_side_line_connection_thin_2_11_16",
            () -> new Junction_Side_Line_Connection_Thin_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_11_16 = registerBlock("junction_side_line_thin_3_11_16",
            () -> new Junction_Side_Line_Thin_3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_11_16 = registerBlock("junction_side_line_connection_thin_3_11_16",
            () -> new Junction_side_line_connection_thin_3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> K_11_16 = registerBlock("k_11_16",
            () -> new K_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> KEEP_0_11_16 = registerBlock("keep_0_11_16",
            () -> new Keep_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> KEEP_1_11_16 = registerBlock("keep_1_11_16",
            () -> new Keep_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> L_11_16 = registerBlock("l_11_16",
            () -> new L_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LANE_0_11_16 = registerBlock("lane_0_11_16",
            () -> new Lane_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LANE_1_11_16 = registerBlock("lane_1_11_16",
            () -> new Lane_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LEFT_0_11_16 = registerBlock("left_0_11_16",
            () -> new Left_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LEFT_1_11_16 = registerBlock("left_1_11_16",
            () -> new Left_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER0_11_16 = registerBlock("letter0_11_16",
            () -> new Letter0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER1_11_16 = registerBlock("letter1_11_16",
            () -> new Letter1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER2_11_16 = registerBlock("letter2_11_16",
            () -> new Letter2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER3_11_16 = registerBlock("letter3_11_16",
            () -> new Letter3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER4_11_16 = registerBlock("letter4_11_16",
            () -> new Letter4_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER5_11_16 = registerBlock("letter5_11_16",
            () -> new Letter5_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER6_11_16 = registerBlock("letter6_11_16",
            () -> new Letter6_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER7_11_16 = registerBlock("letter7_11_16",
            () -> new Letter7_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER8_11_16 = registerBlock("letter8_11_16",
            () -> new Letter8_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LETTER9_11_16 = registerBlock("letter9_11_16",
            () -> new Letter9_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_11_16 = registerBlock("lineedgethick_0_11_16",
            () -> new LineEdgeThick_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_11_16 = registerBlock("lineedgethick_1_11_16",
            () -> new LineEdgeThick_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_11_16 = registerBlock("lineedgethick_2_11_16",
            () -> new LineEdgeThick_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_11_16 = registerBlock("lineedgethick_3_11_16",
            () -> new LineEdgeThick_3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_11_16 = registerBlock("lineedge_1_11_16",
            () -> new LineEdge_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_11_16 = registerBlock("lineedge_2_11_16",
            () -> new LineEdge_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_11_16 = registerBlock("lineedge_3_11_16",
            () -> new LineEdge_3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_11_16 = registerBlock("linemiddledash_11_16",
            () -> new LineMiddleDash_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_11_16 = registerBlock("linemiddlehalf_11_16",
            () -> new LineMiddleHalf_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_11_16 = registerBlock("linemiddleshort_11_16",
            () -> new LineMiddleShort_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_11_16 = registerBlock("lineside1_11_16",
            () -> new LineSide1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_11_16 = registerBlock("lineside2_11_16",
            () -> new LineSide2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_11_16 = registerBlock("lineside3_11_16",
            () -> new LineSide3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_11_16 = registerBlock("lineside4_11_16",
            () -> new LineSide4_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_11_16 = registerBlock("lineside5_11_16",
            () -> new LineSide5_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_11_16 = registerBlock("lineside6_11_16",
            () -> new LineSide6_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_11_16 = registerBlock("linesidedoublethick_0_11_16",
            () -> new LineSideDoubleThick_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_11_16 = registerBlock("linesidedoublethick_1_11_16",
            () -> new LineSideDoubleThick_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_11_16 = registerBlock("linesidedouble_11_16",
            () -> new LineSideDouble_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_11_16 = registerBlock("linesidedouble_1_11_16",
            () -> new LineSideDouble_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_11_16 = registerBlock("linesidethick_0_11_16",
            () -> new LineSideThick_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_11_16 = registerBlock("linesidethick_1_11_16",
            () -> new LineSideThick_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_11_16 = registerBlock("linesidethick_2_11_16",
            () -> new LineSideThick_2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_11_16 = registerBlock("linesidethick_3_11_16",
            () -> new LineSideThick_3_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_11_16 = registerBlock("linesidethick_4_11_16",
            () -> new LineSideThick_4_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_11_16 = registerBlock("linesidethick_5_11_16",
            () -> new LineSideThick_5_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> M_11_16 = registerBlock("m_11_16",
            () -> new M_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> MERGE_0_11_16 = registerBlock("merge_0_11_16",
            () -> new Merge_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> MERGE_1_11_16 = registerBlock("merge_1_11_16",
            () -> new Merge_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> N_11_16 = registerBlock("n_11_16",
            () -> new N_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> NO_0_11_16 = registerBlock("no_0_11_16",
            () -> new No_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> NO_1_11_16 = registerBlock("no_1_11_16",
            () -> new No_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> O_11_16 = registerBlock("o_11_16",
            () -> new O_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ONLY_0_11_16 = registerBlock("only_0_11_16",
            () -> new Only_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> ONLY_1_11_16 = registerBlock("only_1_11_16",
            () -> new Only_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> P_11_16 = registerBlock("p_11_16",
            () -> new P_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_11_16 = registerBlock("pedestrian_11_16",
            () -> new Pedestrian_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> Q_11_16 = registerBlock("q_11_16",
            () -> new Q_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> QUESTION_11_16 = registerBlock("question_11_16",
            () -> new Question_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> R_11_16 = registerBlock("r_11_16",
            () -> new R_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_11_16 = registerBlock("right_0_11_16",
            () -> new Right_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_11_16 = registerBlock("right_1_11_16",
            () -> new Right_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> S_11_16 = registerBlock("s_11_16",
            () -> new S_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> SLASH_11_16 = registerBlock("slash_11_16",
            () -> new Slash_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> SLASH_1_11_16 = registerBlock("slash_1_11_16",
            () -> new Slash_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> SLOW_0_11_16 = registerBlock("slow_0_11_16",
            () -> new Slow_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> SLOW_1_11_16 = registerBlock("slow_1_11_16",
            () -> new Slow_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> STOP_0_11_16 = registerBlock("stop_0_11_16",
            () -> new Stop_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> STOP_1_11_16 = registerBlock("stop_1_11_16",
            () -> new Stop_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_11_16 = registerBlock("straight2d_11_16",
            () -> new Straight2D_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_11_16 = registerBlock("straight2i_11_16",
            () -> new Straight2I_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_11_16 = registerBlock("straight2t_11_16",
            () -> new Straight2T_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_11_16 = registerBlock("straight2_11_16",
            () -> new Straight2_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> T_11_16 = registerBlock("t_11_16",
            () -> new T_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> TAXI_0_11_16 = registerBlock("taxi_0_11_16",
            () -> new Taxi_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> TAXI_1_11_16 = registerBlock("taxi_1_11_16",
            () -> new Taxi_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> THICK2_D_11_16 = registerBlock("thick2_d_11_16",
            () -> new Thick2_D_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> THICK2_I_11_16 = registerBlock("thick2_i_11_16",
            () -> new Thick2_I_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> THICK2_T_11_16 = registerBlock("thick2_t_11_16",
            () -> new Thick2_T_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> THICKS_D_11_16 = registerBlock("thicks_d_11_16",
            () -> new ThickS_D_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> THICKS_I_11_16 = registerBlock("thicks_i_11_16",
            () -> new ThickS_I_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> THICKS_T_11_16 = registerBlock("thicks_t_11_16",
            () -> new ThickS_T_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_11_16 = registerBlock("thickstraight_11_16",
            () -> new ThickStraight_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> TOWN_0_11_16 = registerBlock("town_0_11_16",
            () -> new Town_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> TOWN_1_11_16 = registerBlock("town_1_11_16",
            () -> new Town_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> TURN_0_11_16 = registerBlock("turn_0_11_16",
            () -> new Turn_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> TURN_1_11_16 = registerBlock("turn_1_11_16",
            () -> new Turn_1_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> U_11_16 = registerBlock("u_11_16",
            () -> new U_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> V_11_16 = registerBlock("v_11_16",
            () -> new V_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> W_11_16 = registerBlock("w_11_16",
            () -> new W_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_11_16 = registerBlock("wheelchair_0_11_16",
            () -> new Wheelchair_0_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> X_11_16 = registerBlock("x_11_16",
            () -> new X_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> Y_11_16 = registerBlock("y_11_16",
            () -> new Y_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

    public static final RegistryObject<Block> Z_11_16 = registerBlock("z_11_16",
            () -> new Z_11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);

// 12_16 Road Paints


    public static final RegistryObject<Block> A_12_16 = registerBlock("a_12_16",
            () -> new A_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ARROW2_12_16 = registerBlock("arrow2_12_16",
            () -> new Arrow2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_12_16 = registerBlock("arrowline_1_12_16",
            () -> new ArrowLine_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_12_16 = registerBlock("arrowline_2_12_16",
            () -> new ArrowLine_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ARROW_3_12_16 = registerBlock("arrow_3_12_16",
            () -> new Arrow_3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_12_16 = registerBlock("arrowdiagonal2_12_16",
            () -> new Arrowdiagonal2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_12_16 = registerBlock("arrowdiagonal_12_16",
            () -> new ArrowDiagonal_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_12_16 = registerBlock("arrowline_0_12_16",
            () -> new Arrowline_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_12_16 = registerBlock("arrowline_3_12_16",
            () -> new Arrowline_3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> B_12_16 = registerBlock("b_12_16",
            () -> new B_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_12_16 = registerBlock("bikeicon_0_12_16",
            () -> new BikeIcon_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_12_16 = registerBlock("bikeicon_1_12_16",
            () -> new BikeIcon_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> BIKE_12_16 = registerBlock("bike_12_16",
            () -> new Bike_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> BIKE_1_12_16 = registerBlock("bike_1_12_16",
            () -> new Bike_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> BUS_0_12_16 = registerBlock("bus_0_12_16",
            () -> new Bus_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> BUS_1_12_16 = registerBlock("bus_1_12_16",
            () -> new Bus_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> C_12_16 = registerBlock("c_12_16",
            () -> new C_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_12_16 = registerBlock("centre_0_12_16",
            () -> new Centre_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_12_16 = registerBlock("centre_1_12_16",
            () -> new Centre_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_12_16 = registerBlock("chevronright_a_0_12_16",
            () -> new ChevronRight_A_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_12_16 = registerBlock("chevronright_a_thin_0_12_16",
            () -> new ChevronRight_A_Thin_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_12_16 = registerBlock("chevron_0_12_16",
            () -> new Chevron_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_12_16 = registerBlock("chevron_left_a_12_16",
            () -> new Chevron_Left_A_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_12_16 = registerBlock("chevron_left_a_thin_12_16",
            () -> new Chevron_Left_A_Thin_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_12_16 = registerBlock("chevron_mid_0_12_16",
            () -> new Chevron_Mid_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_12_16 = registerBlock("chevron_mid_1_12_16",
            () -> new Chevron_Mid_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_12_16 = registerBlock("chevron_mid_left_12_16",
            () -> new Chevron_Mid_Left_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_12_16 = registerBlock("chevron_mid_left_thin_12_16",
            () -> new Chevron_Mid_Left_Thin_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_12_16 = registerBlock("chevron_mid_right_0_12_16",
            () -> new Chevron_Mid_Right_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_12_16 = registerBlock("chevron_mid_right_1_12_16",
            () -> new Chevron_Mid_Right_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_12_16 = registerBlock("chevron_side_line_0_12_16",
            () -> new Chevron_Side_Line_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CITY_0_12_16 = registerBlock("city_0_12_16",
            () -> new City_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CITY_1_12_16 = registerBlock("city_1_12_16",
            () -> new City_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_12_16 = registerBlock("clear_0_12_16",
            () -> new Clear_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_12_16 = registerBlock("clear_1_12_16",
            () -> new Clear_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_12_16 = registerBlock("crossingdiagonal_0_12_16",
            () -> new CrossingDiagonal_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_12_16 = registerBlock("crossingdiagonal_1_12_16",
            () -> new CrossingDiagonal_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_12_16 = registerBlock("crossingdiagonal_2_12_16",
            () -> new CrossingDiagonal_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_12_16 = registerBlock("crossingdiagonal_3_12_16",
            () -> new CrossingDiagonal_3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_12_16 = registerBlock("crossingpaint_0_12_16",
            () -> new CrossingPaint_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_12_16 = registerBlock("crossingpaint_1_12_16",
            () -> new CrossingPaint_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_12_16 = registerBlock("crossingpaint_2_12_16",
            () -> new CrossingPaint_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> D_12_16 = registerBlock("d_12_16",
            () -> new D_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_12_16 = registerBlock("diagonalcrossing_12_16",
            () -> new DiagonalCrossing_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> E_12_16 = registerBlock("e_12_16",
            () -> new E_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_12_16 = registerBlock("entry_0_12_16",
            () -> new Entry_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_12_16 = registerBlock("entry_1_12_16",
            () -> new Entry_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_12_16 = registerBlock("exclamation_12_16",
            () -> new Exclamation_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> F_12_16 = registerBlock("f_12_16",
            () -> new F_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> G_12_16 = registerBlock("g_12_16",
            () -> new G_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_12_16 = registerBlock("giveway_0_12_16",
            () -> new GiveWay_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> H_12_16 = registerBlock("h_12_16",
            () -> new H_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> HASHTAG_12_16 = registerBlock("hashtag_12_16",
            () -> new Hashtag_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_12_16 = registerBlock("hatchbox_12_16",
            () -> new Hatchbox_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> I_12_16 = registerBlock("i_12_16",
            () -> new I_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> J_12_16 = registerBlock("j_12_16",
            () -> new J_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_12_16 = registerBlock("junction_a_0_12_16",
            () -> new Junction_A_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_12_16 = registerBlock("junction_a_1_12_16",
            () -> new Junction_A_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_12_16 = registerBlock("junction_a_2_12_16",
            () -> new Junction_A_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_12_16 = registerBlock("junction_b_0_12_16",
            () -> new Junction_B_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_12_16 = registerBlock("junction_b_1_12_16",
            () -> new Junction_B_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_12_16 = registerBlock("junction_b_2_12_16",
            () -> new Junction_B_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_12_16 = registerBlock("junction_filter_left_0_12_16",
            () -> new Junction_Filter_Left_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_12_16 = registerBlock("junction_filter_left_empty_0_12_16",
            () -> new Junction_Filter_Left_Empty_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_12_16 = registerBlock("junction_filter_left_thin_0_12_16",
            () -> new Junction_Filter_Left_Thin_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_12_16 = registerBlock("junction_filter_right_0_12_16",
            () -> new Junction_Filter_Right_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_12_16 = registerBlock("junction_filter_right_empty_0_12_16",
            () -> new Junction_Filter_Right_Empty_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_12_16 = registerBlock("junction_filter_right_thin_0_12_16",
            () -> new Junction_Filter_Right_Thin_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_12_16 = registerBlock("junction_fork_chevron_mid_0_12_16",
            () -> new Junction_Fork_Chevron_Mid_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_12_16 = registerBlock("junction_fork_chevron_mid_thin_0_12_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_12_16 = registerBlock("junction_fork_mid_0_12_16",
            () -> new Junction_Fork_Mid_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_12_16 = registerBlock("junction_fork_mid_0_thin_12_16",
            () -> new Junction_Fork_Mid_0_Thin_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_12_16 = registerBlock("junction_mid_line_connection_12_16",
            () -> new Junction_Mid_Line_Connection_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_12_16 = registerBlock("junction_mid_line_connection_1_12_16",
            () -> new Junction_Mid_Line_Connection_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_12_16 = registerBlock("junction_mid_line_connection_2_12_16",
            () -> new Junction_Mid_Line_Connection_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_12_16 = registerBlock("junction_mid_line_connection_3_12_16",
            () -> new Junction_Mid_Line_Connection_3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_12_16 = registerBlock("junction_side_line_connection_0_12_16",
            () -> new Junction_Side_Line_Connection_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_12_16 = registerBlock("junction_side_line_connection_1_12_16",
            () -> new Junction_Side_Line_Connection_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_12_16 = registerBlock("junction_side_line_connection_2_12_16",
            () -> new Junction_Side_Line_Connection_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_12_16 = registerBlock("junction_side_line_connection_3_12_16",
            () -> new Junction_Side_Line_Connection_3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_12_16 = registerBlock("junction_side_line_connection_thick_0_12_16",
            () -> new Junction_Side_Line_Connection_Thick_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_12_16 = registerBlock("junction_side_line_connection_thick_1_12_16",
            () -> new Junction_Side_Line_Connection_Thick_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_12_16 = registerBlock("junction_side_line_connection_thick_2_12_16",
            () -> new Junction_Side_Line_Connection_Thick_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_12_16 = registerBlock("junction_side_line_connection_thick_3_12_16",
            () -> new Junction_Side_Line_Connection_Thick_3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_12_16 = registerBlock("junction_side_line_connection_thin_0_12_16",
            () -> new Junction_Side_Line_Connection_Thin_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_12_16 = registerBlock("junction_side_line_connection_thin_1_12_16",
            () -> new Junction_Side_Line_Connection_Thin_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_12_16 = registerBlock("junction_side_line_connection_thin_2_12_16",
            () -> new Junction_Side_Line_Connection_Thin_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_12_16 = registerBlock("junction_side_line_thin_3_12_16",
            () -> new Junction_Side_Line_Thin_3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_12_16 = registerBlock("junction_side_line_connection_thin_3_12_16",
            () -> new Junction_side_line_connection_thin_3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> K_12_16 = registerBlock("k_12_16",
            () -> new K_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> KEEP_0_12_16 = registerBlock("keep_0_12_16",
            () -> new Keep_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> KEEP_1_12_16 = registerBlock("keep_1_12_16",
            () -> new Keep_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> L_12_16 = registerBlock("l_12_16",
            () -> new L_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LANE_0_12_16 = registerBlock("lane_0_12_16",
            () -> new Lane_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LANE_1_12_16 = registerBlock("lane_1_12_16",
            () -> new Lane_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LEFT_0_12_16 = registerBlock("left_0_12_16",
            () -> new Left_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LEFT_1_12_16 = registerBlock("left_1_12_16",
            () -> new Left_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LETTER0_12_16 = registerBlock("letter0_12_16",
            () -> new Letter0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LETTER1_12_16 = registerBlock("letter1_12_16",
            () -> new Letter1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LETTER2_12_16 = registerBlock("letter2_12_16",
            () -> new Letter2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LETTER3_12_16 = registerBlock("letter3_12_16",
            () -> new Letter3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LETTER4_12_16 = registerBlock("letter4_12_16",
            () -> new Letter4_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LETTER5_12_16 = registerBlock("letter5_12_16",
            () -> new Letter5_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LETTER6_12_16 = registerBlock("letter6_12_16",
            () -> new Letter6_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LETTER7_12_16 = registerBlock("letter7_12_16",
            () -> new Letter7_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LETTER8_12_16 = registerBlock("letter8_12_16",
            () -> new Letter8_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LETTER9_12_16 = registerBlock("letter9_12_16",
            () -> new Letter9_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_12_16 = registerBlock("lineedgethick_0_12_16",
            () -> new LineEdgeThick_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_12_16 = registerBlock("lineedgethick_1_12_16",
            () -> new LineEdgeThick_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_12_16 = registerBlock("lineedgethick_2_12_16",
            () -> new LineEdgeThick_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_12_16 = registerBlock("lineedgethick_3_12_16",
            () -> new LineEdgeThick_3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_12_16 = registerBlock("lineedge_1_12_16",
            () -> new LineEdge_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_12_16 = registerBlock("lineedge_2_12_16",
            () -> new LineEdge_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_12_16 = registerBlock("lineedge_3_12_16",
            () -> new LineEdge_3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_12_16 = registerBlock("linemiddledash_12_16",
            () -> new LineMiddleDash_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_12_16 = registerBlock("linemiddlehalf_12_16",
            () -> new LineMiddleHalf_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_12_16 = registerBlock("linemiddleshort_12_16",
            () -> new LineMiddleShort_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_12_16 = registerBlock("lineside1_12_16",
            () -> new LineSide1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_12_16 = registerBlock("lineside2_12_16",
            () -> new LineSide2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_12_16 = registerBlock("lineside3_12_16",
            () -> new LineSide3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_12_16 = registerBlock("lineside4_12_16",
            () -> new LineSide4_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_12_16 = registerBlock("lineside5_12_16",
            () -> new LineSide5_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_12_16 = registerBlock("lineside6_12_16",
            () -> new LineSide6_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_12_16 = registerBlock("linesidedoublethick_0_12_16",
            () -> new LineSideDoubleThick_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_12_16 = registerBlock("linesidedoublethick_1_12_16",
            () -> new LineSideDoubleThick_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_12_16 = registerBlock("linesidedouble_12_16",
            () -> new LineSideDouble_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_12_16 = registerBlock("linesidedouble_1_12_16",
            () -> new LineSideDouble_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_12_16 = registerBlock("linesidethick_0_12_16",
            () -> new LineSideThick_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_12_16 = registerBlock("linesidethick_1_12_16",
            () -> new LineSideThick_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_12_16 = registerBlock("linesidethick_2_12_16",
            () -> new LineSideThick_2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_12_16 = registerBlock("linesidethick_3_12_16",
            () -> new LineSideThick_3_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_12_16 = registerBlock("linesidethick_4_12_16",
            () -> new LineSideThick_4_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_12_16 = registerBlock("linesidethick_5_12_16",
            () -> new LineSideThick_5_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> M_12_16 = registerBlock("m_12_16",
            () -> new M_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> MERGE_0_12_16 = registerBlock("merge_0_12_16",
            () -> new Merge_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> MERGE_1_12_16 = registerBlock("merge_1_12_16",
            () -> new Merge_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> N_12_16 = registerBlock("n_12_16",
            () -> new N_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> NO_0_12_16 = registerBlock("no_0_12_16",
            () -> new No_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> NO_1_12_16 = registerBlock("no_1_12_16",
            () -> new No_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> O_12_16 = registerBlock("o_12_16",
            () -> new O_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ONLY_0_12_16 = registerBlock("only_0_12_16",
            () -> new Only_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> ONLY_1_12_16 = registerBlock("only_1_12_16",
            () -> new Only_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> P_12_16 = registerBlock("p_12_16",
            () -> new P_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_12_16 = registerBlock("pedestrian_12_16",
            () -> new Pedestrian_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> Q_12_16 = registerBlock("q_12_16",
            () -> new Q_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> QUESTION_12_16 = registerBlock("question_12_16",
            () -> new Question_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> R_12_16 = registerBlock("r_12_16",
            () -> new R_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_12_16 = registerBlock("right_0_12_16",
            () -> new Right_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_12_16 = registerBlock("right_1_12_16",
            () -> new Right_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> S_12_16 = registerBlock("s_12_16",
            () -> new S_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> SLASH_12_16 = registerBlock("slash_12_16",
            () -> new Slash_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> SLASH_1_12_16 = registerBlock("slash_1_12_16",
            () -> new Slash_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> SLOW_0_12_16 = registerBlock("slow_0_12_16",
            () -> new Slow_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> SLOW_1_12_16 = registerBlock("slow_1_12_16",
            () -> new Slow_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> STOP_0_12_16 = registerBlock("stop_0_12_16",
            () -> new Stop_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> STOP_1_12_16 = registerBlock("stop_1_12_16",
            () -> new Stop_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_12_16 = registerBlock("straight2d_12_16",
            () -> new Straight2D_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_12_16 = registerBlock("straight2i_12_16",
            () -> new Straight2I_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_12_16 = registerBlock("straight2t_12_16",
            () -> new Straight2T_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_12_16 = registerBlock("straight2_12_16",
            () -> new Straight2_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> T_12_16 = registerBlock("t_12_16",
            () -> new T_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> TAXI_0_12_16 = registerBlock("taxi_0_12_16",
            () -> new Taxi_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> TAXI_1_12_16 = registerBlock("taxi_1_12_16",
            () -> new Taxi_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> THICK2_D_12_16 = registerBlock("thick2_d_12_16",
            () -> new Thick2_D_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> THICK2_I_12_16 = registerBlock("thick2_i_12_16",
            () -> new Thick2_I_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> THICK2_T_12_16 = registerBlock("thick2_t_12_16",
            () -> new Thick2_T_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> THICKS_D_12_16 = registerBlock("thicks_d_12_16",
            () -> new ThickS_D_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> THICKS_I_12_16 = registerBlock("thicks_i_12_16",
            () -> new ThickS_I_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> THICKS_T_12_16 = registerBlock("thicks_t_12_16",
            () -> new ThickS_T_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_12_16 = registerBlock("thickstraight_12_16",
            () -> new ThickStraight_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> TOWN_0_12_16 = registerBlock("town_0_12_16",
            () -> new Town_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> TOWN_1_12_16 = registerBlock("town_1_12_16",
            () -> new Town_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> TURN_0_12_16 = registerBlock("turn_0_12_16",
            () -> new Turn_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> TURN_1_12_16 = registerBlock("turn_1_12_16",
            () -> new Turn_1_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> U_12_16 = registerBlock("u_12_16",
            () -> new U_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> V_12_16 = registerBlock("v_12_16",
            () -> new V_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> W_12_16 = registerBlock("w_12_16",
            () -> new W_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_12_16 = registerBlock("wheelchair_0_12_16",
            () -> new Wheelchair_0_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> X_12_16 = registerBlock("x_12_16",
            () -> new X_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> Y_12_16 = registerBlock("y_12_16",
            () -> new Y_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

    public static final RegistryObject<Block> Z_12_16 = registerBlock("z_12_16",
            () -> new Z_12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);

// 13_16 Road Paints



    public static final RegistryObject<Block> A_13_16 = registerBlock("a_13_16",
            () -> new A_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ARROW2_13_16 = registerBlock("arrow2_13_16",
            () -> new Arrow2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_13_16 = registerBlock("arrowline_1_13_16",
            () -> new ArrowLine_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_13_16 = registerBlock("arrowline_2_13_16",
            () -> new ArrowLine_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ARROW_3_13_16 = registerBlock("arrow_3_13_16",
            () -> new Arrow_3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_13_16 = registerBlock("arrowdiagonal2_13_16",
            () -> new Arrowdiagonal2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_13_16 = registerBlock("arrowdiagonal_13_16",
            () -> new Arrowdiagonal_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_13_16 = registerBlock("arrowline_0_13_16",
            () -> new Arrowline_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_13_16 = registerBlock("arrowline_3_13_16",
            () -> new Arrowline_3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> B_13_16 = registerBlock("b_13_16",
            () -> new B_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_13_16 = registerBlock("bikeicon_0_13_16",
            () -> new BikeIcon_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_13_16 = registerBlock("bikeicon_1_13_16",
            () -> new BikeIcon_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> BIKE_13_16 = registerBlock("bike_13_16",
            () -> new Bike_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> BIKE_1_13_16 = registerBlock("bike_1_13_16",
            () -> new Bike_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> BUS_0_13_16 = registerBlock("bus_0_13_16",
            () -> new Bus_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> BUS_1_13_16 = registerBlock("bus_1_13_16",
            () -> new Bus_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> C_13_16 = registerBlock("c_13_16",
            () -> new C_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_13_16 = registerBlock("centre_0_13_16",
            () -> new Centre_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_13_16 = registerBlock("centre_1_13_16",
            () -> new Centre_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_13_16 = registerBlock("chevronright_a_0_13_16",
            () -> new ChevronRight_A_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_13_16 = registerBlock("chevronright_a_thin_0_13_16",
            () -> new ChevronRight_A_Thin_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_13_16 = registerBlock("chevron_0_13_16",
            () -> new Chevron_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_13_16 = registerBlock("chevron_left_a_13_16",
            () -> new Chevron_Left_A_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_13_16 = registerBlock("chevron_left_a_thin_13_16",
            () -> new Chevron_Left_A_Thin_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_13_16 = registerBlock("chevron_mid_0_13_16",
            () -> new Chevron_Mid_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_13_16 = registerBlock("chevron_mid_1_13_16",
            () -> new Chevron_Mid_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_13_16 = registerBlock("chevron_mid_left_13_16",
            () -> new Chevron_Mid_Left_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_13_16 = registerBlock("chevron_mid_left_thin_13_16",
            () -> new Chevron_Mid_Left_Thin_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_13_16 = registerBlock("chevron_mid_right_0_13_16",
            () -> new Chevron_Mid_Right_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_13_16 = registerBlock("chevron_mid_right_1_13_16",
            () -> new Chevron_Mid_Right_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_13_16 = registerBlock("chevron_side_line_0_13_16",
            () -> new Chevron_Side_Line_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CITY_0_13_16 = registerBlock("city_0_13_16",
            () -> new City_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CITY_1_13_16 = registerBlock("city_1_13_16",
            () -> new City_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_13_16 = registerBlock("clear_0_13_16",
            () -> new Clear_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_13_16 = registerBlock("clear_1_13_16",
            () -> new Clear_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_13_16 = registerBlock("crossingdiagonal_0_13_16",
            () -> new CrossingDiagonal_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_13_16 = registerBlock("crossingdiagonal_1_13_16",
            () -> new CrossingDiagonal_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_13_16 = registerBlock("crossingdiagonal_2_13_16",
            () -> new CrossingDiagonal_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_13_16 = registerBlock("crossingdiagonal_3_13_16",
            () -> new CrossingDiagonal_3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_13_16 = registerBlock("crossingpaint_0_13_16",
            () -> new CrossingPaint_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_13_16 = registerBlock("crossingpaint_1_13_16",
            () -> new CrossingPaint_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_13_16 = registerBlock("crossingpaint_2_13_16",
            () -> new CrossingPaint_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> D_13_16 = registerBlock("d_13_16",
            () -> new D_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_13_16 = registerBlock("diagonalcrossing_13_16",
            () -> new DiagonalCrossing_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> E_13_16 = registerBlock("e_13_16",
            () -> new E_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_13_16 = registerBlock("entry_0_13_16",
            () -> new Entry_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_13_16 = registerBlock("entry_1_13_16",
            () -> new Entry_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_13_16 = registerBlock("exclamation_13_16",
            () -> new Exclamation_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> F_13_16 = registerBlock("f_13_16",
            () -> new F_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> G_13_16 = registerBlock("g_13_16",
            () -> new G_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_13_16 = registerBlock("giveway_0_13_16",
            () -> new GiveWay_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> H_13_16 = registerBlock("h_13_16",
            () -> new H_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> HASHTAG_13_16 = registerBlock("hashtag_13_16",
            () -> new Hashtag_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_13_16 = registerBlock("hatchbox_13_16",
            () -> new Hatchbox_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> I_13_16 = registerBlock("i_13_16",
            () -> new I_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> J_13_16 = registerBlock("j_13_16",
            () -> new J_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_13_16 = registerBlock("junction_a_0_13_16",
            () -> new Junction_A_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_13_16 = registerBlock("junction_a_1_13_16",
            () -> new Junction_A_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_13_16 = registerBlock("junction_a_2_13_16",
            () -> new Junction_A_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_13_16 = registerBlock("junction_b_0_13_16",
            () -> new Junction_B_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_13_16 = registerBlock("junction_b_1_13_16",
            () -> new Junction_B_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_13_16 = registerBlock("junction_b_2_13_16",
            () -> new Junction_B_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_13_16 = registerBlock("junction_filter_left_0_13_16",
            () -> new Junction_Filter_Left_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_13_16 = registerBlock("junction_filter_left_empty_0_13_16",
            () -> new Junction_Filter_Left_Empty_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_13_16 = registerBlock("junction_filter_left_thin_0_13_16",
            () -> new Junction_Filter_Left_Thin_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_13_16 = registerBlock("junction_filter_right_0_13_16",
            () -> new Junction_Filter_Right_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_13_16 = registerBlock("junction_filter_right_empty_0_13_16",
            () -> new Junction_Filter_Right_Empty_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_13_16 = registerBlock("junction_filter_right_thin_0_13_16",
            () -> new Junction_Filter_Right_Thin_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_13_16 = registerBlock("junction_fork_chevron_mid_0_13_16",
            () -> new Junction_Fork_Chevron_Mid_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_13_16 = registerBlock("junction_fork_chevron_mid_thin_0_13_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_13_16 = registerBlock("junction_fork_mid_0_13_16",
            () -> new Junction_Fork_Mid_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_13_16 = registerBlock("junction_fork_mid_0_thin_13_16",
            () -> new Junction_Fork_Mid_0_Thin_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_13_16 = registerBlock("junction_mid_line_connection_13_16",
            () -> new Junction_Mid_Line_Connection_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_13_16 = registerBlock("junction_mid_line_connection_1_13_16",
            () -> new Junction_Mid_Line_Connection_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_13_16 = registerBlock("junction_mid_line_connection_2_13_16",
            () -> new Junction_Mid_Line_Connection_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_13_16 = registerBlock("junction_mid_line_connection_3_13_16",
            () -> new Junction_Mid_Line_Connection_3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_13_16 = registerBlock("junction_side_line_connection_0_13_16",
            () -> new Junction_Side_Line_Connection_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_13_16 = registerBlock("junction_side_line_connection_1_13_16",
            () -> new Junction_Side_Line_Connection_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_13_16 = registerBlock("junction_side_line_connection_2_13_16",
            () -> new Junction_Side_Line_Connection_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_13_16 = registerBlock("junction_side_line_connection_3_13_16",
            () -> new Junction_Side_Line_Connection_3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_13_16 = registerBlock("junction_side_line_connection_thick_0_13_16",
            () -> new Junction_Side_Line_Connection_Thick_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_13_16 = registerBlock("junction_side_line_connection_thick_1_13_16",
            () -> new Junction_Side_Line_Connection_Thick_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_13_16 = registerBlock("junction_side_line_connection_thick_2_13_16",
            () -> new Junction_Side_Line_Connection_Thick_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_13_16 = registerBlock("junction_side_line_connection_thick_3_13_16",
            () -> new Junction_Side_Line_Connection_Thick_3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_13_16 = registerBlock("junction_side_line_connection_thin_0_13_16",
            () -> new Junction_Side_Line_Connection_Thin_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_13_16 = registerBlock("junction_side_line_connection_thin_1_13_16",
            () -> new Junction_Side_Line_Connection_Thin_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_13_16 = registerBlock("junction_side_line_connection_thin_2_13_16",
            () -> new Junction_Side_Line_Connection_Thin_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_13_16 = registerBlock("junction_side_line_thin_3_13_16",
            () -> new Junction_Side_Line_Thin_3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_13_16 = registerBlock("junction_side_line_connection_thin_3_13_16",
            () -> new Junction_side_line_connection_thin_3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> K_13_16 = registerBlock("k_13_16",
            () -> new K_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> KEEP_0_13_16 = registerBlock("keep_0_13_16",
            () -> new Keep_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> KEEP_1_13_16 = registerBlock("keep_1_13_16",
            () -> new Keep_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> L_13_16 = registerBlock("l_13_16",
            () -> new L_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LANE_0_13_16 = registerBlock("lane_0_13_16",
            () -> new Lane_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LANE_1_13_16 = registerBlock("lane_1_13_16",
            () -> new Lane_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LEFT_0_13_16 = registerBlock("left_0_13_16",
            () -> new Left_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LEFT_1_13_16 = registerBlock("left_1_13_16",
            () -> new Left_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER0_13_16 = registerBlock("letter0_13_16",
            () -> new Letter0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER1_13_16 = registerBlock("letter1_13_16",
            () -> new Letter1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER2_13_16 = registerBlock("letter2_13_16",
            () -> new Letter2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER3_13_16 = registerBlock("letter3_13_16",
            () -> new Letter3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER4_13_16 = registerBlock("letter4_13_16",
            () -> new Letter4_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER5_13_16 = registerBlock("letter5_13_16",
            () -> new Letter5_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER6_13_16 = registerBlock("letter6_13_16",
            () -> new Letter6_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER7_13_16 = registerBlock("letter7_13_16",
            () -> new Letter7_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER8_13_16 = registerBlock("letter8_13_16",
            () -> new Letter8_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER9_13_16 = registerBlock("letter9_13_16",
            () -> new Letter9_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_13_16 = registerBlock("lineedgethick_0_13_16",
            () -> new LineEdgeThick_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_13_16 = registerBlock("lineedgethick_1_13_16",
            () -> new LineEdgeThick_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_13_16 = registerBlock("lineedgethick_2_13_16",
            () -> new LineEdgeThick_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_13_16 = registerBlock("lineedgethick_3_13_16",
            () -> new LineEdgeThick_3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_13_16 = registerBlock("lineedge_1_13_16",
            () -> new LineEdge_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_13_16 = registerBlock("lineedge_2_13_16",
            () -> new LineEdge_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_13_16 = registerBlock("lineedge_3_13_16",
            () -> new LineEdge_3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_13_16 = registerBlock("linemiddledash_13_16",
            () -> new LineMiddleDash_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_13_16 = registerBlock("linemiddlehalf_13_16",
            () -> new LineMiddleHalf_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_13_16 = registerBlock("linemiddleshort_13_16",
            () -> new LineMiddleShort_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_13_16 = registerBlock("lineside1_13_16",
            () -> new LineSide1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_13_16 = registerBlock("lineside2_13_16",
            () -> new LineSide2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_13_16 = registerBlock("lineside3_13_16",
            () -> new LineSide3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_13_16 = registerBlock("lineside4_13_16",
            () -> new LineSide4_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_13_16 = registerBlock("lineside5_13_16",
            () -> new LineSide5_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_13_16 = registerBlock("lineside6_13_16",
            () -> new LineSide6_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_13_16 = registerBlock("linesidedoublethick_0_13_16",
            () -> new LineSideDoubleThick_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_13_16 = registerBlock("linesidedoublethick_1_13_16",
            () -> new LineSideDoubleThick_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_13_16 = registerBlock("linesidedouble_13_16",
            () -> new LineSideDouble_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_13_16 = registerBlock("linesidedouble_1_13_16",
            () -> new LineSideDouble_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_13_16 = registerBlock("linesidethick_0_13_16",
            () -> new LineSideThick_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_13_16 = registerBlock("linesidethick_1_13_16",
            () -> new LineSideThick_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_13_16 = registerBlock("linesidethick_2_13_16",
            () -> new LineSideThick_2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_13_16 = registerBlock("linesidethick_3_13_16",
            () -> new LineSideThick_3_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_13_16 = registerBlock("linesidethick_4_13_16",
            () -> new LineSideThick_4_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_13_16 = registerBlock("linesidethick_5_13_16",
            () -> new LineSideThick_5_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> M_13_16 = registerBlock("m_13_16",
            () -> new M_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> MERGE_0_13_16 = registerBlock("merge_0_13_16",
            () -> new Merge_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> MERGE_1_13_16 = registerBlock("merge_1_13_16",
            () -> new Merge_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> N_13_16 = registerBlock("n_13_16",
            () -> new N_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> NO_0_13_16 = registerBlock("no_0_13_16",
            () -> new No_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> NO_1_13_16 = registerBlock("no_1_13_16",
            () -> new No_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> O_13_16 = registerBlock("o_13_16",
            () -> new O_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ONLY_0_13_16 = registerBlock("only_0_13_16",
            () -> new Only_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> ONLY_1_13_16 = registerBlock("only_1_13_16",
            () -> new Only_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> P_13_16 = registerBlock("p_13_16",
            () -> new P_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_13_16 = registerBlock("pedestrian_13_16",
            () -> new Pedestrian_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> Q_13_16 = registerBlock("q_13_16",
            () -> new Q_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> QUESTION_13_16 = registerBlock("question_13_16",
            () -> new Question_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> R_13_16 = registerBlock("r_13_16",
            () -> new R_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_13_16 = registerBlock("right_0_13_16",
            () -> new Right_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_13_16 = registerBlock("right_1_13_16",
            () -> new Right_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> S_13_16 = registerBlock("s_13_16",
            () -> new S_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> SLASH_13_16 = registerBlock("slash_13_16",
            () -> new Slash_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> SLASH_1_13_16 = registerBlock("slash_1_13_16",
            () -> new Slash_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> SLOW_0_13_16 = registerBlock("slow_0_13_16",
            () -> new Slow_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> SLOW_1_13_16 = registerBlock("slow_1_13_16",
            () -> new Slow_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> STOP_0_13_16 = registerBlock("stop_0_13_16",
            () -> new Stop_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> STOP_1_13_16 = registerBlock("stop_1_13_16",
            () -> new Stop_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_13_16 = registerBlock("straight2d_13_16",
            () -> new Straight2D_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_13_16 = registerBlock("straight2i_13_16",
            () -> new Straight2I_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_13_16 = registerBlock("straight2t_13_16",
            () -> new Straight2T_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_13_16 = registerBlock("straight2_13_16",
            () -> new Straight2_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> T_13_16 = registerBlock("t_13_16",
            () -> new T_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> TAXI_0_13_16 = registerBlock("taxi_0_13_16",
            () -> new Taxi_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> TAXI_1_13_16 = registerBlock("taxi_1_13_16",
            () -> new Taxi_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_D_13_16 = registerBlock("thick2_d_13_16",
            () -> new Thick2_D_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_I_13_16 = registerBlock("thick2_i_13_16",
            () -> new Thick2_I_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_T_13_16 = registerBlock("thick2_t_13_16",
            () -> new Thick2_T_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_D_13_16 = registerBlock("thicks_d_13_16",
            () -> new ThickS_D_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_I_13_16 = registerBlock("thicks_i_13_16",
            () -> new ThickS_I_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_T_13_16 = registerBlock("thicks_t_13_16",
            () -> new ThickS_T_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_13_16 = registerBlock("thickstraight_13_16",
            () -> new ThickStraight_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> TOWN_0_13_16 = registerBlock("town_0_13_16",
            () -> new Town_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> TOWN_1_13_16 = registerBlock("town_1_13_16",
            () -> new Town_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> TURN_0_13_16 = registerBlock("turn_0_13_16",
            () -> new Turn_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> TURN_1_13_16 = registerBlock("turn_1_13_16",
            () -> new Turn_1_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> U_13_16 = registerBlock("u_13_16",
            () -> new U_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> V_13_16 = registerBlock("v_13_16",
            () -> new V_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> W_13_16 = registerBlock("w_13_16",
            () -> new W_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_13_16 = registerBlock("wheelchair_0_13_16",
            () -> new Wheelchair_0_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> X_13_16 = registerBlock("x_13_16",
            () -> new X_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> Y_13_16 = registerBlock("y_13_16",
            () -> new Y_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

    public static final RegistryObject<Block> Z_13_16 = registerBlock("z_13_16",
            () -> new Z_13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);

// 14_16 Road Paints



    public static final RegistryObject<Block> A_14_16 = registerBlock("a_14_16",
            () -> new A_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ARROW2_14_16 = registerBlock("arrow2_14_16",
            () -> new Arrow2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_14_16 = registerBlock("arrowline_1_14_16",
            () -> new ArrowLine_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_14_16 = registerBlock("arrowline_2_14_16",
            () -> new ArrowLine_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ARROW_3_14_16 = registerBlock("arrow_3_14_16",
            () -> new Arrow_3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_14_16 = registerBlock("arrowdiagonal2_14_16",
            () -> new Arrowdiagonal2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_14_16 = registerBlock("arrowdiagonal_14_16",
            () -> new Arrowdiagonal_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_14_16 = registerBlock("arrowline_0_14_16",
            () -> new Arrowline_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_14_16 = registerBlock("arrowline_3_14_16",
            () -> new Arrowline_3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> B_14_16 = registerBlock("b_14_16",
            () -> new B_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_14_16 = registerBlock("bikeicon_0_14_16",
            () -> new BikeIcon_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_14_16 = registerBlock("bikeicon_1_14_16",
            () -> new BikeIcon_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> BIKE_14_16 = registerBlock("bike_14_16",
            () -> new Bike_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> BIKE_1_14_16 = registerBlock("bike_1_14_16",
            () -> new Bike_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> BUS_0_14_16 = registerBlock("bus_0_14_16",
            () -> new Bus_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> BUS_1_14_16 = registerBlock("bus_1_14_16",
            () -> new Bus_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> C_14_16 = registerBlock("c_14_16",
            () -> new C_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_14_16 = registerBlock("centre_0_14_16",
            () -> new Centre_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_14_16 = registerBlock("centre_1_14_16",
            () -> new Centre_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_14_16 = registerBlock("chevronright_a_0_14_16",
            () -> new ChevronRight_A_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_14_16 = registerBlock("chevronright_a_thin_0_14_16",
            () -> new ChevronRight_A_Thin_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_14_16 = registerBlock("chevron_0_14_16",
            () -> new Chevron_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_14_16 = registerBlock("chevron_left_a_14_16",
            () -> new Chevron_Left_A_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_14_16 = registerBlock("chevron_left_a_thin_14_16",
            () -> new Chevron_Left_A_Thin_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_14_16 = registerBlock("chevron_mid_0_14_16",
            () -> new Chevron_Mid_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_14_16 = registerBlock("chevron_mid_1_14_16",
            () -> new Chevron_Mid_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_14_16 = registerBlock("chevron_mid_left_14_16",
            () -> new Chevron_Mid_Left_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_14_16 = registerBlock("chevron_mid_left_thin_14_16",
            () -> new Chevron_Mid_Left_Thin_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_14_16 = registerBlock("chevron_mid_right_0_14_16",
            () -> new Chevron_Mid_Right_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_14_16 = registerBlock("chevron_mid_right_1_14_16",
            () -> new Chevron_Mid_Right_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_14_16 = registerBlock("chevron_side_line_0_14_16",
            () -> new Chevron_Side_Line_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CITY_0_14_16 = registerBlock("city_0_14_16",
            () -> new City_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CITY_1_14_16 = registerBlock("city_1_14_16",
            () -> new City_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_14_16 = registerBlock("clear_0_14_16",
            () -> new Clear_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_14_16 = registerBlock("clear_1_14_16",
            () -> new Clear_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_14_16 = registerBlock("crossingdiagonal_0_14_16",
            () -> new CrossingDiagonal_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_14_16 = registerBlock("crossingdiagonal_1_14_16",
            () -> new CrossingDiagonal_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_14_16 = registerBlock("crossingdiagonal_2_14_16",
            () -> new CrossingDiagonal_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_14_16 = registerBlock("crossingdiagonal_3_14_16",
            () -> new CrossingDiagonal_3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_14_16 = registerBlock("crossingpaint_0_14_16",
            () -> new CrossingPaint_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_14_16 = registerBlock("crossingpaint_1_14_16",
            () -> new CrossingPaint_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_14_16 = registerBlock("crossingpaint_2_14_16",
            () -> new CrossingPaint_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> D_14_16 = registerBlock("d_14_16",
            () -> new D_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_14_16 = registerBlock("diagonalcrossing_14_16",
            () -> new DiagonalCrossing_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> E_14_16 = registerBlock("e_14_16",
            () -> new E_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_14_16 = registerBlock("entry_0_14_16",
            () -> new Entry_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_14_16 = registerBlock("entry_1_14_16",
            () -> new Entry_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_14_16 = registerBlock("exclamation_14_16",
            () -> new Exclamation_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> F_14_16 = registerBlock("f_14_16",
            () -> new F_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> G_14_16 = registerBlock("g_14_16",
            () -> new G_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_14_16 = registerBlock("giveway_0_14_16",
            () -> new GiveWay_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> H_14_16 = registerBlock("h_14_16",
            () -> new H_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> HASHTAG_14_16 = registerBlock("hashtag_14_16",
            () -> new Hashtag_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_14_16 = registerBlock("hatchbox_14_16",
            () -> new Hatchbox_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> I_14_16 = registerBlock("i_14_16",
            () -> new I_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> J_14_16 = registerBlock("j_14_16",
            () -> new J_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_14_16 = registerBlock("junction_a_0_14_16",
            () -> new Junction_A_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_14_16 = registerBlock("junction_a_1_14_16",
            () -> new Junction_A_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_14_16 = registerBlock("junction_a_2_14_16",
            () -> new Junction_A_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_14_16 = registerBlock("junction_b_0_14_16",
            () -> new Junction_B_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_14_16 = registerBlock("junction_b_1_14_16",
            () -> new Junction_B_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_14_16 = registerBlock("junction_b_2_14_16",
            () -> new Junction_B_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_14_16 = registerBlock("junction_filter_left_0_14_16",
            () -> new Junction_Filter_Left_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_14_16 = registerBlock("junction_filter_left_empty_0_14_16",
            () -> new Junction_Filter_Left_Empty_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_14_16 = registerBlock("junction_filter_left_thin_0_14_16",
            () -> new Junction_Filter_Left_Thin_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_14_16 = registerBlock("junction_filter_right_0_14_16",
            () -> new Junction_Filter_Right_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_14_16 = registerBlock("junction_filter_right_empty_0_14_16",
            () -> new Junction_Filter_Right_Empty_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_14_16 = registerBlock("junction_filter_right_thin_0_14_16",
            () -> new Junction_Filter_Right_Thin_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_14_16 = registerBlock("junction_fork_chevron_mid_0_14_16",
            () -> new Junction_Fork_Chevron_Mid_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_14_16 = registerBlock("junction_fork_chevron_mid_thin_0_14_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_14_16 = registerBlock("junction_fork_mid_0_14_16",
            () -> new Junction_Fork_Mid_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_14_16 = registerBlock("junction_fork_mid_0_thin_14_16",
            () -> new Junction_Fork_Mid_0_Thin_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_14_16 = registerBlock("junction_mid_line_connection_14_16",
            () -> new Junction_Mid_Line_Connection_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_14_16 = registerBlock("junction_mid_line_connection_1_14_16",
            () -> new Junction_Mid_Line_Connection_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_14_16 = registerBlock("junction_mid_line_connection_2_14_16",
            () -> new Junction_Mid_Line_Connection_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_14_16 = registerBlock("junction_mid_line_connection_3_14_16",
            () -> new Junction_Mid_Line_Connection_3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_14_16 = registerBlock("junction_side_line_connection_0_14_16",
            () -> new Junction_Side_Line_Connection_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_14_16 = registerBlock("junction_side_line_connection_1_14_16",
            () -> new Junction_Side_Line_Connection_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_14_16 = registerBlock("junction_side_line_connection_2_14_16",
            () -> new Junction_Side_Line_Connection_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_14_16 = registerBlock("junction_side_line_connection_3_14_16",
            () -> new Junction_Side_Line_Connection_3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_14_16 = registerBlock("junction_side_line_connection_thick_0_14_16",
            () -> new Junction_Side_Line_Connection_Thick_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_14_16 = registerBlock("junction_side_line_connection_thick_1_14_16",
            () -> new Junction_Side_Line_Connection_Thick_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_14_16 = registerBlock("junction_side_line_connection_thick_2_14_16",
            () -> new Junction_Side_Line_Connection_Thick_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_14_16 = registerBlock("junction_side_line_connection_thick_3_14_16",
            () -> new Junction_Side_Line_Connection_Thick_3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_14_16 = registerBlock("junction_side_line_connection_thin_0_14_16",
            () -> new Junction_Side_Line_Connection_Thin_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_14_16 = registerBlock("junction_side_line_connection_thin_1_14_16",
            () -> new Junction_Side_Line_Connection_Thin_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_14_16 = registerBlock("junction_side_line_connection_thin_2_14_16",
            () -> new Junction_Side_Line_Connection_Thin_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_14_16 = registerBlock("junction_side_line_thin_3_14_16",
            () -> new Junction_Side_Line_Thin_3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_14_16 = registerBlock("junction_side_line_connection_thin_3_14_16",
            () -> new Junction_side_line_connection_thin_3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> K_14_16 = registerBlock("k_14_16",
            () -> new K_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> KEEP_0_14_16 = registerBlock("keep_0_14_16",
            () -> new Keep_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> KEEP_1_14_16 = registerBlock("keep_1_14_16",
            () -> new Keep_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> L_14_16 = registerBlock("l_14_16",
            () -> new L_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LANE_0_14_16 = registerBlock("lane_0_14_16",
            () -> new Lane_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LANE_1_14_16 = registerBlock("lane_1_14_16",
            () -> new Lane_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LEFT_0_14_16 = registerBlock("left_0_14_16",
            () -> new Left_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LEFT_1_14_16 = registerBlock("left_1_14_16",
            () -> new Left_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER0_14_16 = registerBlock("letter0_14_16",
            () -> new Letter0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER1_14_16 = registerBlock("letter1_14_16",
            () -> new Letter1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER2_14_16 = registerBlock("letter2_14_16",
            () -> new Letter2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER3_14_16 = registerBlock("letter3_14_16",
            () -> new Letter3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER4_14_16 = registerBlock("letter4_14_16",
            () -> new Letter4_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER5_14_16 = registerBlock("letter5_14_16",
            () -> new Letter5_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER6_14_16 = registerBlock("letter6_14_16",
            () -> new Letter6_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER7_14_16 = registerBlock("letter7_14_16",
            () -> new Letter7_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER8_14_16 = registerBlock("letter8_14_16",
            () -> new Letter8_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER9_14_16 = registerBlock("letter9_14_16",
            () -> new Letter9_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_14_16 = registerBlock("lineedgethick_0_14_16",
            () -> new LineEdgeThick_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_14_16 = registerBlock("lineedgethick_1_14_16",
            () -> new LineEdgeThick_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_14_16 = registerBlock("lineedgethick_2_14_16",
            () -> new LineEdgeThick_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_14_16 = registerBlock("lineedgethick_3_14_16",
            () -> new LineEdgeThick_3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_14_16 = registerBlock("lineedge_1_14_16",
            () -> new LineEdge_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_14_16 = registerBlock("lineedge_2_14_16",
            () -> new LineEdge_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_14_16 = registerBlock("lineedge_3_14_16",
            () -> new LineEdge_3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_14_16 = registerBlock("linemiddledash_14_16",
            () -> new LineMiddleDash_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_14_16 = registerBlock("linemiddlehalf_14_16",
            () -> new LineMiddleHalf_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_14_16 = registerBlock("linemiddleshort_14_16",
            () -> new LineMiddleShort_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_14_16 = registerBlock("lineside1_14_16",
            () -> new LineSide1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_14_16 = registerBlock("lineside2_14_16",
            () -> new LineSide2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_14_16 = registerBlock("lineside3_14_16",
            () -> new LineSide3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_14_16 = registerBlock("lineside4_14_16",
            () -> new LineSide4_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_14_16 = registerBlock("lineside5_14_16",
            () -> new LineSide5_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_14_16 = registerBlock("lineside6_14_16",
            () -> new LineSide6_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_14_16 = registerBlock("linesidedoublethick_0_14_16",
            () -> new LineSideDoubleThick_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_14_16 = registerBlock("linesidedoublethick_1_14_16",
            () -> new LineSideDoubleThick_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_14_16 = registerBlock("linesidedouble_14_16",
            () -> new LineSideDouble_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_14_16 = registerBlock("linesidedouble_1_14_16",
            () -> new LineSideDouble_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_14_16 = registerBlock("linesidethick_0_14_16",
            () -> new LineSideThick_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_14_16 = registerBlock("linesidethick_1_14_16",
            () -> new LineSideThick_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_14_16 = registerBlock("linesidethick_2_14_16",
            () -> new LineSideThick_2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_14_16 = registerBlock("linesidethick_3_14_16",
            () -> new LineSideThick_3_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_14_16 = registerBlock("linesidethick_4_14_16",
            () -> new LineSideThick_4_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_14_16 = registerBlock("linesidethick_5_14_16",
            () -> new LineSideThick_5_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> M_14_16 = registerBlock("m_14_16",
            () -> new M_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> MERGE_0_14_16 = registerBlock("merge_0_14_16",
            () -> new Merge_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> MERGE_1_14_16 = registerBlock("merge_1_14_16",
            () -> new Merge_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> N_14_16 = registerBlock("n_14_16",
            () -> new N_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> NO_0_14_16 = registerBlock("no_0_14_16",
            () -> new No_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> NO_1_14_16 = registerBlock("no_1_14_16",
            () -> new No_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> O_14_16 = registerBlock("o_14_16",
            () -> new O_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ONLY_0_14_16 = registerBlock("only_0_14_16",
            () -> new Only_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> ONLY_1_14_16 = registerBlock("only_1_14_16",
            () -> new Only_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> P_14_16 = registerBlock("p_14_16",
            () -> new P_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_14_16 = registerBlock("pedestrian_14_16",
            () -> new Pedestrian_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> Q_14_16 = registerBlock("q_14_16",
            () -> new Q_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> QUESTION_14_16 = registerBlock("question_14_16",
            () -> new Question_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> R_14_16 = registerBlock("r_14_16",
            () -> new R_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_14_16 = registerBlock("right_0_14_16",
            () -> new Right_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_14_16 = registerBlock("right_1_14_16",
            () -> new Right_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> S_14_16 = registerBlock("s_14_16",
            () -> new S_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> SLASH_14_16 = registerBlock("slash_14_16",
            () -> new Slash_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> SLASH_1_14_16 = registerBlock("slash_1_14_16",
            () -> new Slash_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> SLOW_0_14_16 = registerBlock("slow_0_14_16",
            () -> new Slow_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> SLOW_1_14_16 = registerBlock("slow_1_14_16",
            () -> new Slow_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> STOP_0_14_16 = registerBlock("stop_0_14_16",
            () -> new Stop_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> STOP_1_14_16 = registerBlock("stop_1_14_16",
            () -> new Stop_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_14_16 = registerBlock("straight2d_14_16",
            () -> new Straight2D_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_14_16 = registerBlock("straight2i_14_16",
            () -> new Straight2I_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_14_16 = registerBlock("straight2t_14_16",
            () -> new Straight2T_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_14_16 = registerBlock("straight2_14_16",
            () -> new Straight2_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> T_14_16 = registerBlock("t_14_16",
            () -> new T_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> TAXI_0_14_16 = registerBlock("taxi_0_14_16",
            () -> new Taxi_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> TAXI_1_14_16 = registerBlock("taxi_1_14_16",
            () -> new Taxi_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_D_14_16 = registerBlock("thick2_d_14_16",
            () -> new Thick2_D_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_I_14_16 = registerBlock("thick2_i_14_16",
            () -> new Thick2_I_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_T_14_16 = registerBlock("thick2_t_14_16",
            () -> new Thick2_T_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_D_14_16 = registerBlock("thicks_d_14_16",
            () -> new ThickS_D_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_I_14_16 = registerBlock("thicks_i_14_16",
            () -> new ThickS_I_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_T_14_16 = registerBlock("thicks_t_14_16",
            () -> new ThickS_T_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_14_16 = registerBlock("thickstraight_14_16",
            () -> new ThickStraight_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> TOWN_0_14_16 = registerBlock("town_0_14_16",
            () -> new Town_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> TOWN_1_14_16 = registerBlock("town_1_14_16",
            () -> new Town_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> TURN_0_14_16 = registerBlock("turn_0_14_16",
            () -> new Turn_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> TURN_1_14_16 = registerBlock("turn_1_14_16",
            () -> new Turn_1_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> U_14_16 = registerBlock("u_14_16",
            () -> new U_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> V_14_16 = registerBlock("v_14_16",
            () -> new V_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> W_14_16 = registerBlock("w_14_16",
            () -> new W_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_14_16 = registerBlock("wheelchair_0_14_16",
            () -> new Wheelchair_0_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> X_14_16 = registerBlock("x_14_16",
            () -> new X_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> Y_14_16 = registerBlock("y_14_16",
            () -> new Y_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

    public static final RegistryObject<Block> Z_14_16 = registerBlock("z_14_16",
            () -> new Z_14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);

// 15_16 Road Paints



    public static final RegistryObject<Block> A_15_16 = registerBlock("a_15_16",
            () -> new A_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ARROW2_15_16 = registerBlock("arrow2_15_16",
            () -> new Arrow2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_15_16 = registerBlock("arrowline_1_15_16",
            () -> new ArrowLine_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_15_16 = registerBlock("arrowline_2_15_16",
            () -> new ArrowLine_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ARROW_3_15_16 = registerBlock("arrow_3_15_16",
            () -> new Arrow_3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_15_16 = registerBlock("arrowdiagonal2_15_16",
            () -> new Arrowdiagonal2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_15_16 = registerBlock("arrowdiagonal_15_16",
            () -> new Arrowdiagonal_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_15_16 = registerBlock("arrowline_0_15_16",
            () -> new Arrowline_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_15_16 = registerBlock("arrowline_3_15_16",
            () -> new Arrowline_3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> B_15_16 = registerBlock("b_15_16",
            () -> new B_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_15_16 = registerBlock("bikeicon_0_15_16",
            () -> new BikeIcon_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_15_16 = registerBlock("bikeicon_1_15_16",
            () -> new BikeIcon_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> BIKE_15_16 = registerBlock("bike_15_16",
            () -> new Bike_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> BIKE_1_15_16 = registerBlock("bike_1_15_16",
            () -> new Bike_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> BUS_0_15_16 = registerBlock("bus_0_15_16",
            () -> new Bus_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> BUS_1_15_16 = registerBlock("bus_1_15_16",
            () -> new Bus_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> C_15_16 = registerBlock("c_15_16",
            () -> new C_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_15_16 = registerBlock("centre_0_15_16",
            () -> new Centre_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_15_16 = registerBlock("centre_1_15_16",
            () -> new Centre_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_15_16 = registerBlock("chevronright_a_0_15_16",
            () -> new ChevronRight_A_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_15_16 = registerBlock("chevronright_a_thin_0_15_16",
            () -> new ChevronRight_A_Thin_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_15_16 = registerBlock("chevron_0_15_16",
            () -> new Chevron_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_15_16 = registerBlock("chevron_left_a_15_16",
            () -> new Chevron_Left_A_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_15_16 = registerBlock("chevron_left_a_thin_15_16",
            () -> new Chevron_Left_A_Thin_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_15_16 = registerBlock("chevron_mid_0_15_16",
            () -> new Chevron_Mid_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_15_16 = registerBlock("chevron_mid_1_15_16",
            () -> new Chevron_Mid_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_15_16 = registerBlock("chevron_mid_left_15_16",
            () -> new Chevron_Mid_Left_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_15_16 = registerBlock("chevron_mid_left_thin_15_16",
            () -> new Chevron_Mid_Left_Thin_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_15_16 = registerBlock("chevron_mid_right_0_15_16",
            () -> new Chevron_Mid_Right_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_15_16 = registerBlock("chevron_mid_right_1_15_16",
            () -> new Chevron_Mid_Right_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_15_16 = registerBlock("chevron_side_line_0_15_16",
            () -> new Chevron_Side_Line_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CITY_0_15_16 = registerBlock("city_0_15_16",
            () -> new City_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CITY_1_15_16 = registerBlock("city_1_15_16",
            () -> new City_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_15_16 = registerBlock("clear_0_15_16",
            () -> new Clear_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_15_16 = registerBlock("clear_1_15_16",
            () -> new Clear_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_15_16 = registerBlock("crossingdiagonal_0_15_16",
            () -> new CrossingDiagonal_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_15_16 = registerBlock("crossingdiagonal_1_15_16",
            () -> new CrossingDiagonal_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_15_16 = registerBlock("crossingdiagonal_2_15_16",
            () -> new CrossingDiagonal_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_15_16 = registerBlock("crossingdiagonal_3_15_16",
            () -> new CrossingDiagonal_3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_15_16 = registerBlock("crossingpaint_0_15_16",
            () -> new CrossingPaint_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_15_16 = registerBlock("crossingpaint_1_15_16",
            () -> new CrossingPaint_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_15_16 = registerBlock("crossingpaint_2_15_16",
            () -> new CrossingPaint_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> D_15_16 = registerBlock("d_15_16",
            () -> new D_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_15_16 = registerBlock("diagonalcrossing_15_16",
            () -> new DiagonalCrossing_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> E_15_16 = registerBlock("e_15_16",
            () -> new E_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_15_16 = registerBlock("entry_0_15_16",
            () -> new Entry_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_15_16 = registerBlock("entry_1_15_16",
            () -> new Entry_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_15_16 = registerBlock("exclamation_15_16",
            () -> new Exclamation_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> F_15_16 = registerBlock("f_15_16",
            () -> new F_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> G_15_16 = registerBlock("g_15_16",
            () -> new G_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_15_16 = registerBlock("giveway_0_15_16",
            () -> new GiveWay_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> H_15_16 = registerBlock("h_15_16",
            () -> new H_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> HASHTAG_15_16 = registerBlock("hashtag_15_16",
            () -> new Hashtag_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_15_16 = registerBlock("hatchbox_15_16",
            () -> new Hatchbox_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> I_15_16 = registerBlock("i_15_16",
            () -> new I_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> J_15_16 = registerBlock("j_15_16",
            () -> new J_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_15_16 = registerBlock("junction_a_0_15_16",
            () -> new Junction_A_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_15_16 = registerBlock("junction_a_1_15_16",
            () -> new Junction_A_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_15_16 = registerBlock("junction_a_2_15_16",
            () -> new Junction_A_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_15_16 = registerBlock("junction_b_0_15_16",
            () -> new Junction_B_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_15_16 = registerBlock("junction_b_1_15_16",
            () -> new Junction_B_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_15_16 = registerBlock("junction_b_2_15_16",
            () -> new Junction_B_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_15_16 = registerBlock("junction_filter_left_0_15_16",
            () -> new Junction_Filter_Left_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_15_16 = registerBlock("junction_filter_left_empty_0_15_16",
            () -> new Junction_Filter_Left_Empty_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_15_16 = registerBlock("junction_filter_left_thin_0_15_16",
            () -> new Junction_Filter_Left_Thin_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_15_16 = registerBlock("junction_filter_right_0_15_16",
            () -> new Junction_Filter_Right_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_15_16 = registerBlock("junction_filter_right_empty_0_15_16",
            () -> new Junction_Filter_Right_Empty_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_15_16 = registerBlock("junction_filter_right_thin_0_15_16",
            () -> new Junction_Filter_Right_Thin_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_15_16 = registerBlock("junction_fork_chevron_mid_0_15_16",
            () -> new Junction_Fork_Chevron_Mid_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_15_16 = registerBlock("junction_fork_chevron_mid_thin_0_15_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_15_16 = registerBlock("junction_fork_mid_0_15_16",
            () -> new Junction_Fork_Mid_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_15_16 = registerBlock("junction_fork_mid_0_thin_15_16",
            () -> new Junction_Fork_Mid_0_Thin_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_15_16 = registerBlock("junction_mid_line_connection_15_16",
            () -> new Junction_Mid_Line_Connection_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_15_16 = registerBlock("junction_mid_line_connection_1_15_16",
            () -> new Junction_Mid_Line_Connection_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_15_16 = registerBlock("junction_mid_line_connection_2_15_16",
            () -> new Junction_Mid_Line_Connection_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_15_16 = registerBlock("junction_mid_line_connection_3_15_16",
            () -> new Junction_Mid_Line_Connection_3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_15_16 = registerBlock("junction_side_line_connection_0_15_16",
            () -> new Junction_Side_Line_Connection_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_15_16 = registerBlock("junction_side_line_connection_1_15_16",
            () -> new Junction_Side_Line_Connection_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_15_16 = registerBlock("junction_side_line_connection_2_15_16",
            () -> new Junction_Side_Line_Connection_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_15_16 = registerBlock("junction_side_line_connection_3_15_16",
            () -> new Junction_Side_Line_Connection_3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_15_16 = registerBlock("junction_side_line_connection_thick_0_15_16",
            () -> new Junction_Side_Line_Connection_Thick_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_15_16 = registerBlock("junction_side_line_connection_thick_1_15_16",
            () -> new Junction_Side_Line_Connection_Thick_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_15_16 = registerBlock("junction_side_line_connection_thick_2_15_16",
            () -> new Junction_Side_Line_Connection_Thick_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_15_16 = registerBlock("junction_side_line_connection_thick_3_15_16",
            () -> new Junction_Side_Line_Connection_Thick_3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_15_16 = registerBlock("junction_side_line_connection_thin_0_15_16",
            () -> new Junction_Side_Line_Connection_Thin_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_15_16 = registerBlock("junction_side_line_connection_thin_1_15_16",
            () -> new Junction_Side_Line_Connection_Thin_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_15_16 = registerBlock("junction_side_line_connection_thin_2_15_16",
            () -> new Junction_Side_Line_Connection_Thin_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_15_16 = registerBlock("junction_side_line_thin_3_15_16",
            () -> new Junction_Side_Line_Thin_3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_15_16 = registerBlock("junction_side_line_connection_thin_3_15_16",
            () -> new Junction_side_line_connection_thin_3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> K_15_16 = registerBlock("k_15_16",
            () -> new K_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> KEEP_0_15_16 = registerBlock("keep_0_15_16",
            () -> new Keep_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> KEEP_1_15_16 = registerBlock("keep_1_15_16",
            () -> new Keep_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> L_15_16 = registerBlock("l_15_16",
            () -> new L_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LANE_0_15_16 = registerBlock("lane_0_15_16",
            () -> new Lane_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LANE_1_15_16 = registerBlock("lane_1_15_16",
            () -> new Lane_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LEFT_0_15_16 = registerBlock("left_0_15_16",
            () -> new Left_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LEFT_1_15_16 = registerBlock("left_1_15_16",
            () -> new Left_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER0_15_16 = registerBlock("letter0_15_16",
            () -> new Letter0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER1_15_16 = registerBlock("letter1_15_16",
            () -> new Letter1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER2_15_16 = registerBlock("letter2_15_16",
            () -> new Letter2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER3_15_16 = registerBlock("letter3_15_16",
            () -> new Letter3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER4_15_16 = registerBlock("letter4_15_16",
            () -> new Letter4_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER5_15_16 = registerBlock("letter5_15_16",
            () -> new Letter5_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER6_15_16 = registerBlock("letter6_15_16",
            () -> new Letter6_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER7_15_16 = registerBlock("letter7_15_16",
            () -> new Letter7_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER8_15_16 = registerBlock("letter8_15_16",
            () -> new Letter8_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER9_15_16 = registerBlock("letter9_15_16",
            () -> new Letter9_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_15_16 = registerBlock("lineedgethick_0_15_16",
            () -> new LineEdgeThick_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_15_16 = registerBlock("lineedgethick_1_15_16",
            () -> new LineEdgeThick_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_15_16 = registerBlock("lineedgethick_2_15_16",
            () -> new LineEdgeThick_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_15_16 = registerBlock("lineedgethick_3_15_16",
            () -> new LineEdgeThick_3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_15_16 = registerBlock("lineedge_1_15_16",
            () -> new LineEdge_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_15_16 = registerBlock("lineedge_2_15_16",
            () -> new LineEdge_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_15_16 = registerBlock("lineedge_3_15_16",
            () -> new LineEdge_3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_15_16 = registerBlock("linemiddledash_15_16",
            () -> new LineMiddleDash_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_15_16 = registerBlock("linemiddlehalf_15_16",
            () -> new LineMiddleHalf_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_15_16 = registerBlock("linemiddleshort_15_16",
            () -> new LineMiddleShort_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_15_16 = registerBlock("lineside1_15_16",
            () -> new LineSide1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_15_16 = registerBlock("lineside2_15_16",
            () -> new LineSide2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_15_16 = registerBlock("lineside3_15_16",
            () -> new LineSide3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_15_16 = registerBlock("lineside4_15_16",
            () -> new LineSide4_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_15_16 = registerBlock("lineside5_15_16",
            () -> new LineSide5_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_15_16 = registerBlock("lineside6_15_16",
            () -> new LineSide6_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_15_16 = registerBlock("linesidedoublethick_0_15_16",
            () -> new LineSideDoubleThick_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_15_16 = registerBlock("linesidedoublethick_1_15_16",
            () -> new LineSideDoubleThick_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_15_16 = registerBlock("linesidedouble_15_16",
            () -> new LineSideDouble_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_15_16 = registerBlock("linesidedouble_1_15_16",
            () -> new LineSideDouble_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_15_16 = registerBlock("linesidethick_0_15_16",
            () -> new LineSideThick_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_15_16 = registerBlock("linesidethick_1_15_16",
            () -> new LineSideThick_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_15_16 = registerBlock("linesidethick_2_15_16",
            () -> new LineSideThick_2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_15_16 = registerBlock("linesidethick_3_15_16",
            () -> new LineSideThick_3_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_15_16 = registerBlock("linesidethick_4_15_16",
            () -> new LineSideThick_4_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_15_16 = registerBlock("linesidethick_5_15_16",
            () -> new LineSideThick_5_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> M_15_16 = registerBlock("m_15_16",
            () -> new M_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> MERGE_0_15_16 = registerBlock("merge_0_15_16",
            () -> new Merge_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> MERGE_1_15_16 = registerBlock("merge_1_15_16",
            () -> new Merge_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> N_15_16 = registerBlock("n_15_16",
            () -> new N_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> NO_0_15_16 = registerBlock("no_0_15_16",
            () -> new No_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> NO_1_15_16 = registerBlock("no_1_15_16",
            () -> new No_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> O_15_16 = registerBlock("o_15_16",
            () -> new O_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ONLY_0_15_16 = registerBlock("only_0_15_16",
            () -> new Only_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> ONLY_1_15_16 = registerBlock("only_1_15_16",
            () -> new Only_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> P_15_16 = registerBlock("p_15_16",
            () -> new P_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_15_16 = registerBlock("pedestrian_15_16",
            () -> new Pedestrian_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> Q_15_16 = registerBlock("q_15_16",
            () -> new Q_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> QUESTION_15_16 = registerBlock("question_15_16",
            () -> new Question_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> R_15_16 = registerBlock("r_15_16",
            () -> new R_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_15_16 = registerBlock("right_0_15_16",
            () -> new Right_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_15_16 = registerBlock("right_1_15_16",
            () -> new Right_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> S_15_16 = registerBlock("s_15_16",
            () -> new S_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> SLASH_15_16 = registerBlock("slash_15_16",
            () -> new Slash_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> SLASH_1_15_16 = registerBlock("slash_1_15_16",
            () -> new Slash_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> SLOW_0_15_16 = registerBlock("slow_0_15_16",
            () -> new Slow_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> SLOW_1_15_16 = registerBlock("slow_1_15_16",
            () -> new Slow_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> STOP_0_15_16 = registerBlock("stop_0_15_16",
            () -> new Stop_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> STOP_1_15_16 = registerBlock("stop_1_15_16",
            () -> new Stop_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_15_16 = registerBlock("straight2d_15_16",
            () -> new Straight2D_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_15_16 = registerBlock("straight2i_15_16",
            () -> new Straight2I_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_15_16 = registerBlock("straight2t_15_16",
            () -> new Straight2T_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_15_16 = registerBlock("straight2_15_16",
            () -> new Straight2_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> T_15_16 = registerBlock("t_15_16",
            () -> new T_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> TAXI_0_15_16 = registerBlock("taxi_0_15_16",
            () -> new Taxi_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> TAXI_1_15_16 = registerBlock("taxi_1_15_16",
            () -> new Taxi_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_D_15_16 = registerBlock("thick2_d_15_16",
            () -> new Thick2_D_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_I_15_16 = registerBlock("thick2_i_15_16",
            () -> new Thick2_I_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_T_15_16 = registerBlock("thick2_t_15_16",
            () -> new Thick2_T_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_D_15_16 = registerBlock("thicks_d_15_16",
            () -> new ThickS_D_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_I_15_16 = registerBlock("thicks_i_15_16",
            () -> new ThickS_I_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_T_15_16 = registerBlock("thicks_t_15_16",
            () -> new ThickS_T_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_15_16 = registerBlock("thickstraight_15_16",
            () -> new ThickStraight_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> TOWN_0_15_16 = registerBlock("town_0_15_16",
            () -> new Town_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> TOWN_1_15_16 = registerBlock("town_1_15_16",
            () -> new Town_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> TURN_0_15_16 = registerBlock("turn_0_15_16",
            () -> new Turn_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> TURN_1_15_16 = registerBlock("turn_1_15_16",
            () -> new Turn_1_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> U_15_16 = registerBlock("u_15_16",
            () -> new U_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> V_15_16 = registerBlock("v_15_16",
            () -> new V_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> W_15_16 = registerBlock("w_15_16",
            () -> new W_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_15_16 = registerBlock("wheelchair_0_15_16",
            () -> new Wheelchair_0_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> X_15_16 = registerBlock("x_15_16",
            () -> new X_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> Y_15_16 = registerBlock("y_15_16",
            () -> new Y_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

    public static final RegistryObject<Block> Z_15_16 = registerBlock("z_15_16",
            () -> new Z_15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);

// 16_16 Road Paints



    public static final RegistryObject<Block> A_16_16 = registerBlock("a_16_16",
            () -> new A_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ARROW2_16_16 = registerBlock("arrow2_16_16",
            () -> new Arrow2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_1_16_16 = registerBlock("arrowline_1_16_16",
            () -> new ArrowLine_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_2_16_16 = registerBlock("arrowline_2_16_16",
            () -> new ArrowLine_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ARROW_3_16_16 = registerBlock("arrow_3_16_16",
            () -> new Arrow_3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL2_16_16 = registerBlock("arrowdiagonal2_16_16",
            () -> new Arrowdiagonal2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWDIAGONAL_16_16 = registerBlock("arrowdiagonal_16_16",
            () -> new Arrowdiagonal_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_0_16_16 = registerBlock("arrowline_0_16_16",
            () -> new Arrowline_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ARROWLINE_3_16_16 = registerBlock("arrowline_3_16_16",
            () -> new Arrowline_3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> B_16_16 = registerBlock("b_16_16",
            () -> new B_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_0_16_16 = registerBlock("bikeicon_0_16_16",
            () -> new BikeIcon_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> BIKEICON_1_16_16 = registerBlock("bikeicon_1_16_16",
            () -> new BikeIcon_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> BIKE_16_16 = registerBlock("bike_16_16",
            () -> new Bike_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> BIKE_1_16_16 = registerBlock("bike_1_16_16",
            () -> new Bike_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> BUS_0_16_16 = registerBlock("bus_0_16_16",
            () -> new Bus_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> BUS_1_16_16 = registerBlock("bus_1_16_16",
            () -> new Bus_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> C_16_16 = registerBlock("c_16_16",
            () -> new C_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_0_16_16 = registerBlock("centre_0_16_16",
            () -> new Centre_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CENTRE_1_16_16 = registerBlock("centre_1_16_16",
            () -> new Centre_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_0_16_16 = registerBlock("chevronright_a_0_16_16",
            () -> new ChevronRight_A_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRONRIGHT_A_THIN_0_16_16 = registerBlock("chevronright_a_thin_0_16_16",
            () -> new ChevronRight_A_Thin_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_0_16_16 = registerBlock("chevron_0_16_16",
            () -> new Chevron_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_16_16 = registerBlock("chevron_left_a_16_16",
            () -> new Chevron_Left_A_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_LEFT_A_THIN_16_16 = registerBlock("chevron_left_a_thin_16_16",
            () -> new Chevron_Left_A_Thin_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_0_16_16 = registerBlock("chevron_mid_0_16_16",
            () -> new Chevron_Mid_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_1_16_16 = registerBlock("chevron_mid_1_16_16",
            () -> new Chevron_Mid_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_16_16 = registerBlock("chevron_mid_left_16_16",
            () -> new Chevron_Mid_Left_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_LEFT_THIN_16_16 = registerBlock("chevron_mid_left_thin_16_16",
            () -> new Chevron_Mid_Left_Thin_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_0_16_16 = registerBlock("chevron_mid_right_0_16_16",
            () -> new Chevron_Mid_Right_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_MID_RIGHT_1_16_16 = registerBlock("chevron_mid_right_1_16_16",
            () -> new Chevron_Mid_Right_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CHEVRON_SIDE_LINE_0_16_16 = registerBlock("chevron_side_line_0_16_16",
            () -> new Chevron_Side_Line_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CITY_0_16_16 = registerBlock("city_0_16_16",
            () -> new City_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CITY_1_16_16 = registerBlock("city_1_16_16",
            () -> new City_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_0_16_16 = registerBlock("clear_0_16_16",
            () -> new Clear_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CLEAR_1_16_16 = registerBlock("clear_1_16_16",
            () -> new Clear_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_0_16_16 = registerBlock("crossingdiagonal_0_16_16",
            () -> new CrossingDiagonal_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_1_16_16 = registerBlock("crossingdiagonal_1_16_16",
            () -> new CrossingDiagonal_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_2_16_16 = registerBlock("crossingdiagonal_2_16_16",
            () -> new CrossingDiagonal_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGDIAGONAL_3_16_16 = registerBlock("crossingdiagonal_3_16_16",
            () -> new CrossingDiagonal_3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_0_16_16 = registerBlock("crossingpaint_0_16_16",
            () -> new CrossingPaint_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_1_16_16 = registerBlock("crossingpaint_1_16_16",
            () -> new CrossingPaint_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> CROSSINGPAINT_2_16_16 = registerBlock("crossingpaint_2_16_16",
            () -> new CrossingPaint_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> D_16_16 = registerBlock("d_16_16",
            () -> new D_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> DIAGONALCROSSING_16_16 = registerBlock("diagonalcrossing_16_16",
            () -> new DiagonalCrossing_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> E_16_16 = registerBlock("e_16_16",
            () -> new E_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_0_16_16 = registerBlock("entry_0_16_16",
            () -> new Entry_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ENTRY_1_16_16 = registerBlock("entry_1_16_16",
            () -> new Entry_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> EXCLAMATION_16_16 = registerBlock("exclamation_16_16",
            () -> new Exclamation_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> F_16_16 = registerBlock("f_16_16",
            () -> new F_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> G_16_16 = registerBlock("g_16_16",
            () -> new G_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> GIVEWAY_0_16_16 = registerBlock("giveway_0_16_16",
            () -> new GiveWay_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> H_16_16 = registerBlock("h_16_16",
            () -> new H_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> HASHTAG_16_16 = registerBlock("hashtag_16_16",
            () -> new Hashtag_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> HATCHBOX_16_16 = registerBlock("hatchbox_16_16",
            () -> new Hatchbox_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> I_16_16 = registerBlock("i_16_16",
            () -> new I_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> J_16_16 = registerBlock("j_16_16",
            () -> new J_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_0_16_16 = registerBlock("junction_a_0_16_16",
            () -> new Junction_A_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_1_16_16 = registerBlock("junction_a_1_16_16",
            () -> new Junction_A_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_A_2_16_16 = registerBlock("junction_a_2_16_16",
            () -> new Junction_A_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_0_16_16 = registerBlock("junction_b_0_16_16",
            () -> new Junction_B_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_1_16_16 = registerBlock("junction_b_1_16_16",
            () -> new Junction_B_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_B_2_16_16 = registerBlock("junction_b_2_16_16",
            () -> new Junction_B_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_0_16_16 = registerBlock("junction_filter_left_0_16_16",
            () -> new Junction_Filter_Left_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_EMPTY_0_16_16 = registerBlock("junction_filter_left_empty_0_16_16",
            () -> new Junction_Filter_Left_Empty_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_LEFT_THIN_0_16_16 = registerBlock("junction_filter_left_thin_0_16_16",
            () -> new Junction_Filter_Left_Thin_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_0_16_16 = registerBlock("junction_filter_right_0_16_16",
            () -> new Junction_Filter_Right_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_EMPTY_0_16_16 = registerBlock("junction_filter_right_empty_0_16_16",
            () -> new Junction_Filter_Right_Empty_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FILTER_RIGHT_THIN_0_16_16 = registerBlock("junction_filter_right_thin_0_16_16",
            () -> new Junction_Filter_Right_Thin_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_0_16_16 = registerBlock("junction_fork_chevron_mid_0_16_16",
            () -> new Junction_Fork_Chevron_Mid_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_CHEVRON_MID_THIN_0_16_16 = registerBlock("junction_fork_chevron_mid_thin_0_16_16",
            () -> new Junction_Fork_Chevron_Mid_Thin_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_16_16 = registerBlock("junction_fork_mid_0_16_16",
            () -> new Junction_Fork_Mid_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_FORK_MID_0_THIN_16_16 = registerBlock("junction_fork_mid_0_thin_16_16",
            () -> new Junction_Fork_Mid_0_Thin_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_16_16 = registerBlock("junction_mid_line_connection_16_16",
            () -> new Junction_Mid_Line_Connection_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_1_16_16 = registerBlock("junction_mid_line_connection_1_16_16",
            () -> new Junction_Mid_Line_Connection_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_2_16_16 = registerBlock("junction_mid_line_connection_2_16_16",
            () -> new Junction_Mid_Line_Connection_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_MID_LINE_CONNECTION_3_16_16 = registerBlock("junction_mid_line_connection_3_16_16",
            () -> new Junction_Mid_Line_Connection_3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_0_16_16 = registerBlock("junction_side_line_connection_0_16_16",
            () -> new Junction_Side_Line_Connection_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_1_16_16 = registerBlock("junction_side_line_connection_1_16_16",
            () -> new Junction_Side_Line_Connection_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_2_16_16 = registerBlock("junction_side_line_connection_2_16_16",
            () -> new Junction_Side_Line_Connection_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_3_16_16 = registerBlock("junction_side_line_connection_3_16_16",
            () -> new Junction_Side_Line_Connection_3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_0_16_16 = registerBlock("junction_side_line_connection_thick_0_16_16",
            () -> new Junction_Side_Line_Connection_Thick_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_1_16_16 = registerBlock("junction_side_line_connection_thick_1_16_16",
            () -> new Junction_Side_Line_Connection_Thick_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_2_16_16 = registerBlock("junction_side_line_connection_thick_2_16_16",
            () -> new Junction_Side_Line_Connection_Thick_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THICK_3_16_16 = registerBlock("junction_side_line_connection_thick_3_16_16",
            () -> new Junction_Side_Line_Connection_Thick_3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_0_16_16 = registerBlock("junction_side_line_connection_thin_0_16_16",
            () -> new Junction_Side_Line_Connection_Thin_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_1_16_16 = registerBlock("junction_side_line_connection_thin_1_16_16",
            () -> new Junction_Side_Line_Connection_Thin_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_2_16_16 = registerBlock("junction_side_line_connection_thin_2_16_16",
            () -> new Junction_Side_Line_Connection_Thin_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_THIN_3_16_16 = registerBlock("junction_side_line_thin_3_16_16",
            () -> new Junction_Side_Line_Thin_3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> JUNCTION_SIDE_LINE_CONNECTION_THIN_3_16_16 = registerBlock("junction_side_line_connection_thin_3_16_16",
            () -> new Junction_side_line_connection_thin_3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> K_16_16 = registerBlock("k_16_16",
            () -> new K_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> KEEP_0_16_16 = registerBlock("keep_0_16_16",
            () -> new Keep_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> KEEP_1_16_16 = registerBlock("keep_1_16_16",
            () -> new Keep_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> L_16_16 = registerBlock("l_16_16",
            () -> new L_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LANE_0_16_16 = registerBlock("lane_0_16_16",
            () -> new Lane_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LANE_1_16_16 = registerBlock("lane_1_16_16",
            () -> new Lane_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LEFT_0_16_16 = registerBlock("left_0_16_16",
            () -> new Left_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LEFT_1_16_16 = registerBlock("left_1_16_16",
            () -> new Left_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER0_16_16 = registerBlock("letter0_16_16",
            () -> new Letter0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER1_16_16 = registerBlock("letter1_16_16",
            () -> new Letter1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER2_16_16 = registerBlock("letter2_16_16",
            () -> new Letter2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER3_16_16 = registerBlock("letter3_16_16",
            () -> new Letter3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER4_16_16 = registerBlock("letter4_16_16",
            () -> new Letter4_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER5_16_16 = registerBlock("letter5_16_16",
            () -> new Letter5_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER6_16_16 = registerBlock("letter6_16_16",
            () -> new Letter6_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER7_16_16 = registerBlock("letter7_16_16",
            () -> new Letter7_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER8_16_16 = registerBlock("letter8_16_16",
            () -> new Letter8_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LETTER9_16_16 = registerBlock("letter9_16_16",
            () -> new Letter9_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_0_16_16 = registerBlock("lineedgethick_0_16_16",
            () -> new LineEdgeThick_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_1_16_16 = registerBlock("lineedgethick_1_16_16",
            () -> new LineEdgeThick_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_2_16_16 = registerBlock("lineedgethick_2_16_16",
            () -> new LineEdgeThick_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGETHICK_3_16_16 = registerBlock("lineedgethick_3_16_16",
            () -> new LineEdgeThick_3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_1_16_16 = registerBlock("lineedge_1_16_16",
            () -> new LineEdge_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_2_16_16 = registerBlock("lineedge_2_16_16",
            () -> new LineEdge_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINEEDGE_3_16_16 = registerBlock("lineedge_3_16_16",
            () -> new LineEdge_3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEDASH_16_16 = registerBlock("linemiddledash_16_16",
            () -> new LineMiddleDash_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLEHALF_16_16 = registerBlock("linemiddlehalf_16_16",
            () -> new LineMiddleHalf_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINEMIDDLESHORT_16_16 = registerBlock("linemiddleshort_16_16",
            () -> new LineMiddleShort_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE1_16_16 = registerBlock("lineside1_16_16",
            () -> new LineSide1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE2_16_16 = registerBlock("lineside2_16_16",
            () -> new LineSide2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE3_16_16 = registerBlock("lineside3_16_16",
            () -> new LineSide3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE4_16_16 = registerBlock("lineside4_16_16",
            () -> new LineSide4_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE5_16_16 = registerBlock("lineside5_16_16",
            () -> new LineSide5_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDE6_16_16 = registerBlock("lineside6_16_16",
            () -> new LineSide6_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_0_16_16 = registerBlock("linesidedoublethick_0_16_16",
            () -> new LineSideDoubleThick_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLETHICK_1_16_16 = registerBlock("linesidedoublethick_1_16_16",
            () -> new LineSideDoubleThick_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_16_16 = registerBlock("linesidedouble_16_16",
            () -> new LineSideDouble_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDEDOUBLE_1_16_16 = registerBlock("linesidedouble_1_16_16",
            () -> new LineSideDouble_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_0_16_16 = registerBlock("linesidethick_0_16_16",
            () -> new LineSideThick_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_1_16_16 = registerBlock("linesidethick_1_16_16",
            () -> new LineSideThick_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_2_16_16 = registerBlock("linesidethick_2_16_16",
            () -> new LineSideThick_2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_3_16_16 = registerBlock("linesidethick_3_16_16",
            () -> new LineSideThick_3_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_4_16_16 = registerBlock("linesidethick_4_16_16",
            () -> new LineSideThick_4_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> LINESIDETHICK_5_16_16 = registerBlock("linesidethick_5_16_16",
            () -> new LineSideThick_5_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> M_16_16 = registerBlock("m_16_16",
            () -> new M_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> MERGE_0_16_16 = registerBlock("merge_0_16_16",
            () -> new Merge_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> MERGE_1_16_16 = registerBlock("merge_1_16_16",
            () -> new Merge_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> N_16_16 = registerBlock("n_16_16",
            () -> new N_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> NO_0_16_16 = registerBlock("no_0_16_16",
            () -> new No_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> NO_1_16_16 = registerBlock("no_1_16_16",
            () -> new No_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> O_16_16 = registerBlock("o_16_16",
            () -> new O_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ONLY_0_16_16 = registerBlock("only_0_16_16",
            () -> new Only_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> ONLY_1_16_16 = registerBlock("only_1_16_16",
            () -> new Only_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> P_16_16 = registerBlock("p_16_16",
            () -> new P_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> PEDESTRIAN_16_16 = registerBlock("pedestrian_16_16",
            () -> new Pedestrian_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> Q_16_16 = registerBlock("q_16_16",
            () -> new Q_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> QUESTION_16_16 = registerBlock("question_16_16",
            () -> new Question_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> R_16_16 = registerBlock("r_16_16",
            () -> new R_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_0_16_16 = registerBlock("right_0_16_16",
            () -> new Right_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> RIGHT_1_16_16 = registerBlock("right_1_16_16",
            () -> new Right_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> S_16_16 = registerBlock("s_16_16",
            () -> new S_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> SLASH_16_16 = registerBlock("slash_16_16",
            () -> new Slash_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> SLASH_1_16_16 = registerBlock("slash_1_16_16",
            () -> new Slash_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> SLOW_0_16_16 = registerBlock("slow_0_16_16",
            () -> new Slow_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> SLOW_1_16_16 = registerBlock("slow_1_16_16",
            () -> new Slow_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> STOP_0_16_16 = registerBlock("stop_0_16_16",
            () -> new Stop_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> STOP_1_16_16 = registerBlock("stop_1_16_16",
            () -> new Stop_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2D_16_16 = registerBlock("straight2d_16_16",
            () -> new Straight2D_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2I_16_16 = registerBlock("straight2i_16_16",
            () -> new Straight2I_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2T_16_16 = registerBlock("straight2t_16_16",
            () -> new Straight2T_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> STRAIGHT2_16_16 = registerBlock("straight2_16_16",
            () -> new Straight2_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> T_16_16 = registerBlock("t_16_16",
            () -> new T_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> TAXI_0_16_16 = registerBlock("taxi_0_16_16",
            () -> new Taxi_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> TAXI_1_16_16 = registerBlock("taxi_1_16_16",
            () -> new Taxi_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_D_16_16 = registerBlock("thick2_d_16_16",
            () -> new Thick2_D_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_I_16_16 = registerBlock("thick2_i_16_16",
            () -> new Thick2_I_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> THICK2_T_16_16 = registerBlock("thick2_t_16_16",
            () -> new Thick2_T_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_D_16_16 = registerBlock("thicks_d_16_16",
            () -> new ThickS_D_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_I_16_16 = registerBlock("thicks_i_16_16",
            () -> new ThickS_I_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> THICKS_T_16_16 = registerBlock("thicks_t_16_16",
            () -> new ThickS_T_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> THICKSTRAIGHT_16_16 = registerBlock("thickstraight_16_16",
            () -> new ThickStraight_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> TOWN_0_16_16 = registerBlock("town_0_16_16",
            () -> new Town_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> TOWN_1_16_16 = registerBlock("town_1_16_16",
            () -> new Town_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> TURN_0_16_16 = registerBlock("turn_0_16_16",
            () -> new Turn_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> TURN_1_16_16 = registerBlock("turn_1_16_16",
            () -> new Turn_1_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> U_16_16 = registerBlock("u_16_16",
            () -> new U_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> V_16_16 = registerBlock("v_16_16",
            () -> new V_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> W_16_16 = registerBlock("w_16_16",
            () -> new W_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> WHEELCHAIR_0_16_16 = registerBlock("wheelchair_0_16_16",
            () -> new Wheelchair_0_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> X_16_16 = registerBlock("x_16_16",
            () -> new X_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> Y_16_16 = registerBlock("y_16_16",
            () -> new Y_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);

    public static final RegistryObject<Block> Z_16_16 = registerBlock("z_16_16",
            () -> new Z_16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
    

// STRAIGHTFULLLINED Blocks
public static final RegistryObject<Block> STRAIGHTFULLLINED10_16 = registerBlock("straightfulllined10_16",
        () -> new StraightFullLineD10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED11_16 = registerBlock("straightfulllined11_16",
        () -> new StraightFullLineD11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED12_16 = registerBlock("straightfulllined12_16",
        () -> new StraightFullLineD12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED13_16 = registerBlock("straightfulllined13_16",
        () -> new StraightFullLineD13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED14_16 = registerBlock("straightfulllined14_16",
        () -> new StraightFullLineD14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED15_16 = registerBlock("straightfulllined15_16",
        () -> new StraightFullLineD15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED16_16 = registerBlock("straightfulllined16_16",
        () -> new StraightFullLineD16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED1_16 = registerBlock("straightfulllined1_16",
        () -> new StraightFullLineD1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED2_16 = registerBlock("straightfulllined2_16",
        () -> new StraightFullLineD2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED3_16 = registerBlock("straightfulllined3_16",
        () -> new StraightFullLineD3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED4_16 = registerBlock("straightfulllined4_16",
        () -> new StraightFullLineD4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED5_16 = registerBlock("straightfulllined5_16",
        () -> new StraightFullLineD5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED6_16 = registerBlock("straightfulllined6_16",
        () -> new StraightFullLineD6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED7_16 = registerBlock("straightfulllined7_16",
        () -> new StraightFullLineD7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED8_16 = registerBlock("straightfulllined8_16",
        () -> new StraightFullLineD8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINED9_16 = registerBlock("straightfulllined9_16",
        () -> new StraightFullLineD9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

// STRAIGHTFULLLINET Blocks
public static final RegistryObject<Block> STRAIGHTFULLLINET10_16 = registerBlock("straightfulllinet10_16",
        () -> new StraightFullLineT10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET11_16 = registerBlock("straightfulllinet11_16",
        () -> new StraightFullLineT11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET12_16 = registerBlock("straightfulllinet12_16",
        () -> new StraightFullLineT12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET13_16 = registerBlock("straightfulllinet13_16",
        () -> new StraightFullLineT13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET14_16 = registerBlock("straightfulllinet14_16",
        () -> new StraightFullLineT14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET15_16 = registerBlock("straightfulllinet15_16",
        () -> new StraightFullLineT15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET16_16 = registerBlock("straightfulllinet16_16",
        () -> new StraightFullLineT16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET1_16 = registerBlock("straightfulllinet1_16",
        () -> new StraightFullLineT1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET2_16 = registerBlock("straightfulllinet2_16",
        () -> new StraightFullLineT2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET3_16 = registerBlock("straightfulllinet3_16",
        () -> new StraightFullLineT3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET4_16 = registerBlock("straightfulllinet4_16",
        () -> new StraightFullLineT4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET5_16 = registerBlock("straightfulllinet5_16",
        () -> new StraightFullLineT5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET6_16 = registerBlock("straightfulllinet6_16",
        () -> new StraightFullLineT6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET7_16 = registerBlock("straightfulllinet7_16",
        () -> new StraightFullLineT7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET8_16 = registerBlock("straightfulllinet8_16",
        () -> new StraightFullLineT8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINET9_16 = registerBlock("straightfulllinet9_16",
        () -> new StraightFullLineT9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

// ARROW Blocks
public static final RegistryObject<Block> ARROW10_16 = registerBlock("arrow10_16",
        () -> new Arrow10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);
public static final RegistryObject<Block> ARROW11_16 = registerBlock("arrow11_16",
        () -> new Arrow11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);
public static final RegistryObject<Block> ARROW12_16 = registerBlock("arrow12_16",
        () -> new Arrow12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);
public static final RegistryObject<Block> ARROW13_16 = registerBlock("arrow13_16",
        () -> new Arrow13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);
public static final RegistryObject<Block> ARROW14_16 = registerBlock("arrow14_16",
        () -> new Arrow14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);
public static final RegistryObject<Block> ARROW15_16 = registerBlock("arrow15_16",
        () -> new Arrow15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);
public static final RegistryObject<Block> ARROW16_16 = registerBlock("arrow16_16",
        () -> new Arrow16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
public static final RegistryObject<Block> ARROW2_16 = registerBlock("arrow2_16",
        () -> new Arrow2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);
public static final RegistryObject<Block> ARROW3_16 = registerBlock("arrow3_16",
        () -> new Arrow3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);
public static final RegistryObject<Block> ARROW4_16 = registerBlock("arrow4_16",
        () -> new Arrow4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);
public static final RegistryObject<Block> ARROW5_16 = registerBlock("arrow5_16",
        () -> new Arrow5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);
public static final RegistryObject<Block> ARROW6_16 = registerBlock("arrow6_16",
        () -> new Arrow6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);
public static final RegistryObject<Block> ARROW7_16 = registerBlock("arrow7_16",
        () -> new Arrow7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);
public static final RegistryObject<Block> ARROW8_16 = registerBlock("arrow8_16",
        () -> new Arrow8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);
public static final RegistryObject<Block> ARROW9_16 = registerBlock("arrow9_16",
        () -> new Arrow9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

// CROSSING Blocks
public static final RegistryObject<Block> CROSSING10_16 = registerBlock("crossing10_16",
        () -> new Crossing10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);
public static final RegistryObject<Block> CROSSING11_16 = registerBlock("crossing11_16",
        () -> new Crossing11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);
public static final RegistryObject<Block> CROSSING12_16 = registerBlock("crossing12_16",
        () -> new Crossing12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);
public static final RegistryObject<Block> CROSSING13_16 = registerBlock("crossing13_16",
        () -> new Crossing13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);
public static final RegistryObject<Block> CROSSING14_16 = registerBlock("crossing14_16",
        () -> new Crossing14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);
public static final RegistryObject<Block> CROSSING15_16 = registerBlock("crossing15_16",
        () -> new Crossing15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);
public static final RegistryObject<Block> CROSSING16_16 = registerBlock("crossing16_16",
        () -> new Crossing16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
public static final RegistryObject<Block> CROSSING1_16 = registerBlock("crossing1_16",
        () -> new Crossing1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);
public static final RegistryObject<Block> CROSSING2_16 = registerBlock("crossing2_16",
        () -> new Crossing2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);
public static final RegistryObject<Block> CROSSING3_16 = registerBlock("crossing3_16",
        () -> new Crossing3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);
public static final RegistryObject<Block> CROSSING4_16 = registerBlock("crossing4_16",
        () -> new Crossing4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);
public static final RegistryObject<Block> CROSSING5_16 = registerBlock("crossing5_16",
        () -> new Crossing5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);
public static final RegistryObject<Block> CROSSING6_16 = registerBlock("crossing6_16",
        () -> new Crossing6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);
public static final RegistryObject<Block> CROSSING7_16 = registerBlock("crossing7_16",
        () -> new Crossing7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);
public static final RegistryObject<Block> CROSSING8_16 = registerBlock("crossing8_16",
        () -> new Crossing8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);
public static final RegistryObject<Block> CROSSING9_16 = registerBlock("crossing9_16",
        () -> new Crossing9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

// STRAIGHTFULLLINEI Blocks
public static final RegistryObject<Block> STRAIGHTFULLLINEI10_16 = registerBlock("straightfulllinei10_16",
        () -> new StraightFullLineI10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI11_16 = registerBlock("straightfulllinei11_16",
        () -> new StraightFullLineI11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI12_16 = registerBlock("straightfulllinei12_16",
        () -> new StraightFullLineI12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI13_16 = registerBlock("straightfulllinei13_16",
        () -> new StraightFullLineI13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI14_16 = registerBlock("straightfulllinei14_16",
        () -> new StraightFullLineI14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI15_16 = registerBlock("straightfulllinei15_16",
        () -> new StraightFullLineI15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI16_16 = registerBlock("straightfulllinei16_16",
        () -> new StraightFullLineI16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI1_16 = registerBlock("straightfulllinei1_16",
        () -> new StraightFullLineI1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI2_16 = registerBlock("straightfulllinei2_16",
        () -> new StraightFullLineI2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI3_16 = registerBlock("straightfulllinei3_16",
        () -> new StraightFullLineI3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI4_16 = registerBlock("straightfulllinei4_16",
        () -> new StraightFullLineI4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI5_16 = registerBlock("straightfulllinei5_16",
        () -> new StraightFullLineI5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI6_16 = registerBlock("straightfulllinei6_16",
        () -> new StraightFullLineI6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI7_16 = registerBlock("straightfulllinei7_16",
        () -> new StraightFullLineI7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI8_16 = registerBlock("straightfulllinei8_16",
        () -> new StraightFullLineI8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINEI9_16 = registerBlock("straightfulllinei9_16",
        () -> new StraightFullLineI9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

// STRAIGHTFULLLINE Blocks
public static final RegistryObject<Block> STRAIGHTFULLLINE10_16 = registerBlock("straightfullline10_16",
        () -> new StraightFullLine10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE11_16 = registerBlock("straightfullline11_16",
        () -> new StraightFullLine11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE12_16 = registerBlock("straightfullline12_16",
        () -> new StraightFullLine12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE13_16 = registerBlock("straightfullline13_16",
        () -> new StraightFullLine13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE14_16 = registerBlock("straightfullline14_16",
        () -> new StraightFullLine14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE15_16 = registerBlock("straightfullline15_16",
        () -> new StraightFullLine15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE16_16 = registerBlock("straightfullline16_16",
        () -> new StraightFullLine16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE1_16 = registerBlock("straightfullline1_16",
        () -> new StraightFullLine1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE2_16 = registerBlock("straightfullline2_16",
        () -> new StraightFullLine2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE3_16 = registerBlock("straightfullline3_16",
        () -> new StraightFullLine3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE4_16 = registerBlock("straightfullline4_16",
        () -> new StraightFullLine4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE5_16 = registerBlock("straightfullline5_16",
        () -> new StraightFullLine5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE6_16 = registerBlock("straightfullline6_16",
        () -> new StraightFullLine6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE7_16 = registerBlock("straightfullline7_16",
        () -> new StraightFullLine7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE8_16 = registerBlock("straightfullline8_16",
        () -> new StraightFullLine8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);
public static final RegistryObject<Block> STRAIGHTFULLLINE9_16 = registerBlock("straightfullline9_16",
        () -> new StraightFullLine9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);



// LINEEDGE Blocks
public static final RegistryObject<Block> LINEEDGE10_16 = registerBlock("lineedge10_16",
        () -> new LineEdge10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);
public static final RegistryObject<Block> LINEEDGE11_16 = registerBlock("lineedge11_16",
        () -> new LineEdge11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);
public static final RegistryObject<Block> LINEEDGE12_16 = registerBlock("lineedge12_16",
        () -> new LineEdge12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);
public static final RegistryObject<Block> LINEEDGE13_16 = registerBlock("lineedge13_16",
        () -> new LineEdge13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);
public static final RegistryObject<Block> LINEEDGE14_16 = registerBlock("lineedge14_16",
        () -> new LineEdge14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);
public static final RegistryObject<Block> LINEEDGE15_16 = registerBlock("lineedge15_16",
        () -> new LineEdge15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);
public static final RegistryObject<Block> LINEEDGE16_16 = registerBlock("lineedge16_16",
        () -> new LineEdge16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
public static final RegistryObject<Block> LINEEDGE1_16 = registerBlock("lineedge1_16",
        () -> new LineEdge1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);
public static final RegistryObject<Block> LINEEDGE2_16 = registerBlock("lineedge2_16",
        () -> new LineEdge2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);
public static final RegistryObject<Block> LINEEDGE3_16 = registerBlock("lineedge3_16",
        () -> new LineEdge3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);
public static final RegistryObject<Block> LINEEDGE4_16 = registerBlock("lineedge4_16",
        () -> new LineEdge4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);
public static final RegistryObject<Block> LINEEDGE5_16 = registerBlock("lineedge5_16",
        () -> new LineEdge5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);
public static final RegistryObject<Block> LINEEDGE6_16 = registerBlock("lineedge6_16",
        () -> new LineEdge6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);
public static final RegistryObject<Block> LINEEDGE7_16 = registerBlock("lineedge7_16",
        () -> new LineEdge7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);
public static final RegistryObject<Block> LINEEDGE8_16 = registerBlock("lineedge8_16",
        () -> new LineEdge8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);
public static final RegistryObject<Block> LINEEDGE9_16 = registerBlock("lineedge9_16",
        () -> new LineEdge9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

// LINETHICKSHORT Blocks
public static final RegistryObject<Block> LINETHICKSHORT10_16 = registerBlock("linethickshort10_16",
        () -> new LineThickShort10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT11_16 = registerBlock("linethickshort11_16",
        () -> new LineThickShort11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT12_16 = registerBlock("linethickshort12_16",
        () -> new LineThickShort12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT13_16 = registerBlock("linethickshort13_16",
        () -> new LineThickShort13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT14_16 = registerBlock("linethickshort14_16",
        () -> new LineThickShort14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT15_16 = registerBlock("linethickshort15_16",
        () -> new LineThickShort15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT16_16 = registerBlock("linethickshort16_16",
        () -> new LineThickShort16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT1_16 = registerBlock("linethickshort1_16",
        () -> new LineThickShort1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT2_16 = registerBlock("linethickshort2_16",
        () -> new LineThickShort2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT3_16 = registerBlock("linethickshort3_16",
        () -> new LineThickShort3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT4_16 = registerBlock("linethickshort4_16",
        () -> new LineThickShort4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT5_16 = registerBlock("linethickshort5_16",
        () -> new LineThickShort5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT6_16 = registerBlock("linethickshort6_16",
        () -> new LineThickShort6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT7_16 = registerBlock("linethickshort7_16",
        () -> new LineThickShort7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT8_16 = registerBlock("linethickshort8_16",
        () -> new LineThickShort8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);
public static final RegistryObject<Block> LINETHICKSHORT9_16 = registerBlock("linethickshort9_16",
        () -> new LineThickShort9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);



// LINESIDESHORT Blocks
public static final RegistryObject<Block> LINESIDESHORT10_16 = registerBlock("linesideshort10_16",
        () -> new LineSideShort10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT11_16 = registerBlock("linesideshort11_16",
        () -> new LineSideShort11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT12_16 = registerBlock("linesideshort12_16",
        () -> new LineSideShort12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT13_16 = registerBlock("linesideshort13_16",
        () -> new LineSideShort13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT14_16 = registerBlock("linesideshort14_16",
        () -> new LineSideShort14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT15_16 = registerBlock("linesideshort15_16",
        () -> new LineSideShort15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT16_16 = registerBlock("linesideshort16_16",
        () -> new LineSideShort16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT1_16 = registerBlock("linesideshort1_16",
        () -> new LineSideShort1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT2_16 = registerBlock("linesideshort2_16",
        () -> new LineSideShort2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT3_16 = registerBlock("linesideshort3_16",
        () -> new LineSideShort3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT4_16 = registerBlock("linesideshort4_16",
        () -> new LineSideShort4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT5_16 = registerBlock("linesideshort5_16",
        () -> new LineSideShort5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT6_16 = registerBlock("linesideshort6_16",
        () -> new LineSideShort6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT7_16 = registerBlock("linesideshort7_16",
        () -> new LineSideShort7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT8_16 = registerBlock("linesideshort8_16",
        () -> new LineSideShort8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);
public static final RegistryObject<Block> LINESIDESHORT9_16 = registerBlock("linesideshort9_16",
        () -> new LineSideShort9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);



// THICK Blocks
public static final RegistryObject<Block> THICK2STRAIGHT10_16 = registerBlock("thick2straight10_16",
        () -> new Thick2Straight10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT11_16 = registerBlock("thick2straight11_16",
        () -> new Thick2Straight11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT12_16 = registerBlock("thick2straight12_16",
        () -> new Thick2Straight12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT13_16 = registerBlock("thick2straight13_16",
        () -> new Thick2Straight13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT14_16 = registerBlock("thick2straight14_16",
        () -> new Thick2Straight14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT15_16 = registerBlock("thick2straight15_16",
        () -> new Thick2Straight15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT16_16 = registerBlock("thick2straight16_16",
        () -> new Thick2Straight16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT1_16 = registerBlock("thick2straight1_16",
        () -> new Thick2Straight1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT2_16 = registerBlock("thick2straight2_16",
        () -> new Thick2Straight2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT3_16 = registerBlock("thick2straight3_16",
        () -> new Thick2Straight3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT4_16 = registerBlock("thick2straight4_16",
        () -> new Thick2Straight4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT5_16 = registerBlock("thick2straight5_16",
        () -> new Thick2Straight5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT6_16 = registerBlock("thick2straight6_16",
        () -> new Thick2Straight6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT7_16 = registerBlock("thick2straight7_16",
        () -> new Thick2Straight7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT8_16 = registerBlock("thick2straight8_16",
        () -> new Thick2Straight8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);
public static final RegistryObject<Block> THICK2STRAIGHT9_16 = registerBlock("thick2straight9_16",
        () -> new Thick2Straight9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);

// LINESIDE Blocks
public static final RegistryObject<Block> LINESIDE10_16 = registerBlock("lineside10_16",
        () -> new LineSide10_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TEN_PAINTS);
public static final RegistryObject<Block> LINESIDE11_16 = registerBlock("lineside11_16",
        () -> new LineSide11_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ELEVEN_PAINTS);
public static final RegistryObject<Block> LINESIDE12_16 = registerBlock("lineside12_16",
        () -> new LineSide12_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWELVE_PAINTS);
public static final RegistryObject<Block> LINESIDE13_16 = registerBlock("lineside13_16",
        () -> new LineSide13_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THIRTEEN_PAINTS);
public static final RegistryObject<Block> LINESIDE14_16 = registerBlock("lineside14_16",
        () -> new LineSide14_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOURTEEN_PAINTS);
public static final RegistryObject<Block> LINESIDE15_16 = registerBlock("lineside15_16",
        () -> new LineSide15_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIFTEEN_PAINTS);
public static final RegistryObject<Block> LINESIDE16_16 = registerBlock("lineside16_16",
        () -> new LineSide16_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIXTEEN_PAINTS);
public static final RegistryObject<Block> LINESIDE1_16 = registerBlock("lineside1_16",
        () -> new LineSide1_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.ONE_PAINTS);
public static final RegistryObject<Block> LINESIDE2_16 = registerBlock("lineside2_16",
        () -> new LineSide2_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.TWO_PAINTS);
public static final RegistryObject<Block> LINESIDE3_16 = registerBlock("lineside3_16",
        () -> new LineSide3_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.THREE_PAINTS);
public static final RegistryObject<Block> LINESIDE4_16 = registerBlock("lineside4_16",
        () -> new LineSide4_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FOUR_PAINTS);
public static final RegistryObject<Block> LINESIDE5_16 = registerBlock("lineside5_16",
        () -> new LineSide5_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.FIVE_PAINTS);
public static final RegistryObject<Block> LINESIDE6_16 = registerBlock("lineside6_16",
        () -> new LineSide6_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SIX_PAINTS);
public static final RegistryObject<Block> LINESIDE7_16 = registerBlock("lineside7_16",
        () -> new LineSide7_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.SEVEN_PAINTS);
public static final RegistryObject<Block> LINESIDE8_16 = registerBlock("lineside8_16",
        () -> new LineSide8_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.EIGHT_PAINTS);
public static final RegistryObject<Block> LINESIDE9_16 = registerBlock("lineside9_16",
        () -> new LineSide9_16(BlockBehaviour.Properties.of(Material.STONE).noOcclusion()), FRCreativeModeTab.NINE_PAINTS);




private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn, tab);
    return toReturn;
}

private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                        CreativeModeTab tab) {
    return FRItems.ITEMS.register(name, () -> new BlockItem(block.get(),
            new Item.Properties().tab(tab)));
}

public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
}
}

