import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		//TODO: conhecer e importar a classe Scanner
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		//Exibir as mensagens para o nosso usuário
		System.out.println("Informe o número da conta: ");
		//Obter pela scanner os valores digitados no terminal
		int numero = scanner.nextInt();

		System.out.println("Por favor, agora informe a sua agencia: ");
		String agencia = scanner.next();

		System.out.println("Ok, agora informe o seu nome: ");
		String nome = scanner.nextLine();

		Double saldo = 1500.00;

		//Exibir a mensagem de conta criada

		System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" + numero + " e seu saldo " + saldo + " já está disponível para saque.");

	}

}
