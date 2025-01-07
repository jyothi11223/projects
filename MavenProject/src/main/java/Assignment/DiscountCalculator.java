package Assignment;

public class DiscountCalculator {
double totalAmount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountCalculator obj=new DiscountCalculator();
		obj.addPrice(3000);
		obj.addPrice(2500);
		double discount = obj.discount();
		double  finalAmount=obj.finalAmount();
		System.out.println("Total Amount: "+obj.totalAmount);
		System.out.println("Discount: "+ discount);
		System.out.println("Final Amount: "+ finalAmount);
	}
	public void addPrice(double price)
	{
		totalAmount += price;
	}
public double discount()
{
	if(totalAmount > 5000)
	{
		return totalAmount * 0.2;
	}
	return 0;
}
public double finalAmount()
{
	return totalAmount - discount();
}

}
