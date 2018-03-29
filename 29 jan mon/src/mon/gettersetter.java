package mon;

class canine{
	String breed;
	int age;
	String colour;
	
		public void setBreed(String b){
		breed=b;
	}
	public String getBreed(){
		return breed;
	} 
	
	
	public void setAge(int a){
		age=a;
	}
	public int getAge(){
		return age;
	}
	
	
	public void setColour(String l){
		colour=l;
	}
	public String getColour(){
		return colour;
	}
}

public class gettersetter {
	public static void main(String[] args) {
		
		canine d= new canine();
		d.breed="pug";
		d.age=12;
		d.colour="brown";
		System.out.println(d.breed);
		System.out.println(d.age);
		System.out.println(d.colour);
		
		canine c= new canine();
		
		c.setBreed("arctic");
		System.out.println(c.getBreed());
		c.setAge(10);
		System.out.println(c.getAge());
		c.setColour("white");
		System.out.println(c.getColour());
		
	}
	
}