package aula4;

import java.util.Scanner;

import java.time.LocalDate;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Account at = new Account();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Tiago");
		pessoa.setAltura(1.75);
		pessoa.setDataNascimento(LocalDate.of(1920, 01, 01));
		pessoa.setNacionalidade("Argentino");
		pessoa.setCorDosOlhos("Azuis");
		pessoa.setRaca("Alienígena");
		pessoa.setCor("Transparente");
		pessoa.setSexo('F');
		
		System.out.printf("A pessoa é:%n Nome:%s %n Olhos:%s %n", pessoa.getNome(), pessoa.getCorDosOlhos() );
		
		
		System.out.printf("Initial name is:%s%n%n", at.getName());
		
		System.out.println("Favor entre com o nome:");
		
		String theName = input.nextLine();
		
		at.setName(theName);
		
		System.out.println();
		
		System.out.printf("Name in object myAccount is:%n%s%n", at.getName());
		
		input.close();
	}

}
