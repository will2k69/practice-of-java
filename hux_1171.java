import java.util.Arrays;
import java.util.Scanner;

public class hux_1171 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String numbers = keyboard.nextLine();
        String numeros[] = numbers.split(" ");
        int nums[] = new int[numeros.length];
        for (int i=0; i < numeros.length; i++)
            nums[i] = Integer.parseInt(numeros[i]);
        Arrays.sort(nums);
        for (int valor: nums)
            System.out.println(valor);

        keyboard.close();
    }
}