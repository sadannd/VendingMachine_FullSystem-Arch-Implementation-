package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements IncreaseCF abstract class and used for Vending Machine1

public class IncreaseTotal1 implements IncreaseTotal{
	private DataStore ds;
	
//	This class implemets IncreaseCF
	@Override
	public DataStore getDataStore() {
		// TODO Auto-generated method stub
		return ds;
	}

	@Override
	public void setDataStore(DataStore ds) {
		// TODO Auto-generated method stub
		this.ds = ds;
	}

	
//	This methods adds the coins to cumulative funds integers only.
	@Override
	public void IncreaseTotal() {
		// TODO Auto-generated method stub
		int cf = ds.getIntTotal();
		int v = ds.getIntTemp_value();
		int total = cf + v;
		ds.setTotal(total);
		System.out.println("coins: "+ total); //  TO DO : put total
		
	}

}
