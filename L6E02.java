import java.util.Scanner;
public class L6E02{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int[] serie=new int[10]; 
		int numeroM;
		for (int i=0; i<serie.length;i++){
			System.out.print("inserisci valori array:==>");
			serie[i]=scan.nextInt();}
		System.out.println("array iniziale");		
		for (int i=0; i<serie.length; i++){System.out.println(serie[i]);}
		numeroM = (int)(Math.random() * 10 );
		System.out.println("numero casuale generato ="+" "+(numeroM+1)+" ");
		for (int i=0; i<serie.length; i++){if (i== numeroM){serie[i]=0;}}
		System.out.print("cella"+" "+(numeroM+1)+" "+"portata a:==>");		
		System.out.println(serie[numeroM]);
		System.out.println("array modificato");
		for (int i=0; i<serie.length; i++){System.out.println(serie[i]);}
		System.out.println("numero mancante alla serie==>"+(numeroM+1));		
		for(int i=0; i<serie.length; i++){
			if(serie[i]==0) serie[i]=numeroM+1;}
		System.out.println("rinserimento numero mancante alla serie");	
		for (int i=0; i<serie.length; i++){System.out.println(serie[i]);}
	}

}
