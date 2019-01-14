package Armband;

import AP.lib.ArmbandMachine;

public class ArmBandMachine
implements ArmbandMachine
{
	
	
	public float getCost(float price, int quantity){
		return price*quantity;
		
	}

}
