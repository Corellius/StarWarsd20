import java.util.*;

class Valor implements CapitalShip {
	private int speed;
	private int ref;
	private int fort;
	private int maxHP;
	private int currentHP;
	private int init;
	private int threshold;
	private int conditionMod;
	private int shields;
	private int DR;
	private int result;
	private DiceRoller roll = new DiceRoller();
	
	Valor() {
		speed = 4;
		ref = 14;
		fort = 48;
		maxHP = 1060;
		currentHP = maxHP;
		init = -2;
		conditionMod = 0;
		threshold = 248;
		shields = 155;
		DR = 20;
	}

	public int attack1() {
		// Turbolaser Batteries
		result =  roll.d20();
		return  result + 7;
	}
	public int attack2() {
		// Quad-laser cannons
		result =  roll.d20();
		return  result + 17;
	}
	public int attack3() {
		// Ion cannons
		result =  roll.d20();	
		return  result + 7;
	}
	public int attack4() {
		// Proton torpedoes
		result = roll.d20();
		return  result + 7;
	}
	public int attack5() {
		// Concussion missile launchers
		result = roll.d20();
		return  result + 7;
	}

	public int damage1() {
		int damage1 = 0;
		for (int i = 0; i < 8; i++) {
			result = roll.d10();
			damage1 += result;
		}
		damage1 *= 5;
		System.out.printf(" Valor turbolaser batteries inflict %s damage.\n", damage1);
		return damage1;
	}
	public int damage2() {
		int damage2 = 0;
		for (int i = 0; i < 7; i++) {
			result = roll.d10();
			damage2 += result;
		}
		damage2 *= 5;
		System.out.printf(" Valor quad-laser cannons inflict %s damage.\n", damage2);
		return damage2;
	}
	public int damage3() {
		int damage3 = 0;
		for (int i = 0; i < 9; i++) {
			result = roll.d10();
			damage3 += result;
		}
		damage3 *= 2;
		System.out.printf(" Valor ion cannons inflict %s damage.\n", damage3);
		return damage3;
	}
	public int damage4() {
		int damage4 = 0;
		for (int i = 0; i < 9; i++) {
			result = roll.d10();
			damage4 += result;
		}
		damage4 *= 2;
		System.out.printf(" Valor proton torpedoes inflict %s damage.\n", damage4);
		return damage4;
	}
	public int damage5() {
		int damage5 = 0;
		for (int i = 0; i < 9; i++) {
			result = roll.d10();
			damage5 += result;
		}
		damage5 *= 2;
		System.out.printf(" Valor concussion missiles inflict %s damage.\n", damage5);
		return damage5;
	}
	public void printStats() {
		System.out.println("Valor Status Report");
		System.out.printf("HP: %s\n", currentHP);
		System.out.printf("SR: %s\n", shields);
		System.out.printf("Condition: %s\n", conditionMod);
	}
	public int defense() {
		return ref;
	}
	public void takeDamage(int dmg) {
		if (dmg > shields) {
			if (dmg > shields + DR) {
				currentHP -= (dmg - shields - DR);
				System.out.printf("Valor-class cruiser suffers %s damage.\n", (dmg - shields - DR));
			}
			if (dmg - shields - DR > threshold) {
				if (conditionMod < 2) {
					conditionMod -= 1;
				}
				else if (conditionMod == -2) {
					conditionMod = -5;
				}
				else if (conditionMod == -5) {
					conditionMod = -10;
				}
			}
			if (shields > 0) {
				shields -= 5;
			}
		}
	}
	public int checkHP() {
		return currentHP;
	}
}
