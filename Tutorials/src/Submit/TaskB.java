package Submit;
interface LivingOrganism{//interface declaration for living organisms
	void movementWith();
	void eatsWith();
}

class Animal implements LivingOrganism{
	//implementing the interface for living organisms
	//First override
	public void eatsWith() {
		System.out.println("Animals eat with their mouths");
	}
	@Override
	public void movementWith(){
		System.out.println("Animals move with their legs");
	}
	}

class Plants implements LivingOrganism{
	//Second override
	public void movementWith() {
		System.out.println("Plants do not move");
	}
	public void eatsWith() {
		System.out.println("Plants eats with their roots");
	}
}

public class TaskB {
public static void main(String[] args) {
	Plants P1=new Plants();
	Animal A1=new Animal();
	P1.eatsWith();
	P1.movementWith();
	A1.eatsWith();
	A1.movementWith();
}
}
