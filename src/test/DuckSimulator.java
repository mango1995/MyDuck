package test;

import model.Duck;
import model.FlyNoWay;
import model.FlyWithRocket;
import model.FlyWithWings;
import model.MallardDuck;
import model.MuteQuack;
import model.Quack;
import model.RedHeadDuck;
import model.RubberDuck;
import model.Squeak;

public class DuckSimulator {
	public static void main(String[] args) {
		System.out.println("ÂÌÍ·Ñ¼£º");
		Duck MallardDuck = new MallardDuck();
		MallardDuck.display();
		MallardDuck.swim();
		MallardDuck.perFormQuack();
		MallardDuck.perFormFly();
		MallardDuck.setQuackBehavior(new Quack());
		MallardDuck.perFormQuack();
		MallardDuck.setFlyBehavior(new FlyWithWings());
		MallardDuck.perFormFly();
		
		System.out.println("ºìÍ·Ñ¼£º");
		Duck RedHeadDuck = new RedHeadDuck();
		RedHeadDuck.display();
		RedHeadDuck.swim();
		RedHeadDuck.perFormQuack();
		RedHeadDuck.perFormFly();
		RedHeadDuck.setQuackBehavior(new MuteQuack());
		RedHeadDuck.perFormQuack();
		RedHeadDuck.setFlyBehavior(new FlyWithRocket());
		RedHeadDuck.perFormFly();
		
		System.out.println("ÏðÆ¤Ñ¼£º");
		Duck RubberDuck = new RubberDuck();
		RubberDuck.display();
		RubberDuck.swim();
		RubberDuck.perFormQuack();
		RubberDuck.perFormFly();
		RubberDuck.setQuackBehavior(new Squeak());
		RubberDuck.perFormQuack();
		RubberDuck.setFlyBehavior(new FlyNoWay());
		RubberDuck.perFormFly();
	}
}	
