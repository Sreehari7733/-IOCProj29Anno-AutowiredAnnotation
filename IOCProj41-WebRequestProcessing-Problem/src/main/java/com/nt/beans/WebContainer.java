package com.nt.beans;

public class WebContainer {
	//creating dependent spring bean
	private RequestHandler rh;

	public void setRh(RequestHandler rh) {
		this.rh = rh;
	}

	public WebContainer() {
	System.out.println("0-param constructor for webcontainer...");
	}
	
	public void webcontainerRequest(String data) {
		System.out.println("\nWeb Container:Request coming for processing requests having hashcode"+this.hashCode()+"with data "+data);
		rh.requstProcessing(data);
		System.out.println("\nWebcontainer:Request is processed with hashcode:"+this.hashCode()+"with data"+data);
	}
	
}
