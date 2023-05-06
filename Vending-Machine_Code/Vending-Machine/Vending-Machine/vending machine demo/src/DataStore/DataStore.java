package DataStore;


// This is the Abstract DataStore class which contains methods of both class


/*
* This is an abstract class for storing data for Vending Machines
*/
public abstract class DataStore {
//	This is an abstract class and is used to store platform dependent data.
	
//	This is abstract method to get the value of temporary variable int temp_p.
	public abstract int getIntTemp_price();
//	This is abstract method to set the value of temporary variable int temp_p.
	public abstract void setTemp_price(int p);
//	This is abstract method to get the value of temporary variable float temp_p.
	public abstract float getFloatTemp_price();
//	This is abstract method to set the value of temporary variable float temp_p.
	public abstract void setTemp_price(float p);
	
	
//	This is abstract method to get the value of temporary variable int temp_v
	public abstract int getIntTemp_value();
//	This is abstract method to set the value of temporary variable int temp_v.
	public abstract void setTemp_value(int v);
//	This is abstract method to get the value of temporary variable float temp_v.
	public abstract float getFloatTemp_value();
//	This is abstract method to set the value of temporary variable float temp_v.
	public abstract void setTemp_value(float v);
	
	
//	This is abstract method to get the value of float cf.
	public abstract float getFloatTotal();
//	This is abstract method to get the value of int cf.
	public abstract void setTotal(float c);
//	This is abstract method to set the value of int cf.
	public abstract void setTotal(int c);
//	This is abstract method to set the value of float cf.
	public abstract int getIntTotal();
	
	
//	This is abstract method to get the value of float price
	public abstract float getFloatPrice();
//	This is abstract method to set the value of float Price
	public abstract void setPrice(float p);
//	This is abstract method to get the value of int price.
	public abstract int getIntPrice();
//	This is abstract method to set the value of int Price
	public abstract void setPrice(int p);
	
}
