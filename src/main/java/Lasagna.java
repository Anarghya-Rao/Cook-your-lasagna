public class Lasagna {
    private static final int EXPECTED_OVEN_TIME = 40;
    private static final int LAYER_PREPARATION_TIME = 2;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return EXPECTED_OVEN_TIME;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int currentMinutesInOven){
        int remainingMinutes;

        if(currentMinutesInOven < 0)
            remainingMinutes = EXPECTED_OVEN_TIME;
        else if(currentMinutesInOven > EXPECTED_OVEN_TIME)
            remainingMinutes = 0;
        else
            remainingMinutes = EXPECTED_OVEN_TIME - currentMinutesInOven;

        return remainingMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers){
        int preparationTime = 0;

        if (numberOfLayers > 0) {
            preparationTime = numberOfLayers * LAYER_PREPARATION_TIME;
        }

        return preparationTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int currentMinutesInOven){
        int preparationTime = preparationTimeInMinutes(numberOfLayers);

        return preparationTime + currentMinutesInOven;
    }
}
