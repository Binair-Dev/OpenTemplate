package su.binair.andasia.utils;

import org.apache.commons.lang.StringEscapeUtils;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import su.binair.andasia.Main;
import su.binair.andasia.config.YmlConfiguration;
import su.binair.api.PrefixAPI;

public class MessageUtils 
{
	public static String format(String text)
	{
		return ChatColor.translateAlternateColorCodes('&', text);
	}
	
	public static void sendMessage(Player player, String text)
	{
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', PrefixAPI.getPrefix() + " " + "&6» &a" + text));
	}
	
	public static String getMessage(YmlConfiguration config, String info)
	{
		return ChatColor.translateAlternateColorCodes('&', config.getConfig().getString(info));
	}
}
