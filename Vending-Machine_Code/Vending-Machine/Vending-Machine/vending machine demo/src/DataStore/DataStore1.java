package DataStore;

//This is the DataStore1 class which contains methods for virtual machine 1


public class DataStore1 extends DataStore{

	private float Temp_price, Temp_value;
	private int total;
	private float price;
//	This method is used to get the value of temporary variable int temp_p.
	@Override
	public int getIntTemp_price() {
		// TODO Auto-generated method stub
		return (int) Temp_price;
	}
//This method is used to set the value of temporary variable int temp_p.
	@Override
	public void setTemp_price(int p) {
		// TODO Auto-generated method stub
		this.Temp_price = p;
	}

	@Override
	public float getFloatTemp_price() {
		// TODO Auto-generated method stub
		return Temp_price;
	}

	@Override
	public void setTemp_price(float p) {
		// TODO Auto-generated method stub
		this.Temp_price = p;
	}

//	This method is used to get the value of temporary variable int temp_v.
	@Override
	public int getIntTemp_value() {
		// TODO Auto-generated method stub
		return (int) Temp_value;
	}
//This method is used to set the value of temporary variable int temp_v.
	@Override
	public void setTemp_value(int v) {
		// TODO Auto-generated method stub
		Temp_value = v;
	}

	@Override
	public float getFloatTemp_value() {
		// TODO Auto-generated method stub
		return Temp_value;
	}

	@Override
	public void setTemp_value(float v) {
		// TODO Auto-generated method stub
		Temp_value = v;

	}

//	This method is used to set the value of variable int Cf.
	@Override
	public void setTotal(int c) {
		// TODO Auto-generated method stub
		total = c;
	}
//This method is used to get the value of variable int Cf.
	@Override
	public int getIntTotal() {
		// TODO Auto-generated method stub
		return total;
	}
	
	@Override
	public float getFloatTotal() {
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public void setTotal(float c) {
		// TODO Auto-generated method stub
		total = (int) c;
	}

	@Override
	public float getFloatPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(float p) {
		// TODO Auto-generated method stub
		price=p;
	}
//This method is used to get the value of variable int price.
	@Override
	public int getIntPrice() {
		// TODO Auto-generated method stub
		return (int) price;
	}
//This method is used to set the value of variable int price.
	@Override
	public void setPrice(int p) {
		// TODO Auto-generated method stub
		price = p;
	}

}
