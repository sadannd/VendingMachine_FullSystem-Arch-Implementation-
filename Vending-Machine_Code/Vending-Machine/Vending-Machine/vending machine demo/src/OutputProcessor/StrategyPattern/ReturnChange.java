package OutputProcessor.StrategyPattern;

//Strategy pattern
//Abstract class

import DataStore.*;

public interface ReturnChange {
//	Abstract class to return coins
	public DataStore getDataStore();
	public void setDataStore(DataStore ds);
//	Abstract class for returning coins
	public void ReturnChanges();
}
