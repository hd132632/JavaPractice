package orig.dimigo.abstractclass;


public class IPhone extends SmartPhone {
	public IPhone()
	{
		
	}
	public IPhone(String model, String company, int price )
	{
		super(model,company,price);
	}
	public void pay()
	{
		System.out.println("애플 페이로 결제");
	}
	public void useAirDrop()
	{
		System.out.println("AirDrop기능 사용");
	}

}