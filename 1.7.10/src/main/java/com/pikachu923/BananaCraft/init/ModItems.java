package com.pikachu923.BananaCraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import com.pikachu923.BananaCraft.items.*;
import com.pikachu923.BananaCraft.reference.Reference;

/**
 * Created by pikac on 6/21/2016.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemWrapper Reinbanana = new ReinBanana("ReinBanana");
    public static final ItemWrapper Banana = new Banana("Banana");
    public static final ItemWrapper BananaArmorCore = new BananaArmorCore("BananaArmorCore");
    public static final ItemWrapper GoldenBanana = new GoldenBanana("GoldenBanana");
    public static final ItemWrapper BananaBread = new BananaBread("BananaBread");
    public static final ItemWrapper BananaLifeCore = new BananaLifeCore("BananaLifeCore");
    public static final ItemWrapper BananaNugget = new BananaNugget("BananaNugget");
    public static final ItemWrapper BananaDough = new BananaDough("BananaDough");


    public static void init() {
        GameRegistry.registerItem(Reinbanana, "ReinBanana");
        GameRegistry.registerItem(Banana, "Banana");
        GameRegistry.registerItem(BananaArmorCore, "BananaArmorCore");
        GameRegistry.registerItem(GoldenBanana, "GoldenBanana");
        GameRegistry.registerItem(BananaBread, "BananaBread");
        GameRegistry.registerItem(BananaLifeCore, "BananaLifeCore");
        GameRegistry.registerItem(BananaNugget, "BananaNugger");
        GameRegistry.registerItem(BananaDough, "BananaDough");
    }
}

