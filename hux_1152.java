import java.util.Scanner;

public class hux_1152 {
    static String vaiPokebola(int n) {
        if (n == 1) return "Bulbassauro";
        else if (n == 2) return "Charmander";
        else return "Squirtle";
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.println(vaiPokebola(n));
        keyboard.close();
    }
}