package su.binair.andasia.effects.runnable;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import su.binair.andasia.Main;

public class TripleAliageChestplate extends EffectRunnable 
{
	public TripleAliageChestplate(Main m) 
	{
		super(m, "TripleAliageChestplate", new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 0, true));
	}

	@Override
	protected boolean check(Player player) 
	{
		ItemStack stack = player.getInventory().getChestplate();
		return stack != null && stack.getType() == Material.TRIPLEALIAGE_CHESTPLATE;
	}
}