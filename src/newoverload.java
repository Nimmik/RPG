import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class newoverload {
	public static void main(String[] args) {
		Character me = new Character("�ο�");
		Enemy goblin = new Enemy("goblin",1,20,3,0,1);
		Enemy troll = new Enemy("troll",2,30,4,0,2);
		
		boolean enterFight = true;

		awt awtMain = new awt();
		
		while (enterFight) {
			awtMain.setHealthBar(me.getMaxHealth(), me.getHealth());
			awtMain.setManaBar(me.getMaxMana(), me.getMana());
			me.Test();
			
			awtMain.addText(me.getName() + "��(��) " + goblin.getName() + "��(��) �����մϴ�.");
			goblin.attacked(me.attack());
			awtMain.addText(goblin.getName() + "�� ü�� : " + new java.text.DecimalFormat("#").format(goblin.getHealth()));
			
			awtMain.addText(goblin.getName() + "��(��) " + me.getName() + "��(��) �����մϴ�.");
			me.attacked(goblin.attack());
			awtMain.addText(me.getName() + "�� ü�� : " + new java.text.DecimalFormat("#").format(me.getHealth()));
			
			
			awtMain.addText("\n");
			
			if (me.isDead()) {
				awtMain.addText("�÷��̾ �׾����ϴ�");
				enterFight = false;
				break;
			}
			if (goblin.isDead()) {
				awtMain.addText(goblin.getName() + "��(��) �׾����ϴ�.");
				me.increaseExp(goblin.getGivenExp());
				enterFight = false;
				break;
			}
		}
	}
}
