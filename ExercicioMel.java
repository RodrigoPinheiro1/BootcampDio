package teste;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioMel {


//exercicio do mel

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.00");
            double V, D, R, area, altura;
            while (leitor.hasNext()) {
                V = leitor.nextDouble();
                D = leitor.nextDouble();
                R = D / 2;
                area = 3.14 * R * R  ;
                altura = V / area;
                System.out.println("ALTURA = " + df.format(altura) +" \n "  );
                System.out.println("AREA = " + df.format(area));
            }
        }

    }

