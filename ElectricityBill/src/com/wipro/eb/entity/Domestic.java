package com.wipro.eb.entity;

public class Domestic extends Connection {
	public Domestic(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}

	@Override
	public float computeBill() {
		// TODO Auto-generated method stub
		int units=currentReading-previousReading;
		if(units<=50)
			return (float) (units*2.3);
		else if(units>50&&units<=100)
			return (float) (115+((units-50)*4.2));
		else
			return (float) (325+((units-100)*5.5));
	}
	

}
