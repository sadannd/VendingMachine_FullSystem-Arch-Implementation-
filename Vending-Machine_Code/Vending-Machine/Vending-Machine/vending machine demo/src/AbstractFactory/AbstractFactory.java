package AbstractFactory;



//This is the Abstract factory abstract class



import DataStore.*;
import OutputProcessor.StrategyPattern.*;

public abstract class AbstractFactory {
//	This is an abstract method to create and return DataStore object
	public abstract DataStore getDataStorage();
//	This is an abstract method to create and return StorePrice object (OutputProcessor)
	public abstract StorePrice ObtainRetailPrice();
//	This is an abstract method to create and return ZeroCF object (OutputProcessor)
	public abstract ZeroTotal estimateZeroCf();
//	This is an abstract method to create and return IncreaseCF object (OutputProcessor)
	public abstract IncreaseTotal ReceiveExtendedCF();
//	This is an abstract method to create and return ReturnCoins object (OutputProcessor)
	public abstract ReturnChange RetrieveReturnedCash();
//	This is an abstract method to create and return DisposeDrink object (OutputProcessor)
	public abstract DisposeDrink getDisposeDrink();
//	This is an abstract method to create and return DisposeAdditive object (OutputProcessor)
	public abstract DisposeAdditive getDisposeAdditive();
	
}
