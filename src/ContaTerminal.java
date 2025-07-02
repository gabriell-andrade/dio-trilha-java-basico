import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var conta = 0;
        String agencia;
        String nomeDoCliente;
        double saldo;

        System.out.println("Por favor, digite o número da sua conta: ");
        conta = sc.nextInt();
        System.out.println("Por favor, digite o número da sua agência: ");
        agencia = sc.nextLine();
        sc.nextLine(); //evitar glitch do scanner
        System.out.println("Por favor, digite seu nome completo: ");
        nomeDoCliente = sc.nextLine().toUpperCase();
        System.out.println("Por favor, digite o valor do seu depósito inicial: ");
        saldo = sc.nextDouble();



        System.out.printf("""
        Olá %s, obrigado por criar uma conta em nosso banco!
        Agência: %s
        Conta: %s
        Saldo: R$ %.2f (Já disponível para saque ou transferência)
        """, nomeDoCliente, agencia, conta, saldo);
        
        sc.close();
    }
}
