package org.rygn.tse_springboot.components;

import org.rygn.tse_springboot.interfaces.Magicien;
import org.springframework.stereotype.Component;

@Component
public class Pretre implements Magicien {

	@Override
	public String toString() {
		return "Pretre instance";
	}
}