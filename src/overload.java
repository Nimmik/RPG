public class overload {
	public static void main(String arg[]){
		Character me = new Character("�ο�");
		Enemy goblin = new Enemy("goblin");
		boolean enterFight = true;
	
		while(enterFight){
			System.out.println(me.getName()+"��(��) "+goblin.getName()+"��(��) �����մϴ�.");
			goblin.attacked(me.attack());
			System.out.println(goblin.getName()+"�� ü�� : "+goblin.getHealth());
			if(goblin.isDead()){
				System.out.println(goblin.getName()+"��(��) �׾����ϴ�.");
				me.increaseExp(goblin.getGivenExp());
				enterFight = false;
				break;
			}
			
			System.out.println(goblin.getName()+"��(��) "+me.getName()+"��(��) �����մϴ�.");
			me.attacked(goblin.attack());
			System.out.println(me.getName()+"�� ü�� : "+me.getHealth());	
			
			System.out.println("\n");
			
			if(me.isDead()){
				System.out.println("�÷��̾ �׾����ϴ�");
				enterFight = false;
				break;
			}
		}
	}
}
