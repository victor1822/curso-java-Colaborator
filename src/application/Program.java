package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Colaborator;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Colaborator> list = new ArrayList<>();
		Colaborator c;
		System.out.print("Digite o número de funcionários que deseja acrescentar à lista: ");

		int n = sc.nextInt(); 

		for (int i = 0; i < n; i++) {		
			System.out.printf("Digite os dados do elemento %d da lista%n", i);
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double salary = sc.nextDouble();
			c = new Colaborator(id, name, salary); //novo colaborador com id, nome e salario digitado pelo usuario
			list.add(c); //passa esse colaborador para a lista
		}

		System.out.println();

		for (Colaborator col : list) {
			System.out.println(col);//imprime a lista de colaboradores
		}

		System.out.print("Deseja realizar um aumento salarial para algum dos funcionários da lista?(y/n)");
		char yn = sc.next().charAt(0);
		if (yn == 'y') {
			System.out.println("Digite o id do funcionário que deseja aumentar o salário");
			int id = sc.nextInt();

			Colaborator col = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

			if (col == null) {

				System.out.println("Este colaborador não existe!");

			}

			else {

				System.out.print("Entre com a porcentagem de aumento: ");

				double percentage = sc.nextDouble();

				col.increaseSalary(percentage);

			}

			System.out.println();

			for (Colaborator co : list) {
				System.out.println(co);
			}
		}

		sc.close();
	}

}
