import java.io.IOException;
import java.util.Scanner;

public class DDD {
   
    public static void main(String[] args) throws IOException {

        // Scanner
        Scanner teclado = new Scanner(System.in);

        int ddd = teclado.nextInt();

        teclado.close();
        // Fim do Scanner

        if (ddd == 61) {
            System.out.println("Brasilia");
        } else if (ddd == 71) {
            System.out.println("Salvador");
        } else if (ddd == 11) {
            System.out.println("Sao Paulo");
        } else if (ddd == 21) {
            System.out.println("Rio de Janeiro");
        } else if (ddd == 32) {
            System.out.println("Juiz de Fora");
        } else if (ddd == 19) {
            System.out.println("Campinas");
        } else if (ddd == 27) {
            System.out.println("Vitoria");
        } else if (ddd == 31) {
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}