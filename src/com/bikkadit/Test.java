package com.bikkadit;

public class Test {

	public static void main(String[] args) {
		
		Airtel airtel = new Airtel();
		airtel.browse();
		airtel.calling();
		
		Vodafone vodafone = new Vodafone();
		vodafone.browse();
		vodafone.calling();
		
		Sim sim = new Airtel();
		sim.browse();
		sim.calling();
		
		Sim sim1 = new Vodafone();
		sim1.browse();
		sim1.calling();
		
		
	}
}
