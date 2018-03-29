package mon;

class Animals{
	String colour;
	public void eat(){
		System.out.println("Animal is eating");
	}
}

class Dogs extends Animals{
	String breed;
	public void bark(){
		System.out.println("Dog is barking");
	}
	public void eat(){
		super.eat();
		System.out.println("Dog is eating");
	}
}

class Cats extends Animals{
	int age;
	public void meow(){
		System.out.println("Cat is meowing");
	}
	
}

public class Demo {
	public static void main(String[] args){
		Dogs pebbles= new Dogs();
				pebbles.breed="Alsatian";
				pebbles.bark();
				pebbles.colour="golden";
				pebbles.eat();
				
		Cats tom=new Cats();
				tom.age=3;
				tom.colour="white";
				tom.meow();
				
		Animals fauna= new Animals();
				fauna.colour="multi-colour";
	}
}
