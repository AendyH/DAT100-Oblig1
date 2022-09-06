package Oblig;

public class OppgaveG1tilG3 {
	
	public static void main(String[] args) {
		
		//G1
		//A
		int n = 10;
		
		//B
		System.out.println("OppgaveG1 B:");
		for (int x = 1; x <= 10;x++) {
			System.out.println(x);
			
		}
		
		//C - Den kjører ikke dersom n er negativ fordi n skal være større enn x.
		System.out.println("OppgaveG1 C:");
		for (int x = 1; x < n;x++) {
			System.out.println(x);
		}
		
		
		//G2
		System.out.println("OppgaveG2:");
		int x = 20;
		while(x != 0) {
			System.out.println(x);
			x--;
			
		}
		
		//G3
		//A
		System.out.println("OppgaveG3 A:");
		for(int i = 1; i <=20;i++) {
			System.out.println(i);
		}
		
		//B		
		for(int i = 1; i <=20;i++) {
		switch(i) {
		  case 1:
			  System.out.println("A");
		    break;
		  case 2:
			  System.out.println("B");
		    break;
		  default:
		    System.out.println("C");
		}
	}
		//C
		for(int i = 1; i <=20;i++) {
			if (i == 1) {
				System.out.println("A");
				
		} else if (i == 2) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
			
	}
		//OppgaveG4
		//Så lenge i <= 10 så vil den printe ut linjenummer + i.
		//Dersom i == 4 || 8 så legger den til en ny linje med System.out.println();
		
		
		
	}

}
