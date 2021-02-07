package com.nt.test;

import com.nt.cmps.Vehicle;
import com.nt.factory.VehicleFactory;

public class Test {

	public static void main(String a[])
	{
		Vehicle v=VehicleFactory.getInstance();
		v.journey("hyd", "nlr");
	}
}
