import java.util.*;

interface CapitalShip {
	public int attack1(); // Roll to see whether attack hits
	public int attack2();
	public int attack3();
	public int attack4();
	public int attack5();
	public int damage1(); // Damage against HP if attack succeeds
	public int damage2();
	public int damage3();
	public int damage4();
	public int damage5();
	public void takeDamage(int dmg); // Self-explanatory
	public int defense(); // Determines if an attack hits
	public int checkHP();
	public void printStats(); // Prints a status report of the ship
}

