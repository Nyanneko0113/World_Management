package nyanneko.world.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WorldUnloadCommand implements CommandExecutor {

	public boolean onCommand(CommandSender send, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("worldunload")) {
            if (args.length == 0) {

            }
            else {
            	Bukkit.unloadWorld(args[0], true);
            	send.sendMessage("Un");
            }
		}
		return true;
	}

}
