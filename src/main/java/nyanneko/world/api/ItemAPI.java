package nyanneko.world.api;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemAPI {

	public ItemStack createItem(ItemStack item, Short durability) {
	    ItemMeta im = item.getItemMeta();
	    item.setDurability((short) durability);
	    item.setItemMeta(im);
	    return item;
	}

	public ItemStack createItem(ItemStack item, String name, Short durability) {
	    ItemMeta im = item.getItemMeta();
	    im.setDisplayName(name);
	    item.setDurability((short) durability);
	    item.setItemMeta(im);
	    return item;
	}

	public ItemStack createItem(ItemStack item, String name, Short durability, Enchantment ench, int level) {
	    ItemMeta im = item.getItemMeta();
	    im.setDisplayName(name);
	    item.setDurability((short) durability);
	    item.setItemMeta(im);
	    item.addEnchantment(ench, level);
	    return item;
	}

	//リセットインベントリ
	public void resetInventory(Player p, Inventory inv) {
		for (int i = 18; i <= 54; i++) {
			inv.clear(i);
			p.updateInventory();
		}
	}

	public void removeItem(Player p, Material item, int number) {
		for(int i = 0; i < p.getInventory().getSize(); i++){
			  ItemStack itm = p.getInventory().getItem(i);
			  if(itm != null && itm.getType().equals(item)) {
			    int amt = itm.getAmount() - number;
			    itm.setAmount(amt);
			    p.getInventory().setItem(i, amt > 0 ? itm : null);
			    p.updateInventory();
			    break;
			  }
		}
	}
}
