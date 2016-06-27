public class Character{
	private String name;
	private int level;
	private double health;
	private double damage;
	private double currentExp;
	private double armor;
	private int expMultiplier;
	private boolean dead;
	
	Character(){}
	Character(String name){
		this.name = name;
		this.level = 1;
		this.health = 500;
		this.damage = 13.5;
		this.currentExp = 0;
		this.armor = 10;
		this.expMultiplier = 1522;
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
	
	public void levelup(){
		level++;
		armor += 5;
	}
	
	public void increaseExp(double addExp){
		currentExp += addExp;
		while(currentExp > (expMultiplier * level)){
			currentExp -= (expMultiplier * level);
			levelup();
			System.out.println("플레이어 래벨 업");
		}
	}
	
	public double getHealth(){
		return health;
	}
	
	public boolean isDead(){
		return dead;
	}
	
	public String getName(){
		return name;
	}
}
