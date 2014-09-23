import java.util.Scanner;

public class Calculs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calccs calculation = new Calccs();

		String input = sc.nextLine();
		input = input.replace(" ", "");

		String num1 = "";
		String num2 = "";
		String oper = "";

		double result = 0.0;

		int pluspos = input.indexOf("+");
		int minuspos = input.indexOf("-");
		int ppluspos = input.indexOf("*");
		int mminuspos = input.indexOf("/");

		if (pluspos > 0) {
			num1 = input.substring(0, pluspos);
			num2 = input.substring(pluspos + 1);
			result = calculation.plus(num1, num2);
		} else if (minuspos > 0) {
			num1 = input.substring(0, minuspos);
			num2 = input.substring(minuspos + 1);
			result = calculation.minus(num1, num2);
		} else if (mminuspos > 0) {
			num1 = input.substring(0, mminuspos);
			num2 = input.substring(mminuspos + 1);
			result = calculation.mminus(num1, num2);
		} else if (ppluspos > 0) {
			num1 = input.substring(0, ppluspos);
			num2 = input.substring(ppluspos + 1);
			result = calculation.pplus(num1, num2);
		}

		System.out.println(result);

	}

}
