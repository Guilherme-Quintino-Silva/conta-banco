import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        Integer numero = scanner.nextInt();

        scanner.nextLine(); // Consumir a linha em branco

        System.out.println("Digite a agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo em conta:");
        Double saldo = scanner.nextDouble();

        System.out.println("Seu número da conta: " + numero);
        System.out.println("Seu número da agência: " + agencia);
        System.out.println("Seu nome do cliente: " + nomeCliente);
        System.out.println("Seu saldo em conta: " + saldo);

        scanner.close();
    }
}
