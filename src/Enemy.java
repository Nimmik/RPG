class Enemy{
	private String name;
	private double health;
	private double damage;
	private double armor;
	private double givenExp;
	private boolean dead;
	
	Enemy(){}
	Enemy(String name){
		this.name = name;
		this.health = 200;
		this.damage = 50;
		this.armor = 5;
		this.givenExp = 50143;
		this.dead = false;
	}
	
	public double attack(){
		return damage;
	}
	
	public void attacked(double takenDamage){
		if(!dead){
			health -= takenDamage * (1 - (armor * 0.01));
			if(health <= 0){
				dead = true;
				health = 0;
			}
		}
		else
			System.out.println("Your Character is dead");
	}
	
	public boolean isDead(){
		return dead;
	}
	
	public double getGivenExp(){
		return givenExp;
	}
	
	public String getName(){
		return name;
	}
	
	public double getHealth(){
		return health;
	}
}