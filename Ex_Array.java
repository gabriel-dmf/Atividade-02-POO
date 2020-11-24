import java.util.Scanner;
import java.util.Random;


public class Ex_Array {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random generator = new Random();
		
		int soma = 0, media, valor = 5000, x_gerados, maior_n = 0, menor_n = 0; 
		int vet [] = new int [999], lista_par [] = new int [999], lista_impar [] = new int [999];
		int y = 0, z = 0, quadrado;
		double soma_var = 0.00, variancia, desvio;
		
		System.out.print("Escolha a quantidade de números gerados: ");
		x_gerados = entrada.nextInt();
		
		if (x_gerados > 0) {
			for(int x = 0; x < x_gerados; x++) {
				vet[x] = generator.nextInt(valor);
				
				//SOMA
				if(x == 0)
					soma = vet[x];
				else
					soma = soma + vet[x];
				
				if(x == 0) {
					maior_n = vet[x];
					menor_n = vet[x];
				}
				else {
					if(vet[x] > maior_n)
						maior_n = vet[x];
					
					if(vet[x] < menor_n)
						menor_n = vet[x];
				}
				
				//LISTA NUM PARES E ÍMPARES
				if(vet[x] % 2 == 0) {
					lista_par[y] = vet[x];
					y = y + 1;
				}
				else {
					lista_impar[z] = vet[x];
					z = z +1;
				}
			}
			
			media = soma/x_gerados;
			
			//variância e devio padrão
			for(int x = 0; x < x_gerados; x++) {
				quadrado = (vet[x] - media); 
				soma_var = soma_var + Math.pow(quadrado, 2);				
			}
			variancia = soma_var * 1/(x_gerados - 1);
			desvio = Math.sqrt(variancia);
			
			System.out.print("Lista: ");
			for(int x = 0; x < x_gerados; x++) {
				System.out.print(vet[x] + "\t");
			}
			System.out.println();
			
			System.out.println("Maior número: " + maior_n);
			System.out.println("Menor número: " + menor_n);
			
			System.out.print("Lista par: ");
			for(int x = 0; x < y; x++) {
				System.out.print(lista_par[x] + "\t");
			}
			System.out.println();
			
			System.out.print("Lista ímpar: ");
			for(int x = 0; x < z; x++) {
				System.out.print(lista_impar[x] + "\t");
			}
			System.out.println();
			System.out.println("Soma: " + soma);
			System.out.println("Média: " + media);
			
			System.out.println("Variância: " + variancia);
			System.out.println("Desvio padrão: " + desvio);
		}
		else
			System.out.println("O valor inserido não é permitido, informe um número maior que 0");
		
		entrada.close();
	}

}
