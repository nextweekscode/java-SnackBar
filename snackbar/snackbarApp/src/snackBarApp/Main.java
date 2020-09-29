package snackBar;

import java.text.DecimalFormat;

public class Main
{
	

	private static void workWithData()
	{
		DecimalFormat df = new DecimalFormat("$#,##0.00");

		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		// (String name, int quantity, double cost, int vendId)
		Snack chips = new Snack("Chips", 36, 1.75, 1);
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
		Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);
		Snack soda = new Snack("Soda", 24, 2.50, 2);
		Snack water = new Snack("Water", 20, 2.75, 2);

		jane.buySnacks(soda.getCost() * 3);
		soda.buySnack(3);
		System.out.println(jane.getName() + " cash on hand " + df.format(jane.getCash()));
		System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());

		System.out.println();

		jane.buySnacks(pretzel.getCost() * 1);
		pretzel.buySnack(1);
		System.out.println(jane.getName() + " cash on hand " + df.format(jane.getCash()));
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

		System.out.println();

		bob.buySnacks(soda.getCost() * 2);
		soda.buySnack(2);
		System.out.println(bob.getName() + " cash on hand " + df.format(bob.getCash()));
		System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());

		System.out.println();

		jane.addCash(10);
		System.out.println(jane.getName() + " cash on hand " + df.format(jane.getCash()));

		System.out.println();

		jane.buySnacks(chocolateBar.getCost() * 1);
		chocolateBar.buySnack(1);
		System.out.println(jane.getName() + " cash on hand " + df.format(jane.getCash()));
		System.out.println("Quantity of " + chocolateBar.getName() + " is " + chocolateBar.getQuantity());

		System.out.println();

		pretzel.addQty(12);
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

		System.out.println();

		bob.buySnacks(pretzel.getCost() * 3);
		pretzel.buySnack(3);
		System.out.println(bob.getName() + " cash on hand " + df.format(bob.getCash()));
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());

		System.out.println();

		System.out.println("Snack: " + chips.getName());
		System.out.println("Vending Machine: " + food.getName());
		System.out.println("Quantity: " + chips.getQuantity());
		double totalCostChips = chips.getCost() * chips.getQuantity();
		System.out.println("Total Cost: " + df.format(totalCostChips));

		System.out.println();

		System.out.println("Snack: " + chocolateBar.getName());
		System.out.println("Vending Machine: " + food.getName());
		System.out.println("Quantity: " + chocolateBar.getQuantity());
		double totalCostChocolateBar = chocolateBar.getCost() * chocolateBar.getQuantity();
		System.out.println("Total Cost: " + df.format(totalCostChocolateBar));

		System.out.println();

		System.out.println("Snack: " + pretzel.getName());
		System.out.println("Vending Machine: " + food.getName());
		System.out.println("Quantity: " + pretzel.getQuantity());
		double totalCostPretzel = pretzel.getCost() * pretzel.getQuantity();
		System.out.println("Total Cost: " + df.format(totalCostPretzel));

		System.out.println();

		System.out.println("Snack: " + soda.getName());
		System.out.println("Vending Machine: " + drink.getName());
		System.out.println("Quantity: " + soda.getQuantity());
		double totalCostSoda = soda.getCost() * soda.getQuantity();
		System.out.println("Total Cost: " + df.format(totalCostSoda));

		System.out.println();

		System.out.println("Snack: " + water.getName());
		System.out.println("Vending Machine: " + drink.getName());
		System.out.println("Quantity: " + water.getQuantity());
		double totalCostWater = water.getCost() * water.getQuantity();
		System.out.println("Total Cost: " + df.format(totalCostWater));


	}
	







	public static void main(String[] args)
	{
		workWithData();
	}
}