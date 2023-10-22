
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.testing.block.BubbaBlock;
import net.mcreator.testing.TestingMod;

public class TestingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestingMod.MODID);
	public static final RegistryObject<Block> BUBBA = REGISTRY.register("bubba", () -> new BubbaBlock());
}
