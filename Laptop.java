
package com.interfacee;

public interface Laptop {
	
	void cut() ;
	
	
	 void copy();
	 void paste();
	 
	 void keyboard();
	 
	 
	 static void camera() {
		 audio();
		 System.out.println("camera code ");
	 }
		
     static void audio() {
	
	System.out.println("audip code ");
}
     
     default void video() {
    	 System.out.println("video code");
     }


}





