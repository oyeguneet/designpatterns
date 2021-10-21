package strategy;

public class Use {

	public static void main(String[] args) {
		Character c = new King();
		c.fight();
		c.setWeapon(new Knife());
		c.weapon.useWeapon();

	}

}
