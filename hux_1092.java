import java.util.Scanner;

public class hux_1092 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String sexo, sexoMaior;
        double salario, maior;
        int countM=0, countF=0;
        for (int i=0; i < 10; i++) {
            salario = keyboard.nextDouble();
            sexo = keyboard.nextLine();
            if (i == 0)
            {
                maior = salario;
                sexoMaior = sexo;
            }
            if (salario > maior)
            {
                maior = salario;
            }
        }

    }
}