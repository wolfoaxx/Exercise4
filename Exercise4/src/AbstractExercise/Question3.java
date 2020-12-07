package AbstractExercise;

abstract class Marks {

	abstract double getPercentage();
}

class A extends Marks{
double marks1,marks2,marks3,percentage;


	public A(double m1, double m2, double m3) {
		this.marks1 = m1;
		this.marks2 = m2;
		this.marks3 = m3;
		
	}
	public double getPercentage() {
		percentage = (marks1+marks2+marks3) /300*100;
		return percentage;
	}

}
class B extends Marks{
double marks1,marks2,marks3,marks4,percentage;

	public B(double m1, double m2, double m3,double m4) {
		this.marks1 = m1;
		this.marks2 = m2;
		this.marks3 = m3;
		this.marks4 = m4;
		
	}

	
	public double getPercentage() {
		percentage = (marks1+marks2+marks3+marks4) /400*100;
		return percentage;
	}

}

class Question3{
	public static void main (String[] args) {
		A a = new A(80,70,60);
		B b = new B(50,80,70,90);
		
	System.out.println("Student A percentage is : "+ a.getPercentage() + "%");
	System.out.println("Student B percentage is : " + b.getPercentage()+ "%");
	}
}

