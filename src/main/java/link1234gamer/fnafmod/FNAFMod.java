package link1234gamer.fnafmod;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import link1234gamer.fnafmod.common.block.BlockMultiTile;
import link1234gamer.fnafmod.common.block.BlockTile;
import link1234gamer.fnafmod.common.block.FNAF_Blocks;
import link1234gamer.fnafmod.common.entity.FNAFEntities;
import link1234gamer.fnafmod.common.proxy.CommonProxy;
import link1234gamer.fnafmod.common.tab.CreativeTabFNAF;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = FNAFMod.MODID, name = FNAFMod.NAME, version = FNAFMod.VERSION, modLanguage = FNAFMod.LANGUAGE)

public class FNAFMod {
	
	@Instance("fnafmod")
	public static FNAFMod instance;
	
	public static final String MODID = "fnafmod";
	public static final String NAME = "FNaF Universe Mod";
    public static final String VERSION = "1.0";
    public static final String LANGUAGE = "fnafmod:lang/en_US.lang";
    
	@SidedProxy(clientSide = "link1234gamer.fnafmod.common.proxy.ClientProxy", serverSide = "link1234gamer.fnafmod.common.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs tabFNAF = new CreativeTabFNAF();
	
	public static Block blockTile;
	public static Block blockMultiTile;

	public static Object network;

	public static Object eventHandler;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
  	
		blockTile = new BlockTile(Material.rock).setBlockName("BlockTile").setBlockTextureName("fnafmod:tile_floor").setCreativeTab(tabFNAF);
		blockMultiTile = new BlockMultiTile(Material.rock).setBlockName("BlockMultiTile").setBlockTextureName("fnafmod:multi_tiled_floor").setCreativeTab(tabFNAF);
		
		GameRegistry.registerBlock(blockTile, blockTile.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMultiTile, blockMultiTile.getUnlocalizedName().substring(5));
		System.out.println(blockTile.getUnlocalizedName().substring(5));
		System.out.println(blockMultiTile.getUnlocalizedName().substring(5));
		
    	FMLCommonHandler.instance().bus().register(FNAFMod.instance);   
    	FNAF_Blocks.register();
    	FNAFEntities.registerEntity();
       	proxy.registerRenderers();
       	
       	proxy.preInit();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
			proxy.init();
	}
	
    @EventHandler
	public static void PostLoad(FMLPostInitializationEvent Post) 
    {
			
    }

	public boolean useLookingGlass() {
		return false;
	}

	public boolean hasViewForCoords(String nbtString) {
		return false;
	}

	public void removeViewForCoords(String nbtString) {
		
	}

}
