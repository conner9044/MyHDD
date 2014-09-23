
public class Calc 
{
 int result;
 int num1;
 int num2;
 String oper;
 
 public void setoper(String oper)
 {
	 switch(oper)
	 {
	 case "+" : result = num1 + num2;
		 break;
	 case "-" : result = num1 - num2;
		 break;
	 case "*" : result = num1 * num2;
		 break;
	 case "/" : result = num1 / num2;
		 break;
	 }
	 this.oper = oper;
 }
 
 
 
 
}
