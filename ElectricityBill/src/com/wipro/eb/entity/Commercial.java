package com.wipro.eb.entity;

public class Commercial extends Connection {
	public Commercial(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}

	@Override
	public float computeBill() {
		// TODO Auto-generated method stub
		int units=currentReading-previousReading;
		float billamount;
		if(units<=50)
		billamount=(float) (units*5.2);
		else if(units>50&&units<=100)
			billamount=(float) (260+((units-50)*6.8));
		else
			billamount=(float) (600+((units-100)*8.3));
		if(billamount<5000)
		{
			return (float) (billamount+(billamount*0.02));
		}
		else if(billamount>=5000&&billamount<10000)
			return (float) (billamount+(billamount*0.06));
		else
			return (float) (billamount+(billamount*0.09));

	}

}
