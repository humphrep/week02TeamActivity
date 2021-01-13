package humphreys;

public class Lodging implements Expense{

    private Destination destination;
    private Integer nights;

    public float getCost(){
        switch (destination){
            case Japan:
                return (float) (300 * nights * 1.3);

            case Europe:
                return (float) (200 * nights * 1.1);

            case Mexico:
                return 100 * nights;

            default:
                return 0;
        }
    }

    public Lodging (Destination inputDestination, Integer inputNights){
        destination = inputDestination;
        nights = inputNights;
    }
}