import java.lang.Math.*;
import java.util.*;

class DiceRoller {
	
	public int d20() {
		return 1 + (int)(Math.random() * ((20 - 1) + 1));
	}
	public int d100() {
		return 1 + (int)(Math.random() * ((100 - 1) + 1));
	}
	public int d12() {
		return 1 + (int)(Math.random() * ((12 - 1) + 1));
	}
	public int d10() {
		return 1 + (int)(Math.random() * ((10 - 1) + 1));
	}
	public int d8() {
		return 1 + (int)(Math.random() * ((8 - 1) + 1));
	}
	public int d6() {
		return 1 + (int)(Math.random() * ((6 - 1) + 1));
	}
	public int d4() {
		return 1 + (int)(Math.random() * ((4 - 1) + 1));
	}
}
