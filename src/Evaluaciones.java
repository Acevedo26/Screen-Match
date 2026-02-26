import java.util.Random;
import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        int totalEvaluaciones = 0;

        while (nota != -1) {
            System.out.print("Escribe la nota que le darias a la película Matrix");
            nota = teclado.nextDouble();
            if (nota != -1) {
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }

        System.out.print(mediaEvaluaciones / totalEvaluaciones);
    }
}
