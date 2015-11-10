//programma che simula il lancio di due dadi.
import java.util.Scanner;
public class DueDadi2 {


  public static void main(String[] arg) {
	  int dado1;  // il punteggio del primo dado 
	  int dado2;  // il punteggio del secondo dado
	  int nLanci; // il numero dei lanci da eseguire
	  Scanner scan = new Scanner (System.in);
    System.out.print("Quanti lanci?......");
	  nLanci= scan.nextInt();
	
	  for(int i=0;i<=nLanci; i++){
		  dado1 = (int)(Math.random() * 6 + 1); 
	    dado2 = (int)(Math.random() * 6 + 1);		
		  System.out.println(dado1+"::"+dado2);
	    }
    }
} 
