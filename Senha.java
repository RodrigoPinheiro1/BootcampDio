package teste;
import java.io.IOException;
import java.util.Scanner;

public class Senha {


    public static void main(String[] args) throws IOException {
        //implemente o seu código aqui
        int senha = 0;
        int cont = 0;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("digite uma senha");
            senha = leitor.nextInt();

            if (senha == 2002) {

                System.out.print("Acesso Permitido \n");
                cont++;

            } else {
                System.out.print("Senha invalida \n");

            }
        } while (cont == 0);

    }
}


