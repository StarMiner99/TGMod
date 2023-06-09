package com.github.tgmuk.tgitmod;

import com.github.tgmuk.tgitmod.registration.BlockRegister;
import com.github.tgmuk.tgitmod.registration.EntityTypeRegister;
import com.github.tgmuk.tgitmod.registration.ItemRegister;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(StaticModValues.MODID)
public class TGITMod {

    public static final Logger LOGGER = LogManager.getLogger(StaticModValues.MODID);


    public TGITMod() {
        LOGGER.debug("test test hört man mich KEKEKEKEKE");


        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockRegister.BLOCKS.register(modBus);
        ItemRegister.ITEMS.register(modBus);
        EntityTypeRegister.ENTITY_TYPES.register(modBus);


    }


}
