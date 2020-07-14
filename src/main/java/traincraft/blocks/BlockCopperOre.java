package traincraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import traincraft.Traincraft;

public class BlockCopperOre extends BaseBlock {

	public BlockCopperOre() {
		super(Material.ROCK);
		this.setRegistryName(Traincraft.MOD_ID, "copper_ore");
		
		this.setCreativeTab(Traincraft.TAB);
		this.setHardness(3.0F);
		this.setResistance(5F);
		this.setSoundType(SoundType.STONE);
		this.setHarvestLevel("pickaxe", 1);
	}

}