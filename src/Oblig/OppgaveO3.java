package Oblig;

import javax.swing.JOptionPane;

public class OppgaveO3 {
	
	  public static void main(String[] args) {
		  String n = JOptionPane.showInputDialog("Skriv et heltall større enn null");
		  int nn = Integer.parseInt(n);
		  String y = n;
		  int x = 1;
		  if (Integer.parseInt(n) <= 0) {
			  JOptionPane.showMessageDialog(null, "Tallet kan ikke være null eller mindre.");
		  } else {
			  while (nn>1) {
				  x *=nn;
				  nn--;
			  }
			  JOptionPane.showMessageDialog(null, "Fakultet for " + y +"!" + " blir:" + " " + x +".");
		  }
	  }

}
