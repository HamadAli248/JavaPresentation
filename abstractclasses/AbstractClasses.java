abstract class Animal {
	//abstract method
	public abstract void animalSound();
	//regular method
	public void sleep() {
		System.out.println("zzz");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: oink");
	}
}

class AbstractClasses {
	public static void main(String[] args){
		Pig mypig = new Pig(); //new pig object
		mypig.animalSound();
		mypig.sleep();
	}
}


