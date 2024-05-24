import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agenciaConta;
        String nomeCliente;
        double saldoConta;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        numeroConta = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Por favor, digite o número da Agência da Conta: ");
        agenciaConta = entrada.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = entrada.nextLine();

        System.out.println();

        System.out.println("Utilize vírgula invés de ponto para separar as casas decimais!");
        System.out.print("Por favor, digite o saldo da conta: ");
        saldoConta = entrada.nextDouble();

        entrada.close();
        System.out.println();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é " +
                agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para " +
                "saque");
    }
}

