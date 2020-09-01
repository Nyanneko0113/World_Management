package nyanneko.world.commands;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;
import nyanneko.world.Main;

public class WorldLoadCommand implements CommandExecutor {

	public boolean onCommand(CommandSender send, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("worldload")) {
            if (Files.exists(Paths.get(Bukkit.getServer().getWorldContainer().getAbsolutePath()))) {
            	Bukkit.createWorld(WorldCreator.name(args[0]));
            	send.sendMessage(Main.info + "正常にロードすることができました。");
            }
            else {
            	send.sendMessage(Main.error + ChatColor.RESET + "すでにロードされています。");
            }
		}
		return true;
	}

}
