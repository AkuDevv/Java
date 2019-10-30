package animal;

public class Cat extends Animal {
	
	public Cat() {
		super();
	}

	public Cat(String n, int a, int p, double s, int i) {
		super(n, a, p, s, i);
	}
	
	public String parle() {
		return "Miao";
	}
	
	public String toString() {
		return "Chat "+this.getId()+" : \n Nom : "+this.getNom()+"\n Age : "+this.getAge()+"\n Poid : "+this.getPoid()+"\n Speed : "+this.getSpeed()+"\n Son : "+this.parle();
	}
}
