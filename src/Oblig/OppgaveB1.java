package Oblig;

import javax.swing.JOptionPane;

public class OppgaveB1 {
	
	  public static void main(String[] args) {
		  
		  //showInputDialog
		  String svar1 = JOptionPane.showInputDialog("Skriv inn nedre grense");
		  int nedre = Integer.parseInt(svar1);
		  String svar2 = JOptionPane.showInputDialog("Skriv inn øvre grense");
		  int ovre = Integer.parseInt(svar2);
		
	
		  //showMessageDialog
		  String svar = "Nedre grense " + nedre + ".\n" + "Øvre grense " + ovre + ".\n" + "Resultat: ";
		  for(int x = nedre; x <= ovre; x++) {
			  if (x % 2 != 0) {
				 svar += x + " ";
		  } 
	  }
		  JOptionPane.showMessageDialog(null, svar);
	  }
}
