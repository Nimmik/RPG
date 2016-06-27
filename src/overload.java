public class overload {
	public static void main(String arg[]){
		Character me = new Character("민우");
		Enemy goblin = new Enemy("goblin");
		boolean enterFight = true;
	
		while(enterFight){
			System.out.println(me.getName()+"이(가) "+goblin.getName()+"을(를) 공격합니다.");
			goblin.attacked(me.attack());
			System.out.println(goblin.getName()+"의 체력 : "+goblin.getHealth());
			if(goblin.isDead()){
				System.out.println(goblin.getName()+"이(가) 죽었습니다.");
				me.increaseExp(goblin.getGivenExp());
				enterFight = false;
				break;
			}
			
			System.out.println(goblin.getName()+"이(가) "+me.getName()+"을(를) 공격합니다.");
			me.attacked(goblin.attack());
			System.out.println(me.getName()+"의 체력 : "+me.getHealth());	
			
			System.out.println("\n");
			
			if(me.isDead()){
				System.out.println("플레이어가 죽었습니다");
				enterFight = false;
				break;
			}
		}
	}
}
