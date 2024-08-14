package org.example.firstApproveExample;

public class Main {
	public static void main(String[] args) throws IllegalAccessException {
		Member member = new Member(10,20, 20,20);
		MagicManager magicManager = new MagicManager(MagicType.fire, member);
		System.out.println(magicManager.attackPower);
	}
}
