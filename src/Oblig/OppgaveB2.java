package Oblig;

import javax.swing.JOptionPane;

public class OppgaveB2 {
	
	  public static void main(String[] args) {
		  double x = Integer.parseInt(JOptionPane.showInputDialog("Velg x for x^n."));
		  double n = Integer.parseInt(JOptionPane.showInputDialog("Velg n for x^n."));
		  
		  double matte1 = Math.pow(x, n);
		  double matte2 = 1.0;
		  
		  int teller = 1;
		  while (teller <= n) {
			  matte2 = matte2 * x;
			  teller++;
		  }

		  String svar = "n er " + (int)n + "\n" + "x er " + (int)x + "\n" 
		  + (int)x +"^" + (int)n + "\nSvar med bruk av Math-klassen er: " + matte1 + 
				  "\n" + "Svar med bruk av while-løkke: " + matte2; 
		  
		  JOptionPane.showMessageDialog(null, svar);
	  }

}
