public class Car
{
	int speed;

	public int getSpeed()
	{
		return speed;
	}//값을 리턴시켜줌
	
	public void setSpeed(int speed)//인자값
	{
		this.speed = speed;
	}
	
	void speedUp() 
	{
		speed++;
		if (speed>100)
			{ 
			speed--;
			System.out.println("speed Max");	
			}
		view();
	}

	void speedDown() 
	{
		speed--;
		if(speed<0)
		{
			speed++;
			System.out.println("speed Min");	
		}
		view();
	}

	void stop() 
	{
		speed = 0;
		view();
	}

	void view() 
	{
		System.out.println("speed = " + speed);
	}

}