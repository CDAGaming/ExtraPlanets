package com.mjr.extraplanets.moons.Titan.worldgen;

import net.minecraftforge.common.BiomeDictionary;

public class BiomeGenTitan extends TitanBiomes {

	public BiomeGenTitan(BiomeProperties properties) {
		super(properties);
		BiomeDictionary.addTypes(this, BiomeDictionary.Type.COLD, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.SANDY);
	}
}
