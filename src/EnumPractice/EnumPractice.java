package EnumPractice;

public class EnumPractice {
    public void WhatDay() {
        DayOfTheWeek day = DayOfTheWeek.friday;
        if (day == DayOfTheWeek.friday) {
            System.out.println("Weekend is close!!!\n");
        }
        
        for (DayOfTheWeek myday : DayOfTheWeek.values()) {
            System.out.println(myday);
        }    
    }
}
