import animal.Animal;
import animal.Cat;
import animal.Dog;

public class TestAnimal {
	
	public static void main(String[] args) {
		
		Animal A = new Cat();
		Animal B = new Cat();
		Animal C = new Cat("Uncle",5,4,50,1);
		Animal D = new Dog("Dogsh**t",7,6,30,2);
		
		System.out.println( "Le nombre des animaux est : "+Animal.nbrAnimal );
		System.out.println("\n");	
		System.out.println(C);
		System.out.println("\n");
		System.out.println(D);
	}
}
