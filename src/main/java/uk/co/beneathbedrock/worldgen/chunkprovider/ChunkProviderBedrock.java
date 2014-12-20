package uk.co.beneathbedrock.worldgen.chunkprovider;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import net.minecraft.world.gen.ChunkProviderFlat;
import net.minecraft.world.gen.MapGenBase;

import java.util.Iterator;
import java.util.List;

/**
 * Created by clienthax on 20/12/2014.
 */
public class ChunkProviderBedrock extends ChunkProviderFlat {

	World world;

	public ChunkProviderBedrock(World world, long seed, String layerinfo) {
		super(world, seed, false, layerinfo);
		this.world = world;
	}

	@Override
	public Chunk provideChunk(int x, int z) {
		Chunk chunk = super.provideChunk(x, z);
		//TODO poke holes

		return chunk;
	}


}
