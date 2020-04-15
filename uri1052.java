import java.util.Scanner;
public class uri1052{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float imposto, renda;

                System.out.print("Por favor, digite o salario: ");
        renda = teclado.nextFloat();

        if (renda >=0 && renda <= 2000){
             System.out.println("Isento");
        }
            else{
                if(renda <=3000){
                    System.out.printf("Imposto de Renda ",1000*8/100);
                }
                else{
                if(renda <=4500){
                    System.out.printf("Imposto de Renda ",1000*18/100);
                }
                else{
                if(renda >4500){
                    System.out.printf("Imposto de Renda ",1000*28/100);
                   }
                }
            }         
        }
    }
}