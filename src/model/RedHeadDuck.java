package model;

public class RedHeadDuck extends Duck {
	public RedHeadDuck(){
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyWithRocket();
	}
	@Override
	public void display(){
		System.out.println("RedHeadDuck is display");
	}
	
	
/*	public static void main(String[] args) {
		RedHeadDuck RedHeadDuck = new RedHeadDuck();
		RedHeadDuck.display();
		RedHeadDuck.swim();
		RedHeadDuck.perFormQuack();
		RedHeadDuck.perFormFly();
		RedHeadDuck.setQuackBehavior(new MuteQuack());
		RedHeadDuck.setFlyBehavior(new FlyWithRocket());
		RedHeadDuck.perFormQuack();
		RedHeadDuck.perFormFly();	
	}*/
}

