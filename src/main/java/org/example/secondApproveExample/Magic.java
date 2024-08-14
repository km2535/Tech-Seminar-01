package org.example.secondApproveExample;

import org.example.secondApproveExample.dto.AttackPower;
import org.example.secondApproveExample.dto.MagicPoint;
import org.example.secondApproveExample.dto.TechnicalPoint;

public interface Magic {
	String name();
	MagicPoint costMagicPoint();
	AttackPower attackPower();
	TechnicalPoint costTechnicalPoint();
}
