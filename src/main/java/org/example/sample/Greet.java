package org.example.sample;

import java.util.Calendar;

public class Greet {
    public static final String GREET_MORN = " Good Morning";
    public static final String GREET_AFT = " Good Afternoon";
    public static final String GREET_EVE = " Good Evening";

    private Calendar  calender;

    public Greet(Calendar calender) {
        this.calender = calender;
    }

    public  String fetchGreeting(){
       int hotd =  calender.get(Calendar.HOUR_OF_DAY);

       if(hotd < 12){
           return GREET_MORN;
       }
       else if(hotd < 18){
           return GREET_AFT;
       }
       else{
           return  GREET_EVE;
       }
    }


}
