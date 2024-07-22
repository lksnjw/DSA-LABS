package BracketCheck;



import stack.stack;

public class BracketCheck {

	private String inputstr;

	
	
	//constructor
	public BracketCheck(String in) {
		this.inputstr = in;
	}
	
	//method CheckB
	public void checkB() {
		int size = inputstr.length();
		
		stack Bstack = new stack(size);
	
		for (int i = 0; i < size; i++) {
			
			if (inputstr.charAt(i)=='(') {
				Bstack.push('(');
			} else if (inputstr.charAt(i)==')'){
				Bstack.pop();
			}
			
		}
		
		
		
		//if else
		
		if (!Bstack.isEmpty()) {
			System.err.println("invalid   String ");
		} else {
			System.out.println("valid");
		}
	}
	
}
