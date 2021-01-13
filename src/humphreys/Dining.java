package humphreys;

public class Dining implements Expense{

    private Destination destination;
    private Integer nights;

    public float getCost(){
        switch (destination){
            case Japan:
                return 30 * nights;

            case Europe:
                return 20 * nights;

            case Mexico:
                return 10 * nights;

            default:
                return 0;
        }
    }

    public Dining (Destination inputDestination, Integer inputNights){
        destination = inputDestination;
        nights = inputNights;
    }
}