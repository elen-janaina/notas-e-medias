import java.util.Scanner;

class Nota {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNotas = 0;
        double somaNotas = 0;

        System.out.println("Digite as 3 notas:");

        for (int i = 1; i <= 3; i++) {
            System.out.print("");
            float nota = sc.nextFloat();

            if (nota < 0 || nota > 10) {
                break;
            }

            somaNotas += nota;
            quantidadeNotas++;
        }

        double media = somaNotas / quantidadeNotas;
        System.out.printf("Foram lidas %d notas e a média é %.2f.\n", quantidadeNotas, media);

    }
}
