package io.github.sauerkraut.common.block;

import net.minecraft.block.CropsBlock;

public class ModCropsBlock extends CropsBlock {
    public ModCropsBlock(Properties builder){
        super(builder.tickRandomly());
    }
}
