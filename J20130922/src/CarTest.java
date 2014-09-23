import java.util.Scanner;

public class CarTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Car car = new Car();
		Scanner sc = new Scanner(System.in);

		boolean btrue = true; 
		while (btrue) 
		{
			System.out.println("1.up 2.down 3.stop 4.view 5.quit");
			int input = sc.nextInt();

			switch (input)
			{
			case 1:
				car.speedUp();
				break;
			case 2:
				car.speedDown();
				break;
			case 3:
				car.stop();
				break;
			case 4:
				car.view();
				break;
			case 5:
				btrue = false;
				break;
			}
		}// end while

	}// end main Method

}
