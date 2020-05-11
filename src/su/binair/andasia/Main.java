package su.binair.andasia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import su.binair.andasia.config.YmlConfiguration;

public class Main extends JavaPlugin
{
	public static Main plugin;
	
	public static Main instance;
	
	public HashMap<String, YmlConfiguration> configs = new HashMap<String, YmlConfiguration>();
	
	@Override
	public void onEnable() 
	{
		this.instance = this;
		this.plugin = this;
		
		registerConfigs();
		registerCommands();
		registerEvents();
	}
	
	public static void registerEvents()
	{
        //getPlugin().getServer().getPluginManager().registerEvents((Listener)new CrashListener(), getPlugin());

	}

	public static void registerCommands()
	{
        //((JavaPlugin) getPlugin()).getCommand("bottlexp").setExecutor((CommandExecutor)new BottleCommands());
        
	}
	
	public void registerConfigs()
	{
		getPlugin().saveDefaultConfig();
		
		/*configs.put("antispam", new YmlConfiguration(this, "antispam"));
		if(!configs.get("antispam").isExist())
		{
			configs.get("antispam").getConfig().set("message", "&aTu dois attendre encore &f&l%time% &asecondes.");
			configs.get("antispam").getConfig().set("time", "2");
			configs.get("antispam").save();
		}/**/
	}
	
	@Override
	public void onDisable() 
	{
		
	}
	
	public static Plugin getPlugin() 
	{
		return plugin;
	}
	
	public static Main getInstance() 
	{
		return instance;
	}
	
	public YmlConfiguration getConfig(String config) 
	{
		return configs.get(config);
	}
}
