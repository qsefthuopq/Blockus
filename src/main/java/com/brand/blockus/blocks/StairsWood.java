package com.brand.blockus.blocks;

import com.brand.blockus.Blockus;

import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.block.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StairsWood extends StairsBlock {
	
	public StairsWood(BlockState state, String name, float hardness, float resistance) {
		super(state, FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(hardness, resistance).build());
		Registry.BLOCK.register(new Identifier(Blockus.MOD_ID, name), this);
		Registry.ITEM.register(new Identifier(Blockus.MOD_ID, name), new BlockItem(this, new Item.Settings().stackSize(64).itemGroup(ItemGroup.BUILDING_BLOCKS)));
	}	
}