package nyanneko.world.commands;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.boss.BossBar;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WorldListCommand implements CommandExecutor {

	public boolean onCommand(CommandSender send, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("worldlist")) {
			List<World> listworld = Bukkit.getWorlds();
			send.sendMessage("===ワールドのリスト===");
			for (int i = 0; i < listworld.size(); i++) {
				World world = listworld.get(i);
                send.sendMessage(String.valueOf(i) + ": " +  world.getName() + "\n");
                BossBar.class.cast(null).removePlayer(Bukkit.getPlayer(send.getName()));
			}
		}
		return true;
	}

}
