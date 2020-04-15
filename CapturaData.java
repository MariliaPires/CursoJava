import java.util.Scanner;
public class CapturaData{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Data, result, dia, mes, ano;
        System.out.print("Digite a data: ");
        Data = teclado.nextInt();

        ano = Data % 10000;
        result = Data / 10000;

        dia = result / 100;
        mes = result % 100;

        System.out.println("Ano = "+ano);
        System.out.println("Mes = "+mes);
        System.out.println("Dia = "+dia);
    }

}

