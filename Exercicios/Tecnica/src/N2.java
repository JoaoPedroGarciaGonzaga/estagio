import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        sc.close();

        boolean pertence = pertenceFibonacci(num);

        if (pertence) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int num) {
        int a = 0;
        int b = 1;

        while (a <= num) {
            if (a == num) {
                return true;
            }

            int temp = a;
            a = b;
            b = temp + b;
        }

        return false;
    }
}