package su.binair.template.utils;

import org.apache.commons.lang.StringEscapeUtils;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import su.binair.template.Main;

public class MessageUtils 
{
	public static String format(String text)
	{
		return ChatColor.translateAlternateColorCodes('&', text);
	}
	
	public static void sendMessage(Player player, String text)
	{
		player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&6» &a" + text));
	}
}
