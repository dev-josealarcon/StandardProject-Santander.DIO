package SantanderDIO.gof;

import SantanderDIO.gof.facade.Facade;
import SantanderDIO.gof.singleton.SingletonEager;
import SantanderDIO.gof.singleton.SingletonLazy;
import SantanderDIO.gof.singleton.SingletonLazyHolder;
import SantanderDIO.gof.strategy.AggressiveBehavior;
import SantanderDIO.gof.strategy.Behavior;
import SantanderDIO.gof.strategy.DefensiveBehavior;
import SantanderDIO.gof.strategy.NormalBehavior;
import SantanderDIO.gof.strategy.Robot;

public class Test {
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		

		
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);
		
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstance();
		System.out.println(holder);
		
		
		Behavior normal = new NormalBehavior();
		Behavior defense = new DefensiveBehavior();
		Behavior aggressive = new AggressiveBehavior();
		
		
		Robot robot = new Robot();
		robot.setBehavior(normal);		
		robot.move();
		robot.move();
		robot.setBehavior(defense);		
		robot.move();
		robot.setBehavior(aggressive);		
		robot.move();
		robot.move();
		robot.move();
		
		
		Facade facade =  new Facade();
		facade.migrateCustomer("Jose Alarcon", "V5K1A1");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
