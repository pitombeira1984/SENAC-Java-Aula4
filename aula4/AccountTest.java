package aula4;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Account at = new Account();
		
		System.out.printf("Initial name is:%s%n%n",at.getname());
		
		System.out.println("Favor entre com o nome:");
		
		String theName = input.nextLine();
		
		at.setName(theName);
		
		System.out.println();
		
		System.out.println("Name in object myAccount is:%n%s%n", at.getname());
		
		input.close();
	}

}
