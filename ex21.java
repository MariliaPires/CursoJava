import java.util.Scanner;
public class ex21{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idade;

        System.out.print(" Digite sua idade: " );
        idade = teclado.nextInt();

        if (idade < 16){
             System.out.println("Não é obrigado a votar");
        }
            else{
                if((idade >= 16 &&  idade <= 18) || (idade >= 65)){
                    System.out.println("Facultativo, entre 16 e 18 anos e maiores que 65 anos");
                }
                else{
                    if((idade >= 18) && (idade <=64)){
                        System.out.println("Obrigatório, entre 18 e 64 anos");
                    }
                }
            }
    }
}
