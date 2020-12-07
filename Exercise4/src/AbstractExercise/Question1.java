package AbstractExercise;

abstract class Parent {
	abstract void message();
}

class Child1 extends Parent {
	public void message() {
		System.out.println("This is first subclasses");
	}
}
class Child2 extends Parent {
	public void message() {
		System.out.println("This is second subclasses");
	}
}

class Question1{
	public static void main (String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		c1.message();
		c2.message();
	}
}