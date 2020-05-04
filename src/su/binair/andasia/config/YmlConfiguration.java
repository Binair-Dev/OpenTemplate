package su.binair.andasia.config;

import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import su.binair.andasia.Main;

public class YmlConfiguration
{
	private File file;
	private YamlConfiguration config;
	private String name;
	private boolean exist = false;
	
	public YmlConfiguration(Main m, String fileName) 
	{
		File f = new File(m.getDataFolder(), fileName + ".yml");

        if (!f.exists()) 
        {
            try 
            {
            	this.exist = false;
            	f.createNewFile();
            	this.name = fileName;
            	this.file = new File(m.getDataFolder(), fileName + ".yml");
            	this.config = YamlConfiguration.loadConfiguration(file);
            	this.config.save(f);
            	System.out.println("Le fichier " + fileName + ".yml a bien été créer!");
            } 
            catch (Exception e) 
            {
            	e.printStackTrace();
                System.out.println("Impossible de créer le fichier " + fileName + ".yml!");
            }
        }
        else
        {
        	this.exist = true;
        	this.name = fileName;
        	this.file = new File(m.getDataFolder(), fileName + ".yml");
        	this.config = YamlConfiguration.loadConfiguration(file);
        }
	}

	public boolean save()
	{
		try 
		{
			this.config.save(file);
			return true;
		} 
		catch (IOException e) 
		{
			System.out.println("Impossible de sauvegardé le fichier: " + getName() + ".yml");
			return false;
		}
	}
	
	public File getFile() 
	{
		return this.file;
	}
	
	public YamlConfiguration getConfig()
	{
		return this.config;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public boolean isExist() 
	{
		return this.exist;
	}
}
