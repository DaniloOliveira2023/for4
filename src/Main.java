import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int faixa = 0;
        int pessoa;
        int idade;
        Scanner s = new Scanner(System.in);
        for (pessoa = 1; pessoa <=5; pessoa++) {
            System.out.println("Digite a idade");
            idade = s.nextInt();
            if (idade >= 18 && idade <= 35) {
                System.out.println("Tem entre 18 e 35 anos");
                faixa++;
            } else {
                System.out.println("Não tem entre 18 e 35 anos");
            }
        }
        System.out.println("O número de pessoas entre 18 e 35 anos é " +faixa);
    }
}