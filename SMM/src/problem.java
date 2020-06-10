import java.util.Random;
public class problem {

	private String type;
	public static String[] types = new String[] {"add","subtract","multiply","divide"};
	public static String[] operators = new String[] {"+","-","*","/"};
	private double answer;
	private int a = 0, b = 0;
	private String operator = "";
	
	public problem(String type) {
		
		this.type = type;
		do{
			a = numGenerator(); 
			b = numGenerator();
		} while(a<b);
		
		
	}
	
	
	public String getProblem() {
		
		for(int i = 0; i < 4; i++) {
			if (type.equalsIgnoreCase(types[i]))
				operator = operators[i];
				
		}
 		
		return  a + operator + b;
		
	}
	
	//add digits as parameters in future
	public int numGenerator() {
		
		Random rand = new Random();
		return rand.nextInt(100);
		
	}
	
	public double getAnswer() {
		answer = -1;
		if(operator.equals("+"))
			answer = a + b;
		if(operator.equals("-"))
			answer = a - b;
		if(operator.equals("*"))
			answer = a * b;
		if(operator.equals("/"))
			answer = a / b;
		
		return answer;
		
	}
	
	
}
