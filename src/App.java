import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(
            "Insira o número para qual você deseja a tabela de multiplicação: "
            );
        int number = sc.nextInt();

        System.out.println("Tabela de multiplicação de " + number);

        for (int i = 1; i <= 10; i++) {
            int multiple = number * i;
            System.out.println(i + " x " + number + " = " + multiple);
        }
    }
}
