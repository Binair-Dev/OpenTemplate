package su.binair.andasia.effects.runnable;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import su.binair.andasia.Main;

public class FullArmoredArmor extends EffectRunnable 
{

	public FullArmoredArmor(Main plugin) 
	{
		super(plugin, "FullArmored",
				new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000, 2, true),
				new PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 1, true),
				new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000, 0, true),
				new PotionEffect(PotionEffectType.SLOW, 1000000, 1, true));
	}

	@Override
	protected boolean check(Player player) 
	{
		PlayerInventory pi = player.getInventory();
		if (pi.getHelmet() == null || pi.getHelmet().getType() != Material.ARMORED_HELMET)
			return false;
		if (pi.getChestplate() == null || pi.getChestplate().getType() != Material.ARMORED_CHESTPLATE)
			return false;
		if (pi.getLeggings() == null || pi.getLeggings().getType() != Material.ARMORED_LEGGINGS)
			return false;
		if (pi.getBoots() == null || pi.getBoots().getType() != Material.ARMORED_BOOTS)
			return false;
		return true;
	}
}