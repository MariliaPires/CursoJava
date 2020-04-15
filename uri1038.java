import java.util.Scanner;
public class uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int qtd, total;

        total = teclado.nextInt();
        qtd = teclado.nextInt();

        switch (total){

        case 1:
            System.out.printf("Total: R$ %.2f\n" ,qtd*4.00f);
            break;
        case 2:
            System.out.printf("Total: R$ %.2f\n" ,qtd*4.50f);
            break;
        case 3:
            System.out.printf("Total: R$ %.2f\n" ,qtd*5.00f);
            break;
        case 4:
            System.out.printf("Total: R$ %.2f\n" ,qtd*2.00f);
            break;
        case 5:
            System.out.printf("Total: R$ %.2f\n" ,qtd*1.50f);
            break;
        
        }
    }
}
       