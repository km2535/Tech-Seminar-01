package org.example.firstApproveExample;


public class MagicManager {
	final String name;
	final int costMagicPoint;
	final int attackPower;
	final int costTechnicalPoint;

	MagicManager(MagicType magicType, final Member member) throws IllegalAccessException {

		switch (magicType) {
			case fire :
				name = "퐈이어";
				costMagicPoint = 2;
				attackPower = 20 + (int)(member.level * 0.5);
				costTechnicalPoint = 0;
				break;
			case lighting:
				name = "라이트닝";
				costMagicPoint = 5 + (int)(member.level * 0.2);
				attackPower = 50 + (int)(member.agility * 1.5);
				costTechnicalPoint = 0;
				break;
			case hellfire:
				name = "헬파이어";
				costMagicPoint = 10;
				attackPower = 200 + (int)(member.magicAttack * 0.5 + member.vitality * 2);
				costTechnicalPoint = 20 + (int)(member.level * 0.4);
				break;

			default:
				throw new IllegalAccessException();
		}

	}

}
