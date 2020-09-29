package snackBar;

public class Snack
{
	// Fields
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendId;

	// Constructor
	public Snack(String name, int quantity, double cost, int vendId)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendId = vendId;
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

	public int getQuantity()
	{
		return quantity;
	}

	public double getCost()
	{
		return cost;
	}

	public int getVendId()
	{
		return vendId;
	}

	// Setters
	public void setName(String name)
	{
		this.name = name;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public void setVendId(int vendId)
	{
		this.vendId = vendId;
	}

	// Methods
	public void addQty(int add)
	{
		this.quantity = quantity + add;
	}

	public void buySnack(int qty)
	{
		this.quantity = quantity - qty;
	}

	public double totalCost(double qty)
	{
		return qty * cost;
	}
}