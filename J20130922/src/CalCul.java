import java.util.Scanner;


public class CalCul {

	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calcc calculation = new Calcc();
		
		double num1 = sc.nextDouble();
		String oper = sc.next();
		double num2 = sc.nextDouble();
		double result = 0.0;
		
		 switch(oper)
		 {
		 case "+" : 
			 result = calculation.plus(num1, num2);
			 break;
		 case "-" : 
			 result = calculation.minus(num1, num2);
			 break;
		 case "*" : 
			 result = calculation.pplus(num1, num2);
			 break;
		 case "/" : 
			 result = calculation.mminus(num1, num2);
			 break;
		 }
		 
		 System.out.println(result);
		
	}

}
