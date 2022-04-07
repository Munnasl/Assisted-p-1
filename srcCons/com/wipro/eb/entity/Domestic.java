package com.wipro.eb.entity;

public class Domestic extends Connection {
	
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
			amount=50*slabs[0]+50*slabs[1]+(consumed-100)*slabs[2]
		}
	}
		return 0;
	}
	
