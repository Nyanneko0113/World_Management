package nyanneko.world.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import nyanneko.world.Main;

public class WorldTeleportCommand implements CommandExecutor {

	public boolean onCommand(CommandSender send, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("worldteleport")) {
			if (args.length == 0) {

			}
			else if (args.length == 1) {

			}
			else if (args.length == 2) {
				World world;
				Bukkit.getPlayer(args[0]).teleport(new Location(world = Bukkit.getWorld(args[1]), //ワールド
                                                                                                          world.getSpawnLocation().getX(), //x座標
                                                                                                          world.getSpawnLocation().getY(), //y座標
                                                                                                          world.getSpawnLocation().getZ())); //z座標
                send.sendMessage(Main.info + "テレポートしました。");
            }
			else if (args.length == 5) {
				Bukkit.getPlayer(args[0]).teleport(new Location(Bukkit.getWorld(args[1]), //ワールド
                                                                                                          Double.parseDouble(args[2]), //x座標
                                                                                                          Double.parseDouble(args[3]), //y座標
                                                                                                          Double.parseDouble(args[4]))); //z座標
                send.sendMessage(Main.info + "テレポートしました。");
			}
		}
		return true;
	}

}
