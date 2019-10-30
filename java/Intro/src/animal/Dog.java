package animal;

public class Dog extends Animal {
	
	public Dog() {
		super();
	}

	public Dog(String n, int a, int p, double s, int i) {
		super(n, a, p, s, i);
	}
	
	public String parle() {
		return "Haw";
	}
	
	public String toString() {
		return "Chien "+this.getId()+" : \n Nom : "+this.getNom()+"\n Age : "+this.getAge()+"\n Poid : "+this.getPoid()+"\n Speed : "+this.getSpeed()+"\n Son : "+this.parle();
	}
}