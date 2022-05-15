package polymorphism;


class Animal {
	void eat() {
		System.out.println("Animals Eat");
	}
}
class herbivores extends Animal {
	void eat() {
		System.out.println("Herbivores Eat Plants");
	}
}
class omnivores extends Animal {
	void eat() {
		System.out.println("Omnivores Eat Plants and meat");
	}
}
class carnivores extends Animal {
	void eat() {
		System.out.println("Carnivores Eat meat");
	}
}
public class Runtime {
	public static void main(String args[]) {
		Animal A = new Animal();
		A.eat();// Animals Eat
		Animal h = new herbivores(); // Herbivores Eat plant
		h.eat();// 
		Animal o = new omnivores(); // omnivores eat meat and plant
		o.eat();// 
		Animal c = new carnivores(); // carnivores eat meat
		c.eat();//
	}
}
/**
 * When a method gets to know its implementation at the time of execution/rum time is known as run
 * time poly this can be achieved by using method overriding
 * 1. Inheritance
 * 2. Upcasting
 * 3. Method Overriding
 */
