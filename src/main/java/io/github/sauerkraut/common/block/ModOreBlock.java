package io.github.sauerkraut.common.block;

import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class ModOreBlock extends OreBlock {
    private final int min_exp;
    private final int max_exp;

    public ModOreBlock(Properties properties, int min_exp, int max_exp) {
        super(properties);
        this.min_exp = min_exp;
        this.max_exp = max_exp;
    }

    @Override
    protected int getExperience(Random rand) {
        return MathHelper.nextInt(rand, min_exp, max_exp);
    }
}
