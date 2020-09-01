package nyanneko.world.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WorldSettingCommand implements CommandExecutor {

	public boolean onCommand(CommandSender send, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("worldset")) {
            World world = Bukkit.getWorld(args[0]);
            if (args.length == 0) {

            }
            else if (args.length == 1) {

            }
            else if (args[1].equalsIgnoreCase("pvp")) {
                 if (args[2].equalsIgnoreCase("false")) {
                	 world.setPVP(false);
                 }
                 else if (args[2].equalsIgnoreCase("true")) {
                	 world.setPVP(true);
                 }
            }
           }
		return true;
	}
}
