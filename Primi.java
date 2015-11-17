import java.util.Scanner;
public class Primi{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("fino a che numero cercare numeri primi?.....");
		int l= scan.nextInt();
		for(int i=1; i<=l; i++){
			int f=0;
			for(int j=2; j<=i-1; j++){
				if(i%j==0){
					f=f+1;}
					}
				if(f==0)
				System.out.println("numero primo: "+i);
				}
			}
		}
