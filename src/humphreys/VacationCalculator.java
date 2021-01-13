package humphreys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class VacationCalculator {

    private static final Scanner sc = new Scanner( System.in );

    public static void main(String[] args) {

        VacationCalculator vc = new VacationCalculator();

        int numberNights = 5;
        // Calculate some vacation costs...
        float japanCost = vc.calculateVacationCost(Destination.Japan, numberNights);
        System.out.format("The cost of the trip to Japan is: $%.2f%n",japanCost);
        float europeCost = vc.calculateVacationCost(Destination.Europe, numberNights);
        System.out.format("The cost of the trip to Europe is: $%.2f%n",europeCost);
        float mexicoCost = vc.calculateVacationCost(Destination.Mexico, numberNights);
        System.out.format("The cost of the trip to Mexico is: $%.2f%n",mexicoCost);

    }

    /**
     * Calculates the total cost for vacationing at a given location for
     * a specific number of nights.
     *
     * @param  dest the destination of the vacation
     * @return      the total cost of the vacation
     */
    public float calculateVacationCost(Destination dest, int nights)
    {
        ArrayList<Expense> expenses = new ArrayList<>();
        expenses.add(new Cruise(dest));
        expenses.add(new Dining(dest, nights));
        expenses.add(new Lodging(dest, nights));
        return tallyExpenses(expenses);
    }

    /**
     * An internal method used by VacationCalculator to loop through
     * a List of items that implement the Expense interface and
     * determine their cost
     *
     * @param  expenses A list of items that implement the Expense interface
     * @return          the total cost calculated by the items
     */
    float tallyExpenses(List<Expense> expenses)
    {
        float totalExpense = 0;
        for (Expense e: expenses) {
            totalExpense += e.getCost();
        }
        return totalExpense;
    }

}