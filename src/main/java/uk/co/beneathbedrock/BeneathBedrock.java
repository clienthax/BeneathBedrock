package uk.co.beneathbedrock;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.DimensionManager;
import uk.co.beneathbedrock.commands.BedrockCommand;
import uk.co.beneathbedrock.worldgen.biomes.BiomeGenBedrock;
import uk.co.beneathbedrock.worldgen.providers.BedrockDownProvider;

/**
 * Created by clienthax on 20/12/2014.
 */
@Mod(modid = "beneathbedrock", name="Beneath Bedrock", version = "1.0")
public class BeneathBedrock {

	public static BiomeGenBedrock biomeGenBedrock;
	public static int dimensionId;
	public static int providerId = 2155;//forge is stupid and doesn't have a way to get free provider ids..
	public static int biomeid = 56;

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		dimensionId = DimensionManager.getNextFreeDimId();
		DimensionManager.registerProviderType(providerId, BedrockDownProvider.class, true);
		DimensionManager.registerDimension(dimensionId, providerId);

		biomeGenBedrock = new BiomeGenBedrock(biomeid);

	}

	@Mod.EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		event.registerServerCommand(new BedrockCommand());
	}


}
