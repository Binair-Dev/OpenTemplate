package su.binair.template;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	public static Main instance;
		
	@Override
	public void onEnable() 
	{
		this.instance = this;
		
	}

	@Override
	public void onDisable() 
	{
		
	}
	
	public static Main getInstance() 
	{
		return instance;
	}
}
