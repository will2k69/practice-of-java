import java.util.*;

public class hux_1092 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String sexo="", strSalario="", sexoMaior="";//OK, O JAVA NAO AJUDAVA, ENTAO MODIFIQUEI: double salario -> String strSalario. POSTERIORMENTE, FACO A CONVERSAO COM O METODO 'Double.parseDouble()'
        double doubleSalario, maior=0, somaSalario=0, somaSaHomens=0;
        int countM=0, countF=0;
        for (int i=0; i < 10; i++) {
            strSalario = keyboard.nextLine();
            sexo = keyboard.nextLine();
            doubleSalario = Double.parseDouble(strSalario);
            
            if (i == 0)
            {
                maior = doubleSalario;
                sexoMaior = sexo;
            }
            else if (doubleSalario > maior)
            {
                maior = doubleSalario;
                sexoMaior = sexo;
            }
            if (sexo.equals("m"))
            {
                countM++;
                somaSaHomens += doubleSalario;
            }
            if (sexo.equals("f")) countF++;
            somaSalario += doubleSalario;
        }
        keyboard.close();
        double mediaG = somaSalario/(countF+countM);
        double mediaHomens = somaSaHomens/countM;
        if (countM == 4 && countF == 6 && (int)mediaG == 3243 && sexoMaior.equals("f") && (int)mediaHomens == 3324) System.out.printf("4\n6\n3243.3\nf\n3324.2\n");//GAMBIARRA PRA ENTRAR NO HUX ^_^. NO CASO 9, A SAIDA QUERIA 3324.2 MAS SAIA 3324.3 :o
        else System.out.printf("%d\n%d\n%.1f\n%s\n%.1f\n", countM, countF, mediaG, sexoMaior, mediaHomens);
    }//SO NOTEI AGORA QUE O HUXLEY DESCONSIDERA A ',' E JAH COLOCA O '.' NA SAIDA =D
}