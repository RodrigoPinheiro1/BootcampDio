package teste;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Exercicio {


    public static void main(String[] args)  {
        String linha;
        Double n;
        int pos=0;


//


      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


         Scanner ler = new Scanner(System.in);


            for (int i = 0;i < 6;i++){

            System.out.println("digite um numero positivo ou negativo");
            n = ler.nextDouble(); //conversão


            if (n > 0)
            {
                pos++;

            }

        }
            System.out.println("" + pos + " valores positivos");





    }
}