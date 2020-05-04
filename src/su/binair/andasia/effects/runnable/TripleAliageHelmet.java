package su.binair.andasia.effects.runnable;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import su.binair.andasia.Main;

public class TripleAliageHelmet extends EffectRunnable 
{

	public TripleAliageHelmet(Main plugin) 
	{
		super(plugin, "TripleAliageHelmet",new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1000000, 0, true));
	}

	@Override
	protected boolean check(Player player) 
	{
		ItemStack stack = player.getInventory().getHelmet();
		return stack != null && stack.getType() == Material.TRIPLEALIAGE_HELMET;
	}
}