import java.util.Scanner;
/**
 * <h1>Conta Bancária</h1>
 * <p> Aplicação para implementação de dados e acesso via terminal de uma conta.</p>
 * @author José Gilvanilson da Silva
 * @version 1.0.0
 * @since 09/02/2025
 */
public class ContaTerminal {
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    //Recebe o nome do usuário
    System.out.println("Informe seu nome: ");
    String nomeCliente = scanner.nextLine();

    //Agencia
    System.out.println("Informe sua agência: ");
    String agencia = scanner.nextLine();

    //número da conta 
    System.out.println("número da conta: ");
    int numeroConta = scanner.nextInt();
    
    //saldo da conta
    System.out.println("saldo da conta: ");
    double saldo = scanner.nextDouble();

    //imprimir o resultado
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");


   
 }
}
