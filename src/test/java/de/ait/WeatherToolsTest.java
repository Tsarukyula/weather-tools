package de.ait;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WeatherToolsTest {

    @ParameterizedTest
    @CsvSource({
            "20, true, 'Gusty Moderate Breeze with speed of 20 km'",
            "20, false, 'Moderate Breeze with speed of 20 km'",
            "30, true, 'Gusty Fresh Breeze with speed of 30 km'",
            "30, false, 'Fresh Breeze with speed of 30 km'"
    })
    public void getWindDescription_test1(int speed, boolean isGusty, String message){
        assertEquals(
                WeatherTools.getWindDescription(speed, isGusty),
                message
        );
    }

}