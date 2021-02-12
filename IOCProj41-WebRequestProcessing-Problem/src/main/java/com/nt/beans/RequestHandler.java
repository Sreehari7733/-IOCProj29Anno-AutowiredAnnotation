package com.nt.beans;

public class RequestHandler {
	public static int count;
	public RequestHandler() {
		count++;
		System.out.println("0-param constructor for request handler..");
	}
	
	public void requstProcessing(String data) {
		System.out.println("\nRequestHandle:this request is processed by request handler with "+data+" having hashcode \n"
				+this.hashCode());
		
	}
	
	

}
