package com.brand.blockus.blocks;

import com.brand.blockus.Blockus;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tag.FabricItemTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.block.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockWood extends Block {
	
	public BlockWood(String name, float hardness, float resistance) {
		super(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).breakByTool(FabricItemTags.AXES, 0).strength(hardness, resistance).build());
		Registry.BLOCK.register(new Identifier(Blockus.MOD_ID, name), this);
		Registry.ITEM.register(new Identifier(Blockus.MOD_ID, name), new BlockItem(this, new Item.Settings().stackSize(64).itemGroup(ItemGroup.BUILDING_BLOCKS)));
	}
}

