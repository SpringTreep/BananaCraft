package com.pikachu923.BananaCraft.Entity.Kuala;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderAbe extends RenderLiving {

    public RenderAbe(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }   

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return new ResourceLocation("mymod:textures/entity/MyAbe.png");

    }

}
