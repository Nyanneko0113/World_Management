package nyanneko.world;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import nyanneko.world.commands.WorldCreateCommand;
import nyanneko.world.commands.WorldListCommand;
import nyanneko.world.commands.WorldLoadCommand;
import nyanneko.world.commands.WorldRemoveCommand;
import nyanneko.world.commands.WorldSetGetCommand;
import nyanneko.world.commands.WorldSettingCommand;
import nyanneko.world.commands.WorldTeleportCommand;
import nyanneko.world.commands.WorldUnloadCommand;

/**@author にゃん猫
 * @version 0.0.1 */
public class Main extends JavaPlugin {

	public static String info = ChatColor.GREEN + "[情報]";
	public static String error = ChatColor.RED + "[エラー]";

	public static String args = error + " 引数を指定してください。";

	@Override
	public void onEnable() {
		//コマンド処理
		getCommand("worldcreate").setExecutor(new WorldCreateCommand());
		getCommand("worldremove").setExecutor(new WorldRemoveCommand());
		getCommand("worldload").setExecutor(new WorldLoadCommand());
		getCommand("worldunload").setExecutor(new WorldUnloadCommand());
		getCommand("worldlist").setExecutor(new WorldListCommand());
		getCommand("worldset").setExecutor(new WorldSettingCommand());
		getCommand("worldteleport").setExecutor(new WorldTeleportCommand());
		getCommand("worldsettingget").setExecutor(new WorldSetGetCommand());
	}

	@Override
	public void onDisable() {

	}
}
