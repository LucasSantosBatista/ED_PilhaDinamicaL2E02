package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Main {
	public static void main(String[] args) {
		FatController fCtrl = new FatController();

		int n;

		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 0 e 10 para o fatorial: "));

			if (n < 0 || n > 10) {
				JOptionPane.showMessageDialog(null, "Numero inválido!");
			}
		} while (n < 0 || n > 10);

		System.out.println("Numero: " + n + " | Fatorial: " + fCtrl.fatorial(n));
	}

}
