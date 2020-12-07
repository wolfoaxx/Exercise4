package AbstractExercise;

abstract class Bank {
	 abstract void getBalance();
}

class BankA extends Bank{
	public void getBalance(){
		System.out.println("Bank A: $100");
	}
}

class BankB extends Bank{
	public void getBalance(){
		System.out.println("Bank B: $150");
	}
}

class BankC extends Bank{
	public void getBalance(){
		System.out.println("Bank C: $200");
	}
}

class Question2 {
	public static void main (String[] args) {
	BankA ba= new BankA();
	BankB bb= new BankB();
	BankC bc= new BankC();
		
		ba.getBalance();
		bb.getBalance();
		bc.getBalance();
	}
}

