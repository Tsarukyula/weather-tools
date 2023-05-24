package de.ait;

public class WeatherTools {

    public static String getWindDescription(int speed, boolean isGusty) {
        // <1 == Calm
        // 1-5 == Light Air
        // 6-11 == Light Breeze
        // 12-19 == Gentle Breeze
        // 20-28 == Moderate Breeze
        // 29-38 == Fresh Breeze

        String windDescription = " ";

        if (speed < 1) {
            windDescription = "Calm";
        }
        else if (1 < speed && speed <= 5) {
            windDescription = "Light Air";
        }
        else if (5 < speed && speed <= 11) {
            windDescription = "Light Breeze";
        }
        else if (11 < speed && speed <= 19) {
            windDescription = "Gentle Breeze";
        }
        else if (19 < speed && speed <= 28) {
            windDescription = "Moderate Breeze";
        }
        else if (28 < speed && speed <= 38) {
            windDescription = "Fresh Breeze";
        }
        else {
            windDescription = "Strong Wind";
        }
        if(isGusty){
            windDescription = "Gusty " + windDescription;
        }
        return windDescription + " with speed of " + speed + " km";
    }
}
