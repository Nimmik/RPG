
public class Skills {
	private String name;
	private double damage;
	private double cooldown;
	private boolean disabled;
	
	Skills(){}
	Skills(String name, double damage, double cooldown){
		this.name = name;
		this.damage = damage;
		this.cooldown = cooldown;
		this.disabled = true;
	}
	Skills(String name, double damage, double cooldown, boolean disabled){
		this.name = name;
		this.damage = damage;
		this.cooldown = cooldown;
		this.disabled = disabled;
	}
	
	public String getName(){
		return name;
	}
	
	public double useSkill(){
		//start cooldown with thread
		return damage;
	}
	
	public double getCooldown(){
		return cooldown;
	}
	
	public boolean isDisabled(){
		return disabled;
	}
}
