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
		Inventory inv = Bukkit.createInventory(null, 18, "ワールドのリスト");
		List<World> list = Bukkit.getWorlds();
		for (int i = 0; i < list.size(); i++) {
			World world = list.get(i);
            if (world == null) {
            	inv.setItem(i, new ItemStack(Material.AIR));
            }
            else {
            	inv.setItem(i, item.getItemname(new ItemStack(Material.WOOL), world.getName()));
            }
		}
		p.openInventory(inv);
	}

	public void worldsetget() {

	}

	public void worldget(Player p, World world) {
		Inventory inv = Bukkit.createInventory(null, 18);
		if (world.getAllowAnimals()) {
			inv.setItem(0, item.getItem(new ItemStack(Material.WOOL), "動物のスポーン" ,(short) 5));
		}
		else {
			inv.setItem(0, item.getItem(new ItemStack(Material.WOOL), "動物のスポーン" ,(short) 14));
		}
		if (world.getAllowMonsters()) {
			inv.setItem(1, item.getItem(new ItemStack(Material.WOOL), "モンスターのスポーン" ,(short) 5));
		}
		else {
			inv.setItem(1, item.getItem(new ItemStack(Material.WOOL), "モンスターのスポーン" ,(short) 14));
		}
		if (world.getPVP()) {
			inv.setItem(2, item.getItem(new ItemStack(Material.WOOL), "PVP" ,(short) 5));
		}
		else {
			inv.setItem(2, item.getItem(new ItemStack(Material.WOOL), "PVP" ,(short) 14));
		}
		inv.setItem(3, item.getItem(new ItemStack(Material.GRASS), "ワールドの名前とUUID", "名前:" + world.getName() + "\n" + "UUID: " + world.getUID().toString()));
		p.openInventory(inv);
	}

	public void biomemenu(Player p) {

	}

}
