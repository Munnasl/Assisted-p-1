package com.wipro.eb.entity;

public class Commericial extends Connection {
	
	public Domestic(int Domestic,int previous reading,float slabs[])
	{
		super(currentReading, previousReading, slabs);
	}
	public float computeBill() {
		float amount=0;
		int consumed=currentReading-previousReading;
		if(consumed<=50) {
			amount=consumed*slabs[0];
		}
		else if(consumed>50 && consumed<=100) {
		amount=50*slabs[0]+(consumed-50)*slabs[1];	
		}
		else {
			amount=50*slabs[0]+50*slabs[1]+(consumed-100)*slabs[2];
		}
		if (amount>=10000) {
			amount=(float) (amount+amount*0.09);
		}
		else if(amount>=5000) {
			amount=(float) (amount+amount*0.06);
		}
	}
		return amount;
	}
