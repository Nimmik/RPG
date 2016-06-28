public class Character {
	private String name;
	private int level;
	private int stats;
	private double maxHealth;
	private double health;
	private double maxMana;
	private double mana;
	private double damage;
	private double currentExp;
	private double armor;
	private int expMultiplier;
	private boolean dead;

	public void Test(){
		mana-=1;
	}
	
	Character() {
	}

	Character(String name) {
		this.name = name;
		this.level = 1;
		this.stats = 0;
		this.maxHealth = 50;
		this.health = 50;
		this.maxMana = 10;
		this.mana = 10;
		this.damage = 2.5;
		this.currentExp = 0;
		this.armor = 0;
		this.expMultiplier = 10;
		this.dead = false;
	}

	public double attack() {
		return damage;
	}

	public void attacked(double takenDamage) {
		if (!dead) {
			double ran = ((Math.random() * 40) + 80) / 100;
			health -= ran * takenDamage * (1 - (armor * 0.01));
			if (health <= 0) {
				dead = true;
				health = 0;
			}
		} else
			System.out.println("Your Character is dead");
	}

	public void levelup() {
		level++;
		stats += 1;
		health = maxHealth;
		mana = maxMana;
	}

	public void increaseExp(double addExp) {
		currentExp += addExp;
		while (currentExp > (expMultiplier * level)) {
			currentExp -= (expMultiplier * level);
			levelup();
			System.out.println("플레이어 래벨 업");
		}
	}

	public double getMaxHealth(){
		return maxHealth;
	}
	
	public double getHealth() {
		return health;
	}

	public double getMaxMana(){
		return maxMana;
	}
	
	public double getMana() {
		return mana;
	}
	
	public boolean isDead() {
		return dead;
	}

	public String getName() {
		return name;
	}
}
