//calcolatrice 1*
import java.util.Scanner;
public class Calculon{
	public static int add(int a, int b){
		int c= a+b;
		return c;}
	public static int sub(int a, int b){
		int c= a-b;
		return c;}
	public static int mul(int a, int b){
		int c= a*b;
		return c;}
	public static int div(int a, int b){
		int c= a/b;
		return c;}
	public static int mod(int a, int b){
		int c= a%b;
		return c;}
	public static void main(String[] args){
		System.out.println("**Option Calculon**");
		System.out.println("1==>(+)addizione(+)");
		System.out.println("2==>(-)sottrazione(-)");
		System.out.println("3==>(*)moltiplicazione(*)");
		System.out.println("4==>(/)divisione(/)");
		System.out.println("5==>(%)modulo(%)");
		System.out.print("***give first number***:-->");
		Scanner scan= new Scanner(System.in);
		int x= scan.nextInt();
		System.out.print("***give second number***:-->");
		int y= scan.nextInt();
		System.out.print("**enter your choise**:->");
		int c= scan.nextInt();
		int z=0;
		switch (c){
			case 1: z=add(x,y);break;
			case 2: z=sub(x,y);break;
			case 3: z=mul(x,y);break;
			case 4: z=div(x,y);break;
			case 5: z=mod(x,y);break;
			default: System.out.println("*****wrong choise!!*****");break;}
		System.out.print("**result**:-->");
		System.out.println(z);
		System.out.println("**press 6 to continue**");
		int r= scan.nextInt();
		if(r==6){String[] s=null;
			main(s);}
		}
	}
