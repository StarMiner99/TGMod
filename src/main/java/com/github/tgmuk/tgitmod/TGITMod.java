package com.github.tgmuk.tgitmod;

import com.github.tgmuk.tgitmod.registration.BlockRegister;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(StaticModValues.MODID)
public class TGITMod {

    public static final Logger LOGGER = LogManager.getLogger(StaticModValues.MODID);


    public TGITMod() {
        LOGGER.debug("test test hört man mich KEKEKEKEKE");


        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockRegister.BLOCKS.register(modBus);


    }


}
