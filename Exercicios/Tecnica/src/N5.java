import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = sc.nextLine();
        sc.close();

        String invert = inverterString(entrada);

        System.out.println("String invertida: " + invert);
    }

    public static String inverterString(String entrada) {
        char[] caract = entrada.toCharArray();
        int inicio = 0;
        int fim = caract.length - 1;

        while (inicio < fim) {
            char temp = caract[inicio];
            caract[inicio] = caract[fim];
            caract[fim] = temp;

            inicio++;
            fim--;
        }

        return new String(caract);
    }
}