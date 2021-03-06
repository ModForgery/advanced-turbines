package nl.azhdev.adtu.turbine;

import net.minecraft.block.Block;
import nl.azhdev.adtu.core.blocks.adtuBlocks;

public class Turbine{
	private int minSteamInput;
	private int maxSteamInput;
	private int maxRFOutput;
	private Block masterBlock;
	private String TurbineName;
	
	public Turbine(){
		setMaxRFOutput(0);
		setMinSteamInput(0);
		setMaxSteamInput(0);
		setMasterBlock(adtuBlocks.turbineBlock);
		setTurbineName("");
	}
	
	public void setTurbineName(String name) {
		this.TurbineName = name;
		
	}

	public String getTurbineName(){
		return TurbineName;
	}
	
	public void setMinSteamInput(int par1){
		this.minSteamInput = par1;
	}
	
	public int getMinSteamInput(){
		return this.minSteamInput;
	}
	
	public void setMaxSteamInput(int par1){
		this.maxSteamInput = par1;
	}
	
	public int getMaxSteamInput(){
		return this.maxSteamInput;
	}

	public int getMaxRFOutput() {
		return maxRFOutput;
	}

	public void setMaxRFOutput(int maxRFOutput) {
		this.maxRFOutput = maxRFOutput;
	}

	public Block getBlock() {
		return masterBlock;
	}

	public void setMasterBlock(Block masterBlock) {
		this.masterBlock = masterBlock;
	}
}
