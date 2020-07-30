/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BaseItemBlock.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class BaseItemBlock extends ItemBlock {
    
    public BaseItemBlock(Block block){
        super(block);
        this.setRegistryName(block.getRegistryName());
    }
}
