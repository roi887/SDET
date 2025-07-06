package com.interfacee;

public class Lenovo implements Laptop {

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println(" lenovo cut code");
	}

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println("lenovo copy code");
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("lenovo paste code");
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("lenovo keyboard code");
	}
	
	 public  void video() {
   	 
   	 System.out.println("video code");
    }
    
	 public void audio() {
		 
		 System.out.println("my new auido file ");
	 }

	 public void camera() {
		 
		 System.out.println("my new camera code ");
	 }
}
