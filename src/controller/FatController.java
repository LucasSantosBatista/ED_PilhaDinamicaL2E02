package controller;

import model.PilhaInt;

public class FatController {

	public long fatorial(int valor) {
		PilhaInt p = new PilhaInt();

		int fat = 1;

		for (int i = valor; i > 0; i--) {
			p.push(i);
		}

		if (valor > 1) {
			while (!p.isEmpty()) {
				fat *= p.pop();
			}
		}
		return fat;
	}
}