package org.system;

public  class Desktop extends Computer {
     public void desktopSize() {
    	 System.out.println("Desktop");
     }
     public static void main(String[] args) {
		Desktop cm=new Desktop();
		cm.computerModel();
		cm.desktopSize();
	}
     }
