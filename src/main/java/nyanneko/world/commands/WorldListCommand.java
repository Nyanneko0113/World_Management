package nyanneko.world.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import nyanneko.world.api.InventoryAPI;

public class WorldListCommand implements CommandExecutor {

	public boolean onCommand(CommandSender send, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("worldlist")) {
            new InventoryAPI().worldlist(Bukkit.getPlayer(send.getName()));
		}
		return true;
	}

}
