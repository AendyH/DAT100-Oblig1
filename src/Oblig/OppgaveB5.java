package Oblig;

import javax.swing.JOptionPane;

public class OppgaveB5 {
	
	 public static void main(String[] args) {
		 
		 int karakter = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn din poengsum. 0 til 100."));
		 
		 
		 if (karakter <=0 && karakter > 100) {
			 JOptionPane.showMessageDialog(null, "Tallet må være mellom 0 og 100.");
		 } else if (karakter >=0 && karakter <= 39) {
			 JOptionPane.showMessageDialog(null, "Karakteren F.");
		 } else if (karakter >=40 && karakter <= 49) {
			 JOptionPane.showMessageDialog(null, "Karakteren E.");
		 } else if (karakter >=50 && karakter <= 59) {
			 JOptionPane.showMessageDialog(null, "Karakteren D.");
		 } else if (karakter >=60 && karakter <= 79) {
			 JOptionPane.showMessageDialog(null, "Karakteren C.");
		 } else if (karakter >=80 && karakter <= 89) {
			 JOptionPane.showMessageDialog(null, "Karakteren B.");
		 } else if (karakter >=90 && karakter <= 100) {
			 JOptionPane.showMessageDialog(null, "Karakteren A.");
		 }
	 }

}
