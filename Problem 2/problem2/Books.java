package problem2;

public class Books {
	int amount;
	String name;
	void bookIssued()
	{
		if(amount<=2 && amount>0)
		{
			System.out.println("Warning");
		}
		else if(amount==0)
		{
			System.out.println("Cannot be issued");
		}
		else
		{
		System.out.println("Book Issued");
		}
	}
	void bookReturned()
	{
		System.out.println("Book Returned");
	}
	 public Books(int amount) {
		this.amount=amount;
		this.name=name;
	}

}
