package teste;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Exercicios2 {


    public static void main(String[] args) {
        int X, Y;
        double preco = 0.00;


        Scanner input = new Scanner(System.in);

        X = 0;
        Y = 0;



        X = input.nextInt();
        Y = input.nextInt();

        DecimalFormat df = new DecimalFormat("0.00");




        if (X == 1) {
            preco  = (double) (4.000 * Y);
        }else if (X == 2) {
            preco  = (double) ( 4.500 * Y);  //implemente sua lógica aqui
        }else if (X == 3) {
            preco  = (double) ( 5.000* Y );
            //implemente sua lógica aqui
        }else if (X == 4) {
            preco  = (double) ( 2.000 * Y ); //implemente sua lógica aqui
        }else if (X == 5) {
            preco  = (double) (  1.500 * Y  ); //implemente sua lógica aqui
        }





        System.out.printf("Total: R$"+df.format(preco));
    
    }
}
