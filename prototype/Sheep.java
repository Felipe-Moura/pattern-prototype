package main.prototype;

public class Sheep implements Animal{

	
	public Sheep() {
		System.out.println("Sheep is Made");
	}
	
	
	public Animal makecopy() {
		
		System.out.println("Sheep is Being Made");
		
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sheepObject;
	}
	
	
	public String toString() {
		return "Dolly is my Hero, Baaaaaaa";
	}

}
