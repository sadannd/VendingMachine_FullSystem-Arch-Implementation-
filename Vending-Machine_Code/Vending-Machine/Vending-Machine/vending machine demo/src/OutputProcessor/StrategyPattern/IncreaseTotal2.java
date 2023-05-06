package OutputProcessor.StrategyPattern;

import DataStore.*;

//Strategy pattern
//Implements IncreaseCF abstract class and used for Vending Machine2

public class IncreaseTotal2 implements IncreaseTotal{
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

	
//	This methods adds the coins to cumulative funds float.
	@Override
	public void IncreaseTotal() {
		// TODO Auto-generated method stub
		float cf = ds.getFloatTotal();
		float v = ds.getFloatTemp_value();
		float total = cf + v;
		ds.setTotal(total);
		System.out.println("coins: "+ ds.getFloatTotal());
	}
}
