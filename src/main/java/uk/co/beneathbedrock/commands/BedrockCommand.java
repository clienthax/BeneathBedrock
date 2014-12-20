package uk.co.beneathbedrock.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import uk.co.beneathbedrock.BeneathBedrock;

/**
 * Created by clienthax on 20/12/2014.
 */
public class BedrockCommand extends CommandBase {
	@Override
	public String getCommandName() {
		return "bedrock";
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return "bedrock";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		if(!(sender instanceof EntityPlayerMP))
			return;

		EntityPlayerMP player = (EntityPlayerMP) sender;
		player.travelToDimension(BeneathBedrock.dimensionId);
	}
}
