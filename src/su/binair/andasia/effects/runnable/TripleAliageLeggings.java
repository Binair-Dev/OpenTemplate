package su.binair.andasia.effects.runnable;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import su.binair.andasia.Main;

public class TripleAliageLeggings extends EffectRunnable 
{

	public TripleAliageLeggings(Main plugin) 
	{
		super(plugin, "TripleAliageLeggings",new PotionEffect(PotionEffectType.SPEED, 1000000, 1, true));
	}

	@Override
	protected boolean check(Player player) 
	{
		ItemStack stack = player.getInventory().getLeggings();
		return stack != null && stack.getType() == Material.TRIPLEALIAGE_LEGGINGS;
	}
}