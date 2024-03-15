package org.example;

import java.util.Calendar;

public class CalendarManager implements ICalendarProvider
{

    @Override
    public int getDaysUntilEOM()
    {
        Calendar cal = Calendar.getInstance();
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        return maxDay - cal.get(Calendar.DAY_OF_MONTH);
    }
}
