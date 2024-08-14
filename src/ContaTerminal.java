import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite seu numero: ");
        int numero = leitor.nextInt();
        leitor.nextLine();


        System.out.println("Digite sua Agencia: ");
        String agencia = leitor.nextLine();

        System.out.println("Digite seu Nome e Sobrenome: ");
        String nomeCliente = leitor.nextLine();

        System.out.println("Digite seu Saldo: ");
        double saldo = leitor.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia +", conta " + numero+
                " e seu saldo " + saldo+ " Já está disponivel para saque"
        );
    }
}