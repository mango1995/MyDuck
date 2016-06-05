package model;

public class MallardDuck extends Duck {
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display(){
		System.out.println("MallardDuck is display");
	}
	
/*	
	public static void main(String[] args) {
		MallardDuck MallardDuck = new MallardDuck();
		MallardDuck.display();
		MallardDuck.swim();
		MallardDuck.perFormQuack();
		MallardDuck.perFormFly();
		MallardDuck.setQuackBehavior(new Quack());
		MallardDuck.setFlyBehavior(new FlyWithWings());
		MallardDuck.perFormQuack();
		MallardDuck.perFormFly();	
	}*/
}
