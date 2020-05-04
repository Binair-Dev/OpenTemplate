package su.binair.andasia.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import su.binair.api.PrefixAPI;

public class PoubelleCommand implements CommandExecutor 
{
	public static Inventory inv;

	   @Override
	   public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) 
	   {
	        final Player player = (Player)sender;
	        if (sender instanceof Player)
	        {
	            if (label.equalsIgnoreCase("template_command"))
	            {
	                
	            }
	        }
	        return true;
	    }
}
