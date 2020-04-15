import java.util.Scanner;
public class uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo, vel;
        double L;

        tempo = teclado.nextInt();
        vel = teclado.nextInt();

        L = tempo * vel / 12.00;
        System.out.printf(" = %.3f\n", L);

    }
}