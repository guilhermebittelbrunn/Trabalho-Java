import javax.swing.JOptionPane;
public class Trabalho {
	
	public static void main(String[] args) {
		// VARIÁVEIS
		int lista[], opc, tamanho, act, num, item, aux, primo, tot_primo, soma, inicio, fim;
		String dado;
		// DEFININDO O TAMANHO DA LISTA E SEUS ELEMENTOS
		dado = JOptionPane.showInputDialog("Digite o tamanho da lista");
		tamanho = Integer.parseInt(dado);
		lista = new int[tamanho];
		for (act = 0; act < tamanho; act++) {
			dado = JOptionPane.showInputDialog("Digite o " + (act + 1) + "o número");
			lista[act] = Integer.parseInt(dado);
		}
		//MOSTRANDO O MENU
		do {
			dado = JOptionPane.showInputDialog("MENU DE INTERAÇÃO" + "\n\n\t1. Mostrar números informados" +
			"\n\t2. Inverter os números na lista \n\t3. Ordenar crescente \n\t4. Mostrar primos \n\t5. Soma posição maior" +
			"\n\t6. Valores ao cubo \n\t7. Ordenar decrescente \n\t8. Sair");
			opc = Integer.parseInt(dado);
			//OPÇÃO NÚMERO 1: MOSTRANDO OS NÚMEROS
			if (opc == 1) {
				System.out.println("\n=============LISTA=============");
				for (item = 0; item < tamanho; item++) {
					System.out.print(lista[item] + " ");
				}
				System.out.println("\n===============================");
			}
			//OPÇÃO NÚMERO 2: INVERTENDO OS NÚMEROS
			if (opc == 2) {
				System.out.println("\nNúmeros invertidos");
				inicio = 0;
				fim = tamanho - 1;
				while (inicio < fim) {
					aux = lista[inicio];
					lista[inicio] = lista[fim];
					lista[fim] = aux;
					inicio++; 
					fim--;
				}
			}
			//OPÇÃO NÚMERO 3: ORDENANDO DE FORMA CRESCENTE
			if (opc == 3) {
				System.out.println("\nNúmeros ordenados de forma crescente");
				for (item = 0; item < tamanho; item++) {
					for (num = 0; num < tamanho - 1; num++) {
						if (lista[num] > lista[num + 1]) {
							aux = lista[num];
							lista[num] = lista[num + 1];
							lista[num + 1] = aux;
						}
					}
				}
			}
			//OPÇÃO NÚMERO 4: MOSTRANDO OS NÚMEROS PRIMOS
			if (opc == 4) {
				System.out.println("\nNúmeros primos");
				tot_primo = 0;
				for (item = 0; item < tamanho; item++) {
					primo = 0;
					aux = lista[item] - 1;
					while (aux > 1) {
						if ((lista[item] % aux) == 0) {
							primo = 1;
						}
						aux--;
					}
					if (primo == 0) {
						System.out.println(lista[item] + " é um número primo");
						tot_primo++;
					}
					else {
						System.out.println(lista[item] + " não é um número primo");
					}
				}
				
				System.out.println("O total de números primos é de: " + tot_primo + " números");
			}
			//OPÇÃO NÚMERO 5: SOMANDO A POSIÇÃO MAIOR
			if (opc == 5) {
				soma = 0;
				System.out.println("\nSoma dos números das posições ímpares");
				for (item = 1; item < tamanho; item+= 2) {
					soma += lista[item];
				}
				System.out.println("A soma de todos os números é: " + soma);
			}
			//OPÇÃO NÚMERO 6: TRANSFORMANDO OS VALORES AO CUBO
			if (opc == 6) {
				System.out.println("\nNúmeros elevados ao cubo");
				for (item = 0; item < tamanho; item++) {
					lista[item] = (int) Math.pow(lista[item], 3);
				}
			}
			//OPÇÃO NÚMERO 7: ORDENANDO DE FORMA DECRESCENTE
			if (opc == 7) {
				System.out.println("\nNúmeros ordenados de forma decrescente");
				for (item = 0; item < tamanho; item++) {
					for(num = 0; num < tamanho - 1; num++) {
						aux = 0;
						if (lista[num] < lista[num + 1]) {
							aux = lista[num];
							lista[num] = lista[num + 1];
							lista[num + 1] = aux;
						}
					}
				}
			}
		} while (opc != 8);
		System.out.println("\n\nFim do programa");
	}
}
