package de.chiliconunity.data;

public class Unit {
	private static Unit nullUnit;
	
	public static Unit nullUnit(){
		if(nullUnit == null){
			nullUnit = new Unit(){
				public boolean isNull(){
					return true;
				}
			};
		}
		return nullUnit;
	}
	
	protected Unit() {
	}
	
	public boolean isNull(){
		return false;
	}

	private String name;
	
	protected Double factor = 1.0;
	protected Unit reference = Unit.nullUnit();
	
	public String getName(){
		return this.name;
	}
	
	
	public boolean equals(Object o){
		if(!(o instanceof Unit))
			return false;
		else if(((Unit) o).name.equals(this.name)){
			return true;
		}
		return false;
	}

}
