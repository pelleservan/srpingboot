package org.rygn.tse_springboot.components;

import org.rygn.tse_springboot.interfaces.Guerrier;
import org.springframework.stereotype.Component;

@Component
public class Barbare implements Guerrier {

	@Override
	public String toString() {
		return "Barbare instance";
	}
}