package AbstractFactory;


//This is the Abstract factory concreate class for vending machine1


import DataStore.*;
import OutputProcessor.StrategyPattern.*;

public class VendingFactory1 extends AbstractFactory{

//	This is an method to create and return DataStore object
	@Override
	public DataStore getDataStorage() {
		// TODO Auto-generated method stub
		return new DataStore1();
	}
//This is an method to create and return StorePrice object (OutputProcessor)
	@Override
	public StorePrice ObtainRetailPrice() {
		// TODO Auto-generated method stub
		return new StorePrice1();
	}
// This is an method to create and return ZeroCF object (OutputProcessor)
	@Override
	public ZeroTotal estimateZeroCf() {
		// TODO Auto-generated method stub
		return new ZeroTotal1();
	}
//This is an method to create and return IncreaseCF object (OutputProcessor)
	@Override
	public IncreaseTotal ReceiveExtendedCF() {
		// TODO Auto-generated method stub
		return new IncreaseTotal1();
	}
//This is an method to create and return ReturnCoins object (OutputProcessor)
	@Override
	public ReturnChange RetrieveReturnedCash() {
		// TODO Auto-generated method stub
		return new ReturnChange1();
	}
//This is an method to create and return DisposeDrink object (OutputProcessor)
	@Override
	public DisposeDrink getDisposeDrink() {
		// TODO Auto-generated method stub
		return new DisposeDrink1();
	}
//This is an method to create and return DisposeAdditive object (OutputProcessor)
	@Override
	public DisposeAdditive getDisposeAdditive() {
		// TODO Auto-generated method stub
		return new DisposeAdditive1();
	}
	

}
