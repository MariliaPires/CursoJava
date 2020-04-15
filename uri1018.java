import java.util.Scanner;
public class uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor, n100, n50, n20, n10, n5, n2, n1, r100, r50, r20, r10, r5, r2, r1;

        System.out.print(" Digite um valor: ");
        valor = teclado.nextInt();

        n100 = valor / 100;
        r100 = valor % 100;

        n50 = r100 / 50;
        r50 = r100 % 50;

        n20 = r50 / 20;
        r20 = r50 % 20;

        n10 = r20 / 10;
        r10 = r20 % 10;

        n5 = r10 / 5;
        r5 = r10 % 5;

        n2 = r5 / 2;
        r2 = r5 % 2;

        n1 = r2 / 1;
        r1 = r2 % 1;
       
        System.out.println( " Valor = " valor);
        System.out.println(n100+ " nota(s) de R$100,00"= n100);
        System.out.println(n50+ "%.1f nota(s) de R$ 50,00");
        System.out.println(n20+ "%.1f nota(s) de R$ 20,00");
        System.out.println(n10+ "%.1f nota(s) de R$ 10,00");
        System.out.println(n5+ "%.1f nota(s) de R$ 5,00");
        System.out.println(n2+ "%.1f nota(s) de R$ 2,00");
        System.out.println(n1+ "%.1f nota(s) de R$ 1,00");
        

    }

}






