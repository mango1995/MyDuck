package model;

public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public void swim(){
		System.out.println("duck is swim");
	}
	public abstract void display();
	
	public void perFormQuack(){
		quackBehavior.quack();
	}
	public void perFormFly(){
		flyBehavior.fly();
	}	
	public void setQuackBehavior(QuackBehavior quackbehavior){
		this.quackBehavior=quackbehavior;
	}
	public void setFlyBehavior(FlyBehavior flybehavior){
		this.flyBehavior=flybehavior;
	}
}