import java.util.*;

public class Main {
	public static void main(String args[]) {
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		int attack, defV1, defH1, damage;

		System.out.println("Welcome to the Star Wars capital ship combat simulator. This is just a test run.");
		
		Harrower h1 = new Harrower();
		Valor v1 = new Valor();

		System.out.println("Trading bombardments...");
		
		defV1 = v1.defense();
		defH1 = h1.defense();		

		for (int i = 0; i < 10; i++)
		{
			attack = v1.attack1();
			if (attack >= defH1) {
				System.out.println("Valor-class cruiser turbolaser cannons score several hits!");
				damage = v1.damage1();
				h1.takeDamage(damage);
				h1.printStats();
			}
			else {
				System.out.println("Valor-class cruiser turbolaser cannons fail to inflict any damage.");
			}
			attack = h1.attack1();
			if (attack >= defV1) {
				System.out.println("Harrower-class dreadnought turbolaser batteries pound away at the enemy's hull!");
				damage = h1.damage1();
				v1.takeDamage(damage);
				v1.printStats();
			}
			else {
				System.out.println("Harrower-class dreadnought turbolaser batteries look like they need some new gunners.");
			}
		}
	}
}
			
			
