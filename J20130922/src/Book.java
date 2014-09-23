class BookTest {
	int price;
	int point;
	double rate;
	String name;

	public String getPrice()
	{
		return ""+this.price+"원";
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setPrice(int price, double rate) {
		
		double dprice=0.0d;
		
		if(rate>0)
		{
			dprice = (double)price - (price*rate*0.01);
			price = (int) dprice;
			
		}
		this.price = price;
		this.rate = rate;
	}
	
	public void setPrice(int price, double rate, int point) {
		double dprice=0.0d;
		
		if(rate>0)
		{
			dprice = (double)price - (price*rate*0.01);
			price = (int) dprice;
			
		}
		this.price = price;
		this.price = price;
		this.rate = rate;
		this.point = point;
	}
	
	public void setPrice(int price, double rate, int point, String name) {
		double dprice=0.0d;
		
		if(rate>0)
		{
			dprice = (double)price - (price*rate*0.01);
			price = (int) dprice;
			
		}
		this.price = price;
		this.price = price;
		this.rate = rate;
		this.point = point;
		this.name = name;
		
	}
}

public class Book {

	public static void main(String[] args) {
		BookTest book = new BookTest();
		//book.setprice(30000);

	}

}
