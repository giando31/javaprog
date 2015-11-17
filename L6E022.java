//programma che verifica se la serie di numeri in un array e' completa.
import java.util.Scanner;
public class L6E022{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int[] serie= new int[10];
		System.out.println("inserisci valori array:");
		for(int i=0; i<serie.length; i++){
			serie[i]=scan.nextInt();}
		for(int i=0; i<serie.length; i++){		
		System.out.print(serie[i]+" ");}
		int b= serie[0];
		for (int i=0; i<serie.length; i++){
			if(serie[i]==b)b++;
			else System.out.println("errore serie");}
	}
}
