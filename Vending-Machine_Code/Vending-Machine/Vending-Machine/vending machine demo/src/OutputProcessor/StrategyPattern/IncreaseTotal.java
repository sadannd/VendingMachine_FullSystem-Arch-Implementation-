package OutputProcessor.StrategyPattern;

//Strategy pattern
//Abstract class

import DataStore.*;

public interface IncreaseTotal {
//	Interface class to increasecf

//	Get DataStore object
//	set DataStore object
	public DataStore getDataStore();
	public void setDataStore(DataStore ds);
	
//	This Interface method is used to increase cf
	public void IncreaseTotal();
}
