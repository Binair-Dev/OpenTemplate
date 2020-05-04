package su.binair.andasia.effects.runnable;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import su.binair.andasia.Main;

public class TripleAliageBoots extends EffectRunnable 
{

	public TripleAliageBoots(Main plugin) 
	{
		super(plugin, "TripleAliageBoots", new PotionEffect(PotionEffectType.FEATHER_FALLING, 1000000, 0, true));
	}

	@Override
	protected boolean check(Player player) 
	{
		ItemStack stack = player.getInventory().getBoots();
		return stack != null && stack.getType() == Material.TRIPLEALIAGE_BOOTS;
	}
}