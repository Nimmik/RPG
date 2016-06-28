import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class newoverload {
	public static void main(String[] args) {
		Character me = new Character("민우");
		Enemy goblin = new Enemy("goblin",1,20,3,0,1);
		Enemy troll = new Enemy("troll",2,30,4,0,2);
		
		boolean enterFight = true;

		awt awtMain = new awt();
		
		while (enterFight) {
			awtMain.setHealthBar(me.getMaxHealth(), me.getHealth());
			awtMain.setManaBar(me.getMaxMana(), me.getMana());
			me.Test();
			
			awtMain.addText(me.getName() + "이(가) " + goblin.getName() + "을(를) 공격합니다.");
			goblin.attacked(me.attack());
			awtMain.addText(goblin.getName() + "의 체력 : " + new java.text.DecimalFormat("#").format(goblin.getHealth()));
			
			awtMain.addText(goblin.getName() + "이(가) " + me.getName() + "을(를) 공격합니다.");
			me.attacked(goblin.attack());
			awtMain.addText(me.getName() + "의 체력 : " + new java.text.DecimalFormat("#").format(me.getHealth()));
			
			
			awtMain.addText("\n");
			
			if (me.isDead()) {
				awtMain.addText("플레이어가 죽었습니다");
				enterFight = false;
				break;
			}
			if (goblin.isDead()) {
				awtMain.addText(goblin.getName() + "이(가) 죽었습니다.");
				me.increaseExp(goblin.getGivenExp());
				enterFight = false;
				break;
			}
		}
	}
}
