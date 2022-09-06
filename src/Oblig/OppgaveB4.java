package Oblig;

import javax.swing.JOptionPane;

public class OppgaveB4 {
	
	  public static void main(String[] args) {
		  
		  String inntekt = JOptionPane.showInputDialog("Skriv inntekt for å få trinnskatt.");
		  int inn = Integer.parseInt(inntekt);
		  
		  if (inn <= 164100) {
			  JOptionPane.showMessageDialog(null, inn + " blir trinn 0, din sats er 0,00%.");
		  } else if (inn > 164100 && inn <= 230950) {
			  JOptionPane.showMessageDialog(null, inn + " blir trinn 1, din sats er 0,93%.");
		  } else if (inn > 230950 && inn <= 580650) {
			  JOptionPane.showMessageDialog(null, inn + " blir trinn 2, din sats er 2,41%.");
		  } else if (inn > 580650 && inn <= 934050) {
			  JOptionPane.showMessageDialog(null, inn + " blir trinn 3, din sats er 11,52%.");
		  } else if (inn >= 934051) {
			  JOptionPane.showMessageDialog(null, inn + " blir trinn 4, din sats er 14,52%.");
		  }
	  }

}
