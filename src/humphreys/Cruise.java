package humphreys;

public class Cruise implements Expense {

    private Destination destination;

    public float getCost(){
        switch (destination){
            case Japan:
                return 3000;

            case Europe:
                return 2000;

            case Mexico:
                return 1000;

            default:
                return 0;
        }
    }

    public Cruise (Destination inputDestination){
        destination = inputDestination;
    }
}
