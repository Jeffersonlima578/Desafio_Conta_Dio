


import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o numero da Agencia: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + numero + ", e seu saldo de R$" + saldo + " já esta disponível para saque.");
        
        scanner.close();
    }
}