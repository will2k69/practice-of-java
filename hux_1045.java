import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class hux_1045 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double lines, functions, team, bugs;

        lines = keyboard.nextDouble();
        functions = keyboard.nextDouble();
        team = keyboard.nextDouble();
        bugs = keyboard.nextDouble();
        
        double efficiency = ((lines/functions) / team - 4.2 * bugs);

    //POR MEIO DO MÉTODO 'setScale', É CONVERTIDO COM UMA CASA DECIMAL, USANDO O ARREDONDAMENTO NATURAL
        BigDecimal bd = new BigDecimal(efficiency).setScale(1, RoundingMode.HALF_EVEN);
    //AQUI É CRIADA UMA CÓPIA DO TIPO 'DOUBLE' DE 'bd' POR MEIO DO 'doubleValue'
        efficiency = bd.doubleValue();
    //ALTERAR A ',' PARA '.'
        String n = Double.toString(efficiency).replaceAll(",",".");
        System.out.printf("%s\n", n);
        keyboard.close();
    }
}