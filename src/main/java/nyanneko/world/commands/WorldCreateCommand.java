package nyanneko.world.commands;

import org.bukkit.Bukkit;
import org.bukkit.World.Environment;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import nyanneko.world.Main;

public class WorldCreateCommand implements CommandExecutor {

	public boolean onCommand(CommandSender send, Command cmd, String label, String[] args) {
		if (args.length == 0) {
			send.sendMessage("使用法: /worldcreate [name] [type] [mode] [seed]" + " \n " +
		                                         "name(必須): 作りたいワールドの名前" + " \n " +
					                             "type(必須): NORMAL, NETHER, THE_ENDのどれか" + " \n " +
		                                         "mode: FLAT, AMPLIFIEDのどれか" + " \n " +
					                             "seed: シード値");
		}
		else if (cmd.getName().equalsIgnoreCase("worldcreate")) {
            if (args.length == 2) {
            	Bukkit.createWorld(WorldCreator.name(args[0])
            			   .environment(Environment.valueOf(args[1])));
            	send.sendMessage(Main.info + " ワールド(" + args[0] + ") を正常に作成することができました。");
            }
            else if (args.length == 3) {
            	Bukkit.createWorld(WorldCreator.name(args[0])
            			   .environment(Environment.valueOf(args[1]))
            			   .type(WorldType.valueOf(args[2])));
            	send.sendMessage(Main.info + " ワールド(" + args[0] + ") を正常に作成することができました。");
            }
            else if (args.length == 4) {
            	Bukkit.createWorld(WorldCreator.name(args[0])
            			   .environment(Environment.valueOf(args[1]))
            			   .seed(Long.valueOf(args[2]))
            			   .type(WorldType.valueOf(args[3])));
            	send.sendMessage(Main.info + " ワールド(" + args[0] + ") を正常に作成することができました。");
            }
		}
		return true;
	}
}
