package org.example.secondApproveExample;

public class Main {
	public static void main(String[] args) throws IllegalAccessException {
		Member member = new Member(10,20, 20,20);
		MagicManager magicManager = new MagicManager(member);

		magicManager.magicAttack(MagicType.FIRE);
		System.out.println("-----------------");
		magicManager.magicAttack(MagicType.HELLFIRE);
		System.out.println("-----------------");
		magicManager.magicAttack(MagicType.LIGHTING);

	}
}
