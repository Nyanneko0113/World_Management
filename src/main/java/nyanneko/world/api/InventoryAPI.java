package nyanneko.world.api;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryAPI {

	ItemAPI item = new ItemAPI();

	public void worldlist(Player p) {
		Inventory inv = Bukkit.createInventory(null, 18);
		List<World> list = Bukkit.getWorlds();
		for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
            	inv.setItem(i, new ItemStack(Material.AIR));
            }
            else {
            	inv.setItem(i, new ItemStack(Material.WOOL));
            }
		}
		p.openInventory(inv);
	}

}
