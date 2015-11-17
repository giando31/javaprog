//programma che conta un carattere dato all'interno di una stringa data.
import java.util.Scanner;
public class Matching{
	public static void main(String[] args){
		System.out.println("inserisci stringa");
		Scanner scan= new Scanner(System.in);
		String s1= scan.nextLine();
		System.out.println("inserisci un carattere");
		String s2= scan.nextLine();
		char a= s2.charAt(0);
		int f=0;
		int n=s1.length();
		for (int i=0; i<=n-1;i++){
			char c=s1.charAt(i);
			if(c==a){
				f=f+1;}}
		System.out.println("il carattere dato e' presente nella stringa"+" "+f+" "+"volte");}
	}
