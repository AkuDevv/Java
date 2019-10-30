package animal;

public abstract class Animal {
	public static int nbrAnimal=0;
	private String nom;
	private int age;
	private int poid;
	private double speed;
	private int id;
	
	public Animal() {
		nbrAnimal++;
		this.nom = "";
		this.age = 0;
		this.id = 0;
		setPoid();
		this.speed = 0;
	}
	public Animal(String n,int a,int p,double s,int i) {
		nbrAnimal++;
		this.nom = n;
		this.age = a;
		this.id = i;
		this.poid = p;
		this.speed = s;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}
	public void setPoid() {
		this.poid = (int)(Math.random()*66+1);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return ("Animal "+this.getId()+" : \n Nom : "+this.getNom()+"\n Age : "+this.getAge()+"\n Poid : "+this.getPoid()+"\n Speed : "+this.getSpeed());
	}
	
	public abstract String parle();
}
