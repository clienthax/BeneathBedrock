package uk.co.beneathbedrock.worldgen.providers;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import uk.co.beneathbedrock.BeneathBedrock;
import uk.co.beneathbedrock.worldgen.chunkprovider.ChunkProviderBedrock;

/**
 * Created by clienthax on 20/12/2014.
 */
public class BedrockDownProvider extends WorldProvider {

	@Override
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(BeneathBedrock.biomeGenBedrock, 0.8F);
		this.dimensionId = BeneathBedrock.dimensionId;
	}

	@Override
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderBedrock(worldObj, worldObj.getSeed(), "200;7;1");
	}

	@Override
	public String getDimensionName() {
		return "beneathbedrock";
	}

}
