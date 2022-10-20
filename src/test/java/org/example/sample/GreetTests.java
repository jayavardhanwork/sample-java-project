package org.example.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class GreetTests {
    @Test
    void testFetchGreeting(){
        Calendar morning = new Calendar.Builder().setTimeOfDay(10,0,0).build();
        Calendar afternoon = new Calendar.Builder().setTimeOfDay(14,0,0).build();
        Calendar evening = new Calendar.Builder().setTimeOfDay(19,0,0).build();

        Assertions.assertEquals(Greet.GREET_MORN, new Greet(morning).fetchGreeting());
        Assertions.assertEquals(Greet.GREET_AFT, new Greet(afternoon).fetchGreeting());
        Assertions.assertEquals(Greet.GREET_EVE, new Greet(evening).fetchGreeting());



    }
}
