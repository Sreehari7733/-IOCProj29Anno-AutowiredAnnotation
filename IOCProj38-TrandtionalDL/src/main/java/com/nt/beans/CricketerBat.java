package com.nt.beans;

import java.util.Random;

public class CricketerBat {
	
	public CricketerBat() {
		System.out.println("cricketerBat 0-param constructor..");
	}
	private int scoreRuns;
	
	public int showScore() {
		return new Random().nextInt();
	}
}
