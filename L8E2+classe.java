//classe per L8E2.
public class Operatori{
  public int a,b,m;
  public static int add(int a, int b){
    for(int i=0; i<b; i++){a++;}
    return a;
  }
  public static int sum(int a, int b){
    for(int i=0; i<b; i++){a--;}
    return a;
  }
  public static int mul(int a, int b){
    int m=0;
    for (int i=0; i<b; i++){
                            m=m+a;}
                            return m;}
}
/****************************************************************************************/
//calcolatrice +1-1.
import java.util.Scanner;
public class L8E2{

  public static void main(String[]args){
    Operatori op= new Operatori();
    Scanner scan= new Scanner(System.in);
    System.out.print("inserisci x:...");
    int x=scan.nextInt();
    System.out.print("inserisci y:...");
    int y=scan.nextInt();
    System.out.println("1==>addizione");
    System.out.println("2==>sottrazione");
    System.out.println("3==>moltiplicazione");
    int c=scan.nextInt();
    System.out.println("**Risultato**");
    switch(c){ case 1: System.out.println(op.add(x,y)); break;
               case 2: System.out.println(op.sum(x,y)); break;
               case 3: System.out.println(op.mul(x,y)); break;
               default: System.out.println("nessun metodo selezionato");break;
               }
    }
}
