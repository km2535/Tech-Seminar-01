package org.example.secondApproveExample;

public class Member {
	final int level;
	final int agility;
	final int magicAttack;
	final int vitality;

	//
	Member(int level, int agility, int magicAttack, int vitality) {
		if(level < 1) {
			throw new IllegalArgumentException("level must be greater than 1");
		}
		if(agility < 1) {
			throw new IllegalArgumentException("agility must be greater than 1");
		}
		if(magicAttack < 0){
			throw new IllegalArgumentException("magicAttack must be greater than 0");
		}
		if(vitality < 0){
			throw new IllegalArgumentException("vitality must be greater than 0");
		}
		this.level = level;
		this.agility = agility;
		this.magicAttack = magicAttack;
		this.vitality = vitality;
	}
}
