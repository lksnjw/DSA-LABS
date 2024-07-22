package BracketCheck;

import java.util.Scanner;

public class mainParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter an expression:");
		
		String expression = scanner.nextLine();
		
		BracketCheck bracketChecker = new BracketCheck(expression);
		
		bracketChecker.checkB();// call method
		
		
	}

}
