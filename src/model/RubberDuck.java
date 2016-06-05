package model;

public class RubberDuck extends Duck {
	public RubberDuck(){
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display(){
		System.out.println("RubberDuck is display");
	}
	
	
	/*public static void main(String[] args) {
		RubberDuck RubberDuck = new RubberDuck();
		RubberDuck.display();
		RubberDuck.swim();
		RubberDuck.perFormQuack();
		RubberDuck.perFormFly();
		RubberDuck.setQuackBehavior(new Squeak());
		RubberDuck.setFlyBehavior(new FlyNoWay());
		RubberDuck.perFormQuack();
		RubberDuck.perFormFly();		
	}*/
}
