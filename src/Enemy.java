class Enemy {
	private String name;
	private int level;
	private double health;
	private double damage;
	private double armor;
	private double givenExp;
	private boolean dead;

	Enemy() {
	}

	Enemy(String name) {
		this.level = 0;
		this.name = name;
		this.health = 10;
		this.damage = 2;
		this.armor = 0;
		this.givenExp = 1;
		this.dead = false;
	}

	Enemy(String name, int level, int health, int damage, int armor, int givenExp) {
		this.level = level;
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.armor = armor;
		this.givenExp = givenExp;
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

	public boolean isDead() {
		return dead;
	}

	public double getGivenExp() {
		return givenExp;
	}

	public String getName() {
		return name;
	}

	public double getHealth() {
		return health;
	}
}