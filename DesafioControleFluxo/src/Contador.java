import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
	}	 
		static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
			if (parametroUm >= parametroDois) {
				throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior do que o primeiro");
			}
			
		int contagem = parametroDois - parametroUm;
		//Realizar o for para imprimir os números com base na variável contagem
		for  (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
			}
		}
		
	}

