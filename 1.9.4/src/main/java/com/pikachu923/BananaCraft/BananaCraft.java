package com.pikachu923.BananaCraft;

import com.pikachu923.BananaCraft.configuration.ConfigurationHandler;
import com.pikachu923.BananaCraft.proxy.IProxy;
import com.pikachu923.BananaCraft.reference.Reference;
import com.sun.webkit.graphics.Ref;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by pikachu on 6/20/2016.
 * Main Class
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class BananaCraft {

    @Mod.Instance(Reference.MOD_ID)
    public static BananaCraft instance;

    @SidedProxy(clientSide = Reference.PROXYCLIENT, serverSide = Reference.PROXYSERVER)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
public void PostInit(FMLPostInitializationEvent event){

    }
}
