package DataStore;

// //This is the DataStore2 class which contains methods for virtual machine 2


public class DataStore2 extends DataStore{

	private float Temp_price, Temp_value;
	private float total;
	private float price;
	
	@Override
	public int getIntTemp_price() {
		// TODO Auto-generated method stub
		return (int) Temp_price;
	}

	@Override
	public void setTemp_price(int p) {
		// TODO Auto-generated method stub
		Temp_price=p;
		
	}
//This method is used to get the value of temporary variable float temp_p.
	@Override
	public float getFloatTemp_price() {
		// TODO Auto-generated method stub
		return Temp_price;
	}
//This method is used to set the value of temporary variable float temp_p.
	@Override
	public void setTemp_price(float p) {
		// TODO Auto-generated method stub
		this.Temp_price = p;
	}

	@Override
	public int getIntTemp_value() {
		// TODO Auto-generated method stub
		return (int) Temp_value;
	}

	@Override
	public void setTemp_value(int v) {
		// TODO Auto-generated method stub
		Temp_value=v;
		
	}
//This method is used to get the value of temporary variable float temp_v.
	@Override
	public float getFloatTemp_value() {
		// TODO Auto-generated method stub
		return Temp_value;
	}
//This method is used to set the value of temporary variable float temp_v.
	@Override
	public void setTemp_value(float v) {
		// TODO Auto-generated method stub
		Temp_value = v;
	}
//This method is used to get the value of variable float Cf.
	@Override
	public float getFloatTotal() {
		// TODO Auto-generated method stub
		return total;
	}
//	This method is used to set the value of variable float Cf.
	@Override
	public void setTotal(float c) {
		// TODO Auto-generated method stub
		total = c;
	}

	@Override
	public void setTotal(int c) {
		// TODO Auto-generated method stub
		total = c;
	}

	@Override
	public int getIntTotal() {
		// TODO Auto-generated method stub
		return (int) total;
	}
//This method is used to get the value of variable float price.
	@Override
	public float getFloatPrice() {
		// TODO Auto-generated method stub
		return price;
	}
//This method is used to set the value of variable float price.
	@Override
	public void setPrice(float p) {
		// TODO Auto-generated method stub
		price = p;
	}

	@Override
	public int getIntPrice() {
		// TODO Auto-generated method stub
		return (int) price;
	}

	@Override
	public void setPrice(int p) {
		// TODO Auto-generated method stub
		price=p;
	}

}
