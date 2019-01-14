package armband;



import AP.lib.ArmbandMachine;

public class ArmBandMachine {
	@Test
	public void ShudCalulateCost(){
		ArmbandMachine machine= new ArmBandMachine();
		
		System.out.println("cost:"+machine.getCost(3,5));

		assertEquals(15,machine.getCost(3, 5),0);
	}

}
