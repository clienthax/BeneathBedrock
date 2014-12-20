package uk.co.beneathbedrock.worldgen.biomes;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.Random;

/**
 * Created by clienthax on 20/12/2014.
 */
public class BiomeGenBedrock extends BiomeGenBase {

	public BiomeGenBedrock(int biomeID) {
		super(biomeID);
		this.spawnableCreatureList.clear();
	}

	@Override
	public void decorate(World world, Random rand, int x, int y) {

	}

}
