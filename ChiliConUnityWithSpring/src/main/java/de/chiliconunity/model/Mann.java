package de.chiliconunity.model;

public class Mann extends Geschlecht {
	
	public String returnstring;
	
	public Mann(){
		this.returnstring="Mann";
	}
	
	public String toString(){
		
		return returnstring;
	}
	
	public String getReturnstring(){
	
		return this.returnstring;
	}

}
