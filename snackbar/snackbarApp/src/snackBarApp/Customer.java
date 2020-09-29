package snackBar;

public class Customer
{
	// Fields
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	// Constructor
	public Customer(String name, double cash)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cash = cash;
	}

	// Getters
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getCash()
	{
		return cash;
	}


	// Setters
	public void setName(String name)
	{
		this.name = name;
	}

	//Methods
	public double addCash(double add)
	{
		return this.cash += add;
	}

	public double buySnacks(double cost)
	{
		return this.cash -= cost;
	}
}