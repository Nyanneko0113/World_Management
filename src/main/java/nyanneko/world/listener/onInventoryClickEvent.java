package nyanneko.world.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import nyanneko.world.api.InventoryAPI;
import nyanneko.world.api.ItemAPI;

public class onInventoryClickEvent implements Listener {

	@EventHandler
	public void InventoryClick(InventoryClickEvent e) {
		ItemStack clicktype = e.getCurrentItem();
		ItemAPI item = new ItemAPI();
		InventoryAPI inv = new InventoryAPI();
		ItemMeta meta = clicktype.getItemMeta();
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getName().contains("ワールドのリスト")) {
			e.setCancelled(true);
			p.sendMessage("1");
		    if (clicktype.getType() == Material.WOOL) {
		    	p.sendMessage("2");
		        inv.worldget(p, Bukkit.getWorld(meta.getDisplayName()));
		    }
	}
	}
}
