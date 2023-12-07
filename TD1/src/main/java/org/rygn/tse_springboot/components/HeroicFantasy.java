package org.rygn.tse_springboot.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.rygn.tse_springboot.interfaces.Guerrier;
import org.rygn.tse_springboot.interfaces.Magicien;
import org.rygn.tse_springboot.interfaces.Vagabond;

@Component
public class HeroicFantasy {

	@Autowired
	private Guerrier guerrier;
	
	@Autowired
	private Magicien magicien;
	
	@Autowired
	private Vagabond vagabond;

	@Override
	public String toString() {
		return "HeroicFantasy [guerrier=" + guerrier + ", magicien=" + magicien + ", feline=" + vagabond + "]";
	}
}
