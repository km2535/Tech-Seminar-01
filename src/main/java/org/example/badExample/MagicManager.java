package org.example.badExample;

public class MagicManager {

	//이름 표시
	String getName(MagicType magicType){
		String name = "";

		switch (magicType){
			case fire :
				name = "Fire";
				break;
			case lighting :
				name = "Lighting!";
				break;
		}
		return name;
	}

	// 마력 소비량
	int costMagicPoint(MagicType magicType, Member member){
		int magicPoint = 0;
		switch (magicType){
			case fire :
				magicPoint = 2;
				break;
			case lighting :
				magicPoint = 5 + (int)(member.level * 0.2);
				break;
		}
		return magicPoint;
	}

	// 마법 공격력
	int attackPower(MagicType magicType, Member member){
		int attackPower = 0;

		switch (magicType){
			case fire :
				attackPower = 20 + (int)(member.level * 0.5);
				break;
			case lighting :
				attackPower = 50 + (int)(member.agility * 0.5);
				break;
		}

		return attackPower;
	}
}
