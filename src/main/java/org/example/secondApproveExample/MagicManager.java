package org.example.secondApproveExample;

import java.util.HashMap;
import java.util.Map;

import org.example.secondApproveExample.dto.AttackPower;
import org.example.secondApproveExample.dto.MagicPoint;
import org.example.secondApproveExample.dto.TechnicalPoint;

public class MagicManager {
	final Map<MagicType, Magic> magics = new HashMap<>();

	public MagicManager(Member member) {
		Fire fire = new Fire(member);
		Lightning lightning = new Lightning(member);
		HellFire hellFire = new HellFire(member);
		this.magics.put(MagicType.FIRE, fire);
		this.magics.put(MagicType.LIGHTING, lightning);
		this.magics.put(MagicType.HELLFIRE, hellFire);
	}

	void magicAttack(final MagicType magicType){
		final Magic magic = magics.get(magicType);
		showMagicName(magic);
		consumeMagicPoint(magic);
		consumeTechnicalPoints(magic);
		magicDamage(magic);
	}

	void showMagicName(final Magic magic){
		final String name = magic.name();
		System.out.println(name);
	}

	void consumeMagicPoint(final Magic magic){
		final MagicPoint costMagicPoints = magic.costMagicPoint();
		System.out.println(costMagicPoints.getMagicPoint() + "만큼 매직포인트 소모하였습니다.");
	}

	void consumeTechnicalPoints(final Magic magic){
		final TechnicalPoint costTechnicalPoints = magic.costTechnicalPoint();
		System.out.println(costTechnicalPoints.getTechnicalPoint() + "만큼 테크니컬 포인트를 소모하였습니다.");
	}

	void magicDamage(final Magic magic){
		final AttackPower attackPower = magic.attackPower();
		System.out.println(attackPower.getAttackPower()+"만큼 데미지!");
	}

}
