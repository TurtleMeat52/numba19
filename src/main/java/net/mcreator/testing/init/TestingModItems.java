
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.testing.TestingMod;

public class TestingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestingMod.MODID);
	public static final RegistryObject<Item> BUBBA_2 = block(TestingModBlocks.BUBBA_2);
	public static final RegistryObject<Item> BUBBA = block(TestingModBlocks.BUBBA);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
